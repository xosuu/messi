package org.joda.time.format;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/* JADX INFO: loaded from: classes.dex */
public class PeriodFormatterBuilder {
    private static final int DAYS = 3;
    private static final int HOURS = 4;
    private static final int MAX_FIELD = 9;
    private static final int MILLIS = 7;
    private static final int MINUTES = 5;
    private static final int MONTHS = 1;
    private static final ConcurrentMap<String, Pattern> PATTERNS = new ConcurrentHashMap();
    private static final int PRINT_ZERO_ALWAYS = 4;
    private static final int PRINT_ZERO_IF_SUPPORTED = 3;
    private static final int PRINT_ZERO_NEVER = 5;
    private static final int PRINT_ZERO_RARELY_FIRST = 1;
    private static final int PRINT_ZERO_RARELY_LAST = 2;
    private static final int SECONDS = 6;
    private static final int SECONDS_MILLIS = 8;
    private static final int SECONDS_OPTIONAL_MILLIS = 9;
    private static final int WEEKS = 2;
    private static final int YEARS = 0;
    private List<Object> iElementPairs;
    private FieldFormatter[] iFieldFormatters;
    private int iMaxParsedDigits;
    private int iMinPrintedDigits;
    private boolean iNotParser;
    private boolean iNotPrinter;
    private PeriodFieldAffix iPrefix;
    private int iPrintZeroSetting;
    private boolean iRejectSignedValues;

    public static class FieldFormatter implements PeriodPrinter, PeriodParser {
        private final FieldFormatter[] iFieldFormatters;
        private final int iFieldType;
        private final int iMaxParsedDigits;
        private final int iMinPrintedDigits;
        private final PeriodFieldAffix iPrefix;
        private final int iPrintZeroSetting;
        private final boolean iRejectSignedValues;
        private final PeriodFieldAffix iSuffix;

        public FieldFormatter(int i10, int i11, int i12, boolean z9, int i13, FieldFormatter[] fieldFormatterArr, PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iMinPrintedDigits = i10;
            this.iPrintZeroSetting = i11;
            this.iMaxParsedDigits = i12;
            this.iRejectSignedValues = z9;
            this.iFieldType = i13;
            this.iFieldFormatters = fieldFormatterArr;
            this.iPrefix = periodFieldAffix;
            this.iSuffix = periodFieldAffix2;
        }

        private int parseInt(String str, int i10, int i11) {
            if (i11 >= 10) {
                return Integer.parseInt(str.substring(i10, i11 + i10));
            }
            boolean z9 = false;
            if (i11 <= 0) {
                return 0;
            }
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            int i13 = i11 - 1;
            if (cCharAt == '-') {
                i13 = i11 - 2;
                if (i13 < 0) {
                    return 0;
                }
                cCharAt = str.charAt(i12);
                z9 = true;
                i12 = i10 + 2;
            }
            int i14 = cCharAt - '0';
            while (true) {
                int i15 = i13 - 1;
                if (i13 <= 0) {
                    break;
                }
                int iCharAt = (str.charAt(i12) + ((i14 << 3) + (i14 << 1))) - 48;
                i13 = i15;
                i12++;
                i14 = iCharAt;
            }
            return z9 ? -i14 : i14;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return 0;
            }
            int iMax = Math.max(FormatUtils.calculateDigitCount(fieldValue), this.iMinPrintedDigits);
            if (this.iFieldType >= 8) {
                int iMax2 = Math.max(iMax, fieldValue < 0 ? 5 : 4);
                iMax = (this.iFieldType == 9 && Math.abs(fieldValue) % 1000 == 0) ? iMax2 - 3 : iMax2 + 1;
                fieldValue /= 1000;
            }
            int i10 = (int) fieldValue;
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                iMax += periodFieldAffix.calculatePrintedLength(i10);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            return periodFieldAffix2 != null ? iMax + periodFieldAffix2.calculatePrintedLength(i10) : iMax;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            if (i10 <= 0) {
                return 0;
            }
            return (this.iPrintZeroSetting == 4 || getFieldValue(readablePeriod) != Long.MAX_VALUE) ? 1 : 0;
        }

        public void finish(FieldFormatter[] fieldFormatterArr) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (FieldFormatter fieldFormatter : fieldFormatterArr) {
                if (fieldFormatter != null && !equals(fieldFormatter)) {
                    hashSet.add(fieldFormatter.iPrefix);
                    hashSet2.add(fieldFormatter.iSuffix);
                }
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.finish(hashSet);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.finish(hashSet2);
            }
        }

        public int getFieldType() {
            return this.iFieldType;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long getFieldValue(org.joda.time.ReadablePeriod r10) {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.FieldFormatter.getFieldValue(org.joda.time.ReadablePeriod):long");
        }

        public boolean isSupported(PeriodType periodType, int i10) {
            switch (i10) {
                case 0:
                    return periodType.isSupported(DurationFieldType.years());
                case 1:
                    return periodType.isSupported(DurationFieldType.months());
                case 2:
                    return periodType.isSupported(DurationFieldType.weeks());
                case 3:
                    return periodType.isSupported(DurationFieldType.days());
                case 4:
                    return periodType.isSupported(DurationFieldType.hours());
                case 5:
                    return periodType.isSupported(DurationFieldType.minutes());
                case 6:
                    return periodType.isSupported(DurationFieldType.seconds());
                case 7:
                    return periodType.isSupported(DurationFieldType.millis());
                case 8:
                case 9:
                    return periodType.isSupported(DurationFieldType.seconds()) || periodType.isSupported(DurationFieldType.millis());
                default:
                    return false;
            }
        }

        public boolean isZero(ReadablePeriod readablePeriod) {
            int size = readablePeriod.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (readablePeriod.getValue(i10) != 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            int iScan;
            PeriodFieldAffix periodFieldAffix;
            int i11;
            char cCharAt;
            int i12 = i10;
            boolean z9 = this.iPrintZeroSetting == 4;
            if (i12 >= str.length()) {
                return z9 ? ~i12 : i12;
            }
            PeriodFieldAffix periodFieldAffix2 = this.iPrefix;
            if (periodFieldAffix2 != null) {
                i12 = periodFieldAffix2.parse(str, i12);
                if (i12 < 0) {
                    return !z9 ? ~i12 : i12;
                }
                z9 = true;
            }
            PeriodFieldAffix periodFieldAffix3 = this.iSuffix;
            int i13 = -1;
            if (periodFieldAffix3 == null || z9) {
                iScan = -1;
            } else {
                iScan = periodFieldAffix3.scan(str, i12);
                if (iScan < 0) {
                    return !z9 ? ~iScan : iScan;
                }
                z9 = true;
            }
            if (!z9 && !isSupported(readWritablePeriod.getPeriodType(), this.iFieldType)) {
                return i12;
            }
            int iMin = iScan > 0 ? Math.min(this.iMaxParsedDigits, iScan - i12) : Math.min(this.iMaxParsedDigits, str.length() - i12);
            int i14 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i14 < iMin) {
                int i15 = i12 + i14;
                char cCharAt2 = str.charAt(i15);
                if (i14 != 0 || (!(cCharAt2 == '-' || cCharAt2 == '+') || this.iRejectSignedValues)) {
                    if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                        z10 = true;
                    } else {
                        if ((cCharAt2 != '.' && cCharAt2 != ',') || (((i11 = this.iFieldType) != 8 && i11 != 9) || i13 >= 0)) {
                            break;
                        }
                        iMin = Math.min(iMin + 1, str.length() - i12);
                        i13 = i15 + 1;
                    }
                    i14++;
                } else {
                    z11 = cCharAt2 == '-';
                    int i16 = i14 + 1;
                    if (i16 >= iMin || (cCharAt = str.charAt(i15 + 1)) < '0' || cCharAt > '9') {
                        break;
                    }
                    if (z11) {
                        i14 = i16;
                    } else {
                        i12++;
                    }
                    iMin = Math.min(iMin + 1, str.length() - i12);
                }
            }
            if (!z10) {
                return ~i12;
            }
            if (iScan >= 0 && i12 + i14 != iScan) {
                return i12;
            }
            int i17 = this.iFieldType;
            if (i17 != 8 && i17 != 9) {
                setFieldValue(readWritablePeriod, i17, parseInt(str, i12, i14));
            } else if (i13 < 0) {
                setFieldValue(readWritablePeriod, 6, parseInt(str, i12, i14));
                setFieldValue(readWritablePeriod, 7, 0);
            } else {
                int i18 = 0;
                int i19 = parseInt(str, i12, (i13 - i12) - 1);
                setFieldValue(readWritablePeriod, 6, i19);
                int i20 = (i12 + i14) - i13;
                if (i20 > 0) {
                    if (i20 >= 3) {
                        i18 = parseInt(str, i13, 3);
                    } else {
                        int i21 = parseInt(str, i13, i20);
                        i18 = i20 == 1 ? i21 * 100 : i21 * 10;
                    }
                    if (z11 || i19 < 0) {
                        i18 = -i18;
                    }
                }
                setFieldValue(readWritablePeriod, 7, i18);
            }
            int i22 = i12 + i14;
            return (i22 < 0 || (periodFieldAffix = this.iSuffix) == null) ? i22 : periodFieldAffix.parse(str, i22);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return;
            }
            int i10 = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i10 = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(stringBuffer, i10);
            }
            int length = stringBuffer.length();
            int i11 = this.iMinPrintedDigits;
            if (i11 <= 1) {
                FormatUtils.appendUnpaddedInteger(stringBuffer, i10);
            } else {
                FormatUtils.appendPaddedInteger(stringBuffer, i10, i11);
            }
            if (this.iFieldType >= 8) {
                int iAbs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || iAbs > 0) {
                    if (fieldValue < 0 && fieldValue > -1000) {
                        stringBuffer.insert(length, '-');
                    }
                    stringBuffer.append('.');
                    FormatUtils.appendPaddedInteger(stringBuffer, iAbs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(stringBuffer, i10);
            }
        }

        public void setFieldValue(ReadWritablePeriod readWritablePeriod, int i10, int i11) {
            switch (i10) {
                case 0:
                    readWritablePeriod.setYears(i11);
                    break;
                case 1:
                    readWritablePeriod.setMonths(i11);
                    break;
                case 2:
                    readWritablePeriod.setWeeks(i11);
                    break;
                case 3:
                    readWritablePeriod.setDays(i11);
                    break;
                case 4:
                    readWritablePeriod.setHours(i11);
                    break;
                case 5:
                    readWritablePeriod.setMinutes(i11);
                    break;
                case 6:
                    readWritablePeriod.setSeconds(i11);
                    break;
                case 7:
                    readWritablePeriod.setMillis(i11);
                    break;
            }
        }

        public FieldFormatter(FieldFormatter fieldFormatter, PeriodFieldAffix periodFieldAffix) {
            this.iMinPrintedDigits = fieldFormatter.iMinPrintedDigits;
            this.iPrintZeroSetting = fieldFormatter.iPrintZeroSetting;
            this.iMaxParsedDigits = fieldFormatter.iMaxParsedDigits;
            this.iRejectSignedValues = fieldFormatter.iRejectSignedValues;
            this.iFieldType = fieldFormatter.iFieldType;
            this.iFieldFormatters = fieldFormatter.iFieldFormatters;
            this.iPrefix = fieldFormatter.iPrefix;
            PeriodFieldAffix periodFieldAffix2 = fieldFormatter.iSuffix;
            this.iSuffix = periodFieldAffix2 != null ? new CompositeAffix(periodFieldAffix2, periodFieldAffix) : periodFieldAffix;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return;
            }
            int i10 = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i10 = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(writer, i10);
            }
            int i11 = this.iMinPrintedDigits;
            if (i11 <= 1) {
                FormatUtils.writeUnpaddedInteger(writer, i10);
            } else {
                FormatUtils.writePaddedInteger(writer, i10, i11);
            }
            if (this.iFieldType >= 8) {
                int iAbs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || iAbs > 0) {
                    writer.write(46);
                    FormatUtils.writePaddedInteger(writer, iAbs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(writer, i10);
            }
        }
    }

    public static abstract class IgnorableAffix implements PeriodFieldAffix {
        private volatile String[] iOtherAffixes;

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void finish(Set<PeriodFieldAffix> set) {
            if (this.iOtherAffixes == null) {
                int length = Integer.MAX_VALUE;
                String str = null;
                for (String str2 : getAffixes()) {
                    if (str2.length() < length) {
                        length = str2.length();
                        str = str2;
                    }
                }
                HashSet hashSet = new HashSet();
                for (PeriodFieldAffix periodFieldAffix : set) {
                    if (periodFieldAffix != null) {
                        for (String str3 : periodFieldAffix.getAffixes()) {
                            if (str3.length() > length || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.iOtherAffixes = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }

        public boolean matchesOtherAffix(int i10, String str, int i11) {
            if (this.iOtherAffixes != null) {
                for (String str2 : this.iOtherAffixes) {
                    int length = str2.length();
                    if (i10 < length && str.regionMatches(true, i11, str2, 0, length)) {
                        return true;
                    }
                    if (i10 == length && str.regionMatches(false, i11, str2, 0, length)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class Literal implements PeriodPrinter, PeriodParser {
        static final Literal EMPTY = new Literal(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        private final String iText;

        public Literal(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            return 0;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            String str2 = this.iText;
            return str.regionMatches(true, i10, str2, 0, str2.length()) ? this.iText.length() + i10 : ~i10;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            stringBuffer.append(this.iText);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            writer.write(this.iText);
        }
    }

    public interface PeriodFieldAffix {
        int calculatePrintedLength(int i10);

        void finish(Set<PeriodFieldAffix> set);

        String[] getAffixes();

        int parse(String str, int i10);

        void printTo(Writer writer, int i10);

        void printTo(StringBuffer stringBuffer, int i10);

        int scan(String str, int i10);
    }

    public static class PluralAffix extends IgnorableAffix {
        private final String iPluralText;
        private final String iSingularText;

        public PluralAffix(String str, String str2) {
            this.iSingularText = str;
            this.iPluralText = str2;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return (i10 == 1 ? this.iSingularText : this.iPluralText).length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iSingularText, this.iPluralText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            String str2;
            int length;
            String str3 = this.iPluralText;
            String str4 = this.iSingularText;
            if (str3.length() < str4.length()) {
                str2 = str3;
                str3 = str4;
            } else {
                str2 = str4;
            }
            if (!str.regionMatches(true, i10, str3, 0, str3.length()) || matchesOtherAffix(str3.length(), str, i10)) {
                if (!str.regionMatches(true, i10, str2, 0, str2.length()) || matchesOtherAffix(str2.length(), str, i10)) {
                    return ~i10;
                }
                length = str2.length();
            } else {
                length = str3.length();
            }
            return length + i10;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append(i10 == 1 ? this.iSingularText : this.iPluralText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            String str2;
            String str3;
            String str4 = this.iPluralText;
            String str5 = this.iSingularText;
            if (str4.length() < str5.length()) {
                str3 = str4;
                str2 = str5;
            } else {
                str2 = str4;
                str3 = str5;
            }
            int length = str2.length();
            int length2 = str3.length();
            int length3 = str.length();
            for (int i11 = i10; i11 < length3; i11++) {
                if (str.regionMatches(true, i11, str2, 0, length) && !matchesOtherAffix(str2.length(), str, i11)) {
                    return i11;
                }
                if (str.regionMatches(true, i11, str3, 0, length2) && !matchesOtherAffix(str3.length(), str, i11)) {
                    return i11;
                }
            }
            return ~i10;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) throws IOException {
            writer.write(i10 == 1 ? this.iSingularText : this.iPluralText);
        }
    }

    public static class RegExAffix extends IgnorableAffix {
        private static final Comparator<String> LENGTH_DESC_COMPARATOR = new Comparator<String>() { // from class: org.joda.time.format.PeriodFormatterBuilder.RegExAffix.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        };
        private final Pattern[] iPatterns;
        private final String[] iSuffixes;
        private final String[] iSuffixesSortedDescByLength;

        public RegExAffix(String[] strArr, String[] strArr2) {
            this.iSuffixes = (String[]) strArr2.clone();
            this.iPatterns = new Pattern[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                Pattern patternCompile = (Pattern) PeriodFormatterBuilder.PATTERNS.get(strArr[i10]);
                if (patternCompile == null) {
                    patternCompile = Pattern.compile(strArr[i10]);
                    PeriodFormatterBuilder.PATTERNS.putIfAbsent(strArr[i10], patternCompile);
                }
                this.iPatterns[i10] = patternCompile;
            }
            String[] strArr3 = (String[]) this.iSuffixes.clone();
            this.iSuffixesSortedDescByLength = strArr3;
            Arrays.sort(strArr3, LENGTH_DESC_COMPARATOR);
        }

        private int selectSuffixIndex(int i10) {
            String strValueOf = String.valueOf(i10);
            int i11 = 0;
            while (true) {
                Pattern[] patternArr = this.iPatterns;
                if (i11 >= patternArr.length) {
                    return patternArr.length - 1;
                }
                if (patternArr[i11].matcher(strValueOf).matches()) {
                    return i11;
                }
                i11++;
            }
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return this.iSuffixes[selectSuffixIndex(i10)].length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iSuffixes.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            for (String str2 : this.iSuffixesSortedDescByLength) {
                if (str.regionMatches(true, i10, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str, i10)) {
                    return str2.length() + i10;
                }
            }
            return ~i10;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append(this.iSuffixes[selectSuffixIndex(i10)]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            int length = str.length();
            for (int i11 = i10; i11 < length; i11++) {
                for (String str2 : this.iSuffixesSortedDescByLength) {
                    if (str.regionMatches(true, i11, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str, i11)) {
                        return i11;
                    }
                }
            }
            return ~i10;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) throws IOException {
            writer.write(this.iSuffixes[selectSuffixIndex(i10)]);
        }
    }

    public static class SimpleAffix extends IgnorableAffix {
        private final String iText;

        public SimpleAffix(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            String str2 = this.iText;
            int length = str2.length();
            return (!str.regionMatches(true, i10, str2, 0, length) || matchesOtherAffix(length, str, i10)) ? ~i10 : i10 + length;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append(this.iText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            String str2 = this.iText;
            int length = str2.length();
            int length2 = str.length();
            for (int i11 = i10; i11 < length2; i11++) {
                if (str.regionMatches(true, i11, str2, 0, length) && !matchesOtherAffix(length, str, i11)) {
                    return i11;
                }
                switch (str.charAt(i11)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        break;
                }
                return ~i10;
            }
            return ~i10;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) throws IOException {
            writer.write(this.iText);
        }
    }

    public PeriodFormatterBuilder() {
        clear();
    }

    private PeriodFormatterBuilder append0(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        this.iElementPairs.add(periodPrinter);
        this.iElementPairs.add(periodParser);
        this.iNotPrinter = (periodPrinter == null) | this.iNotPrinter;
        this.iNotParser |= periodParser == null;
        return this;
    }

    private void appendField(int i10) {
        appendField(i10, this.iMinPrintedDigits);
    }

    private void clearPrefix() {
        if (this.iPrefix != null) {
            throw new IllegalStateException("Prefix not followed by field");
        }
        this.iPrefix = null;
    }

    private static Object[] createComposite(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            Literal literal = Literal.EMPTY;
            return new Object[]{literal, literal};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        Composite composite = new Composite(list);
        return new Object[]{composite, composite};
    }

    public PeriodFormatterBuilder append(PeriodFormatter periodFormatter) {
        if (periodFormatter == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        clearPrefix();
        append0(periodFormatter.getPrinter(), periodFormatter.getParser());
        return this;
    }

    public PeriodFormatterBuilder appendDays() {
        appendField(3);
        return this;
    }

    public PeriodFormatterBuilder appendHours() {
        appendField(4);
        return this;
    }

    public PeriodFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        clearPrefix();
        Literal literal = new Literal(str);
        append0(literal, literal);
        return this;
    }

    public PeriodFormatterBuilder appendMillis() {
        appendField(7);
        return this;
    }

    public PeriodFormatterBuilder appendMillis3Digit() {
        appendField(7, 3);
        return this;
    }

    public PeriodFormatterBuilder appendMinutes() {
        appendField(5);
        return this;
    }

    public PeriodFormatterBuilder appendMonths() {
        appendField(1);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String str) {
        if (str != null) {
            return appendPrefix(new SimpleAffix(str));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSeconds() {
        appendField(6);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithMillis() {
        appendField(8);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithOptionalMillis() {
        appendField(9);
        return this;
    }

    public PeriodFormatterBuilder appendSeparator(String str) {
        return appendSeparator(str, str, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String str) {
        return appendSeparator(str, str, null, false, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String str) {
        return appendSeparator(str, str, null, true, false);
    }

    public PeriodFormatterBuilder appendSuffix(String str) {
        if (str != null) {
            return appendSuffix(new SimpleAffix(str));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendWeeks() {
        appendField(2);
        return this;
    }

    public PeriodFormatterBuilder appendYears() {
        appendField(0);
        return this;
    }

    public void clear() {
        this.iMinPrintedDigits = 1;
        this.iPrintZeroSetting = 2;
        this.iMaxParsedDigits = 10;
        this.iRejectSignedValues = false;
        this.iPrefix = null;
        List<Object> list = this.iElementPairs;
        if (list == null) {
            this.iElementPairs = new ArrayList();
        } else {
            list.clear();
        }
        this.iNotPrinter = false;
        this.iNotParser = false;
        this.iFieldFormatters = new FieldFormatter[10];
    }

    public PeriodFormatterBuilder maximumParsedDigits(int i10) {
        this.iMaxParsedDigits = i10;
        return this;
    }

    public PeriodFormatterBuilder minimumPrintedDigits(int i10) {
        this.iMinPrintedDigits = i10;
        return this;
    }

    public PeriodFormatterBuilder printZeroAlways() {
        this.iPrintZeroSetting = 4;
        return this;
    }

    public PeriodFormatterBuilder printZeroIfSupported() {
        this.iPrintZeroSetting = 3;
        return this;
    }

    public PeriodFormatterBuilder printZeroNever() {
        this.iPrintZeroSetting = 5;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyFirst() {
        this.iPrintZeroSetting = 1;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyLast() {
        this.iPrintZeroSetting = 2;
        return this;
    }

    public PeriodFormatterBuilder rejectSignedValues(boolean z9) {
        this.iRejectSignedValues = z9;
        return this;
    }

    public PeriodFormatter toFormatter() {
        PeriodFormatter formatter = toFormatter(this.iElementPairs, this.iNotPrinter, this.iNotParser);
        for (FieldFormatter fieldFormatter : this.iFieldFormatters) {
            if (fieldFormatter != null) {
                fieldFormatter.finish(this.iFieldFormatters);
            }
        }
        this.iFieldFormatters = (FieldFormatter[]) this.iFieldFormatters.clone();
        return formatter;
    }

    public PeriodParser toParser() {
        if (this.iNotParser) {
            return null;
        }
        return toFormatter().getParser();
    }

    public PeriodPrinter toPrinter() {
        if (this.iNotPrinter) {
            return null;
        }
        return toFormatter().getPrinter();
    }

    public static class Composite implements PeriodPrinter, PeriodParser {
        private final PeriodParser[] iParsers;
        private final PeriodPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.iPrinters = null;
            } else {
                this.iPrinters = (PeriodPrinter[]) arrayList.toArray(new PeriodPrinter[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.iParsers = null;
            } else {
                this.iParsers = (PeriodParser[]) arrayList2.toArray(new PeriodParser[arrayList2.size()]);
            }
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10 += 2) {
                Object obj = list.get(i10);
                if (obj instanceof PeriodPrinter) {
                    if (obj instanceof Composite) {
                        addArrayToList(list2, ((Composite) obj).iPrinters);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i10 + 1);
                if (obj2 instanceof PeriodParser) {
                    if (obj2 instanceof Composite) {
                        addArrayToList(list3, ((Composite) obj2).iParsers);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int iCalculatePrintedLength = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return iCalculatePrintedLength;
                }
                iCalculatePrintedLength += periodPrinterArr[length].calculatePrintedLength(readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int iCountFieldsToPrint = 0;
            while (iCountFieldsToPrint < i10) {
                length--;
                if (length < 0) {
                    break;
                }
                iCountFieldsToPrint += periodPrinterArr[length].countFieldsToPrint(readablePeriod, Integer.MAX_VALUE, locale);
            }
            return iCountFieldsToPrint;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            PeriodParser[] periodParserArr = this.iParsers;
            if (periodParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = periodParserArr.length;
            for (int i11 = 0; i11 < length && i10 >= 0; i11++) {
                i10 = periodParserArr[i11].parseInto(readWritablePeriod, str, i10, locale);
            }
            return i10;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(writer, readablePeriod, locale);
            }
        }
    }

    public static class CompositeAffix extends IgnorableAffix {
        private final PeriodFieldAffix iLeft;
        private final String[] iLeftRightCombinations;
        private final PeriodFieldAffix iRight;

        public CompositeAffix(PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iLeft = periodFieldAffix;
            this.iRight = periodFieldAffix2;
            HashSet hashSet = new HashSet();
            for (String str : periodFieldAffix.getAffixes()) {
                for (String str2 : this.iRight.getAffixes()) {
                    hashSet.add(str + str2);
                }
            }
            this.iLeftRightCombinations = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return this.iLeft.calculatePrintedLength(i10) + this.iRight.calculatePrintedLength(i10);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iLeftRightCombinations.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            int i11 = this.iLeft.parse(str, i10);
            return (i11 < 0 || (i11 = this.iRight.parse(str, i11)) < 0 || !matchesOtherAffix(parse(str, i11) - i11, str, i10)) ? i11 : ~i10;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            this.iLeft.printTo(stringBuffer, i10);
            this.iRight.printTo(stringBuffer, i10);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            int iScan;
            int iScan2 = this.iLeft.scan(str, i10);
            return (iScan2 < 0 || ((iScan = this.iRight.scan(str, this.iLeft.parse(str, iScan2))) >= 0 && matchesOtherAffix(this.iRight.parse(str, iScan) - iScan2, str, i10))) ? ~i10 : iScan2 > 0 ? iScan2 : iScan;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) {
            this.iLeft.printTo(writer, i10);
            this.iRight.printTo(writer, i10);
        }
    }

    private void appendField(int i10, int i11) {
        FieldFormatter fieldFormatter = new FieldFormatter(i11, this.iPrintZeroSetting, this.iMaxParsedDigits, this.iRejectSignedValues, i10, this.iFieldFormatters, this.iPrefix, null);
        append0(fieldFormatter, fieldFormatter);
        this.iFieldFormatters[i10] = fieldFormatter;
        this.iPrefix = null;
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2) {
        return appendSeparator(str, str2, null, true, true);
    }

    public PeriodFormatterBuilder appendPrefix(String str, String str2) {
        if (str != null && str2 != null) {
            return appendPrefix(new PluralAffix(str, str2));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr) {
        return appendSeparator(str, str2, strArr, true, true);
    }

    public PeriodFormatterBuilder appendSuffix(String str, String str2) {
        if (str != null && str2 != null) {
            return appendSuffix(new PluralAffix(str, str2));
        }
        throw new IllegalArgumentException();
    }

    private PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr, boolean z9, boolean z10) {
        Separator separator;
        if (str != null && str2 != null) {
            clearPrefix();
            List<Object> listSubList = this.iElementPairs;
            if (listSubList.size() == 0) {
                if (z10 && !z9) {
                    Literal literal = Literal.EMPTY;
                    Separator separator2 = new Separator(str, str2, strArr, literal, literal, z9, z10);
                    append0(separator2, separator2);
                }
                return this;
            }
            int size = listSubList.size();
            while (true) {
                int i10 = size - 1;
                if (i10 < 0) {
                    separator = null;
                    break;
                }
                if (listSubList.get(i10) instanceof Separator) {
                    separator = (Separator) listSubList.get(i10);
                    listSubList = listSubList.subList(size, listSubList.size());
                    break;
                }
                size -= 2;
            }
            List<Object> list = listSubList;
            if (separator != null && list.size() == 0) {
                throw new IllegalStateException("Cannot have two adjacent separators");
            }
            Object[] objArrCreateComposite = createComposite(list);
            list.clear();
            Separator separator3 = new Separator(str, str2, strArr, (PeriodPrinter) objArrCreateComposite[0], (PeriodParser) objArrCreateComposite[1], z9, z10);
            list.add(separator3);
            list.add(separator3);
            return this;
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder append(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        if (periodPrinter == null && periodParser == null) {
            throw new IllegalArgumentException("No printer or parser supplied");
        }
        clearPrefix();
        append0(periodPrinter, periodParser);
        return this;
    }

    private static PeriodFormatter toFormatter(List<Object> list, boolean z9, boolean z10) {
        if (z9 && z10) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof Separator)) {
            Separator separator = (Separator) list.get(0);
            if (separator.iAfterParser == null && separator.iAfterPrinter == null) {
                PeriodFormatter formatter = toFormatter(list.subList(2, size), z9, z10);
                Separator separatorFinish = separator.finish(formatter.getPrinter(), formatter.getParser());
                return new PeriodFormatter(separatorFinish, separatorFinish);
            }
        }
        Object[] objArrCreateComposite = createComposite(list);
        if (z9) {
            return new PeriodFormatter(null, (PeriodParser) objArrCreateComposite[1]);
        }
        if (z10) {
            return new PeriodFormatter((PeriodPrinter) objArrCreateComposite[0], null);
        }
        return new PeriodFormatter((PeriodPrinter) objArrCreateComposite[0], (PeriodParser) objArrCreateComposite[1]);
    }

    public PeriodFormatterBuilder appendPrefix(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return appendPrefix(new RegExAffix(strArr, strArr2));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSuffix(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return appendSuffix(new RegExAffix(strArr, strArr2));
        }
        throw new IllegalArgumentException();
    }

    public static class Separator implements PeriodPrinter, PeriodParser {
        private volatile PeriodParser iAfterParser;
        private volatile PeriodPrinter iAfterPrinter;
        private final PeriodParser iBeforeParser;
        private final PeriodPrinter iBeforePrinter;
        private final String iFinalText;
        private final String[] iParsedForms;
        private final String iText;
        private final boolean iUseAfter;
        private final boolean iUseBefore;

        public Separator(String str, String str2, String[] strArr, PeriodPrinter periodPrinter, PeriodParser periodParser, boolean z9, boolean z10) {
            this.iText = str;
            this.iFinalText = str2;
            if ((str2 == null || str.equals(str2)) && (strArr == null || strArr.length == 0)) {
                this.iParsedForms = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        } else {
                            treeSet.add(strArr[length]);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.iParsedForms = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.iBeforePrinter = periodPrinter;
            this.iBeforeParser = periodParser;
            this.iUseBefore = z9;
            this.iUseAfter = z10;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            int length;
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            int iCalculatePrintedLength = periodPrinter2.calculatePrintedLength(readablePeriod, locale) + periodPrinter.calculatePrintedLength(readablePeriod, locale);
            if (this.iUseBefore) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) <= 0) {
                    return iCalculatePrintedLength;
                }
                if (this.iUseAfter) {
                    int iCountFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                    if (iCountFieldsToPrint <= 0) {
                        return iCalculatePrintedLength;
                    }
                    length = (iCountFieldsToPrint > 1 ? this.iText : this.iFinalText).length();
                } else {
                    length = this.iText.length();
                }
            } else {
                if (!this.iUseAfter || periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) <= 0) {
                    return iCalculatePrintedLength;
                }
                length = this.iText.length();
            }
            return iCalculatePrintedLength + length;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            int iCountFieldsToPrint = this.iBeforePrinter.countFieldsToPrint(readablePeriod, i10, locale);
            return iCountFieldsToPrint < i10 ? iCountFieldsToPrint + this.iAfterPrinter.countFieldsToPrint(readablePeriod, i10, locale) : iCountFieldsToPrint;
        }

        public Separator finish(PeriodPrinter periodPrinter, PeriodParser periodParser) {
            this.iAfterPrinter = periodPrinter;
            this.iAfterParser = periodParser;
            return this;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            int i11;
            int into = this.iBeforeParser.parseInto(readWritablePeriod, str, i10, locale);
            if (into < 0) {
                return into;
            }
            if (into > i10) {
                String[] strArr = this.iParsedForms;
                int length = strArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    String str2 = strArr[i12];
                    if (str2 == null || str2.length() == 0 || str.regionMatches(true, into, str2, 0, str2.length())) {
                        length = str2 != null ? str2.length() : 0;
                        into += length;
                        i11 = length;
                        length = 1;
                    }
                }
                i11 = -1;
            } else {
                i11 = -1;
            }
            int into2 = this.iAfterParser.parseInto(readWritablePeriod, str, into, locale);
            return into2 < 0 ? into2 : (length == 0 || into2 != into || i11 <= 0) ? (into2 <= into || length != 0 || this.iUseBefore) ? into2 : ~into : ~into;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            if (this.iUseBefore) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.iUseAfter) {
                        int iCountFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (iCountFieldsToPrint > 0) {
                            stringBuffer.append(iCountFieldsToPrint > 1 ? this.iText : this.iFinalText);
                        }
                    } else {
                        stringBuffer.append(this.iText);
                    }
                }
            } else if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                stringBuffer.append(this.iText);
            }
            periodPrinter2.printTo(stringBuffer, readablePeriod, locale);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            periodPrinter.printTo(writer, readablePeriod, locale);
            if (this.iUseBefore) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.iUseAfter) {
                        int iCountFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (iCountFieldsToPrint > 0) {
                            writer.write(iCountFieldsToPrint > 1 ? this.iText : this.iFinalText);
                        }
                    } else {
                        writer.write(this.iText);
                    }
                }
            } else if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                writer.write(this.iText);
            }
            periodPrinter2.printTo(writer, readablePeriod, locale);
        }
    }

    private PeriodFormatterBuilder appendPrefix(PeriodFieldAffix periodFieldAffix) {
        if (periodFieldAffix == null) {
            throw new IllegalArgumentException();
        }
        PeriodFieldAffix periodFieldAffix2 = this.iPrefix;
        if (periodFieldAffix2 != null) {
            periodFieldAffix = new CompositeAffix(periodFieldAffix2, periodFieldAffix);
        }
        this.iPrefix = periodFieldAffix;
        return this;
    }

    private PeriodFormatterBuilder appendSuffix(PeriodFieldAffix periodFieldAffix) {
        Object obj;
        Object obj2;
        if (this.iElementPairs.size() > 0) {
            obj = this.iElementPairs.get(r0.size() - 2);
            obj2 = this.iElementPairs.get(r1.size() - 1);
        } else {
            obj = null;
            obj2 = null;
        }
        if (obj != null && obj2 != null && obj == obj2 && (obj instanceof FieldFormatter)) {
            clearPrefix();
            FieldFormatter fieldFormatter = new FieldFormatter((FieldFormatter) obj, periodFieldAffix);
            this.iElementPairs.set(r4.size() - 2, fieldFormatter);
            this.iElementPairs.set(r4.size() - 1, fieldFormatter);
            this.iFieldFormatters[fieldFormatter.getFieldType()] = fieldFormatter;
            return this;
        }
        throw new IllegalStateException("No field to apply suffix to");
    }
}

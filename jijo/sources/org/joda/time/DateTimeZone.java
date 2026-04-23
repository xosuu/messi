package org.joda.time;

import com.google.android.gms.internal.ads.fb1;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class DateTimeZone implements Serializable {
    private static final int MAX_MILLIS = 86399999;
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;
    public static final DateTimeZone UTC = UTCDateTimeZone.INSTANCE;
    private static final AtomicReference<Provider> cProvider = new AtomicReference<>();
    private static final AtomicReference<NameProvider> cNameProvider = new AtomicReference<>();
    private static final AtomicReference<DateTimeZone> cDefault = new AtomicReference<>();

    public static final class LazyInit {
        static final Map<String, String> CONVERSION_MAP = buildMap();
        static final DateTimeFormatter OFFSET_FORMATTER = buildFormatter();

        private static DateTimeFormatter buildFormatter() {
            return new DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter().withChronology(new BaseChronology() { // from class: org.joda.time.DateTimeZone.LazyInit.1
                private static final long serialVersionUID = -3128740902654445468L;

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public DateTimeZone getZone() {
                    return null;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public String toString() {
                    return getClass().getName();
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withUTC() {
                    return this;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withZone(DateTimeZone dateTimeZone) {
                    return this;
                }
            });
        }

        private static Map<String, String> buildMap() {
            HashMap map = new HashMap();
            map.put("GMT", "UTC");
            map.put("WET", "WET");
            map.put("CET", "CET");
            map.put("MET", "CET");
            map.put("ECT", "CET");
            map.put("EET", "EET");
            map.put("MIT", "Pacific/Apia");
            map.put("HST", "Pacific/Honolulu");
            map.put("AST", "America/Anchorage");
            map.put("PST", "America/Los_Angeles");
            map.put("MST", "America/Denver");
            map.put("PNT", "America/Phoenix");
            map.put("CST", "America/Chicago");
            map.put("EST", "America/New_York");
            map.put("IET", "America/Indiana/Indianapolis");
            map.put("PRT", "America/Puerto_Rico");
            map.put("CNT", "America/St_Johns");
            map.put("AGT", "America/Argentina/Buenos_Aires");
            map.put("BET", "America/Sao_Paulo");
            map.put("ART", "Africa/Cairo");
            map.put("CAT", "Africa/Harare");
            map.put("EAT", "Africa/Addis_Ababa");
            map.put("NET", "Asia/Yerevan");
            map.put("PLT", "Asia/Karachi");
            map.put("IST", "Asia/Kolkata");
            map.put("BST", "Asia/Dhaka");
            map.put("VST", "Asia/Ho_Chi_Minh");
            map.put("CTT", "Asia/Shanghai");
            map.put("JST", "Asia/Tokyo");
            map.put("ACT", "Australia/Darwin");
            map.put("AET", "Australia/Sydney");
            map.put("SST", "Pacific/Guadalcanal");
            map.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(map);
        }
    }

    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;
        private transient String iID;

        public Stub(String str) {
            this.iID = str;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iID = objectInputStream.readUTF();
        }

        private Object readResolve() {
            return DateTimeZone.forID(this.iID);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.iID);
        }
    }

    public DateTimeZone(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.iID = str;
    }

    private static String convertToAsciiNumber(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i10 = 0; i10 < sb.length(); i10++) {
            int iDigit = Character.digit(sb.charAt(i10), 10);
            if (iDigit >= 0) {
                sb.setCharAt(i10, (char) (iDigit + 48));
            }
        }
        return sb.toString();
    }

    private static DateTimeZone fixedOffsetZone(String str, int i10) {
        return i10 == 0 ? UTC : new FixedDateTimeZone(str, null, i10, i10);
    }

    @FromString
    public static DateTimeZone forID(String str) {
        if (str == null) {
            return getDefault();
        }
        if (str.equals("UTC")) {
            return UTC;
        }
        DateTimeZone zone = getProvider().getZone(str);
        if (zone != null) {
            return zone;
        }
        if (!str.startsWith("+") && !str.startsWith("-")) {
            throw new IllegalArgumentException(fb1.i("The datetime zone id '", str, "' is not recognised"));
        }
        int offset = parseOffset(str);
        return ((long) offset) == 0 ? UTC : fixedOffsetZone(printOffset(offset), offset);
    }

    public static DateTimeZone forOffsetHours(int i10) {
        return forOffsetHoursMinutes(i10, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return UTC;
        }
        if (i10 < -23 || i10 > 23) {
            throw new IllegalArgumentException(fb1.g("Hours out of range: ", i10));
        }
        if (i11 < -59 || i11 > 59) {
            throw new IllegalArgumentException(fb1.g("Minutes out of range: ", i11));
        }
        if (i10 > 0 && i11 < 0) {
            throw new IllegalArgumentException(fb1.g("Positive hours must not have negative minutes: ", i11));
        }
        int i12 = i10 * 60;
        try {
            return forOffsetMillis(FieldUtils.safeMultiply(i12 < 0 ? i12 - Math.abs(i11) : i12 + i11, DateTimeConstants.MILLIS_PER_MINUTE));
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Offset is too large");
        }
    }

    public static DateTimeZone forOffsetMillis(int i10) {
        if (i10 < -86399999 || i10 > MAX_MILLIS) {
            throw new IllegalArgumentException(fb1.g("Millis out of range: ", i10));
        }
        return fixedOffsetZone(printOffset(i10), i10);
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        char cCharAt;
        if (timeZone == null) {
            return getDefault();
        }
        String id = timeZone.getID();
        if (id == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        if (id.equals("UTC")) {
            return UTC;
        }
        String convertedId = getConvertedId(id);
        Provider provider = getProvider();
        DateTimeZone zone = convertedId != null ? provider.getZone(convertedId) : null;
        if (zone == null) {
            zone = provider.getZone(id);
        }
        if (zone != null) {
            return zone;
        }
        if (convertedId != null || (!id.startsWith("GMT+") && !id.startsWith("GMT-"))) {
            throw new IllegalArgumentException(fb1.i("The datetime zone id '", id, "' is not recognised"));
        }
        String strSubstring = id.substring(3);
        if (strSubstring.length() > 2 && (cCharAt = strSubstring.charAt(1)) > '9' && Character.isDigit(cCharAt)) {
            strSubstring = convertToAsciiNumber(strSubstring);
        }
        int offset = parseOffset(strSubstring);
        return ((long) offset) == 0 ? UTC : fixedOffsetZone(printOffset(offset), offset);
    }

    public static Set<String> getAvailableIDs() {
        return getProvider().getAvailableIDs();
    }

    private static String getConvertedId(String str) {
        return LazyInit.CONVERSION_MAP.get(str);
    }

    public static DateTimeZone getDefault() {
        DateTimeZone dateTimeZoneForTimeZone = cDefault.get();
        if (dateTimeZoneForTimeZone != null) {
            return dateTimeZoneForTimeZone;
        }
        try {
            String property = System.getProperty("user.timezone");
            if (property != null) {
                dateTimeZoneForTimeZone = forID(property);
            }
        } catch (RuntimeException unused) {
        }
        if (dateTimeZoneForTimeZone == null) {
            try {
                dateTimeZoneForTimeZone = forTimeZone(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (dateTimeZoneForTimeZone == null) {
            dateTimeZoneForTimeZone = UTC;
        }
        DateTimeZone dateTimeZone = dateTimeZoneForTimeZone;
        AtomicReference<DateTimeZone> atomicReference = cDefault;
        while (!atomicReference.compareAndSet(null, dateTimeZone)) {
            if (atomicReference.get() != null) {
                return cDefault.get();
            }
        }
        return dateTimeZone;
    }

    private static NameProvider getDefaultNameProvider() {
        NameProvider nameProvider = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                try {
                    nameProvider = (NameProvider) Class.forName(property).newInstance();
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        } catch (SecurityException unused) {
        }
        return nameProvider == null ? new DefaultNameProvider() : nameProvider;
    }

    private static Provider getDefaultProvider() {
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    return validateProvider((Provider) Class.forName(property).newInstance());
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
            if (property2 != null) {
                try {
                    return validateProvider(new ZoneInfoProvider(new File(property2)));
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        } catch (SecurityException unused2) {
        }
        try {
            return validateProvider(new ZoneInfoProvider("org/joda/time/tz/data"));
        } catch (Exception unused3) {
            return new UTCProvider();
        }
    }

    public static NameProvider getNameProvider() {
        AtomicReference<NameProvider> atomicReference = cNameProvider;
        NameProvider nameProvider = atomicReference.get();
        if (nameProvider != null) {
            return nameProvider;
        }
        NameProvider defaultNameProvider = getDefaultNameProvider();
        while (!atomicReference.compareAndSet(null, defaultNameProvider)) {
            if (atomicReference.get() != null) {
                return cNameProvider.get();
            }
        }
        return defaultNameProvider;
    }

    public static Provider getProvider() {
        AtomicReference<Provider> atomicReference = cProvider;
        Provider provider = atomicReference.get();
        if (provider != null) {
            return provider;
        }
        Provider defaultProvider = getDefaultProvider();
        while (!atomicReference.compareAndSet(null, defaultProvider)) {
            if (atomicReference.get() != null) {
                return cProvider.get();
            }
        }
        return defaultProvider;
    }

    private static int parseOffset(String str) {
        return -((int) LazyInit.OFFSET_FORMATTER.parseMillis(str));
    }

    private static String printOffset(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i10 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i10 = -i10;
        }
        int i11 = i10 / DateTimeConstants.MILLIS_PER_HOUR;
        FormatUtils.appendPaddedInteger(stringBuffer, i11, 2);
        int i12 = i10 - (i11 * DateTimeConstants.MILLIS_PER_HOUR);
        int i13 = i12 / DateTimeConstants.MILLIS_PER_MINUTE;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i13, 2);
        int i14 = i12 - (i13 * DateTimeConstants.MILLIS_PER_MINUTE);
        if (i14 == 0) {
            return stringBuffer.toString();
        }
        int i15 = i14 / 1000;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i15, 2);
        int i16 = i14 - (i15 * 1000);
        if (i16 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        FormatUtils.appendPaddedInteger(stringBuffer, i16, 3);
        return stringBuffer.toString();
    }

    public static void setDefault(DateTimeZone dateTimeZone) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone == null) {
            throw new IllegalArgumentException("The datetime zone must not be null");
        }
        cDefault.set(dateTimeZone);
    }

    public static void setNameProvider(NameProvider nameProvider) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        if (nameProvider == null) {
            nameProvider = getDefaultNameProvider();
        }
        cNameProvider.set(nameProvider);
    }

    public static void setProvider(Provider provider) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (provider == null) {
            provider = getDefaultProvider();
        } else {
            validateProvider(provider);
        }
        cProvider.set(provider);
    }

    private static Provider validateProvider(Provider provider) {
        Set<String> availableIDs = provider.getAvailableIDs();
        if (availableIDs == null || availableIDs.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!availableIDs.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (UTC.equals(provider.getZone("UTC"))) {
            return provider;
        }
        throw new IllegalArgumentException("Invalid UTC zone provided");
    }

    public long adjustOffset(long j10, boolean z9) {
        long j11 = j10 - 10800000;
        long offset = getOffset(j11);
        long offset2 = getOffset(10800000 + j10);
        if (offset <= offset2) {
            return j10;
        }
        long j12 = offset - offset2;
        long jNextTransition = nextTransition(j11);
        long j13 = jNextTransition - j12;
        return (j10 < j13 || j10 >= jNextTransition + j12) ? j10 : j10 - j13 >= j12 ? z9 ? j10 : j10 - j12 : z9 ? j10 + j12 : j10;
    }

    public long convertLocalToUTC(long j10, boolean z9, long j11) {
        int offset = getOffset(j11);
        long j12 = j10 - ((long) offset);
        return getOffset(j12) == offset ? j12 : convertLocalToUTC(j10, z9);
    }

    public long convertUTCToLocal(long j10) {
        long offset = getOffset(j10);
        long j11 = j10 + offset;
        if ((j10 ^ j11) >= 0 || (j10 ^ offset) < 0) {
            return j11;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    @ToString
    public final String getID() {
        return this.iID;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j10) {
        if (dateTimeZone == null) {
            dateTimeZone = getDefault();
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        return dateTimeZone2 == this ? j10 : dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j10), false, j10);
    }

    public final String getName(long j10) {
        return getName(j10, null);
    }

    public abstract String getNameKey(long j10);

    public abstract int getOffset(long j10);

    public final int getOffset(ReadableInstant readableInstant) {
        return readableInstant == null ? getOffset(DateTimeUtils.currentTimeMillis()) : getOffset(readableInstant.getMillis());
    }

    public int getOffsetFromLocal(long j10) {
        int offset = getOffset(j10);
        long j11 = j10 - ((long) offset);
        int offset2 = getOffset(j11);
        if (offset != offset2) {
            if (offset - offset2 < 0) {
                long jNextTransition = nextTransition(j11);
                if (jNextTransition == j11) {
                    jNextTransition = Long.MAX_VALUE;
                }
                long j12 = j10 - ((long) offset2);
                long jNextTransition2 = nextTransition(j12);
                if (jNextTransition != (jNextTransition2 != j12 ? jNextTransition2 : Long.MAX_VALUE)) {
                    return offset;
                }
            }
        } else if (offset >= 0) {
            long jPreviousTransition = previousTransition(j11);
            if (jPreviousTransition < j11) {
                int offset3 = getOffset(jPreviousTransition);
                if (j11 - jPreviousTransition <= offset3 - offset) {
                    return offset3;
                }
            }
        }
        return offset2;
    }

    public final String getShortName(long j10) {
        return getShortName(j10, null);
    }

    public abstract int getStandardOffset(long j10);

    public int hashCode() {
        return getID().hashCode() + 57;
    }

    public abstract boolean isFixed();

    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {
        if (isFixed()) {
            return false;
        }
        try {
            localDateTime.toDateTime(this);
            return false;
        } catch (IllegalInstantException unused) {
            return true;
        }
    }

    public boolean isStandardOffset(long j10) {
        return getOffset(j10) == getStandardOffset(j10);
    }

    public abstract long nextTransition(long j10);

    public abstract long previousTransition(long j10);

    public String toString() {
        return getID();
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    public Object writeReplace() {
        return new Stub(this.iID);
    }

    public String getName(long j10, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j10);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        String name = nameProvider instanceof DefaultNameProvider ? ((DefaultNameProvider) nameProvider).getName(locale, this.iID, nameKey, isStandardOffset(j10)) : nameProvider.getName(locale, this.iID, nameKey);
        return name != null ? name : printOffset(getOffset(j10));
    }

    public String getShortName(long j10, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j10);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        String shortName = nameProvider instanceof DefaultNameProvider ? ((DefaultNameProvider) nameProvider).getShortName(locale, this.iID, nameKey, isStandardOffset(j10)) : nameProvider.getShortName(locale, this.iID, nameKey);
        return shortName != null ? shortName : printOffset(getOffset(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long convertLocalToUTC(long r12, boolean r14) {
        /*
            r11 = this;
            int r0 = r11.getOffset(r12)
            long r1 = (long) r0
            long r1 = r12 - r1
            int r3 = r11.getOffset(r1)
            if (r0 == r3) goto L3d
            if (r14 != 0) goto L11
            if (r0 >= 0) goto L3d
        L11:
            long r4 = r11.nextTransition(r1)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 != 0) goto L1f
            r4 = r6
        L1f:
            long r1 = (long) r3
            long r1 = r12 - r1
            long r8 = r11.nextTransition(r1)
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 != 0) goto L2b
            goto L2c
        L2b:
            r6 = r8
        L2c:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L3d
            if (r14 != 0) goto L33
            goto L3e
        L33:
            org.joda.time.IllegalInstantException r14 = new org.joda.time.IllegalInstantException
            java.lang.String r0 = r11.getID()
            r14.<init>(r12, r0)
            throw r14
        L3d:
            r0 = r3
        L3e:
            long r0 = (long) r0
            long r2 = r12 - r0
            long r4 = r12 ^ r2
            r6 = 0
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L57
            long r12 = r12 ^ r0
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 < 0) goto L4f
            goto L57
        L4f:
            java.lang.ArithmeticException r12 = new java.lang.ArithmeticException
            java.lang.String r13 = "Subtracting time zone offset caused overflow"
            r12.<init>(r13)
            throw r12
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.convertLocalToUTC(long, boolean):long");
    }
}

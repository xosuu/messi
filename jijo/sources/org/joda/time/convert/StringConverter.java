package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes.dex */
class StringConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {
    static final StringConverter INSTANCE = new StringConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        long j10;
        long j11;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            int i10 = length - 1;
            if (str.charAt(i10) == 'S' || str.charAt(i10) == 's') {
                String strSubstring = str.substring(2, i10);
                int i11 = 0;
                int i12 = -1;
                for (int i13 = 0; i13 < strSubstring.length(); i13++) {
                    if (strSubstring.charAt(i13) < '0' || strSubstring.charAt(i13) > '9') {
                        if (i13 == 0 && strSubstring.charAt(0) == '-') {
                            i11 = 1;
                        } else {
                            if (i13 <= i11 || strSubstring.charAt(i13) != '.' || i12 != -1) {
                                throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
                            }
                            i12 = i13;
                        }
                    }
                }
                if (i12 > 0) {
                    j11 = Long.parseLong(strSubstring.substring(i11, i12));
                    String strSubstring2 = strSubstring.substring(i12 + 1);
                    if (strSubstring2.length() != 3) {
                        strSubstring2 = strSubstring2.concat("000").substring(0, 3);
                    }
                    j10 = Integer.parseInt(strSubstring2);
                } else {
                    long j12 = i11 != 0 ? Long.parseLong(strSubstring.substring(i11, strSubstring.length())) : Long.parseLong(strSubstring);
                    j10 = 0;
                    j11 = j12;
                }
                return i11 != 0 ? FieldUtils.safeAdd(FieldUtils.safeMultiply(-j11, 1000), -j10) : FieldUtils.safeAdd(FieldUtils.safeMultiply(j11, 1000), j10);
            }
        }
        throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ISODateTimeFormat.dateTimeParser().withChronology(chronology).parseMillis((String) obj);
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PartialConverter
    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter.getZone() != null) {
            chronology = chronology.withZone(dateTimeFormatter.getZone());
        }
        return chronology.get(readablePartial, dateTimeFormatter.withChronology(chronology).parseMillis((String) obj));
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return String.class;
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        String str = (String) obj;
        PeriodFormatter periodFormatterStandard = ISOPeriodFormat.standard();
        readWritablePeriod.clear();
        int into = periodFormatterStandard.parseInto(readWritablePeriod, str, 0);
        if (into < str.length()) {
            if (into < 0) {
                periodFormatterStandard.withParseType(readWritablePeriod.getPeriodType()).parseMutablePeriod(str);
            }
            throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
        }
    }

    @Override // org.joda.time.convert.IntervalConverter
    public void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology) {
        Period period;
        long jAdd;
        long jAdd2;
        String str = (String) obj;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf >= 0) {
            String strSubstring = str.substring(0, iIndexOf);
            if (strSubstring.length() > 0) {
                String strSubstring2 = str.substring(iIndexOf + 1);
                if (strSubstring2.length() > 0) {
                    DateTimeFormatter dateTimeFormatterWithChronology = ISODateTimeFormat.dateTimeParser().withChronology(chronology);
                    PeriodFormatter periodFormatterStandard = ISOPeriodFormat.standard();
                    char cCharAt = strSubstring.charAt(0);
                    Chronology chronology2 = null;
                    if (cCharAt != 'P' && cCharAt != 'p') {
                        DateTime dateTime = dateTimeFormatterWithChronology.parseDateTime(strSubstring);
                        jAdd = dateTime.getMillis();
                        chronology2 = dateTime.getChronology();
                        period = null;
                    } else {
                        period = periodFormatterStandard.withParseType(getPeriodType(strSubstring)).parsePeriod(strSubstring);
                        jAdd = 0;
                    }
                    char cCharAt2 = strSubstring2.charAt(0);
                    if (cCharAt2 != 'P' && cCharAt2 != 'p') {
                        DateTime dateTime2 = dateTimeFormatterWithChronology.parseDateTime(strSubstring2);
                        jAdd2 = dateTime2.getMillis();
                        if (chronology2 == null) {
                            chronology2 = dateTime2.getChronology();
                        }
                        if (chronology != null) {
                            chronology2 = chronology;
                        }
                        if (period != null) {
                            jAdd = chronology2.add(period, jAdd2, -1);
                        }
                    } else if (period == null) {
                        Period period2 = periodFormatterStandard.withParseType(getPeriodType(strSubstring2)).parsePeriod(strSubstring2);
                        if (chronology != null) {
                            chronology2 = chronology;
                        }
                        jAdd2 = chronology2.add(period2, jAdd, 1);
                    } else {
                        throw new IllegalArgumentException("Interval composed of two durations: ".concat(str));
                    }
                    readWritableInterval.setInterval(jAdd, jAdd2);
                    readWritableInterval.setChronology(chronology2);
                    return;
                }
                throw new IllegalArgumentException("Format invalid: ".concat(str));
            }
            throw new IllegalArgumentException("Format invalid: ".concat(str));
        }
        throw new IllegalArgumentException("Format requires a '/' separator: ".concat(str));
    }
}

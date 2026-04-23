package org.joda.time;

import com.google.android.gms.ads.RequestConfiguration;
import g1.a;
import java.io.Serializable;
import java.util.Comparator;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

/* JADX INFO: loaded from: classes.dex */
public class DateTimeComparator implements Comparator<Object>, Serializable {
    private static final DateTimeComparator ALL_INSTANCE = new DateTimeComparator(null, null);
    private static final DateTimeComparator DATE_INSTANCE = new DateTimeComparator(DateTimeFieldType.dayOfYear(), null);
    private static final DateTimeComparator TIME_INSTANCE = new DateTimeComparator(null, DateTimeFieldType.dayOfYear());
    private static final long serialVersionUID = -6097339773320178364L;
    private final DateTimeFieldType iLowerLimit;
    private final DateTimeFieldType iUpperLimit;

    public DateTimeComparator(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        this.iLowerLimit = dateTimeFieldType;
        this.iUpperLimit = dateTimeFieldType2;
    }

    public static DateTimeComparator getDateOnlyInstance() {
        return DATE_INSTANCE;
    }

    public static DateTimeComparator getInstance() {
        return ALL_INSTANCE;
    }

    public static DateTimeComparator getTimeOnlyInstance() {
        return TIME_INSTANCE;
    }

    private Object readResolve() {
        return getInstance(this.iLowerLimit, this.iUpperLimit);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj);
        Chronology chronology = instantConverter.getChronology(obj, (Chronology) null);
        long instantMillis = instantConverter.getInstantMillis(obj, chronology);
        if (obj == obj2) {
            return 0;
        }
        InstantConverter instantConverter2 = ConverterManager.getInstance().getInstantConverter(obj2);
        Chronology chronology2 = instantConverter2.getChronology(obj2, (Chronology) null);
        long instantMillis2 = instantConverter2.getInstantMillis(obj2, chronology2);
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        if (dateTimeFieldType != null) {
            instantMillis = dateTimeFieldType.getField(chronology).roundFloor(instantMillis);
            instantMillis2 = this.iLowerLimit.getField(chronology2).roundFloor(instantMillis2);
        }
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            instantMillis = dateTimeFieldType2.getField(chronology).remainder(instantMillis);
            instantMillis2 = this.iUpperLimit.getField(chronology2).remainder(instantMillis2);
        }
        if (instantMillis < instantMillis2) {
            return -1;
        }
        return instantMillis > instantMillis2 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        DateTimeFieldType dateTimeFieldType;
        DateTimeFieldType dateTimeFieldType2;
        if (!(obj instanceof DateTimeComparator)) {
            return false;
        }
        DateTimeComparator dateTimeComparator = (DateTimeComparator) obj;
        if (this.iLowerLimit == dateTimeComparator.getLowerLimit() || ((dateTimeFieldType2 = this.iLowerLimit) != null && dateTimeFieldType2.equals(dateTimeComparator.getLowerLimit()))) {
            return this.iUpperLimit == dateTimeComparator.getUpperLimit() || ((dateTimeFieldType = this.iUpperLimit) != null && dateTimeFieldType.equals(dateTimeComparator.getUpperLimit()));
        }
        return false;
    }

    public DateTimeFieldType getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTimeFieldType getUpperLimit() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        int iHashCode = dateTimeFieldType == null ? 0 : dateTimeFieldType.hashCode();
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        return ((dateTimeFieldType2 != null ? dateTimeFieldType2.hashCode() : 0) * 123) + iHashCode;
    }

    public String toString() {
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        String name = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (dateTimeFieldType == dateTimeFieldType2) {
            StringBuilder sb = new StringBuilder("DateTimeComparator[");
            DateTimeFieldType dateTimeFieldType3 = this.iLowerLimit;
            if (dateTimeFieldType3 != null) {
                name = dateTimeFieldType3.getName();
            }
            return a.r(sb, name, "]");
        }
        StringBuilder sb2 = new StringBuilder("DateTimeComparator[");
        DateTimeFieldType dateTimeFieldType4 = this.iLowerLimit;
        sb2.append(dateTimeFieldType4 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : dateTimeFieldType4.getName());
        sb2.append("-");
        DateTimeFieldType dateTimeFieldType5 = this.iUpperLimit;
        if (dateTimeFieldType5 != null) {
            name = dateTimeFieldType5.getName();
        }
        return a.r(sb2, name, "]");
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType) {
        return getInstance(dateTimeFieldType, null);
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        return (dateTimeFieldType == null && dateTimeFieldType2 == null) ? ALL_INSTANCE : (dateTimeFieldType == DateTimeFieldType.dayOfYear() && dateTimeFieldType2 == null) ? DATE_INSTANCE : (dateTimeFieldType == null && dateTimeFieldType2 == DateTimeFieldType.dayOfYear()) ? TIME_INSTANCE : new DateTimeComparator(dateTimeFieldType, dateTimeFieldType2);
    }
}

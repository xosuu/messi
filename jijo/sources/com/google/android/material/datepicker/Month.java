package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f11854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11855b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11856d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11857f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11858h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f11859q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f11860s;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = x.a(calendar);
        this.f11854a = calendarA;
        this.f11855b = calendarA.get(2);
        this.f11856d = calendarA.get(1);
        this.f11857f = calendarA.getMaximum(7);
        this.f11858h = calendarA.getActualMaximum(5);
        this.f11859q = calendarA.getTimeInMillis();
    }

    public static Month d(int i10, int i11) {
        Calendar calendarC = x.c(null);
        calendarC.set(1, i10);
        calendarC.set(2, i11);
        return new Month(calendarC);
    }

    public static Month e(long j10) {
        Calendar calendarC = x.c(null);
        calendarC.setTimeInMillis(j10);
        return new Month(calendarC);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f11854a.compareTo(month.f11854a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f11855b == month.f11855b && this.f11856d == month.f11856d;
    }

    public final String f() {
        if (this.f11860s == null) {
            this.f11860s = DateUtils.formatDateTime(null, this.f11854a.getTimeInMillis(), 8228);
        }
        return this.f11860s;
    }

    public final int g(Month month) {
        if (!(this.f11854a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f11855b - this.f11855b) + ((month.f11856d - this.f11856d) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11855b), Integer.valueOf(this.f11856d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11856d);
        parcel.writeInt(this.f11855b);
    }
}

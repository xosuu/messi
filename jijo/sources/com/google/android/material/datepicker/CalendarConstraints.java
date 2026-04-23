package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f11845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Month f11846b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateValidator f11847d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Month f11848f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11849h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11850q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11851s;

    public interface DateValidator extends Parcelable {
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f11845a = month;
        this.f11846b = month2;
        this.f11848f = month3;
        this.f11849h = i10;
        this.f11847d = dateValidator;
        if (month3 != null && month.f11854a.compareTo(month3.f11854a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f11854a.compareTo(month2.f11854a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > x.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f11851s = month.g(month2) + 1;
        this.f11850q = (month2.f11856d - month.f11856d) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f11845a.equals(calendarConstraints.f11845a) && this.f11846b.equals(calendarConstraints.f11846b) && n0.b.a(this.f11848f, calendarConstraints.f11848f) && this.f11849h == calendarConstraints.f11849h && this.f11847d.equals(calendarConstraints.f11847d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11845a, this.f11846b, this.f11848f, Integer.valueOf(this.f11849h), this.f11847d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f11845a, 0);
        parcel.writeParcelable(this.f11846b, 0);
        parcel.writeParcelable(this.f11848f, 0);
        parcel.writeParcelable(this.f11847d, 0);
        parcel.writeInt(this.f11849h);
    }
}

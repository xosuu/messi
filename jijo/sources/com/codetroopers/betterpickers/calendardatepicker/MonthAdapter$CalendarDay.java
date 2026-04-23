package com.codetroopers.betterpickers.calendardatepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.format.Time;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class MonthAdapter$CalendarDay implements Comparable<MonthAdapter$CalendarDay>, Parcelable {
    public static final Parcelable.Creator<MonthAdapter$CalendarDay> CREATOR = new a(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Calendar f1612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1613b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Time f1614d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1615f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1616h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1617q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1618s;

    public MonthAdapter$CalendarDay() {
        f(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(MonthAdapter$CalendarDay monthAdapter$CalendarDay) {
        int i10 = this.f1616h;
        int i11 = monthAdapter$CalendarDay.f1616h;
        if (i10 < i11) {
            return -1;
        }
        if (i10 == i11 && this.f1617q < monthAdapter$CalendarDay.f1617q) {
            return -1;
        }
        if (i10 == i11 && this.f1617q == monthAdapter$CalendarDay.f1617q && this.f1618s < monthAdapter$CalendarDay.f1618s) {
            return -1;
        }
        return (i10 == i11 && this.f1617q == monthAdapter$CalendarDay.f1617q && this.f1618s == monthAdapter$CalendarDay.f1618s) ? 0 : 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        if (this.f1612a == null) {
            Calendar calendar = Calendar.getInstance();
            this.f1612a = calendar;
            calendar.set(this.f1616h, this.f1617q, this.f1618s, 0, 0, 0);
            this.f1612a.set(14, 0);
        }
        return this.f1612a.getTimeInMillis();
    }

    public final void f(long j10) {
        if (this.f1612a == null) {
            this.f1612a = Calendar.getInstance();
        }
        this.f1612a.setTimeInMillis(j10);
        this.f1617q = this.f1612a.get(2);
        this.f1616h = this.f1612a.get(1);
        this.f1618s = this.f1612a.get(5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Calendar calendar = this.f1612a;
        if (calendar != null) {
            this.f1613b = calendar.getTimeInMillis();
        }
        parcel.writeLong(this.f1613b);
        Time time = this.f1614d;
        if (time != null) {
            this.f1615f = time.toMillis(false);
        }
        parcel.writeInt(this.f1616h);
        parcel.writeInt(this.f1617q);
        parcel.writeInt(this.f1618s);
    }

    public MonthAdapter$CalendarDay(long j10) {
        f(j10);
    }

    public MonthAdapter$CalendarDay(int i10, int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        this.f1612a = calendar;
        calendar.set(i10, i11, i12, 0, 0, 0);
        this.f1612a.set(14, 0);
        this.f1616h = this.f1612a.get(1);
        this.f1617q = this.f1612a.get(2);
        this.f1618s = this.f1612a.get(5);
    }
}

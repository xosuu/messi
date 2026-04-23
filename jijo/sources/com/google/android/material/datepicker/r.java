package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class r extends BaseAdapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11899f = x.c(null).getMaximum(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11900h = (x.c(null).getMaximum(7) + x.c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f11901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.support.v4.media.b f11902b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f11903d;

    public r(Month month, CalendarConstraints calendarConstraints) {
        this.f11901a = month;
        this.f11903d = calendarConstraints;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.f11903d.f11849h;
        Month month = this.f11901a;
        Calendar calendar = month.f11854a;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        return i11 < 0 ? i11 + month.f11857f : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 < a() || i10 > c()) {
            return null;
        }
        int iA = (i10 - a()) + 1;
        Calendar calendarA = x.a(this.f11901a.f11854a);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f11901a.f11858h) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f11900h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f11901a.f11857f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            android.support.v4.media.b r1 = r4.f11902b
            if (r1 != 0) goto Lf
            android.support.v4.media.b r1 = new android.support.v4.media.b
            r1.<init>(r0)
            r4.f11902b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131493002(0x7f0c008a, float:1.8609472E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            com.google.android.material.datepicker.Month r7 = r4.f11901a
            int r2 = r7.f11858h
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.String r6 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r6, r3)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L71
        L6c:
            r5.longValue()
            if (r0 != 0) goto L72
        L71:
            return r0
        L72:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.x.b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.r.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}

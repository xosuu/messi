package com.google.android.material.datepicker;

import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11861b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f11862a;

    static {
        Month monthD = Month.d(1900, 0);
        Calendar calendarC = x.c(null);
        calendarC.setTimeInMillis(monthD.f11859q);
        x.a(calendarC).getTimeInMillis();
        Month monthD2 = Month.d(2100, 11);
        Calendar calendarC2 = x.c(null);
        calendarC2.setTimeInMillis(monthD2.f11859q);
        x.a(calendarC2).getTimeInMillis();
    }
}

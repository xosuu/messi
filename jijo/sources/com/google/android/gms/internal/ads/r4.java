package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f8382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f8383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8389j;

    public r4(String str, int i10, Integer num, Integer num2, float f10, boolean z9, boolean z10, boolean z11, boolean z12, int i11) {
        this.f8380a = str;
        this.f8381b = i10;
        this.f8382c = num;
        this.f8383d = num2;
        this.f8384e = f10;
        this.f8385f = z9;
        this.f8386g = z10;
        this.f8387h = z11;
        this.f8388i = z12;
        this.f8389j = i11;
    }

    public static Integer a(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            tc1.K(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(tp1.R(((j10 >> 24) & 255) ^ 255), tp1.R(j10 & 255), tp1.R((j10 >> 8) & 255), tp1.R((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            fg0.g("Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            fg0.g("Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class yh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10891c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10892d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10894f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10895g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10898j = 0.97f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f10897i = 1.03f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10899k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10900l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10893e = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10896h = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10901m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10902n = -9223372036854775807L;

    public /* synthetic */ yh1(long j10, long j11) {
        this.f10889a = j10;
        this.f10890b = j11;
    }

    public final long a() {
        return this.f10896h;
    }

    public final void b() {
        long j10 = this.f10896h;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f10890b;
        this.f10896h = j11;
        long j12 = this.f10895g;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f10896h = j12;
        }
        this.f10900l = -9223372036854775807L;
    }

    public final void c() {
        long j10;
        long j11 = this.f10891c;
        if (j11 != -9223372036854775807L) {
            j10 = this.f10892d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f10894f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f10895g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f10893e == j10) {
            return;
        }
        this.f10893e = j10;
        this.f10896h = j10;
        this.f10901m = -9223372036854775807L;
        this.f10902n = -9223372036854775807L;
        this.f10900l = -9223372036854775807L;
    }
}

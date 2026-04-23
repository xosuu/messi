package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9328i;

    public u() {
        this.f9320a = 1;
        this.f9321b = -1L;
        this.f9322c = -1L;
        this.f9323d = -1L;
        this.f9324e = -1L;
        this.f9325f = -1L;
        this.f9326g = -1L;
        this.f9327h = -1L;
        this.f9328i = -1L;
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) (((j14 - j13) / (j12 - j11)) * (j10 - j11));
        return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
    }

    public final void b() {
        switch (this.f9320a) {
            case 0:
                this.f9328i = a(this.f9322c, this.f9324e, this.f9325f, this.f9326g, this.f9327h, this.f9323d);
                break;
            default:
                this.f9328i = this.f9327h;
                this.f9327h = SystemClock.uptimeMillis();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
    
        if (r8.contains("REWARDED") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r8, android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u.c(android.content.Context, android.view.View):void");
    }

    public u(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f9320a = 0;
        this.f9321b = j10;
        this.f9322c = j11;
        this.f9324e = 0L;
        this.f9325f = j12;
        this.f9326g = j13;
        this.f9327h = j14;
        this.f9323d = j15;
        this.f9328i = a(j11, 0L, j12, j13, j14, j15);
    }
}

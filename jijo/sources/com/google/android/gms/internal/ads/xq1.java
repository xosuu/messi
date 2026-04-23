package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f10641g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10642h;

    public final void a(long j10) {
        long j11 = this.f10638d;
        if (j11 == 0) {
            this.f10635a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f10635a;
            this.f10636b = j12;
            this.f10640f = j12;
            this.f10639e = 1L;
        } else {
            long j13 = j10 - this.f10637c;
            long jAbs = Math.abs(j13 - this.f10636b);
            boolean[] zArr = this.f10641g;
            int i10 = (int) (j11 % 15);
            if (jAbs <= 1000000) {
                this.f10639e++;
                this.f10640f += j13;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f10642h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f10642h++;
            }
        }
        this.f10638d++;
        this.f10637c = j10;
    }

    public final void b() {
        this.f10638d = 0L;
        this.f10639e = 0L;
        this.f10640f = 0L;
        this.f10642h = 0;
        Arrays.fill(this.f10641g, false);
    }

    public final boolean c() {
        return this.f10638d > 15 && this.f10642h == 0;
    }
}

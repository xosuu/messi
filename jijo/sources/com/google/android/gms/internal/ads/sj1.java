package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sj1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final jo1 f8882s = new jo1(-1, new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv f8883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo1 f8884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzhw f8888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kp1 f8890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k6 f8891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f8892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jo1 f8893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final to f8896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile long f8897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f8898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f8899q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f8900r;

    public sj1(wv wvVar, jo1 jo1Var, long j10, long j11, int i10, zzhw zzhwVar, boolean z9, kp1 kp1Var, k6 k6Var, List list, jo1 jo1Var2, boolean z10, int i11, to toVar, long j12, long j13, long j14, long j15) {
        this.f8883a = wvVar;
        this.f8884b = jo1Var;
        this.f8885c = j10;
        this.f8886d = j11;
        this.f8887e = i10;
        this.f8888f = zzhwVar;
        this.f8889g = z9;
        this.f8890h = kp1Var;
        this.f8891i = k6Var;
        this.f8892j = list;
        this.f8893k = jo1Var2;
        this.f8894l = z10;
        this.f8895m = i11;
        this.f8896n = toVar;
        this.f8897o = j12;
        this.f8898p = j13;
        this.f8899q = j14;
        this.f8900r = j15;
    }

    public static sj1 g(k6 k6Var) {
        eu euVar = wv.f10355a;
        jo1 jo1Var = f8882s;
        return new sj1(euVar, jo1Var, -9223372036854775807L, 0L, 1, null, false, kp1.f6364d, k6Var, wz0.f10382h, jo1Var, false, 0, to.f9205d, 0L, 0L, 0L, 0L);
    }

    public final sj1 a(jo1 jo1Var) {
        return new sj1(this.f8883a, this.f8884b, this.f8885c, this.f8886d, this.f8887e, this.f8888f, this.f8889g, this.f8890h, this.f8891i, this.f8892j, jo1Var, this.f8894l, this.f8895m, this.f8896n, this.f8897o, this.f8898p, this.f8899q, this.f8900r);
    }

    public final sj1 b(jo1 jo1Var, long j10, long j11, long j12, long j13, kp1 kp1Var, k6 k6Var, List list) {
        jo1 jo1Var2 = this.f8893k;
        boolean z9 = this.f8894l;
        int i10 = this.f8895m;
        to toVar = this.f8896n;
        long j14 = this.f8897o;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new sj1(this.f8883a, jo1Var, j11, j12, this.f8887e, this.f8888f, this.f8889g, kp1Var, k6Var, list, jo1Var2, z9, i10, toVar, j14, j13, j10, jElapsedRealtime);
    }

    public final sj1 c(int i10, boolean z9) {
        return new sj1(this.f8883a, this.f8884b, this.f8885c, this.f8886d, this.f8887e, this.f8888f, this.f8889g, this.f8890h, this.f8891i, this.f8892j, this.f8893k, z9, i10, this.f8896n, this.f8897o, this.f8898p, this.f8899q, this.f8900r);
    }

    public final sj1 d(zzhw zzhwVar) {
        return new sj1(this.f8883a, this.f8884b, this.f8885c, this.f8886d, this.f8887e, zzhwVar, this.f8889g, this.f8890h, this.f8891i, this.f8892j, this.f8893k, this.f8894l, this.f8895m, this.f8896n, this.f8897o, this.f8898p, this.f8899q, this.f8900r);
    }

    public final sj1 e(int i10) {
        return new sj1(this.f8883a, this.f8884b, this.f8885c, this.f8886d, i10, this.f8888f, this.f8889g, this.f8890h, this.f8891i, this.f8892j, this.f8893k, this.f8894l, this.f8895m, this.f8896n, this.f8897o, this.f8898p, this.f8899q, this.f8900r);
    }

    public final sj1 f(wv wvVar) {
        return new sj1(wvVar, this.f8884b, this.f8885c, this.f8886d, this.f8887e, this.f8888f, this.f8889g, this.f8890h, this.f8891i, this.f8892j, this.f8893k, this.f8894l, this.f8895m, this.f8896n, this.f8897o, this.f8898p, this.f8899q, this.f8900r);
    }

    public final boolean h() {
        return this.f8887e == 3 && this.f8894l && this.f8895m == 0;
    }
}

package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class u5 implements p5 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f9370l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6 f9371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f9372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f9373c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s5 f9374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1.v f9375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t5 f9376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f9378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b1 f9379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9381k;

    public u5(j6 j6Var) {
        this.f9371a = j6Var;
        s5 s5Var = new s5();
        s5Var.f8801e = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];
        this.f9374d = s5Var;
        this.f9381k = -9223372036854775807L;
        this.f9375e = new m1.v(178);
        this.f9372b = new ik0();
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void b(boolean z9) {
        tc1.A(this.f9376f);
        if (z9) {
            this.f9376f.b(0, this.f9377g, this.f9380j);
            t5 t5Var = this.f9376f;
            t5Var.f9048b = false;
            t5Var.f9049c = false;
            t5Var.f9050d = false;
            t5Var.f9051e = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022b  */
    @Override // com.google.android.gms.internal.ads.p5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.ik0 r21) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u5.c(com.google.android.gms.internal.ads.ik0):void");
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void d(i0 i0Var, q2.d dVar) {
        dVar.c();
        dVar.d();
        this.f9378h = dVar.f16416e;
        dVar.d();
        b1 b1VarJ = i0Var.j(dVar.f16414c, 2);
        this.f9379i = b1VarJ;
        this.f9376f = new t5(b1VarJ);
        j6 j6Var = this.f9371a;
        if (j6Var != null) {
            j6Var.b(i0Var, dVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void e(int i10, long j10) {
        this.f9381k = j10;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void zze() {
        ds0.e(this.f9373c);
        s5 s5Var = this.f9374d;
        s5Var.f8797a = false;
        s5Var.f8799c = 0;
        s5Var.f8798b = 0;
        t5 t5Var = this.f9376f;
        if (t5Var != null) {
            t5Var.f9048b = false;
            t5Var.f9049c = false;
            t5Var.f9050d = false;
            t5Var.f9051e = -1;
        }
        m1.v vVar = this.f9375e;
        if (vVar != null) {
            vVar.f();
        }
        this.f9377g = 0L;
        this.f9381k = -9223372036854775807L;
    }
}

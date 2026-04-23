package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class yo1 extends qn1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cw0 f10976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rm1 f10977i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10978j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10979k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10982n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public va1 f10983o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public fg f10984p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mx0 f10985q;

    public /* synthetic */ yo1(fg fgVar, cw0 cw0Var, mx0 mx0Var, f3 f3Var, int i10) {
        jk1 jk1Var = rm1.f8664l;
        this.f10984p = fgVar;
        this.f10976h = cw0Var;
        this.f10985q = mx0Var;
        this.f10977i = jk1Var;
        this.f10978j = i10;
        this.f10979k = true;
        this.f10980l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void a(io1 io1Var) {
        wo1 wo1Var = (wo1) io1Var;
        if (wo1Var.E) {
            for (cp1 cp1Var : wo1Var.B) {
                cp1Var.n();
                if (cp1Var.A != null) {
                    cp1Var.A = null;
                    cp1Var.f3364f = null;
                }
            }
        }
        oq1 oq1Var = wo1Var.f10266t;
        mq1 mq1Var = oq1Var.f7639b;
        if (mq1Var != null) {
            mq1Var.a(true);
        }
        yd0 yd0Var = new yd0(23, wo1Var);
        ExecutorService executorService = oq1Var.f7638a;
        executorService.execute(yd0Var);
        executorService.shutdown();
        wo1Var.f10271y.removeCallbacksAndMessages(null);
        wo1Var.f10272z = null;
        wo1Var.V = true;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final io1 b(jo1 jo1Var, iq1 iq1Var, long j10) {
        hw0 hw0VarZza = this.f10976h.zza();
        va1 va1Var = this.f10983o;
        if (va1Var != null) {
            hw0VarZza.a(va1Var);
        }
        gb gbVar = c().f4518b;
        gbVar.getClass();
        tc1.A(this.f8235g);
        return new wo1(gbVar.f4855a, hw0VarZza, new ep((j0) this.f10985q.f7073a), this.f10977i, new pm1(this.f8232d.f7922b, jo1Var), new pm1(this.f8231c.f7922b, jo1Var), this, iq1Var, this.f10978j, yn0.u(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final synchronized fg c() {
        return this.f10984p;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void j(va1 va1Var) {
        this.f10983o = va1Var;
        Looper.myLooper().getClass();
        tc1.A(this.f8235g);
        t();
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final synchronized void p(fg fgVar) {
        this.f10984p = fgVar;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void r() {
    }

    public final void s(long j10, boolean z9, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f10980l;
        }
        if (!this.f10979k && this.f10980l == j10 && this.f10981m == z9 && this.f10982n == z10) {
            return;
        }
        this.f10980l = j10;
        this.f10981m = z9;
        this.f10982n = z10;
        this.f10979k = false;
        t();
    }

    public final void t() {
        long j10 = this.f10980l;
        boolean z9 = this.f10981m;
        boolean z10 = this.f10982n;
        fg fgVarC = c();
        wv gp1Var = new gp1(j10, j10, z9, fgVarC, z10 ? fgVarC.f4519c : null);
        if (this.f10979k) {
            gp1Var = new xo1(gp1Var);
        }
        k(gp1Var);
    }
}

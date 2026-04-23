package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class un1 implements no1, qm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9544b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9545d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f9546f;

    public un1(wn1 wn1Var, Integer num) {
        this.f9546f = wn1Var;
        jo1 jo1Var = null;
        this.f9544b = new pm1(wn1Var.f8231c.f7922b, jo1Var);
        this.f9545d = new pm1(wn1Var.f8232d.f7922b, jo1Var);
        this.f9543a = num;
    }

    public final boolean E(jo1 jo1Var) {
        jo1 jo1VarW;
        Object obj = this.f9543a;
        Object obj2 = this.f9546f;
        if (jo1Var != null) {
            jo1VarW = ((wn1) obj2).w(obj, jo1Var);
            if (jo1VarW == null) {
                return false;
            }
        } else {
            jo1VarW = null;
        }
        wn1 wn1Var = (wn1) obj2;
        wn1Var.u(obj);
        pm1 pm1Var = (pm1) this.f9544b;
        pm1Var.getClass();
        if (!yn0.c(pm1Var.f7921a, jo1VarW)) {
            this.f9544b = new pm1(wn1Var.f8231c.f7922b, jo1VarW);
        }
        pm1 pm1Var2 = (pm1) this.f9545d;
        pm1Var2.getClass();
        if (yn0.c(pm1Var2.f7921a, jo1VarW)) {
            return true;
        }
        this.f9545d = new pm1(wn1Var.f8232d.f7922b, jo1VarW);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void R(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var) {
        if (E(jo1Var)) {
            ((pm1) this.f9544b).e(bo1Var, a(gk1Var, jo1Var));
        }
    }

    public final gk1 a(gk1 gk1Var, jo1 jo1Var) {
        wn1 wn1Var = (wn1) this.f9546f;
        long j10 = gk1Var.f4943b;
        Object obj = this.f9543a;
        wn1Var.v(obj, j10);
        long j11 = gk1Var.f4944d;
        wn1Var.v(obj, j11);
        return (j10 == gk1Var.f4943b && j11 == gk1Var.f4944d) ? gk1Var : new gk1(gk1Var.f4942a, (y1) gk1Var.f4945f, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void g(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var) {
        if (E(jo1Var)) {
            ((pm1) this.f9544b).b(bo1Var, a(gk1Var, jo1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void j(int i10, jo1 jo1Var, gk1 gk1Var) {
        if (E(jo1Var)) {
            ((pm1) this.f9544b).a(a(gk1Var, jo1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void r(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var, IOException iOException, boolean z9) {
        if (E(jo1Var)) {
            ((pm1) this.f9544b).d(bo1Var, a(gk1Var, jo1Var), iOException, z9);
        }
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void u(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var) {
        if (E(jo1Var)) {
            ((pm1) this.f9544b).c(bo1Var, a(gk1Var, jo1Var));
        }
    }

    public un1(kp1 kp1Var, boolean[] zArr) {
        this.f9543a = kp1Var;
        this.f9544b = zArr;
        int i10 = kp1Var.f6365a;
        this.f9545d = new boolean[i10];
        this.f9546f = new boolean[i10];
    }
}

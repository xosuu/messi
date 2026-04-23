package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ps0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bq0 f7960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y01 f7961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7962c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7963d = false;

    public ps0(ep epVar, aa aaVar, bq0 bq0Var) {
        this.f7960a = bq0Var;
        aaVar.getClass();
        n5.a aVarB = ((zp0) ((nq0) aaVar.f2626b)).b(bq0Var.f3072b, bq0Var.f3071a, null);
        hn hnVar = new hn(this, aaVar, epVar, bq0Var, 8);
        Executor executor = bq0Var.f3075e;
        this.f7961b = tc1.V(tc1.q0(aVarB, hnVar, executor), Exception.class, new jn(this, 16, aaVar), executor);
    }

    public final synchronized y01 a(bq0 bq0Var) {
        fs0 fs0Var;
        fs0 fs0Var2;
        if (!this.f7963d && !this.f7962c && (fs0Var = this.f7960a.f3077g) != null && (fs0Var2 = bq0Var.f3077g) != null && fs0Var.equals(fs0Var2)) {
            this.f7962c = true;
            return this.f7961b;
        }
        return null;
    }

    public final synchronized void b(ok0 ok0Var) {
        tc1.u0(tc1.q0(this.f7961b, new f00(21), this.f7960a.f3075e), ok0Var, this.f7960a.f3075e);
    }
}

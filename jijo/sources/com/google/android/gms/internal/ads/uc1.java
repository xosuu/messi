package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class uc1 extends ub1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wc1 f9461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wc1 f9462b;

    public uc1(wc1 wc1Var) {
        this.f9461a = wc1Var;
        if (wc1Var.v()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f9462b = wc1Var.q();
    }

    public final wc1 b() {
        wc1 wc1VarC = c();
        wc1VarC.getClass();
        if (wc1.u(wc1VarC, true)) {
            return wc1VarC;
        }
        throw new zzhar();
    }

    public final wc1 c() {
        if (!this.f9462b.v()) {
            return this.f9462b;
        }
        this.f9462b.m();
        return this.f9462b;
    }

    public final Object clone() {
        uc1 uc1Var = (uc1) this.f9461a.x(5, null);
        uc1Var.f9462b = c();
        return uc1Var;
    }

    public final void d() {
        if (this.f9462b.v()) {
            return;
        }
        wc1 wc1VarQ = this.f9461a.q();
        yd1.f10857c.a(wc1VarQ.getClass()).d(wc1VarQ, this.f9462b);
        this.f9462b = wc1VarQ;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class db extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3607h;

    public db(ja jaVar, j8 j8Var, int i10) {
        super(jaVar, "vvYcBqgI4aoC3GZZ7n1bdLp71k52s6EJLh0/nA6ME39LmvOZf3TBZ+H4xg1YfQXg", "6jGSPrUM0+2YrTO2vsTOKq3+XL/IfUFs5oxZaSEvsQg=", j8Var, i10, 61);
        this.f3607h = jaVar.f5866q.f4434a;
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        long jLongValue = ((Long) this.f5556e.invoke(null, this.f5552a.f5850a, Boolean.valueOf(this.f3607h))).longValue();
        synchronized (this.f5555d) {
            j8 j8Var = this.f5555d;
            j8Var.d();
            x8.W((x8) j8Var.f9462b, jLongValue);
        }
    }
}

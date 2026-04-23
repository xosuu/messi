package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class di0 implements ci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ci0 f3684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gx0 f3685b;

    public di0(ci0 ci0Var, b3 b3Var) {
        this.f3684a = ci0Var;
        this.f3685b = b3Var;
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final n5.a a(kr0 kr0Var, fr0 fr0Var) {
        return tc1.o0(this.f3684a.a(kr0Var, fr0Var), this.f3685b, nu.f7383a);
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final boolean b(kr0 kr0Var, fr0 fr0Var) {
        return this.f3684a.b(kr0Var, fr0Var);
    }
}

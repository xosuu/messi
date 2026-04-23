package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class q41 extends s31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t41 f8105b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f8106d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tb1 f8107f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f8108h;

    public q41(t41 t41Var, mx0 mx0Var, tb1 tb1Var, Integer num) {
        super(3);
        this.f8105b = t41Var;
        this.f8106d = mx0Var;
        this.f8107f = tb1Var;
        this.f8108h = num;
    }

    public static q41 q(s41 s41Var, mx0 mx0Var, Integer num) throws GeneralSecurityException {
        tb1 tb1VarB;
        s41 s41Var2 = s41.f8794d;
        if (s41Var != s41Var2 && num == null) {
            throw new GeneralSecurityException(fb1.i("For given Variant ", s41Var.f8795a, " the value of idRequirement must be non-null"));
        }
        if (s41Var == s41Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (mx0Var.b() != 32) {
            throw new GeneralSecurityException(fb1.g("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", mx0Var.b()));
        }
        t41 t41Var = new t41(s41Var);
        if (s41Var == s41Var2) {
            tb1VarB = u61.f9405a;
        } else if (s41Var == s41.f8793c) {
            tb1VarB = u61.a(num.intValue());
        } else {
            if (s41Var != s41.f8792b) {
                throw new IllegalStateException("Unknown Variant: ".concat(s41Var.f8795a));
            }
            tb1VarB = u61.b(num.intValue());
        }
        return new q41(t41Var, mx0Var, tb1VarB, num);
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class a51 extends s31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d51 f2592b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f2593d;

    public a51(d51 d51Var, tb1 tb1Var, Integer num) {
        super(3);
        this.f2592b = d51Var;
        this.f2593d = num;
    }

    public static a51 q(d51 d51Var, Integer num) throws GeneralSecurityException {
        tb1 tb1VarB;
        c51 c51Var = d51Var.f3570a;
        if (c51Var == c51.f3189c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            tb1VarB = u61.f9405a;
        } else {
            if (c51Var != c51.f3188b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(d51Var.f3570a)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            tb1VarB = u61.b(num.intValue());
        }
        return new a51(d51Var, tb1VarB, num);
    }
}

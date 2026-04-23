package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class g51 extends s31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j51 f4821b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f4822d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tb1 f4823f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f4824h;

    public g51(j51 j51Var, mx0 mx0Var, tb1 tb1Var, Integer num) {
        super(3);
        this.f4821b = j51Var;
        this.f4822d = mx0Var;
        this.f4823f = tb1Var;
        this.f4824h = num;
    }

    public static g51 q(i51 i51Var, mx0 mx0Var, Integer num) throws GeneralSecurityException {
        tb1 tb1VarB;
        i51 i51Var2 = i51.f5499d;
        if (i51Var != i51Var2 && num == null) {
            throw new GeneralSecurityException(fb1.i("For given Variant ", i51Var.f5500a, " the value of idRequirement must be non-null"));
        }
        if (i51Var == i51Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (mx0Var.b() != 32) {
            throw new GeneralSecurityException(fb1.g("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", mx0Var.b()));
        }
        j51 j51Var = new j51(i51Var);
        if (i51Var == i51Var2) {
            tb1VarB = u61.f9405a;
        } else if (i51Var == i51.f5498c) {
            tb1VarB = u61.a(num.intValue());
        } else {
            if (i51Var != i51.f5497b) {
                throw new IllegalStateException("Unknown Variant: ".concat(i51Var.f5500a));
            }
            tb1VarB = u61.b(num.intValue());
        }
        return new g51(j51Var, mx0Var, tb1VarB, num);
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class z41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x61 f11125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v61 f11126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c61 f11127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a61 f11128d;

    static {
        tb1 tb1VarB = n71.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f11125a = new x61(new vq0(24, 0), y41.class);
        f11126b = new v61(new vq0(25, 0), tb1VarB);
        f11127c = new c61(new vq0(26, 0), w41.class);
        f11128d = new a61(new vq0(27, 0), tb1VarB);
    }

    public static x41 a(ua1 ua1Var) throws GeneralSecurityException {
        int iOrdinal = ua1Var.ordinal();
        if (iOrdinal == 1) {
            return x41.f10426b;
        }
        if (iOrdinal == 3) {
            return x41.f10427c;
        }
        throw new GeneralSecurityException(fb1.g("Unable to parse OutputPrefixType: ", ua1Var.a()));
    }

    public static ua1 b(x41 x41Var) throws GeneralSecurityException {
        if (x41.f10426b.equals(x41Var)) {
            return ua1.TINK;
        }
        if (x41.f10427c.equals(x41Var)) {
            return ua1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(x41Var.f10428a));
    }
}

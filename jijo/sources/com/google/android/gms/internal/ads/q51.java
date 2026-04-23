package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x61 f8116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v61 f8117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c61 f8118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a61 f8119d;

    static {
        tb1 tb1VarB = n71.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f8116a = new x61(new m30(25), t41.class);
        f8117b = new v61(new m30(26), tb1VarB);
        f8118c = new c61(new m30(27), q41.class);
        f8119d = new a61(new m30(28), tb1VarB);
    }

    public static s41 a(ua1 ua1Var) throws GeneralSecurityException {
        int iOrdinal = ua1Var.ordinal();
        if (iOrdinal == 1) {
            return s41.f8792b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return s41.f8794d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(fb1.g("Unable to parse OutputPrefixType: ", ua1Var.a()));
            }
        }
        return s41.f8793c;
    }

    public static ua1 b(s41 s41Var) throws GeneralSecurityException {
        if (s41.f8792b.equals(s41Var)) {
            return ua1.TINK;
        }
        if (s41.f8793c.equals(s41Var)) {
            return ua1.CRUNCHY;
        }
        if (s41.f8794d.equals(s41Var)) {
            return ua1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(s41Var.f8795a));
    }
}

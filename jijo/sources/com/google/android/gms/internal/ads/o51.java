package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x61 f7515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v61 f7516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c61 f7517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a61 f7518d;

    static {
        tb1 tb1VarB = n71.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f7515a = new x61(new m30(21), p41.class);
        f7516b = new v61(new m30(22), tb1VarB);
        f7517c = new c61(new m30(23), l41.class);
        f7518d = new a61(new m30(24), tb1VarB);
    }

    public static n41 a(ua1 ua1Var) {
        int iOrdinal = ua1Var.ordinal();
        if (iOrdinal == 1) {
            return n41.f7140b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return n41.f7142d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(fb1.g("Unable to parse OutputPrefixType: ", ua1Var.a()));
            }
        }
        return n41.f7141c;
    }

    public static ua1 b(n41 n41Var) throws GeneralSecurityException {
        if (n41.f7140b.equals(n41Var)) {
            return ua1.TINK;
        }
        if (n41.f7141c.equals(n41Var)) {
            return ua1.CRUNCHY;
        }
        if (n41.f7142d.equals(n41Var)) {
            return ua1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(n41Var)));
    }
}

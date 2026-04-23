package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x61 f7175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v61 f7176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c61 f7177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a61 f7178d;

    static {
        tb1 tb1VarB = n71.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f7175a = new x61(new m30(17), k41.class);
        f7176b = new v61(new m30(18), tb1VarB);
        f7177c = new c61(new m30(19), h41.class);
        f7178d = new a61(new m30(20), tb1VarB);
    }

    public static j41 a(ua1 ua1Var) throws GeneralSecurityException {
        int iOrdinal = ua1Var.ordinal();
        if (iOrdinal == 1) {
            return j41.f5797b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return j41.f5799d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(fb1.g("Unable to parse OutputPrefixType: ", ua1Var.a()));
            }
        }
        return j41.f5798c;
    }

    public static ua1 b(j41 j41Var) throws GeneralSecurityException {
        if (j41.f5797b.equals(j41Var)) {
            return ua1.TINK;
        }
        if (j41.f5798c.equals(j41Var)) {
            return ua1.CRUNCHY;
        }
        if (j41.f5799d.equals(j41Var)) {
            return ua1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(j41Var)));
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x61 f4845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v61 f4846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c61 f4847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a61 f4848d;

    static {
        tb1 tb1VarB = n71.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f4845a = new x61(new pe(16), r71.class);
        f4846b = new v61(new pe(17), tb1VarB);
        f4847c = new c61(new pe(18), o71.class);
        f4848d = new a61(new pe(19), tb1VarB);
    }

    public static q71 a(ua1 ua1Var) throws GeneralSecurityException {
        int iOrdinal = ua1Var.ordinal();
        if (iOrdinal == 1) {
            return q71.f8131b;
        }
        if (iOrdinal == 2) {
            return q71.f8133d;
        }
        if (iOrdinal == 3) {
            return q71.f8134e;
        }
        if (iOrdinal == 4) {
            return q71.f8132c;
        }
        throw new GeneralSecurityException(fb1.g("Unable to parse OutputPrefixType: ", ua1Var.a()));
    }

    public static ua1 b(q71 q71Var) throws GeneralSecurityException {
        if (q71.f8131b.equals(q71Var)) {
            return ua1.TINK;
        }
        if (q71.f8132c.equals(q71Var)) {
            return ua1.CRUNCHY;
        }
        if (q71.f8134e.equals(q71Var)) {
            return ua1.RAW;
        }
        if (q71.f8133d.equals(q71Var)) {
            return ua1.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(q71Var)));
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class w51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x61 f10075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v61 f10076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c61 f10077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a61 f10078d;

    static {
        tb1 tb1VarB = n71.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f10075a = new x61(new m30(29), j51.class);
        f10076b = new v61(new pe(0), tb1VarB);
        f10077c = new c61(new pe(1), g51.class);
        f10078d = new a61(new pe(2), tb1VarB);
    }

    public static i51 a(ua1 ua1Var) throws GeneralSecurityException {
        int iOrdinal = ua1Var.ordinal();
        if (iOrdinal == 1) {
            return i51.f5497b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return i51.f5499d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(fb1.g("Unable to parse OutputPrefixType: ", ua1Var.a()));
            }
        }
        return i51.f5498c;
    }

    public static ua1 b(i51 i51Var) throws GeneralSecurityException {
        if (i51.f5497b.equals(i51Var)) {
            return ua1.TINK;
        }
        if (i51.f5498c.equals(i51Var)) {
            return ua1.CRUNCHY;
        }
        if (i51.f5499d.equals(i51Var)) {
            return ua1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(i51Var.f5500a));
    }
}

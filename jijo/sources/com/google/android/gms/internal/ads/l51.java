package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x61 f6502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v61 f6503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c61 f6504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a61 f6505d;

    static {
        tb1 tb1VarB = n71.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f6502a = new x61(new m30(9), b41.class);
        f6503b = new v61(new m30(10), tb1VarB);
        f6504c = new c61(new m30(11), w31.class);
        f6505d = new a61(new m30(12), tb1VarB);
    }

    public static z31 a(r91 r91Var) throws GeneralSecurityException {
        int iOrdinal = r91Var.ordinal();
        if (iOrdinal == 1) {
            return z31.f11100b;
        }
        if (iOrdinal == 2) {
            return z31.f11103e;
        }
        if (iOrdinal == 3) {
            return z31.f11102d;
        }
        if (iOrdinal == 4) {
            return z31.f11104f;
        }
        if (iOrdinal == 5) {
            return z31.f11101c;
        }
        throw new GeneralSecurityException(fb1.g("Unable to parse HashType: ", r91Var.a()));
    }

    public static a41 b(ua1 ua1Var) throws GeneralSecurityException {
        int iOrdinal = ua1Var.ordinal();
        if (iOrdinal == 1) {
            return a41.f2577b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return a41.f2579d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(fb1.g("Unable to parse OutputPrefixType: ", ua1Var.a()));
            }
        }
        return a41.f2578c;
    }

    public static x91 c(b41 b41Var) {
        r91 r91Var;
        w91 w91VarC = x91.C();
        int i10 = b41Var.f2894d;
        w91VarC.d();
        ((x91) w91VarC.f9462b).zzd = i10;
        z31 z31Var = z31.f11100b;
        z31 z31Var2 = b41Var.f2896f;
        if (z31Var.equals(z31Var2)) {
            r91Var = r91.SHA1;
        } else if (z31.f11101c.equals(z31Var2)) {
            r91Var = r91.SHA224;
        } else if (z31.f11102d.equals(z31Var2)) {
            r91Var = r91.SHA256;
        } else if (z31.f11103e.equals(z31Var2)) {
            r91Var = r91.SHA384;
        } else {
            if (!z31.f11104f.equals(z31Var2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(z31Var2)));
            }
            r91Var = r91.SHA512;
        }
        w91VarC.d();
        ((x91) w91VarC.f9462b).zzc = r91Var.a();
        return (x91) w91VarC.b();
    }

    public static ua1 d(a41 a41Var) throws GeneralSecurityException {
        if (a41.f2577b.equals(a41Var)) {
            return ua1.TINK;
        }
        if (a41.f2578c.equals(a41Var)) {
            return ua1.CRUNCHY;
        }
        if (a41.f2579d.equals(a41Var)) {
            return ua1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(a41Var)));
    }
}

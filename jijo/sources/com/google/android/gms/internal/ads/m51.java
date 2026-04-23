package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class m51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x61 f6871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v61 f6872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c61 f6873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a61 f6874d;

    static {
        tb1 tb1VarB = n71.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f6871a = new x61(new m30(13), g41.class);
        f6872b = new v61(new m30(14), tb1VarB);
        f6873c = new c61(new m30(15), c41.class);
        f6874d = new a61(new m30(16), tb1VarB);
    }

    public static e41 a(ua1 ua1Var) throws GeneralSecurityException {
        int iOrdinal = ua1Var.ordinal();
        if (iOrdinal == 1) {
            return e41.f3855b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return e41.f3857d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(fb1.g("Unable to parse OutputPrefixType: ", ua1Var.a()));
            }
        }
        return e41.f3856c;
    }

    public static ua1 b(e41 e41Var) throws GeneralSecurityException {
        if (e41.f3855b.equals(e41Var)) {
            return ua1.TINK;
        }
        if (e41.f3856c.equals(e41Var)) {
            return ua1.CRUNCHY;
        }
        if (e41.f3857d.equals(e41Var)) {
            return ua1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(e41Var)));
    }
}

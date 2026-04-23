package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x61 f3860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v61 f3861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c61 f3862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a61 f3863d;

    static {
        tb1 tb1VarB = n71.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f3860a = new x61(new vq0(28, 0), d51.class);
        f3861b = new v61(new vq0(29, 0), tb1VarB);
        f3862c = new c61(new m30(0), a51.class);
        f3863d = new a61(new m30(1), tb1VarB);
    }

    public static d51 a(ta1 ta1Var, ua1 ua1Var) throws GeneralSecurityException {
        b51 b51Var;
        c51 c51Var;
        aa1 aa1VarA = ba1.A();
        aa1VarA.f(ta1Var.A().F());
        aa1VarA.g(ta1Var.A().E());
        aa1VarA.e(ua1.RAW);
        l31 l31VarZ = tp1.z(((ba1) aa1VarA.b()).d());
        boolean z9 = l31VarZ instanceof k41;
        Object obj = b51.f2906g;
        b51 b51Var2 = b51.f2905f;
        b51 b51Var3 = b51.f2904e;
        b51 b51Var4 = b51.f2902c;
        b51 b51Var5 = b51.f2903d;
        b51 b51Var6 = b51.f2901b;
        if (z9) {
            b51Var = b51Var6;
        } else if (l31VarZ instanceof t41) {
            b51Var = b51Var5;
        } else if (l31VarZ instanceof j51) {
            b51Var = b51Var4;
        } else if (l31VarZ instanceof b41) {
            b51Var = b51Var3;
        } else if (l31VarZ instanceof g41) {
            b51Var = b51Var2;
        } else {
            if (!(l31VarZ instanceof p41)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(l31VarZ.toString()));
            }
            b51Var = obj;
        }
        int iOrdinal = ua1Var.ordinal();
        if (iOrdinal == 1) {
            c51Var = c51.f3188b;
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException(fb1.g("Unable to parse OutputPrefixType: ", ua1Var.a()));
            }
            c51Var = c51.f3189c;
        }
        String strE = ta1Var.E();
        t31 t31Var = (t31) l31VarZ;
        if (strE == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (t31Var == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (t31Var.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((b51Var.equals(b51Var6) && (t31Var instanceof k41)) || ((b51Var.equals(b51Var5) && (t31Var instanceof t41)) || ((b51Var.equals(b51Var4) && (t31Var instanceof j51)) || ((b51Var.equals(b51Var3) && (t31Var instanceof b41)) || ((b51Var.equals(b51Var2) && (t31Var instanceof g41)) || (b51Var.equals(obj) && (t31Var instanceof p41))))))) {
            return new d51(c51Var, strE, b51Var, t31Var);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + b51Var.f2907a + " when new keys are picked according to " + String.valueOf(t31Var) + ".");
    }

    public static ta1 b(d51 d51Var) {
        byte[] bArrE0 = tp1.e0(d51Var.f3573d);
        try {
            pc1 pc1Var = pc1.f7857a;
            yd1 yd1Var = yd1.f10857c;
            ba1 ba1VarC = ba1.C(bArrE0, pc1.f7858b);
            sa1 sa1VarB = ta1.B();
            String str = d51Var.f3571b;
            sa1VarB.d();
            ta1.F((ta1) sa1VarB.f9462b, str);
            sa1VarB.d();
            ta1.G((ta1) sa1VarB.f9462b, ba1VarC);
            return (ta1) sa1VarB.b();
        } catch (zzgyn e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    public static ua1 c(c51 c51Var) throws GeneralSecurityException {
        if (c51.f3188b.equals(c51Var)) {
            return ua1.TINK;
        }
        if (c51.f3189c.equals(c51Var)) {
            return ua1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c51Var)));
    }
}

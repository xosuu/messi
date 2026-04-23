package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class q91 extends wc1 {
    private static final q91 zza;
    private static volatile wd1 zzb;

    static {
        q91 q91Var = new q91();
        zza = q91Var;
        wc1.t(q91.class, q91Var);
    }

    public static q91 A() {
        return zza;
    }

    public static void B(ec1 ec1Var, pc1 pc1Var) {
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zza, "\u0000\u0000", null);
            case 3:
                return new q91();
            case 4:
                return new jf(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (q91.class) {
                        try {
                            vc1Var = zzb;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzb = vc1Var;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return vc1Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

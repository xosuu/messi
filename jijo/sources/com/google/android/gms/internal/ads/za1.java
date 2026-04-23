package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class za1 extends wc1 {
    private static final za1 zza;
    private static volatile wd1 zzb;
    private int zzc;

    static {
        za1 za1Var = new za1();
        zza = za1Var;
        wc1.t(za1.class, za1Var);
    }

    public static za1 B() {
        return zza;
    }

    public static za1 C(ec1 ec1Var, pc1 pc1Var) {
        return (za1) wc1.r(zza, ec1Var, pc1Var);
    }

    public final int A() {
        return this.zzc;
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
                return new ae1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case 3:
                return new za1();
            case 4:
                return new jf(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (za1.class) {
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

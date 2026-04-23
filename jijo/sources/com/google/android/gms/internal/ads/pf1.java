package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class pf1 extends wc1 {
    private static final pf1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private ec1 zzd;
    private ec1 zze;
    private ec1 zzf;

    static {
        pf1 pf1Var = new pf1();
        zza = pf1Var;
        wc1.t(pf1.class, pf1Var);
    }

    public pf1() {
        cc1 cc1Var = ec1.f3903b;
        this.zzd = cc1Var;
        this.zze = cc1Var;
        this.zzf = cc1Var;
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        Object obj = null;
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new pf1();
            case 4:
                return new jf(18, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (pf1.class) {
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

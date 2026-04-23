package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ye1 extends wc1 {
    private static final ye1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private ec1 zzf = ec1.f3903b;

    static {
        ye1 ye1Var = new ye1();
        zza = ye1Var;
        wc1.t(ye1.class, ye1Var);
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
                return new ae1(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", xe1.f10544a, "zze", "zzf"});
            case 3:
                return new ye1();
            case 4:
                return new jf(14, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (ye1.class) {
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

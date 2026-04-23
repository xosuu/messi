package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ze extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final ze zzd;
    private static volatile wd1 zze;
    private int zzf;
    private int zzg = 1000;
    private ke zzh;
    private ee zzi;

    static {
        ze zeVar = new ze();
        zzd = zeVar;
        wc1.t(ze.class, zeVar);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        g1.a aVar = null;
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", pf.f7872a, "zzh", "zzi"});
            case 3:
                return new ze();
            case 4:
                return new f8(26, aVar);
            case 5:
                return zzd;
            case 6:
                wd1 vc1Var = zze;
                if (vc1Var == null) {
                    synchronized (ze.class) {
                        try {
                            vc1Var = zze;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zze = vc1Var;
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

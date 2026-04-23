package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class le extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final le zze;
    private static volatile wd1 zzf;
    private int zzg;
    private ge zzh;
    private int zzi = 1000;
    private ke zzj;
    private ee zzk;

    static {
        le leVar = new le();
        zze = leVar;
        wc1.t(le.class, leVar);
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
                return new ae1(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", pf.f7872a, "zzj", "zzk"});
            case 3:
                return new le();
            case 4:
                return new f8(22, aVar);
            case 5:
                return zze;
            case 6:
                wd1 vc1Var = zzf;
                if (vc1Var == null) {
                    synchronized (le.class) {
                        try {
                            vc1Var = zzf;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzf = vc1Var;
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

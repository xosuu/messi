package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ye extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final ye zzg;
    private static volatile wd1 zzh;
    private int zzi;
    private int zzj = 1000;
    private ke zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;

    static {
        ye yeVar = new ye();
        zzg = yeVar;
        wc1.t(ye.class, yeVar);
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
                return new ae1(zzg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", pf.f7872a, "zzk", "zzl", "zzm", "zzn", "zzo"});
            case 3:
                return new ye();
            case 4:
                return new f8(25, aVar);
            case 5:
                return zzg;
            case 6:
                wd1 vc1Var = zzh;
                if (vc1Var == null) {
                    synchronized (ye.class) {
                        try {
                            vc1Var = zzh;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzh = vc1Var;
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

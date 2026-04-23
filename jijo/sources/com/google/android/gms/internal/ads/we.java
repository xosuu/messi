package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class we extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final we zzf;
    private static volatile wd1 zzg;
    private int zzh;
    private int zzi = 1000;
    private ke zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        we weVar = new we();
        zzf = weVar;
        wc1.t(we.class, weVar);
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
                return new ae1(zzf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", pf.f7872a, "zzj", "zzk", "zzl", "zzm"});
            case 3:
                return new we();
            case 4:
                return new f8(23, aVar);
            case 5:
                return zzf;
            case 6:
                wd1 vc1Var = zzg;
                if (vc1Var == null) {
                    synchronized (we.class) {
                        try {
                            vc1Var = zzg;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzg = vc1Var;
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

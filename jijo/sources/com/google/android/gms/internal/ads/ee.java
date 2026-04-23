package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ee extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final ee zzc;
    private static volatile wd1 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ee eeVar = new ee();
        zzc = eeVar;
        wc1.t(ee.class, eeVar);
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
                return new ae1(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new ee();
            case 4:
                return new f8(18, aVar);
            case 5:
                return zzc;
            case 6:
                wd1 vc1Var = zzd;
                if (vc1Var == null) {
                    synchronized (ee.class) {
                        try {
                            vc1Var = zzd;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzd = vc1Var;
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

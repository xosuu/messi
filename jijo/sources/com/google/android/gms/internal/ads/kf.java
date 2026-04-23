package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kf extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final kf zzg;
    private static volatile wd1 zzh;
    private int zzi;
    private int zzj;
    private ee zzk;
    private ee zzl;
    private ee zzm;
    private dd1 zzn = zd1.f11221f;
    private int zzo;

    static {
        kf kfVar = new kf();
        zzg = kfVar;
        wc1.t(kf.class, kfVar);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = 0;
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zzg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", ee.class, "zzo"});
            case 3:
                return new kf();
            case 4:
                return new jf(i11, i11);
            case 5:
                return zzg;
            case 6:
                wd1 vc1Var = zzh;
                if (vc1Var == null) {
                    synchronized (kf.class) {
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

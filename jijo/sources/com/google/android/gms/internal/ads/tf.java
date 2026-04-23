package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class tf extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final tf zze;
    private static volatile wd1 zzf;
    private int zzg;
    private int zzi;
    private ee zzk;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private ad1 zzj = xc1.f10536f;

    static {
        tf tfVar = new tf();
        zze = tfVar;
        wc1.t(tf.class, tfVar);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = 0;
        int i12 = 2;
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", pf.f7872a, "zzj", "zzk"});
            case 3:
                return new tf();
            case 4:
                return new jf(i12, i11);
            case 5:
                return zze;
            case 6:
                wd1 vc1Var = zzf;
                if (vc1Var == null) {
                    synchronized (tf.class) {
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

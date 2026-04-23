package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class of extends wc1 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final of zze;
    private static volatile wd1 zzf;
    private int zzg;
    private int zzh;
    private ge zzi;
    private String zzj = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzk = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        of ofVar = new of();
        zze = ofVar;
        wc1.t(of.class, ofVar);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = 1;
        int i12 = 0;
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zze, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", nf.f7253a, "zzi", "zzj", "zzk"});
            case 3:
                return new of();
            case 4:
                return new jf(i11, i12);
            case 5:
                return zze;
            case 6:
                wd1 vc1Var = zzf;
                if (vc1Var == null) {
                    synchronized (of.class) {
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

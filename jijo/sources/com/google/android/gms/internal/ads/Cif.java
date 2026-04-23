package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.if, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class Cif extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final Cif zzf;
    private static volatile wd1 zzg;
    private int zzh;
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private dd1 zzj = zd1.f11221f;
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        Cif cif = new Cif();
        zzf = cif;
        wc1.t(Cif.class, cif);
    }

    public static void A(Cif cif, String str) {
        cif.getClass();
        str.getClass();
        cif.zzh |= 1;
        cif.zzi = str;
    }

    public static Cif B() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                pf pfVar = pf.f7872a;
                return new ae1(zzf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", ff.class, "zzk", pfVar, "zzl", pfVar, "zzm", pfVar});
            case 3:
                return new Cif();
            case 4:
                return new hf(zzf);
            case 5:
                return zzf;
            case 6:
                wd1 vc1Var = zzg;
                if (vc1Var == null) {
                    synchronized (Cif.class) {
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

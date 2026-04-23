package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class mf extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final mf zzi;
    private static volatile wd1 zzj;
    private int zzk;
    private ee zzm;
    private int zzn;
    private ge zzo;
    private int zzp;
    private String zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzu = 1000;
    private int zzv = 1000;
    private int zzw = 1000;

    static {
        mf mfVar = new mf();
        zzi = mfVar;
        wc1.t(mf.class, mfVar);
    }

    public static void A(mf mfVar, ge geVar) {
        mfVar.getClass();
        geVar.getClass();
        mfVar.zzo = geVar;
        mfVar.zzk |= 8;
    }

    public static mf B() {
        return zzi;
    }

    public static void C(mf mfVar, String str) {
        mfVar.getClass();
        str.getClass();
        mfVar.zzk |= 1;
        mfVar.zzl = str;
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
                return new ae1(zzi, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", pfVar, "zzv", pfVar, "zzw", pfVar});
            case 3:
                return new mf();
            case 4:
                return new lf(zzi);
            case 5:
                return zzi;
            case 6:
                wd1 vc1Var = zzj;
                if (vc1Var == null) {
                    synchronized (mf.class) {
                        try {
                            vc1Var = zzj;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzj = vc1Var;
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

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ge extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final ge zzd;
    private static volatile wd1 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        ge geVar = new ge();
        zzd = geVar;
        wc1.t(ge.class, geVar);
    }

    public static void A(ge geVar, int i10) {
        geVar.zzf |= 4;
        geVar.zzi = i10;
    }

    public static fe B() {
        return (fe) zzd.g();
    }

    public static void C(ge geVar, int i10) {
        geVar.zzf |= 1;
        geVar.zzg = i10;
    }

    public static void D(ge geVar, int i10) {
        geVar.zzf |= 2;
        geVar.zzh = i10;
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
                return new ae1(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
            case 3:
                return new ge();
            case 4:
                return new fe(zzd);
            case 5:
                return zzd;
            case 6:
                wd1 vc1Var = zze;
                if (vc1Var == null) {
                    synchronized (ge.class) {
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

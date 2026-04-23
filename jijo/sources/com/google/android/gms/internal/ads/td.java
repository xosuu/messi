package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class td extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final td zzc;
    private static volatile wd1 zzd;
    private int zze;
    private int zzf;
    private ee zzg;

    static {
        td tdVar = new td();
        zzc = tdVar;
        wc1.t(td.class, tdVar);
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
                return new ae1(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", pf.f7872a, "zzg"});
            case 3:
                return new td();
            case 4:
                return new f8(13, aVar);
            case 5:
                return zzc;
            case 6:
                wd1 vc1Var = zzd;
                if (vc1Var == null) {
                    synchronized (td.class) {
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

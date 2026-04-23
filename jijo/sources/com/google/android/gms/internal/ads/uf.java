package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class uf extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final uf zzc;
    private static volatile wd1 zzd;
    private int zze;
    private int zzf;
    private ad1 zzg = xc1.f10536f;

    static {
        uf ufVar = new uf();
        zzc = ufVar;
        wc1.t(uf.class, ufVar);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = 0;
        int i12 = 3;
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", pf.f7872a, "zzg"});
            case 3:
                return new uf();
            case 4:
                return new jf(i12, i11);
            case 5:
                return zzc;
            case 6:
                wd1 vc1Var = zzd;
                if (vc1Var == null) {
                    synchronized (uf.class) {
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

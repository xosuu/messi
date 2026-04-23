package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tt0 extends wc1 {
    private static final tt0 zza;
    private static volatile wd1 zzb;
    private dd1 zzc = zd1.f11221f;

    static {
        tt0 tt0Var = new tt0();
        zza = tt0Var;
        wc1.t(tt0.class, tt0Var);
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
                return new ae1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", st0.class});
            case 3:
                return new tt0();
            case 4:
                return new jf(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (tt0.class) {
                        try {
                            vc1Var = zzb;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzb = vc1Var;
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

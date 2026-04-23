package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hf1 extends wc1 {
    private static final hf1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private ec1 zzd = ec1.f3903b;

    static {
        hf1 hf1Var = new hf1();
        zza = hf1Var;
        wc1.t(hf1.class, hf1Var);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        Object obj = null;
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzc", "zzd"});
            case 3:
                return new hf1();
            case 4:
                return new jf(16, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (hf1.class) {
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

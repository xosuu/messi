package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class uf1 extends wc1 {
    private static final uf1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        uf1 uf1Var = new uf1();
        zza = uf1Var;
        wc1.t(uf1.class, uf1Var);
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
                tf1 tf1Var = tf1.f9150a;
                return new ae1(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", tf1Var, "zze", "zzf", tf1Var});
            case 3:
                return new uf1();
            case 4:
                return new jf(22, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (uf1.class) {
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

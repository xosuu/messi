package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vf1 extends wc1 {
    private static final vf1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private uf1 zze;
    private uf1 zzf;

    static {
        vf1 vf1Var = new vf1();
        zza = vf1Var;
        wc1.t(vf1.class, vf1Var);
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
                return new ae1(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", tf1.f9150a, "zze", "zzf"});
            case 3:
                return new vf1();
            case 4:
                return new jf(21, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (vf1.class) {
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

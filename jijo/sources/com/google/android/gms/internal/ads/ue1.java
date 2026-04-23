package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ue1 extends wc1 {
    private static final ue1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        ue1 ue1Var = new ue1();
        zza = ue1Var;
        wc1.t(ue1.class, ue1Var);
    }

    public static te1 A() {
        return (te1) zza.g();
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
                return new ae1(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new ue1();
            case 4:
                return new te1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (ue1.class) {
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

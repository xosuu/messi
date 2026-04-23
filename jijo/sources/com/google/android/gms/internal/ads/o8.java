package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class o8 extends wc1 {
    private static final o8 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;
    private int zzf = 1000;

    static {
        o8 o8Var = new o8();
        zza = o8Var;
        wc1.t(o8.class, o8Var);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        Object obj = null;
        if (i10 == 0) {
            throw null;
        }
        int i11 = 5;
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                c9 c9Var = c9.f3232a;
                return new ae1(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", c9Var, "zzf", c9Var});
            case 3:
                return new o8();
            case 4:
                return new f8(i11, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (o8.class) {
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

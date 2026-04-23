package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class s8 extends wc1 {
    private static final s8 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;

    static {
        s8 s8Var = new s8();
        zza = s8Var;
        wc1.t(s8.class, s8Var);
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
                return new ae1(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", "zze", c9.f3232a});
            case 3:
                return new s8();
            case 4:
                return new f8(8, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (s8.class) {
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

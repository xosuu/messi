package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class l8 extends wc1 {
    private static final l8 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;

    static {
        l8 l8Var = new l8();
        zza = l8Var;
        wc1.t(l8.class, l8Var);
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
                return new ae1(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", n8.f7189a});
            case 3:
                return new l8();
            case 4:
                return new f8(4, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (l8.class) {
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

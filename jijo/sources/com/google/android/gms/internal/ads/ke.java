package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ke extends wc1 {
    public static final int zza = 1;
    private static final ke zzb;
    private static volatile wd1 zzc;
    private int zzd;
    private int zze;

    static {
        ke keVar = new ke();
        zzb = keVar;
        wc1.t(ke.class, keVar);
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
                return new ae1(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", je.f5918a});
            case 3:
                return new ke();
            case 4:
                return new f8(21, aVar);
            case 5:
                return zzb;
            case 6:
                wd1 vc1Var = zzc;
                if (vc1Var == null) {
                    synchronized (ke.class) {
                        try {
                            vc1Var = zzc;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzc = vc1Var;
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

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ff extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final ff zzc;
    private static volatile wd1 zzd;
    private int zze;
    private int zzf;
    private ce zzg;

    static {
        ff ffVar = new ff();
        zzc = ffVar;
        wc1.t(ff.class, ffVar);
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
                return new ae1(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", df.f3642a, "zzg"});
            case 3:
                return new ff();
            case 4:
                return new f8(28, aVar);
            case 5:
                return zzc;
            case 6:
                wd1 vc1Var = zzd;
                if (vc1Var == null) {
                    synchronized (ff.class) {
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

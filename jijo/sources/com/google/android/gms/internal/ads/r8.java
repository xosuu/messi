package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class r8 extends wc1 {
    private static final r8 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        r8 r8Var = new r8();
        zza = r8Var;
        wc1.t(r8.class, r8Var);
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
                return new ae1(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", m8.f6883a, "zze"});
            case 3:
                return new r8();
            case 4:
                return new f8(7, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (r8.class) {
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

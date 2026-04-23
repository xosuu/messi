package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sd extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final sd zzc;
    private static volatile wd1 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        sd sdVar = new sd();
        zzc = sdVar;
        wc1.t(sd.class, sdVar);
    }

    public static pd A() {
        return (pd) zzc.g();
    }

    public static void B(sd sdVar, int i10) {
        sdVar.getClass();
        if (i10 == 0) {
            throw null;
        }
        sdVar.zzf = i10 - 1;
        sdVar.zze |= 1;
    }

    public static void C(sd sdVar, int i10) {
        sdVar.getClass();
        sdVar.zzg = g1.a.i(i10);
        sdVar.zze |= 2;
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
                return new ae1(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", rd.f8579a, "zzg", qd.f8158a});
            case 3:
                return new sd();
            case 4:
                return new pd(zzc);
            case 5:
                return zzc;
            case 6:
                wd1 vc1Var = zzd;
                if (vc1Var == null) {
                    synchronized (sd.class) {
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

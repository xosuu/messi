package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class se extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final se zzc;
    private static volatile wd1 zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        se seVar = new se();
        zzc = seVar;
        wc1.t(se.class, seVar);
    }

    public static re A() {
        return (re) zzc.g();
    }

    public static se B() {
        return zzc;
    }

    public static void C(se seVar, boolean z9) {
        seVar.zze |= 1;
        seVar.zzf = z9;
    }

    public static void D(se seVar, int i10) {
        seVar.zze |= 2;
        seVar.zzg = i10;
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
                return new ae1(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new se();
            case 4:
                return new re(zzc);
            case 5:
                return zzc;
            case 6:
                wd1 vc1Var = zzd;
                if (vc1Var == null) {
                    synchronized (se.class) {
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

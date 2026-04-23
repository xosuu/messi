package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ne extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final ne zzd;
    private static volatile wd1 zze;
    private int zzf;
    private int zzg;
    private se zzh;
    private ue zzi;

    static {
        ne neVar = new ne();
        zzd = neVar;
        wc1.t(ne.class, neVar);
    }

    public static void A(ne neVar, se seVar) {
        neVar.getClass();
        seVar.getClass();
        neVar.zzh = seVar;
        neVar.zzf |= 2;
    }

    public static void B(ne neVar, ue ueVar) {
        neVar.getClass();
        neVar.zzi = ueVar;
        neVar.zzf |= 4;
    }

    public static me C() {
        return (me) zzd.g();
    }

    public static void D(ne neVar) {
        neVar.getClass();
        neVar.zzg = u.h.b(2);
        neVar.zzf |= 1;
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
                return new ae1(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", qe.f8162a, "zzh", "zzi"});
            case 3:
                return new ne();
            case 4:
                return new me(zzd);
            case 5:
                return zzd;
            case 6:
                wd1 vc1Var = zze;
                if (vc1Var == null) {
                    synchronized (ne.class) {
                        try {
                            vc1Var = zze;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zze = vc1Var;
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

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ue extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final ue zzd;
    private static volatile wd1 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        ue ueVar = new ue();
        zzd = ueVar;
        wc1.t(ue.class, ueVar);
    }

    public static void A(ue ueVar, boolean z9) {
        ueVar.zzf |= 2;
        ueVar.zzh = z9;
    }

    public static void B(ue ueVar, int i10) {
        ueVar.zzf |= 4;
        ueVar.zzi = i10;
    }

    public static te C() {
        return (te) zzd.g();
    }

    public static void D(ue ueVar, boolean z9) {
        ueVar.zzf |= 1;
        ueVar.zzg = z9;
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
                return new ae1(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
            case 3:
                return new ue();
            case 4:
                return new te(zzd);
            case 5:
                return zzd;
            case 6:
                wd1 vc1Var = zze;
                if (vc1Var == null) {
                    synchronized (ue.class) {
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

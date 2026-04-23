package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class cf extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final cf zzc;
    private static volatile wd1 zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        cf cfVar = new cf();
        zzc = cfVar;
        wc1.t(cf.class, cfVar);
    }

    public static bf A() {
        return (bf) zzc.g();
    }

    public static void C(cf cfVar, boolean z9) {
        cfVar.zze |= 1;
        cfVar.zzf = z9;
    }

    public static void D(cf cfVar, int i10) {
        cfVar.zze |= 2;
        cfVar.zzg = i10;
    }

    public final boolean B() {
        return this.zzf;
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
                return new ae1(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new cf();
            case 4:
                return new bf(zzc);
            case 5:
                return zzc;
            case 6:
                wd1 vc1Var = zzd;
                if (vc1Var == null) {
                    synchronized (cf.class) {
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

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ga1 extends wc1 {
    private static final ga1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private z91 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ga1 ga1Var = new ga1();
        zza = ga1Var;
        wc1.t(ga1.class, ga1Var);
    }

    public static fa1 C() {
        return (fa1) zza.g();
    }

    public static /* synthetic */ void E(ga1 ga1Var, z91 z91Var) {
        ga1Var.zzd = z91Var;
        ga1Var.zzc |= 1;
    }

    public static void J(ga1 ga1Var, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        ga1Var.zze = i10 - 2;
    }

    public final int A() {
        return this.zzf;
    }

    public final z91 B() {
        z91 z91Var = this.zzd;
        return z91Var == null ? z91.C() : z91Var;
    }

    public final ua1 D() {
        ua1 ua1VarD = ua1.d(this.zzg);
        return ua1VarD == null ? ua1.UNRECOGNIZED : ua1VarD;
    }

    public final boolean H() {
        return (this.zzc & 1) != 0;
    }

    public final int I() {
        int i10 = this.zze;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
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
                return new ae1(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new ga1();
            case 4:
                return new fa1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (ga1.class) {
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

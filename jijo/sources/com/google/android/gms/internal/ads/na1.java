package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class na1 extends wc1 {
    private static final na1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private pa1 zze;

    static {
        na1 na1Var = new na1();
        zza = na1Var;
        wc1.t(na1.class, na1Var);
    }

    public static ma1 B() {
        return (ma1) zza.g();
    }

    public static na1 C(ec1 ec1Var, pc1 pc1Var) {
        return (na1) wc1.r(zza, ec1Var, pc1Var);
    }

    public static wd1 E() {
        return zza.i();
    }

    public static /* synthetic */ void F(na1 na1Var, pa1 pa1Var) {
        na1Var.zze = pa1Var;
        na1Var.zzc |= 1;
    }

    public final int A() {
        return this.zzd;
    }

    public final pa1 D() {
        pa1 pa1Var = this.zze;
        return pa1Var == null ? pa1.B() : pa1Var;
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
                return new ae1(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new na1();
            case 4:
                return new ma1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (na1.class) {
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

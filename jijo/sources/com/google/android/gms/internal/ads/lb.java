package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class lb extends wc1 {
    private static final lb zza;
    private static volatile wd1 zzb;
    private int zzc;
    private nb zzd;
    private ec1 zze;
    private ec1 zzf;

    static {
        lb lbVar = new lb();
        zza = lbVar;
        wc1.t(lb.class, lbVar);
    }

    public lb() {
        cc1 cc1Var = ec1.f3903b;
        this.zze = cc1Var;
        this.zzf = cc1Var;
    }

    public static lb A(cc1 cc1Var, pc1 pc1Var) {
        return (lb) wc1.r(zza, cc1Var, pc1Var);
    }

    public final nb B() {
        nb nbVar = this.zzd;
        return nbVar == null ? nb.E() : nbVar;
    }

    public final ec1 C() {
        return this.zzf;
    }

    public final ec1 D() {
        return this.zze;
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
                return new ae1(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new lb();
            case 4:
                return new f8(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (lb.class) {
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

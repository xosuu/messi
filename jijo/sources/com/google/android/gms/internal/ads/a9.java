package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class a9 extends wc1 {
    private static final a9 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private ec1 zzd;
    private ec1 zze;
    private ec1 zzf;
    private ec1 zzg;

    static {
        a9 a9Var = new a9();
        zza = a9Var;
        wc1.t(a9.class, a9Var);
    }

    public a9() {
        cc1 cc1Var = ec1.f3903b;
        this.zzd = cc1Var;
        this.zze = cc1Var;
        this.zzf = cc1Var;
        this.zzg = cc1Var;
    }

    public static z8 A() {
        return (z8) zza.g();
    }

    public static a9 B(byte[] bArr, pc1 pc1Var) throws zzgyn {
        wc1 wc1VarZ = wc1.z(zza, bArr, bArr.length, pc1Var);
        wc1.y(wc1VarZ);
        return (a9) wc1VarZ;
    }

    public static /* synthetic */ void G(a9 a9Var, cc1 cc1Var) {
        a9Var.zzc |= 1;
        a9Var.zzd = cc1Var;
    }

    public static /* synthetic */ void H(a9 a9Var, cc1 cc1Var) {
        a9Var.zzc |= 2;
        a9Var.zze = cc1Var;
    }

    public static /* synthetic */ void I(a9 a9Var, cc1 cc1Var) {
        a9Var.zzc |= 4;
        a9Var.zzf = cc1Var;
    }

    public static /* synthetic */ void J(a9 a9Var, cc1 cc1Var) {
        a9Var.zzc |= 8;
        a9Var.zzg = cc1Var;
    }

    public final ec1 C() {
        return this.zzd;
    }

    public final ec1 D() {
        return this.zze;
    }

    public final ec1 E() {
        return this.zzg;
    }

    public final ec1 F() {
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
                return new ae1(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new a9();
            case 4:
                return new z8(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (a9.class) {
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

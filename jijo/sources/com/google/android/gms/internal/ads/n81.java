package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class n81 extends wc1 {
    private static final n81 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private p81 zze;

    static {
        n81 n81Var = new n81();
        zza = n81Var;
        wc1.t(n81.class, n81Var);
    }

    public static m81 B() {
        return (m81) zza.g();
    }

    public static n81 C(ec1 ec1Var, pc1 pc1Var) {
        return (n81) wc1.r(zza, ec1Var, pc1Var);
    }

    public static /* synthetic */ void F(n81 n81Var, p81 p81Var) {
        n81Var.zze = p81Var;
        n81Var.zzc |= 1;
    }

    public final int A() {
        return this.zzd;
    }

    public final p81 D() {
        p81 p81Var = this.zze;
        return p81Var == null ? p81.C() : p81Var;
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
                return new n81();
            case 4:
                return new m81(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (n81.class) {
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

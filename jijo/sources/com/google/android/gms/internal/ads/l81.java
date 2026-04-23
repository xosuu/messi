package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class l81 extends wc1 {
    private static final l81 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private ec1 zze = ec1.f3903b;
    private p81 zzf;

    static {
        l81 l81Var = new l81();
        zza = l81Var;
        wc1.t(l81.class, l81Var);
    }

    public static k81 B() {
        return (k81) zza.g();
    }

    public static l81 C(ec1 ec1Var, pc1 pc1Var) {
        return (l81) wc1.r(zza, ec1Var, pc1Var);
    }

    public static wd1 F() {
        return zza.i();
    }

    public static /* synthetic */ void H(l81 l81Var, p81 p81Var) {
        l81Var.zzf = p81Var;
        l81Var.zzc |= 1;
    }

    public final int A() {
        return this.zzd;
    }

    public final p81 D() {
        p81 p81Var = this.zzf;
        return p81Var == null ? p81.C() : p81Var;
    }

    public final ec1 E() {
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
                return new ae1(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new l81();
            case 4:
                return new k81(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (l81.class) {
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

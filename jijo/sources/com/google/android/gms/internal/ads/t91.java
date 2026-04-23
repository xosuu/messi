package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class t91 extends wc1 {
    private static final t91 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private x91 zze;
    private ec1 zzf = ec1.f3903b;

    static {
        t91 t91Var = new t91();
        zza = t91Var;
        wc1.t(t91.class, t91Var);
    }

    public static s91 B() {
        return (s91) zza.g();
    }

    public static t91 C() {
        return zza;
    }

    public static t91 D(ec1 ec1Var, pc1 pc1Var) {
        return (t91) wc1.r(zza, ec1Var, pc1Var);
    }

    public static wd1 G() {
        return zza.i();
    }

    public static /* synthetic */ void H(t91 t91Var, x91 x91Var) {
        t91Var.zze = x91Var;
        t91Var.zzc |= 1;
    }

    public final int A() {
        return this.zzd;
    }

    public final x91 E() {
        x91 x91Var = this.zze;
        return x91Var == null ? x91.D() : x91Var;
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
                return new ae1(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new t91();
            case 4:
                return new s91(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (t91.class) {
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

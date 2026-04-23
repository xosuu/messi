package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class r81 extends wc1 {
    private static final r81 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private v81 zze;
    private t91 zzf;

    static {
        r81 r81Var = new r81();
        zza = r81Var;
        wc1.t(r81.class, r81Var);
    }

    public static q81 B() {
        return (q81) zza.g();
    }

    public static r81 C(ec1 ec1Var, pc1 pc1Var) {
        return (r81) wc1.r(zza, ec1Var, pc1Var);
    }

    public static wd1 F() {
        return zza.i();
    }

    public static /* synthetic */ void G(r81 r81Var, v81 v81Var) {
        r81Var.zze = v81Var;
        r81Var.zzc |= 1;
    }

    public static /* synthetic */ void H(r81 r81Var, t91 t91Var) {
        r81Var.zzf = t91Var;
        r81Var.zzc |= 2;
    }

    public final int A() {
        return this.zzd;
    }

    public final v81 D() {
        v81 v81Var = this.zze;
        return v81Var == null ? v81.C() : v81Var;
    }

    public final t91 E() {
        t91 t91Var = this.zzf;
        return t91Var == null ? t91.C() : t91Var;
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
                return new ae1(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new r81();
            case 4:
                return new q81(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (r81.class) {
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

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class v91 extends wc1 {
    private static final v91 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private x91 zzd;
    private int zze;
    private int zzf;

    static {
        v91 v91Var = new v91();
        zza = v91Var;
        wc1.t(v91.class, v91Var);
    }

    public static u91 C() {
        return (u91) zza.g();
    }

    public static v91 D() {
        return zza;
    }

    public static v91 E(ec1 ec1Var, pc1 pc1Var) {
        return (v91) wc1.r(zza, ec1Var, pc1Var);
    }

    public static /* synthetic */ void G(v91 v91Var, x91 x91Var) {
        v91Var.zzd = x91Var;
        v91Var.zzc |= 1;
    }

    public final int A() {
        return this.zze;
    }

    public final int B() {
        return this.zzf;
    }

    public final x91 F() {
        x91 x91Var = this.zzd;
        return x91Var == null ? x91.D() : x91Var;
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
                return new ae1(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new v91();
            case 4:
                return new u91(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (v91.class) {
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

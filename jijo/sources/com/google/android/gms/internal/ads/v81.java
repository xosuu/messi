package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class v81 extends wc1 {
    private static final v81 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private z81 zze;
    private ec1 zzf = ec1.f3903b;

    static {
        v81 v81Var = new v81();
        zza = v81Var;
        wc1.t(v81.class, v81Var);
    }

    public static u81 B() {
        return (u81) zza.g();
    }

    public static v81 C() {
        return zza;
    }

    public static /* synthetic */ void F(v81 v81Var, z81 z81Var) {
        v81Var.zze = z81Var;
        v81Var.zzc |= 1;
    }

    public final int A() {
        return this.zzd;
    }

    public final z81 D() {
        z81 z81Var = this.zze;
        return z81Var == null ? z81.C() : z81Var;
    }

    public final ec1 E() {
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
                return new v81();
            case 4:
                return new u81(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (v81.class) {
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

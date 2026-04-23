package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class b91 extends wc1 {
    private static final b91 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private f91 zze;
    private ec1 zzf = ec1.f3903b;

    static {
        b91 b91Var = new b91();
        zza = b91Var;
        wc1.t(b91.class, b91Var);
    }

    public static a91 B() {
        return (a91) zza.g();
    }

    public static b91 C(ec1 ec1Var, pc1 pc1Var) {
        return (b91) wc1.r(zza, ec1Var, pc1Var);
    }

    public static wd1 F() {
        return zza.i();
    }

    public static /* synthetic */ void G(b91 b91Var, f91 f91Var) {
        b91Var.zze = f91Var;
        b91Var.zzc |= 1;
    }

    public final int A() {
        return this.zzd;
    }

    public final f91 D() {
        f91 f91Var = this.zze;
        return f91Var == null ? f91.C() : f91Var;
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
                return new b91();
            case 4:
                return new a91(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (b91.class) {
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

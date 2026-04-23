package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class p91 extends wc1 {
    private static final p91 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private ec1 zzd = ec1.f3903b;

    static {
        p91 p91Var = new p91();
        zza = p91Var;
        wc1.t(p91.class, p91Var);
    }

    public static o91 B() {
        return (o91) zza.g();
    }

    public static p91 C(ec1 ec1Var, pc1 pc1Var) {
        return (p91) wc1.r(zza, ec1Var, pc1Var);
    }

    public static wd1 E() {
        return zza.i();
    }

    public final int A() {
        return this.zzc;
    }

    public final ec1 D() {
        return this.zzd;
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
                return new ae1(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzc", "zzd"});
            case 3:
                return new p91();
            case 4:
                return new o91(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (p91.class) {
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

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ya1 extends wc1 {
    private static final ya1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private ec1 zzd = ec1.f3903b;

    static {
        ya1 ya1Var = new ya1();
        zza = ya1Var;
        wc1.t(ya1.class, ya1Var);
    }

    public static xa1 B() {
        return (xa1) zza.g();
    }

    public static ya1 C(ec1 ec1Var, pc1 pc1Var) {
        return (ya1) wc1.r(zza, ec1Var, pc1Var);
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
                return new ae1(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
            case 3:
                return new ya1();
            case 4:
                return new xa1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (ya1.class) {
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

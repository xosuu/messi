package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ra1 extends wc1 {
    private static final ra1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private ta1 zze;

    static {
        ra1 ra1Var = new ra1();
        zza = ra1Var;
        wc1.t(ra1.class, ra1Var);
    }

    public static qa1 B() {
        return (qa1) zza.g();
    }

    public static ra1 C(ec1 ec1Var, pc1 pc1Var) {
        return (ra1) wc1.r(zza, ec1Var, pc1Var);
    }

    public static wd1 E() {
        return zza.i();
    }

    public static /* synthetic */ void F(ra1 ra1Var, ta1 ta1Var) {
        ra1Var.zze = ta1Var;
        ra1Var.zzc |= 1;
    }

    public final int A() {
        return this.zzd;
    }

    public final ta1 D() {
        ta1 ta1Var = this.zze;
        return ta1Var == null ? ta1.C() : ta1Var;
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
                return new ra1();
            case 4:
                return new qa1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (ra1.class) {
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

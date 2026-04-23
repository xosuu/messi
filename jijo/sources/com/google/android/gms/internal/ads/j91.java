package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class j91 extends wc1 {
    private static final j91 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;

    static {
        j91 j91Var = new j91();
        zza = j91Var;
        wc1.t(j91.class, j91Var);
    }

    public static i91 C() {
        return (i91) zza.g();
    }

    public static j91 D(ec1 ec1Var, pc1 pc1Var) {
        return (j91) wc1.r(zza, ec1Var, pc1Var);
    }

    public final int A() {
        return this.zzc;
    }

    public final int B() {
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
                return new ae1(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
            case 3:
                return new j91();
            case 4:
                return new i91(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (j91.class) {
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

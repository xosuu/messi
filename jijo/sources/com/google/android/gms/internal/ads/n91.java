package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class n91 extends wc1 {
    private static final n91 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;

    static {
        n91 n91Var = new n91();
        zza = n91Var;
        wc1.t(n91.class, n91Var);
    }

    public static m91 C() {
        return (m91) zza.g();
    }

    public static n91 D(ec1 ec1Var, pc1 pc1Var) {
        return (n91) wc1.r(zza, ec1Var, pc1Var);
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
                return new ae1(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
            case 3:
                return new n91();
            case 4:
                return new m91(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (n91.class) {
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

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class z81 extends wc1 {
    private static final z81 zza;
    private static volatile wd1 zzb;
    private int zzc;

    static {
        z81 z81Var = new z81();
        zza = z81Var;
        wc1.t(z81.class, z81Var);
    }

    public static y81 B() {
        return (y81) zza.g();
    }

    public static z81 C() {
        return zza;
    }

    public final int A() {
        return this.zzc;
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
                return new ae1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case 3:
                return new z81();
            case 4:
                return new y81(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (z81.class) {
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

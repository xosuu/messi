package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class p81 extends wc1 {
    private static final p81 zza;
    private static volatile wd1 zzb;
    private int zzc;

    static {
        p81 p81Var = new p81();
        zza = p81Var;
        wc1.t(p81.class, p81Var);
    }

    public static o81 B() {
        return (o81) zza.g();
    }

    public static p81 C() {
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
                return new p81();
            case 4:
                return new o81(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (p81.class) {
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

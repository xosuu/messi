package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mt0 extends wc1 {
    private static final mt0 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private jt0 zzd;

    static {
        mt0 mt0Var = new mt0();
        zza = mt0Var;
        wc1.t(mt0.class, mt0Var);
    }

    public static lt0 A() {
        return (lt0) zza.g();
    }

    public static /* synthetic */ void B(mt0 mt0Var, jt0 jt0Var) {
        mt0Var.zzd = jt0Var;
        mt0Var.zzc |= 1;
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
                return new ae1(zza, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
            case 3:
                return new mt0();
            case 4:
                return new lt0(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (mt0.class) {
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

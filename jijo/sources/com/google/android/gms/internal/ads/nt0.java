package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nt0 extends wc1 {
    private static final nt0 zza;
    private static volatile wd1 zzb;
    private dd1 zzc = zd1.f11221f;

    static {
        nt0 nt0Var = new nt0();
        zza = nt0Var;
        wc1.t(nt0.class, nt0Var);
    }

    public static kt0 B() {
        return (kt0) zza.g();
    }

    public static void C(nt0 nt0Var) {
        nt0Var.zzc = zd1.f11221f;
    }

    public static void D(nt0 nt0Var, mt0 mt0Var) {
        dd1 dd1Var = nt0Var.zzc;
        if (!((wb1) dd1Var).f10152a) {
            nt0Var.zzc = wc1.h(dd1Var);
        }
        nt0Var.zzc.add(mt0Var);
    }

    public final int A() {
        return this.zzc.size();
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
                return new ae1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", mt0.class});
            case 3:
                return new nt0();
            case 4:
                return new kt0(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (nt0.class) {
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

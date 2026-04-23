package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class we1 extends wc1 {
    private static final we1 zza;
    private static volatile wd1 zzb;
    private dd1 zzc = zd1.f11221f;

    static {
        we1 we1Var = new we1();
        zza = we1Var;
        wc1.t(we1.class, we1Var);
    }

    public static ve1 A() {
        return (ve1) zza.g();
    }

    public static void B(we1 we1Var, ue1 ue1Var) {
        dd1 dd1Var = we1Var.zzc;
        if (!((wb1) dd1Var).f10152a) {
            we1Var.zzc = wc1.h(dd1Var);
        }
        we1Var.zzc.add(ue1Var);
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
                return new ae1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", ue1.class});
            case 3:
                return new we1();
            case 4:
                return new ve1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (we1.class) {
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

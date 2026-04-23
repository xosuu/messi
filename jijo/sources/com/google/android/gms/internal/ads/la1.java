package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class la1 extends wc1 {
    private static final la1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private dd1 zzd = zd1.f11221f;

    static {
        la1 la1Var = new la1();
        zza = la1Var;
        wc1.t(la1.class, la1Var);
    }

    public static ia1 A() {
        return (ia1) zza.g();
    }

    public static void C(la1 la1Var, ka1 ka1Var) {
        dd1 dd1Var = la1Var.zzd;
        if (!((wb1) dd1Var).f10152a) {
            la1Var.zzd = wc1.h(dd1Var);
        }
        la1Var.zzd.add(ka1Var);
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
                return new ae1(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", ka1.class});
            case 3:
                return new la1();
            case 4:
                return new ia1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (la1.class) {
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

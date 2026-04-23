package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ve extends wc1 {
    public static final int zza = 1;
    private static final ve zzb;
    private static volatile wd1 zzc;
    private dd1 zzd = zd1.f11221f;

    static {
        ve veVar = new ve();
        zzb = veVar;
        wc1.t(ve.class, veVar);
    }

    public static oe A() {
        return (oe) zzb.g();
    }

    public static void B(ve veVar, ne neVar) {
        veVar.getClass();
        dd1 dd1Var = veVar.zzd;
        if (!((wb1) dd1Var).f10152a) {
            veVar.zzd = wc1.h(dd1Var);
        }
        veVar.zzd.add(neVar);
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
                return new ae1(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", ne.class});
            case 3:
                return new ve();
            case 4:
                return new oe(zzb);
            case 5:
                return zzb;
            case 6:
                wd1 vc1Var = zzc;
                if (vc1Var == null) {
                    synchronized (ve.class) {
                        try {
                            vc1Var = zzc;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzc = vc1Var;
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

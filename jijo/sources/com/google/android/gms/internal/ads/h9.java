package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class h9 extends wc1 {
    private static final h9 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private dd1 zzd = zd1.f11221f;
    private ec1 zze = ec1.f3903b;
    private int zzf = 1;
    private int zzg = 1;

    static {
        h9 h9Var = new h9();
        zza = h9Var;
        wc1.t(h9.class, h9Var);
    }

    public static g9 A() {
        return (g9) zza.g();
    }

    public static void B(h9 h9Var, cc1 cc1Var) {
        dd1 dd1Var = h9Var.zzd;
        if (!((wb1) dd1Var).f10152a) {
            h9Var.zzd = wc1.h(dd1Var);
        }
        h9Var.zzd.add(cc1Var);
    }

    public static /* synthetic */ void C(h9 h9Var, cc1 cc1Var) {
        h9Var.zzc |= 1;
        h9Var.zze = cc1Var;
    }

    public static /* synthetic */ void D(h9 h9Var) {
        h9Var.zzg = 4;
        h9Var.zzc = 4 | h9Var.zzc;
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
                return new ae1(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", d9.f3599a, "zzg", b9.f2940a});
            case 3:
                return new h9();
            case 4:
                return new g9(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (h9.class) {
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

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class d91 extends wc1 {
    private static final d91 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private f91 zzd;
    private int zze;

    static {
        d91 d91Var = new d91();
        zza = d91Var;
        wc1.t(d91.class, d91Var);
    }

    public static c91 B() {
        return (c91) zza.g();
    }

    public static d91 C(ec1 ec1Var, pc1 pc1Var) {
        return (d91) wc1.r(zza, ec1Var, pc1Var);
    }

    public static /* synthetic */ void E(d91 d91Var, f91 f91Var) {
        d91Var.zzd = f91Var;
        d91Var.zzc |= 1;
    }

    public final int A() {
        return this.zze;
    }

    public final f91 D() {
        f91 f91Var = this.zzd;
        return f91Var == null ? f91.C() : f91Var;
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
                return new ae1(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new d91();
            case 4:
                return new c91(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (d91.class) {
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

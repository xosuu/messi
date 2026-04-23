package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class t81 extends wc1 {
    private static final t81 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private x81 zzd;
    private v91 zze;

    static {
        t81 t81Var = new t81();
        zza = t81Var;
        wc1.t(t81.class, t81Var);
    }

    public static s81 A() {
        return (s81) zza.g();
    }

    public static t81 B(ec1 ec1Var, pc1 pc1Var) {
        return (t81) wc1.r(zza, ec1Var, pc1Var);
    }

    public static /* synthetic */ void E(t81 t81Var, x81 x81Var) {
        t81Var.zzd = x81Var;
        t81Var.zzc |= 1;
    }

    public static /* synthetic */ void F(t81 t81Var, v91 v91Var) {
        t81Var.zze = v91Var;
        t81Var.zzc |= 2;
    }

    public final x81 C() {
        x81 x81Var = this.zzd;
        return x81Var == null ? x81.C() : x81Var;
    }

    public final v91 D() {
        v91 v91Var = this.zze;
        return v91Var == null ? v91.D() : v91Var;
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
                return new ae1(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new t81();
            case 4:
                return new s81(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (t81.class) {
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

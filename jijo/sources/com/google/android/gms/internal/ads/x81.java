package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class x81 extends wc1 {
    private static final x81 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private z81 zzd;
    private int zze;

    static {
        x81 x81Var = new x81();
        zza = x81Var;
        wc1.t(x81.class, x81Var);
    }

    public static w81 B() {
        return (w81) zza.g();
    }

    public static x81 C() {
        return zza;
    }

    public static /* synthetic */ void E(x81 x81Var, z81 z81Var) {
        x81Var.zzd = z81Var;
        x81Var.zzc |= 1;
    }

    public final int A() {
        return this.zze;
    }

    public final z81 D() {
        z81 z81Var = this.zzd;
        return z81Var == null ? z81.C() : z81Var;
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
                return new x81();
            case 4:
                return new w81(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (x81.class) {
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

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class eg1 extends wc1 {
    private static final eg1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private ec1 zzf;
    private ec1 zzg;

    static {
        eg1 eg1Var = new eg1();
        zza = eg1Var;
        wc1.t(eg1.class, eg1Var);
    }

    public eg1() {
        cc1 cc1Var = ec1.f3903b;
        this.zzf = cc1Var;
        this.zzg = cc1Var;
    }

    public static cg1 A() {
        return (cg1) zza.g();
    }

    public static /* synthetic */ void B(eg1 eg1Var) {
        eg1Var.zzc |= 2;
        eg1Var.zze = "image/png";
    }

    public static /* synthetic */ void C(eg1 eg1Var, ec1 ec1Var) {
        ec1Var.getClass();
        eg1Var.zzc |= 4;
        eg1Var.zzf = ec1Var;
    }

    public static /* synthetic */ void D(eg1 eg1Var) {
        eg1Var.zzd = 1;
        eg1Var.zzc = 1 | eg1Var.zzc;
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
                return new ae1(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", dg1.f3648a, "zze", "zzf", "zzg"});
            case 3:
                return new eg1();
            case 4:
                return new cg1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (eg1.class) {
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

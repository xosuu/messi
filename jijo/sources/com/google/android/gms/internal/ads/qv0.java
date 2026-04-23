package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class qv0 extends wc1 {
    private static final qv0 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private nv0 zzg;

    static {
        qv0 qv0Var = new qv0();
        zza = qv0Var;
        wc1.t(qv0.class, qv0Var);
    }

    public static ov0 A() {
        return (ov0) zza.g();
    }

    public static /* synthetic */ void B(qv0 qv0Var, String str) {
        str.getClass();
        qv0Var.zzc |= 2;
        qv0Var.zze = str;
    }

    public static /* synthetic */ void C(qv0 qv0Var, nv0 nv0Var) {
        qv0Var.zzg = nv0Var;
        qv0Var.zzc |= 8;
    }

    public static /* synthetic */ void D(qv0 qv0Var) {
        qv0Var.zzd = 1;
        qv0Var.zzc = 1 | qv0Var.zzc;
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
                return new ae1(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", pv0.f7969a, "zze", "zzf", "zzg"});
            case 3:
                return new qv0();
            case 4:
                return new ov0(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (qv0.class) {
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

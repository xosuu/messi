package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class ta1 extends wc1 {
    private static final ta1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private ba1 zze;

    static {
        ta1 ta1Var = new ta1();
        zza = ta1Var;
        wc1.t(ta1.class, ta1Var);
    }

    public static sa1 B() {
        return (sa1) zza.g();
    }

    public static ta1 C() {
        return zza;
    }

    public static ta1 D(ec1 ec1Var, pc1 pc1Var) {
        return (ta1) wc1.r(zza, ec1Var, pc1Var);
    }

    public static /* synthetic */ void F(ta1 ta1Var, String str) {
        str.getClass();
        ta1Var.zzd = str;
    }

    public static /* synthetic */ void G(ta1 ta1Var, ba1 ba1Var) {
        ba1Var.getClass();
        ta1Var.zze = ba1Var;
        ta1Var.zzc |= 1;
    }

    public final ba1 A() {
        ba1 ba1Var = this.zze;
        return ba1Var == null ? ba1.B() : ba1Var;
    }

    public final String E() {
        return this.zzd;
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
                return new ae1(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new ta1();
            case 4:
                return new sa1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (ta1.class) {
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

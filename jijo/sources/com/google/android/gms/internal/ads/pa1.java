package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class pa1 extends wc1 {
    private static final pa1 zza;
    private static volatile wd1 zzb;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        pa1 pa1Var = new pa1();
        zza = pa1Var;
        wc1.t(pa1.class, pa1Var);
    }

    public static oa1 A() {
        return (oa1) zza.g();
    }

    public static pa1 B() {
        return zza;
    }

    public static pa1 C(ec1 ec1Var, pc1 pc1Var) {
        return (pa1) wc1.r(zza, ec1Var, pc1Var);
    }

    public static /* synthetic */ void E(pa1 pa1Var, String str) {
        str.getClass();
        pa1Var.zzc = str;
    }

    public final String D() {
        return this.zzc;
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
                return new ae1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case 3:
                return new pa1();
            case 4:
                return new oa1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (pa1.class) {
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

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class wa1 extends wc1 {
    public static final /* synthetic */ int zza = 0;
    private static final wa1 zzb;
    private static volatile wd1 zzc;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private dd1 zze = zd1.f11221f;

    static {
        wa1 wa1Var = new wa1();
        zzb = wa1Var;
        wc1.t(wa1.class, wa1Var);
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
                return new ae1(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", da1.class});
            case 3:
                return new wa1();
            case 4:
                return new jf(zzb);
            case 5:
                return zzb;
            case 6:
                wd1 vc1Var = zzc;
                if (vc1Var == null) {
                    synchronized (wa1.class) {
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

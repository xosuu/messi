package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class z91 extends wc1 {
    private static final z91 zza;
    private static volatile wd1 zzb;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private ec1 zzd = ec1.f3903b;
    private int zze;

    static {
        z91 z91Var = new z91();
        zza = z91Var;
        wc1.t(z91.class, z91Var);
    }

    public static y91 A() {
        return (y91) zza.g();
    }

    public static z91 C() {
        return zza;
    }

    public static /* synthetic */ void F(z91 z91Var, String str) {
        str.getClass();
        z91Var.zzc = str;
    }

    public static /* synthetic */ void G(z91 z91Var, ec1 ec1Var) {
        ec1Var.getClass();
        z91Var.zzd = ec1Var;
    }

    public final int B() {
        int i10 = this.zze;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    i11 = i10 != 3 ? i10 != 4 ? 0 : 5 : 4;
                }
            } else {
                i11 = 2;
            }
        }
        if (i11 == 0) {
            return 6;
        }
        return i11;
    }

    public final ec1 D() {
        return this.zzd;
    }

    public final String E() {
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
                return new ae1(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new z91();
            case 4:
                return new y91(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (z91.class) {
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

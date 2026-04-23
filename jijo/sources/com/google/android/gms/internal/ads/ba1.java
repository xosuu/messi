package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class ba1 extends wc1 {
    private static final ba1 zza;
    private static volatile wd1 zzb;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private ec1 zzd = ec1.f3903b;
    private int zze;

    static {
        ba1 ba1Var = new ba1();
        zza = ba1Var;
        wc1.t(ba1.class, ba1Var);
    }

    public static aa1 A() {
        return (aa1) zza.g();
    }

    public static ba1 B() {
        return zza;
    }

    public static ba1 C(byte[] bArr, pc1 pc1Var) {
        wc1 wc1VarZ = wc1.z(zza, bArr, bArr.length, pc1Var);
        wc1.y(wc1VarZ);
        return (ba1) wc1VarZ;
    }

    public static /* synthetic */ void G(ba1 ba1Var, String str) {
        str.getClass();
        ba1Var.zzc = str;
    }

    public static /* synthetic */ void H(ba1 ba1Var, ec1 ec1Var) {
        ec1Var.getClass();
        ba1Var.zzd = ec1Var;
    }

    public final ua1 D() {
        ua1 ua1VarD = ua1.d(this.zze);
        return ua1VarD == null ? ua1.UNRECOGNIZED : ua1VarD;
    }

    public final ec1 E() {
        return this.zzd;
    }

    public final String F() {
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
                return new ba1();
            case 4:
                return new aa1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (ba1.class) {
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

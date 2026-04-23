package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nv0 extends wc1 {
    private static final nv0 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private ad1 zzd = xc1.f10536f;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        nv0 nv0Var = new nv0();
        zza = nv0Var;
        wc1.t(nv0.class, nv0Var);
    }

    public static mv0 A() {
        return (mv0) zza.g();
    }

    public static /* synthetic */ void B(nv0 nv0Var, String str) {
        str.getClass();
        nv0Var.zzc |= 1;
        nv0Var.zze = str;
    }

    public static void C(nv0 nv0Var) {
        dd1 dd1Var = nv0Var.zzd;
        if (!((wb1) dd1Var).f10152a) {
            int size = dd1Var.size();
            int i10 = size == 0 ? 10 : size + size;
            xc1 xc1Var = (xc1) dd1Var;
            if (i10 < xc1Var.f10538d) {
                throw new IllegalArgumentException();
            }
            nv0Var.zzd = new xc1(Arrays.copyOf(xc1Var.f10537b, i10), xc1Var.f10538d, true);
        }
        ((xc1) nv0Var.zzd).f(2);
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
                return new ae1(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", lv0.f6705a, "zze", "zzf", "zzg"});
            case 3:
                return new nv0();
            case 4:
                return new mv0(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (nv0.class) {
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

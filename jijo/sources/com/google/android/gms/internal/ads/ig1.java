package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class ig1 extends wc1 {
    private static final ig1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private qf1 zzf;
    private sf1 zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private ad1 zzi = xc1.f10536f;
    private String zzj = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private dd1 zzl = zd1.f11221f;

    static {
        ig1 ig1Var = new ig1();
        zza = ig1Var;
        wc1.t(ig1.class, ig1Var);
    }

    public static hg1 B() {
        return (hg1) zza.g();
    }

    public static /* synthetic */ void D(ig1 ig1Var, int i10) {
        ig1Var.zzc |= 1;
        ig1Var.zzd = i10;
    }

    public static /* synthetic */ void E(ig1 ig1Var, String str) {
        str.getClass();
        ig1Var.zzc |= 2;
        ig1Var.zze = str;
    }

    public static /* synthetic */ void F(ig1 ig1Var, qf1 qf1Var) {
        ig1Var.zzf = qf1Var;
        ig1Var.zzc |= 4;
    }

    public static void G(ig1 ig1Var, String str) {
        str.getClass();
        dd1 dd1Var = ig1Var.zzl;
        if (!((wb1) dd1Var).f10152a) {
            ig1Var.zzl = wc1.h(dd1Var);
        }
        ig1Var.zzl.add(str);
    }

    public static /* synthetic */ void H(ig1 ig1Var, int i10) {
        ig1Var.zzk = i10 - 1;
        ig1Var.zzc |= 64;
    }

    public final int A() {
        return this.zzl.size();
    }

    public final String C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return Byte.valueOf(this.zzm);
            case 1:
                this.zzm = wc1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new ae1(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", gg1.f4914a, "zzl"});
            case 3:
                return new ig1();
            case 4:
                return new hg1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (ig1.class) {
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

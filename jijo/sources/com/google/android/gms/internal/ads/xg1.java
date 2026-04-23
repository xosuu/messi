package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class xg1 extends wc1 {
    private static final xg1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzf = 4;
    private dd1 zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;
    private dd1 zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;

    static {
        xg1 xg1Var = new xg1();
        zza = xg1Var;
        wc1.t(xg1.class, xg1Var);
    }

    public xg1() {
        zd1 zd1Var = zd1.f11221f;
        this.zzg = zd1Var;
        this.zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzl = zd1Var;
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = 0;
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", wg1.f10182a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", vg1.class, "zze", "zzm", ug1.f9478a, "zzn", "zzo", "zzp", "zzu"});
            case 3:
                return new xg1();
            case 4:
                return new tg1(i11);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (xg1.class) {
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

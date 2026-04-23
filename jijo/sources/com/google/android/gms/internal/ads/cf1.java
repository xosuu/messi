package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class cf1 extends wc1 {
    private static final cf1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private dd1 zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private dd1 zzu;
    private boolean zzv;
    private long zzw;
    private ad1 zzx;
    private boolean zzy;
    private ad1 zzz;

    static {
        cf1 cf1Var = new cf1();
        zza = cf1Var;
        wc1.t(cf1.class, cf1Var);
    }

    public cf1() {
        zd1 zd1Var = zd1.f11221f;
        this.zzg = zd1Var;
        this.zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzu = zd1Var;
        xc1 xc1Var = xc1.f10536f;
        this.zzx = xc1Var;
        this.zzz = xc1Var;
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        Object obj = null;
        if (i10 == 0) {
            throw null;
        }
        int i11 = 13;
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", bf1.f3016a, "zze", "zzf", "zzg", "zzh", ze1.f11226a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", ye1.class, "zzv", "zzw", "zzx", se1.f8850a, "zzy", "zzz", af1.f2674a});
            case 3:
                return new cf1();
            case 4:
                return new jf(i11, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (cf1.class) {
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

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class i8 extends wc1 {
    private static final i8 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzk = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzm = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzn = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private dd1 zzo = zd1.f11221f;

    static {
        i8 i8Var = new i8();
        zza = i8Var;
        wc1.t(i8.class, i8Var);
    }

    public static e8 A() {
        return (e8) zza.g();
    }

    public static /* synthetic */ void B(i8 i8Var, long j10) {
        i8Var.zzc |= 2;
        i8Var.zze = j10;
    }

    public static /* synthetic */ void C(i8 i8Var, String str) {
        str.getClass();
        i8Var.zzc |= 4;
        i8Var.zzf = str;
    }

    public static /* synthetic */ void D(i8 i8Var, String str) {
        i8Var.zzc |= 8;
        i8Var.zzg = str;
    }

    public static /* synthetic */ void E(i8 i8Var, String str) {
        i8Var.zzc |= 16;
        i8Var.zzh = str;
    }

    public static /* synthetic */ void F(i8 i8Var, String str) {
        i8Var.zzc |= 1024;
        i8Var.zzn = str;
    }

    public static /* synthetic */ void G(i8 i8Var, String str) {
        str.getClass();
        i8Var.zzc |= 1;
        i8Var.zzd = str;
    }

    public static /* synthetic */ void H(i8 i8Var, int i10) {
        i8Var.zzp = i10 - 1;
        i8Var.zzc |= 2048;
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
                return new ae1(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", g8.class, "zzp", h8.f5231a});
            case 3:
                return new i8();
            case 4:
                return new e8(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (i8.class) {
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

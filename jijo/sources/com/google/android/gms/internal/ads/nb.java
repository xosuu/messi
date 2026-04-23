package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class nb extends wc1 {
    private static final nb zza;
    private static volatile wd1 zzb;
    private int zzc;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        nb nbVar = new nb();
        zza = nbVar;
        wc1.t(nb.class, nbVar);
    }

    public static mb D() {
        return (mb) zza.g();
    }

    public static nb E() {
        return zza;
    }

    public static nb F(cc1 cc1Var) {
        nb nbVar = zza;
        pc1 pc1Var = pc1.f7857a;
        yd1 yd1Var = yd1.f10857c;
        wc1 wc1VarR = wc1.r(nbVar, cc1Var, pc1.f7858b);
        wc1.y(wc1VarR);
        return (nb) wc1VarR;
    }

    public static nb G(cc1 cc1Var, pc1 pc1Var) {
        return (nb) wc1.r(zza, cc1Var, pc1Var);
    }

    public static /* synthetic */ void J(nb nbVar, String str) {
        str.getClass();
        nbVar.zzc |= 1;
        nbVar.zzd = str;
    }

    public static /* synthetic */ void K(nb nbVar, long j10) {
        nbVar.zzc |= 16;
        nbVar.zzh = j10;
    }

    public static /* synthetic */ void L(nb nbVar, String str) {
        str.getClass();
        nbVar.zzc |= 2;
        nbVar.zze = str;
    }

    public static /* synthetic */ void M(nb nbVar, long j10) {
        nbVar.zzc |= 4;
        nbVar.zzf = j10;
    }

    public static /* synthetic */ void N(nb nbVar, long j10) {
        nbVar.zzc |= 8;
        nbVar.zzg = j10;
    }

    public final long A() {
        return this.zzg;
    }

    public final long B() {
        return this.zzf;
    }

    public final long C() {
        return this.zzh;
    }

    public final String H() {
        return this.zze;
    }

    public final String I() {
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
                return new ae1(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 3:
                return new nb();
            case 4:
                return new mb(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (nb.class) {
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

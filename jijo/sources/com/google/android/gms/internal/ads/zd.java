package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zd extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final zd zzi;
    private static volatile wd1 zzj;
    private int zzk;
    private int zzm;
    private int zzn;
    private long zzo;
    private long zzv;
    private int zzw;
    private dd1 zzl = zd1.f11221f;
    private String zzp = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzu = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zd zdVar = new zd();
        zzi = zdVar;
        wc1.t(zd.class, zdVar);
    }

    public static void A(zd zdVar, ArrayList arrayList) {
        dd1 dd1Var = zdVar.zzl;
        if (!((wb1) dd1Var).f10152a) {
            zdVar.zzl = wc1.h(dd1Var);
        }
        vb1.c(arrayList, zdVar.zzl);
    }

    public static void B(zd zdVar, int i10) {
        zdVar.zzk |= 1;
        zdVar.zzm = i10;
    }

    public static void C(zd zdVar, int i10) {
        zdVar.zzk |= 2;
        zdVar.zzn = i10;
    }

    public static void D(zd zdVar, long j10) {
        zdVar.zzk |= 4;
        zdVar.zzo = j10;
    }

    public static void E(zd zdVar, String str) {
        zdVar.getClass();
        str.getClass();
        zdVar.zzk |= 8;
        zdVar.zzp = str;
    }

    public static void F(zd zdVar, String str) {
        zdVar.getClass();
        str.getClass();
        zdVar.zzk |= 16;
        zdVar.zzu = str;
    }

    public static void G(zd zdVar, long j10) {
        zdVar.zzk |= 32;
        zdVar.zzv = j10;
    }

    public static void H(zd zdVar, int i10) {
        zdVar.zzk |= 64;
        zdVar.zzw = i10;
    }

    public static wd I() {
        return (wd) zzi.g();
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
                return new ae1(zzi, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", vd.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
            case 3:
                return new zd();
            case 4:
                return new wd(zzi);
            case 5:
                return zzi;
            case 6:
                wd1 vc1Var = zzj;
                if (vc1Var == null) {
                    synchronized (zd.class) {
                        try {
                            vc1Var = zzj;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzj = vc1Var;
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

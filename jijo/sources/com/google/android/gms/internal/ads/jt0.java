package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jt0 extends wc1 {
    private static final jt0 zza;
    private static volatile wd1 zzb;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzI;
    private int zzP;
    private int zzQ;
    private int zzS;
    private long zzab;
    private int zzac;
    private int zzad;
    private int zzae;
    private tt0 zzaf;
    private ot0 zzag;
    private pt0 zzah;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private ad1 zzj = xc1.f10536f;
    private String zzu = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzv = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzw = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzx = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzy = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzz = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzB = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzC = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private cd1 zzD = jd1.f5915f;
    private String zzJ = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzK = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzL = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzM = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzN = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzO = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzR = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzT = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzU = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzV = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzW = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzX = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzY = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzZ = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzaa = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        jt0 jt0Var = new jt0();
        zza = jt0Var;
        wc1.t(jt0.class, jt0Var);
    }

    public static ht0 A() {
        return (ht0) zza.g();
    }

    public static /* synthetic */ void B(jt0 jt0Var, String str) {
        str.getClass();
        jt0Var.zzV = str;
    }

    public static /* synthetic */ void D(jt0 jt0Var, String str) {
        str.getClass();
        jt0Var.zzX = str;
    }

    public static /* synthetic */ void E(jt0 jt0Var, String str) {
        str.getClass();
        jt0Var.zzY = str;
    }

    public static /* synthetic */ void F(jt0 jt0Var, String str) {
        str.getClass();
        jt0Var.zzZ = str;
    }

    public static /* synthetic */ void G(jt0 jt0Var, String str) {
        str.getClass();
        jt0Var.zzaa = str;
    }

    public static /* synthetic */ void L(jt0 jt0Var, String str) {
        str.getClass();
        jt0Var.zzu = str;
    }

    public static /* synthetic */ void M(jt0 jt0Var, String str) {
        str.getClass();
        jt0Var.zzx = str;
    }

    public static /* synthetic */ void N(jt0 jt0Var, String str) {
        str.getClass();
        jt0Var.zzz = str;
    }

    public static void P(jt0 jt0Var, List list) {
        dd1 dd1Var = jt0Var.zzD;
        if (!((wb1) dd1Var).f10152a) {
            int size = dd1Var.size();
            int i10 = size == 0 ? 10 : size + size;
            jd1 jd1Var = (jd1) dd1Var;
            if (i10 < jd1Var.f5917d) {
                throw new IllegalArgumentException();
            }
            jt0Var.zzD = new jd1(Arrays.copyOf(jd1Var.f5916b, i10), jd1Var.f5917d, true);
        }
        vb1.c(list, jt0Var.zzD);
    }

    public static /* synthetic */ void S(jt0 jt0Var, String str) {
        str.getClass();
        jt0Var.zzJ = str;
    }

    public static /* synthetic */ void T(jt0 jt0Var, String str) {
        str.getClass();
        jt0Var.zzK = str;
    }

    public static /* synthetic */ void W(jt0 jt0Var, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        jt0Var.zzE = i10 - 2;
    }

    public static /* synthetic */ void X(jt0 jt0Var, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        jt0Var.zzI = i10 - 2;
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
                return new ae1(zza, "\u00005\u0000\u0001\u000155\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0000*ဉ\u0001+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00025\f", new Object[]{"zzc", "zzd", "zzk", "zzl", "zzp", "zzu", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzV", "zzW", "zzX", "zzY", "zzZ", "zzaa", "zzv", "zzw", "zzB", "zzC", "zzD", "zzL", "zzM", "zzU", "zzab", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzo", "zzj", "zzac", "zzad", "zze", "zzaf", "zzag", "zzP", "zzR", "zzO", "zzN", "zzae", "zzQ", "zzS", "zzT", "zzy", "zzah", "zzF"});
            case 3:
                return new jt0();
            case 4:
                return new ht0(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (jt0.class) {
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

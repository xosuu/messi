package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qg1 extends wc1 {
    private static final qg1 zza;
    private static volatile wd1 zzb;
    private dd1 zzA;
    private dd1 zzB;
    private ng1 zzC;
    private dd1 zzD;
    private if1 zzE;
    private String zzF;
    private cf1 zzG;
    private dd1 zzH;
    private vf1 zzI;
    private int zzJ;
    private dd1 zzK;
    private dd1 zzL;
    private long zzM;
    private pg1 zzN;
    private zf1 zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private gf1 zzi;
    private dd1 zzj;
    private dd1 zzk;
    private String zzl;
    private eg1 zzm;
    private boolean zzn;
    private dd1 zzo;
    private String zzp;
    private boolean zzu;
    private boolean zzv;
    private ec1 zzw;
    private kg1 zzx;
    private boolean zzy;
    private String zzz;
    private byte zzP = 2;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        qg1 qg1Var = new qg1();
        zza = qg1Var;
        wc1.t(qg1.class, qg1Var);
    }

    public qg1() {
        zd1 zd1Var = zd1.f11221f;
        this.zzj = zd1Var;
        this.zzk = zd1Var;
        this.zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzo = zd1Var;
        this.zzp = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzw = ec1.f3903b;
        this.zzz = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzA = zd1Var;
        this.zzB = zd1Var;
        this.zzD = zd1Var;
        this.zzF = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzH = zd1Var;
        this.zzK = zd1Var;
        this.zzL = zd1Var;
    }

    public static ef1 A() {
        return (ef1) zza.g();
    }

    public static /* synthetic */ void E(qg1 qg1Var, String str) {
        str.getClass();
        qg1Var.zzc |= 4;
        qg1Var.zzf = str;
    }

    public static /* synthetic */ void F(qg1 qg1Var, String str) {
        str.getClass();
        qg1Var.zzc |= 8;
        qg1Var.zzg = str;
    }

    public static /* synthetic */ void G(qg1 qg1Var, gf1 gf1Var) {
        qg1Var.zzi = gf1Var;
        qg1Var.zzc |= 32;
    }

    public static void H(qg1 qg1Var, ig1 ig1Var) {
        dd1 dd1Var = qg1Var.zzj;
        if (!((wb1) dd1Var).f10152a) {
            qg1Var.zzj = wc1.h(dd1Var);
        }
        qg1Var.zzj.add(ig1Var);
    }

    public static /* synthetic */ void I(qg1 qg1Var, String str) {
        qg1Var.zzc |= 64;
        qg1Var.zzl = str;
    }

    public static /* synthetic */ void J(qg1 qg1Var) {
        qg1Var.zzc &= -65;
        qg1Var.zzl = zza.zzl;
    }

    public static /* synthetic */ void K(qg1 qg1Var, eg1 eg1Var) {
        qg1Var.zzm = eg1Var;
        qg1Var.zzc |= NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    public static /* synthetic */ void L(qg1 qg1Var, kg1 kg1Var) {
        qg1Var.zzx = kg1Var;
        qg1Var.zzc |= 8192;
    }

    public static void M(qg1 qg1Var, ArrayList arrayList) {
        dd1 dd1Var = qg1Var.zzA;
        if (!((wb1) dd1Var).f10152a) {
            qg1Var.zzA = wc1.h(dd1Var);
        }
        vb1.c(arrayList, qg1Var.zzA);
    }

    public static void N(qg1 qg1Var, ArrayList arrayList) {
        dd1 dd1Var = qg1Var.zzB;
        if (!((wb1) dd1Var).f10152a) {
            qg1Var.zzB = wc1.h(dd1Var);
        }
        vb1.c(arrayList, qg1Var.zzB);
    }

    public static /* synthetic */ void O(qg1 qg1Var, int i10) {
        qg1Var.zzd = i10 - 1;
        qg1Var.zzc |= 1;
    }

    public final String B() {
        return this.zzl;
    }

    public final String C() {
        return this.zzf;
    }

    public final dd1 D() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return Byte.valueOf(this.zzP);
            case 1:
                this.zzP = wc1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new ae1(zza, "\u0001\"\u0000\u0001\u0001\"\"\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", ig1.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", fg1.f4524a, "zze", df1.f3644a, "zzi", "zzl", "zzm", "zzw", "zzk", sg1.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", xg1.class, "zzE", "zzF", "zzG", "zzH", lf1.class, "zzI", "zzJ", mg1.f6937a, "zzK", yf1.class, "zzL", bg1.class, "zzM", "zzN", "zzO"});
            case 3:
                return new qg1();
            case 4:
                return new ef1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (qg1.class) {
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

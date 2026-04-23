package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sf extends wc1 {
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private static final sf zzn;
    private static volatile wd1 zzo;
    private mf zzA;
    private of zzB;
    private sd zzC;
    private od zzD;
    private zd zzE;
    private cf zzF;
    private ve zzG;
    private int zzp;
    private int zzu;
    private int zzw;
    private ge zzy;
    private String zzv = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzx = 1000;
    private cd1 zzz = jd1.f5915f;

    static {
        sf sfVar = new sf();
        zzn = sfVar;
        wc1.t(sf.class, sfVar);
    }

    public static void A(sf sfVar, String str) {
        sfVar.getClass();
        str.getClass();
        sfVar.zzp |= 2;
        sfVar.zzv = str;
    }

    public static void B(sf sfVar, List list) {
        dd1 dd1Var = sfVar.zzz;
        if (!((wb1) dd1Var).f10152a) {
            int size = dd1Var.size();
            int i10 = size == 0 ? 10 : size + size;
            jd1 jd1Var = (jd1) dd1Var;
            if (i10 < jd1Var.f5917d) {
                throw new IllegalArgumentException();
            }
            sfVar.zzz = new jd1(Arrays.copyOf(jd1Var.f5916b, i10), jd1Var.f5917d, true);
        }
        vb1.c(list, sfVar.zzz);
    }

    public static void C(sf sfVar) {
        sfVar.getClass();
        sfVar.zzz = jd1.f5915f;
    }

    public static void D(sf sfVar, mf mfVar) {
        sfVar.getClass();
        sfVar.zzA = mfVar;
        sfVar.zzp |= 32;
    }

    public static void E(sf sfVar, od odVar) {
        sfVar.getClass();
        sfVar.zzD = odVar;
        sfVar.zzp |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public static void F(sf sfVar, ve veVar) {
        sfVar.getClass();
        veVar.getClass();
        sfVar.zzG = veVar;
        sfVar.zzp |= 2048;
    }

    public static void H(sf sfVar, zd zdVar) {
        sfVar.getClass();
        zdVar.getClass();
        sfVar.zzE = zdVar;
        sfVar.zzp |= 512;
    }

    public static void I(sf sfVar, cf cfVar) {
        sfVar.getClass();
        sfVar.zzF = cfVar;
        sfVar.zzp |= 1024;
    }

    public static rf L() {
        return (rf) zzn.g();
    }

    public final String G() {
        return this.zzv;
    }

    public final od J() {
        od odVar = this.zzD;
        return odVar == null ? od.C() : odVar;
    }

    public final mf K() {
        mf mfVar = this.zzA;
        return mfVar == null ? mf.B() : mfVar;
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
                return new ae1(zzn, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", pf.f7872a, "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
            case 3:
                return new sf();
            case 4:
                return new rf(zzn);
            case 5:
                return zzn;
            case 6:
                wd1 vc1Var = zzo;
                if (vc1Var == null) {
                    synchronized (sf.class) {
                        try {
                            vc1Var = zzo;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzo = vc1Var;
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

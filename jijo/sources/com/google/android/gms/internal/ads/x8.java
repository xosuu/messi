package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class x8 extends wc1 {
    private static final x8 zza;
    private static volatile wd1 zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzI;
    private long zzJ;
    private long zzK;
    private long zzM;
    private y8 zzP;
    private int zzaA;
    private String zzaB;
    private dd1 zzaC;
    private int zzaD;
    private dd1 zzaE;
    private s8 zzaF;
    private String zzaG;
    private long zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private long zzaL;
    private long zzaM;
    private String zzaN;
    private o8 zzaO;
    private p8 zzaP;
    private long zzaQ;
    private long zzaR;
    private int zzaS;
    private long zzaT;
    private String zzaU;
    private int zzaV;
    private boolean zzaW;
    private String zzaX;
    private long zzaY;
    private e9 zzaZ;
    private u8 zzah;
    private dd1 zzai;
    private w8 zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private long zzaq;
    private long zzar;
    private String zzas;
    private long zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private f9 zzax;
    private long zzay;
    private int zzaz;
    private long zzba;
    private String zzbb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzv = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzF = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzG = "D";
    private String zzH = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzL = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzN = -1;
    private long zzO = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private long zzV = -1;
    private String zzW = "D";
    private String zzX = "D";
    private long zzY = -1;
    private int zzZ = 1000;
    private int zzaa = 1000;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private long zzaf = -1;
    private int zzag = 1000;

    static {
        x8 x8Var = new x8();
        zza = x8Var;
        wc1.t(x8.class, x8Var);
    }

    public x8() {
        zd1 zd1Var = zd1.f11221f;
        this.zzai = zd1Var;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = -1L;
        this.zzar = -1L;
        this.zzas = "D";
        this.zzat = -1L;
        this.zzay = -1L;
        this.zzaz = 1000;
        this.zzaA = 1000;
        this.zzaB = "D";
        this.zzaC = zd1Var;
        this.zzaD = 1000;
        this.zzaE = zd1Var;
        this.zzaG = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzaH = -1L;
        this.zzaI = -1L;
        this.zzaJ = -1L;
        this.zzaK = -1L;
        this.zzaM = -1L;
        this.zzaN = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzaQ = -1L;
        this.zzaR = -1L;
        this.zzaU = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzaV = 2;
        this.zzaX = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzba = -1L;
        this.zzbb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public static /* synthetic */ void A(x8 x8Var, long j10) {
        x8Var.zzc |= 134217728;
        x8Var.zzK = j10;
    }

    public static /* synthetic */ void A0(x8 x8Var, String str) {
        str.getClass();
        x8Var.zzc |= 2;
        x8Var.zzg = str;
    }

    public static /* synthetic */ void B(x8 x8Var, String str) {
        str.getClass();
        x8Var.zzc |= 268435456;
        x8Var.zzL = str;
    }

    public static /* synthetic */ void B0(x8 x8Var, long j10) {
        x8Var.zzc |= 4;
        x8Var.zzh = j10;
    }

    public static /* synthetic */ void C(x8 x8Var, long j10) {
        x8Var.zzc |= 536870912;
        x8Var.zzM = j10;
    }

    public static /* synthetic */ void C0(x8 x8Var, long j10) {
        x8Var.zzc |= 16;
        x8Var.zzj = j10;
    }

    public static /* synthetic */ void D(x8 x8Var, long j10) {
        x8Var.zzc |= 1073741824;
        x8Var.zzN = j10;
    }

    public static /* synthetic */ void D0(x8 x8Var, long j10) {
        x8Var.zzc |= 32;
        x8Var.zzk = j10;
    }

    public static /* synthetic */ void E(x8 x8Var, long j10) {
        x8Var.zzc |= Integer.MIN_VALUE;
        x8Var.zzO = j10;
    }

    public static /* synthetic */ void E0(x8 x8Var, long j10) {
        x8Var.zzc |= 1024;
        x8Var.zzp = j10;
    }

    public static /* synthetic */ void F(x8 x8Var, long j10) {
        x8Var.zzd |= 2;
        x8Var.zzQ = j10;
    }

    public static /* synthetic */ void F0(x8 x8Var, long j10) {
        x8Var.zzc |= 2048;
        x8Var.zzu = j10;
    }

    public static /* synthetic */ void G(x8 x8Var, long j10) {
        x8Var.zzd |= 4;
        x8Var.zzR = j10;
    }

    public static /* synthetic */ void G0(x8 x8Var, long j10) {
        x8Var.zzc |= 8192;
        x8Var.zzw = j10;
    }

    public static /* synthetic */ void H(x8 x8Var, long j10) {
        x8Var.zzd |= 8;
        x8Var.zzS = j10;
    }

    public static /* synthetic */ void H0(x8 x8Var, long j10) {
        x8Var.zzc |= 16384;
        x8Var.zzx = j10;
    }

    public static /* synthetic */ void I(x8 x8Var, long j10) {
        x8Var.zzd |= 16;
        x8Var.zzT = j10;
    }

    public static /* synthetic */ void I0(x8 x8Var, long j10) {
        x8Var.zzc |= 32768;
        x8Var.zzy = j10;
    }

    public static /* synthetic */ void J(x8 x8Var, long j10) {
        x8Var.zzd |= 32;
        x8Var.zzU = j10;
    }

    public static /* synthetic */ void J0(x8 x8Var, long j10) {
        x8Var.zzc |= 65536;
        x8Var.zzz = j10;
    }

    public static /* synthetic */ void K(x8 x8Var, long j10) {
        x8Var.zzd |= 64;
        x8Var.zzV = j10;
    }

    public static /* synthetic */ void K0(x8 x8Var, long j10) {
        x8Var.zzc |= 524288;
        x8Var.zzC = j10;
    }

    public static /* synthetic */ void L(x8 x8Var, String str) {
        str.getClass();
        x8Var.zzd |= NotificationCompat.FLAG_HIGH_PRIORITY;
        x8Var.zzW = str;
    }

    public static /* synthetic */ void L0(x8 x8Var, long j10) {
        x8Var.zzc |= 1048576;
        x8Var.zzD = j10;
    }

    public static /* synthetic */ void M(x8 x8Var, String str) {
        str.getClass();
        x8Var.zzd |= NotificationCompat.FLAG_LOCAL_ONLY;
        x8Var.zzX = str;
    }

    public static /* synthetic */ void M0(x8 x8Var, long j10) {
        x8Var.zzc |= 2097152;
        x8Var.zzE = j10;
    }

    public static /* synthetic */ void N(x8 x8Var, long j10) {
        x8Var.zzd |= NotificationCompat.FLAG_BUBBLE;
        x8Var.zzab = j10;
    }

    public static /* synthetic */ void N0(x8 x8Var, String str) {
        str.getClass();
        x8Var.zzc |= 4194304;
        x8Var.zzF = str;
    }

    public static /* synthetic */ void O(x8 x8Var, long j10) {
        x8Var.zzd |= 8192;
        x8Var.zzac = j10;
    }

    public static /* synthetic */ void O0(x8 x8Var, String str) {
        str.getClass();
        x8Var.zzc |= 16777216;
        x8Var.zzH = str;
    }

    public static /* synthetic */ void P(x8 x8Var, long j10) {
        x8Var.zzd |= 16384;
        x8Var.zzad = j10;
    }

    public static /* synthetic */ void P0(x8 x8Var, long j10) {
        x8Var.zzc |= 33554432;
        x8Var.zzI = j10;
    }

    public static /* synthetic */ void Q(x8 x8Var, u8 u8Var) {
        x8Var.zzah = u8Var;
        x8Var.zzd |= 262144;
    }

    public static /* synthetic */ void Q0(x8 x8Var, long j10) {
        x8Var.zzc |= 67108864;
        x8Var.zzJ = j10;
    }

    public static void R(x8 x8Var, u8 u8Var) {
        dd1 dd1Var = x8Var.zzai;
        if (!((wb1) dd1Var).f10152a) {
            x8Var.zzai = wc1.h(dd1Var);
        }
        x8Var.zzai.add(u8Var);
    }

    public static void S(x8 x8Var) {
        x8Var.zzai = zd1.f11221f;
    }

    public static /* synthetic */ void T(x8 x8Var, w8 w8Var) {
        x8Var.zzaj = w8Var;
        x8Var.zzd |= 524288;
    }

    public static /* synthetic */ void U(x8 x8Var, long j10) {
        x8Var.zzd |= 2097152;
        x8Var.zzal = j10;
    }

    public static /* synthetic */ void V(x8 x8Var, long j10) {
        x8Var.zzd |= 4194304;
        x8Var.zzam = j10;
    }

    public static /* synthetic */ void W(x8 x8Var, long j10) {
        x8Var.zzd |= 8388608;
        x8Var.zzan = j10;
    }

    public static /* synthetic */ void X(x8 x8Var, long j10) {
        x8Var.zzd |= 67108864;
        x8Var.zzaq = j10;
    }

    public static /* synthetic */ void Y(x8 x8Var, long j10) {
        x8Var.zzd |= 134217728;
        x8Var.zzar = j10;
    }

    public static /* synthetic */ void Z(x8 x8Var, String str) {
        str.getClass();
        x8Var.zzd |= 268435456;
        x8Var.zzas = str;
    }

    public static j8 a0() {
        return (j8) zza.g();
    }

    public static /* synthetic */ void b0(x8 x8Var, long j10) {
        x8Var.zze |= 512;
        x8Var.zzaH = j10;
    }

    public static /* synthetic */ void c0(x8 x8Var, long j10) {
        x8Var.zze |= 1024;
        x8Var.zzaI = j10;
    }

    public static /* synthetic */ void d0(x8 x8Var, long j10) {
        x8Var.zze |= 2048;
        x8Var.zzaJ = j10;
    }

    public static /* synthetic */ void e0(x8 x8Var, long j10) {
        x8Var.zze |= NotificationCompat.FLAG_BUBBLE;
        x8Var.zzaK = j10;
    }

    public static /* synthetic */ void f0(x8 x8Var, String str) {
        str.getClass();
        x8Var.zze |= 32768;
        x8Var.zzaN = str;
    }

    public static /* synthetic */ void g0(x8 x8Var, String str) {
        str.getClass();
        x8Var.zze |= 4194304;
        x8Var.zzaU = str;
    }

    public static /* synthetic */ void h0(x8 x8Var, boolean z9) {
        x8Var.zze |= 16777216;
        x8Var.zzaW = z9;
    }

    public static /* synthetic */ void i0(x8 x8Var, long j10) {
        x8Var.zze |= 67108864;
        x8Var.zzaY = j10;
    }

    public static /* synthetic */ void n0(x8 x8Var, int i10) {
        x8Var.zzZ = i10 - 1;
        x8Var.zzd |= 1024;
    }

    public static /* synthetic */ void o0(x8 x8Var, int i10) {
        x8Var.zzaa = i10 - 1;
        x8Var.zzd |= 2048;
    }

    public static /* synthetic */ void p0(x8 x8Var, int i10) {
        x8Var.zzag = i10 - 1;
        x8Var.zzd |= 131072;
    }

    public static /* synthetic */ void q0(x8 x8Var, int i10) {
        x8Var.zzaz = i10 - 1;
        x8Var.zze |= 8;
    }

    public static /* synthetic */ void r0(x8 x8Var, int i10) {
        x8Var.zzaA = i10 - 1;
        x8Var.zze |= 16;
    }

    public static /* synthetic */ void s0(x8 x8Var, int i10) {
        x8Var.zzaS = i10 - 1;
        x8Var.zze |= 1048576;
    }

    public static /* synthetic */ void t0(x8 x8Var) {
        x8Var.zzaV = 5;
        x8Var.zze |= 8388608;
    }

    public static x8 u0() {
        return zza;
    }

    public static x8 v0(byte[] bArr, pc1 pc1Var) throws zzgyn {
        wc1 wc1VarZ = wc1.z(zza, bArr, bArr.length, pc1Var);
        wc1.y(wc1VarZ);
        return (x8) wc1VarZ;
    }

    public static /* synthetic */ void z0(x8 x8Var, String str) {
        str.getClass();
        x8Var.zzc |= 1;
        x8Var.zzf = str;
    }

    public final boolean j0() {
        return this.zzaW;
    }

    public final boolean k0() {
        return (this.zzc & 4194304) != 0;
    }

    public final boolean l0() {
        return (this.zze & 134217728) != 0;
    }

    public final int m0() {
        int i10;
        switch (this.zzaV) {
            case 0:
                i10 = 1;
                break;
            case 1:
                i10 = 2;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 5;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 9;
                break;
            case 9:
                i10 = 10;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 3;
        }
        return i10;
    }

    public final e9 w0() {
        e9 e9Var = this.zzaZ;
        return e9Var == null ? e9.C() : e9Var;
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
                c9 c9Var = c9.f3232a;
                return new ae1(zza, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzaT", "zzD", "zzE", "zzaU", "zzaY", "zzaV", m8.f6883a, "zzF", "zzaW", "zzH", "zzaX", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzai", u8.class, "zzU", "zzV", "zzW", "zzX", "zzZ", c9Var, "zzaa", c9Var, "zzah", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", c9Var, "zzaj", "zzak", "zzal", "zzam", "zzan", "zzaq", "zzar", "zzat", "zzau", b9.f2940a, "zzav", d9.f3599a, "zzas", "zzaw", k8.f6208a, "zzax", "zzay", "zzao", "zzap", "zzaz", c9Var, "zzY", "zzG", "zzaA", c9Var, "zzaB", "zzaC", r8.class, "zzaD", c9Var, "zzaE", l8.class, "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", q8.f8136a, "zzaZ", "zzba", "zzbb"});
            case 3:
                return new x8();
            case 4:
                return new j8(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (x8.class) {
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

    public final String x0() {
        return this.zzaU;
    }

    public final String y0() {
        return this.zzF;
    }
}

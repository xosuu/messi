package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class u8 extends wc1 {
    private static final u8 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        u8 u8Var = new u8();
        zza = u8Var;
        wc1.t(u8.class, u8Var);
    }

    public static t8 A() {
        return (t8) zza.g();
    }

    public static /* synthetic */ void B(u8 u8Var, long j10) {
        u8Var.zzc |= 1;
        u8Var.zzd = j10;
    }

    public static /* synthetic */ void C(u8 u8Var, long j10) {
        u8Var.zzc |= 2;
        u8Var.zze = j10;
    }

    public static /* synthetic */ void D(u8 u8Var, long j10) {
        u8Var.zzc |= 4;
        u8Var.zzf = j10;
    }

    public static /* synthetic */ void E(u8 u8Var, long j10) {
        u8Var.zzc |= 8;
        u8Var.zzg = j10;
    }

    public static /* synthetic */ void F(u8 u8Var) {
        u8Var.zzc &= -9;
        u8Var.zzg = -1L;
    }

    public static /* synthetic */ void G(u8 u8Var, long j10) {
        u8Var.zzc |= 16;
        u8Var.zzh = j10;
    }

    public static /* synthetic */ void H(u8 u8Var, long j10) {
        u8Var.zzc |= 32;
        u8Var.zzi = j10;
    }

    public static /* synthetic */ void I(u8 u8Var, long j10) {
        u8Var.zzc |= NotificationCompat.FLAG_HIGH_PRIORITY;
        u8Var.zzk = j10;
    }

    public static /* synthetic */ void J(u8 u8Var, long j10) {
        u8Var.zzc |= NotificationCompat.FLAG_LOCAL_ONLY;
        u8Var.zzl = j10;
    }

    public static /* synthetic */ void K(u8 u8Var, long j10) {
        u8Var.zzc |= 512;
        u8Var.zzm = j10;
    }

    public static /* synthetic */ void L(u8 u8Var, long j10) {
        u8Var.zzc |= 2048;
        u8Var.zzo = j10;
    }

    public static /* synthetic */ void M(u8 u8Var, long j10) {
        u8Var.zzc |= NotificationCompat.FLAG_BUBBLE;
        u8Var.zzp = j10;
    }

    public static /* synthetic */ void N(u8 u8Var, long j10) {
        u8Var.zzc |= 8192;
        u8Var.zzu = j10;
    }

    public static /* synthetic */ void O(u8 u8Var, long j10) {
        u8Var.zzc |= 16384;
        u8Var.zzv = j10;
    }

    public static /* synthetic */ void P(u8 u8Var, long j10) {
        u8Var.zzc |= 32768;
        u8Var.zzw = j10;
    }

    public static /* synthetic */ void Q(u8 u8Var, long j10) {
        u8Var.zzc |= 65536;
        u8Var.zzx = j10;
    }

    public static /* synthetic */ void R(u8 u8Var, long j10) {
        u8Var.zzc |= 131072;
        u8Var.zzy = j10;
    }

    public static /* synthetic */ void S(u8 u8Var, long j10) {
        u8Var.zzc |= 262144;
        u8Var.zzz = j10;
    }

    public static /* synthetic */ void T(u8 u8Var, int i10) {
        u8Var.zzj = i10 - 1;
        u8Var.zzc |= 64;
    }

    public static /* synthetic */ void U(u8 u8Var, int i10) {
        u8Var.zzn = i10 - 1;
        u8Var.zzc |= 1024;
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
                return new ae1(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", c9Var, "zzk", "zzl", "zzm", "zzn", c9Var, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            case 3:
                return new u8();
            case 4:
                return new t8(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (u8.class) {
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

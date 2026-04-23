package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class w8 extends wc1 {
    private static final w8 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        w8 w8Var = new w8();
        zza = w8Var;
        wc1.t(w8.class, w8Var);
    }

    public static v8 A() {
        return (v8) zza.g();
    }

    public static /* synthetic */ void B(w8 w8Var, long j10) {
        w8Var.zzc |= 1;
        w8Var.zzd = j10;
    }

    public static /* synthetic */ void C(w8 w8Var, long j10) {
        w8Var.zzc |= 4;
        w8Var.zzf = j10;
    }

    public static /* synthetic */ void D(w8 w8Var, long j10) {
        w8Var.zzc |= 8;
        w8Var.zzg = j10;
    }

    public static /* synthetic */ void E(w8 w8Var, long j10) {
        w8Var.zzc |= 16;
        w8Var.zzh = j10;
    }

    public static /* synthetic */ void F(w8 w8Var, long j10) {
        w8Var.zzc |= 32;
        w8Var.zzi = j10;
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
                return new ae1(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 3:
                return new w8();
            case 4:
                return new v8(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (w8.class) {
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

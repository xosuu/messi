package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sf1 extends wc1 {
    private static final sf1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private rf1 zzd;
    private ec1 zzf;
    private ec1 zzg;
    private int zzh;
    private ec1 zzi;
    private byte zzj = 2;
    private dd1 zze = zd1.f11221f;

    static {
        sf1 sf1Var = new sf1();
        zza = sf1Var;
        wc1.t(sf1.class, sf1Var);
    }

    public sf1() {
        cc1 cc1Var = ec1.f3903b;
        this.zzf = cc1Var;
        this.zzg = cc1Var;
        this.zzi = cc1Var;
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        Object obj = null;
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return Byte.valueOf(this.zzj);
            case 1:
                this.zzj = wc1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new ae1(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", nf1.class, "zzf", "zzg", "zzh", "zzi"});
            case 3:
                return new sf1();
            case 4:
                return new jf(19, obj);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (sf1.class) {
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

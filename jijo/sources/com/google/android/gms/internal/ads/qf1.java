package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qf1 extends wc1 {
    private static final qf1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private pf1 zzd;
    private ec1 zzf;
    private ec1 zzg;
    private int zzh;
    private byte zzi = 2;
    private dd1 zze = zd1.f11221f;

    static {
        qf1 qf1Var = new qf1();
        zza = qf1Var;
        wc1.t(qf1.class, qf1Var);
    }

    public qf1() {
        cc1 cc1Var = ec1.f3903b;
        this.zzf = cc1Var;
        this.zzg = cc1Var;
    }

    public static of1 A() {
        return (of1) zza.g();
    }

    public static void B(qf1 qf1Var, nf1 nf1Var) {
        dd1 dd1Var = qf1Var.zze;
        if (!((wb1) dd1Var).f10152a) {
            qf1Var.zze = wc1.h(dd1Var);
        }
        qf1Var.zze.add(nf1Var);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return Byte.valueOf(this.zzi);
            case 1:
                this.zzi = wc1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new ae1(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", nf1.class, "zzf", "zzg", "zzh"});
            case 3:
                return new qf1();
            case 4:
                return new of1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (qf1.class) {
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

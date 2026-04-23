package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nf1 extends wc1 {
    private static final nf1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private ec1 zzd;
    private ec1 zze;
    private byte zzf = 2;

    static {
        nf1 nf1Var = new nf1();
        zza = nf1Var;
        wc1.t(nf1.class, nf1Var);
    }

    public nf1() {
        cc1 cc1Var = ec1.f3903b;
        this.zzd = cc1Var;
        this.zze = cc1Var;
    }

    public static mf1 A() {
        return (mf1) zza.g();
    }

    public static /* synthetic */ void B(nf1 nf1Var, cc1 cc1Var) {
        nf1Var.zzc |= 1;
        nf1Var.zzd = cc1Var;
    }

    public static /* synthetic */ void C(nf1 nf1Var, cc1 cc1Var) {
        nf1Var.zzc |= 2;
        nf1Var.zze = cc1Var;
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                this.zzf = wc1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new ae1(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new nf1();
            case 4:
                return new mf1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (nf1.class) {
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

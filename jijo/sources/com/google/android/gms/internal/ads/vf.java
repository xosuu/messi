package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vf extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final vf zze;
    private static volatile wd1 zzf;
    private int zzg;
    private tf zzh;
    private dd1 zzi = zd1.f11221f;
    private int zzj;
    private ee zzk;

    static {
        vf vfVar = new vf();
        zze = vfVar;
        wc1.t(vf.class, vfVar);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = 0;
        int i12 = 4;
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ae1(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", de.class, "zzj", pf.f7872a, "zzk"});
            case 3:
                return new vf();
            case 4:
                return new jf(i12, i11);
            case 5:
                return zze;
            case 6:
                wd1 vc1Var = zzf;
                if (vc1Var == null) {
                    synchronized (vf.class) {
                        try {
                            vc1Var = zzf;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzf = vc1Var;
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

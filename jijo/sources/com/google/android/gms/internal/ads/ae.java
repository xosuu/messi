package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ae extends wc1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private static final ae zzl;
    private static volatile wd1 zzm;
    private int zzA;
    private int zzB;
    private be zzC;
    private int zzn;
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        ae aeVar = new ae();
        zzl = aeVar;
        wc1.t(ae.class, aeVar);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final Object x(int i10, wc1 wc1Var) {
        g1.a aVar = null;
        if (i10 == 0) {
            throw null;
        }
        int i11 = 14;
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                pf pfVar = pf.f7872a;
                return new ae1(zzl, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", pfVar, "zzp", pfVar, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
            case 3:
                return new ae();
            case 4:
                return new f8(i11, aVar);
            case 5:
                return zzl;
            case 6:
                wd1 vc1Var = zzm;
                if (vc1Var == null) {
                    synchronized (ae.class) {
                        try {
                            vc1Var = zzm;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzm = vc1Var;
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

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class od extends wc1 {
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private static final od zzl;
    private static volatile wd1 zzm;
    private uf zzA;
    private vf zzB;
    private dd1 zzC;
    private int zzn;
    private int zzo;
    private int zzp = 1000;
    private gf zzu;
    private Cif zzv;
    private dd1 zzw;
    private kf zzx;
    private ae zzy;
    private td zzz;

    static {
        od odVar = new od();
        zzl = odVar;
        wc1.t(od.class, odVar);
    }

    public od() {
        zd1 zd1Var = zd1.f11221f;
        this.zzw = zd1Var;
        this.zzC = zd1Var;
    }

    public static void A(od odVar, Cif cif) {
        odVar.getClass();
        odVar.zzv = cif;
        odVar.zzn |= 8;
    }

    public static od C() {
        return zzl;
    }

    public static void D(od odVar, md mdVar) {
        odVar.getClass();
        odVar.zzo = mdVar.f6916a;
        odVar.zzn |= 1;
    }

    public final Cif B() {
        Cif cif = this.zzv;
        return cif == null ? Cif.B() : cif;
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
                return new ae1(zzl, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", ld.f6575a, "zzp", pf.f7872a, "zzu", "zzv", "zzw", ff.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", he.class});
            case 3:
                return new od();
            case 4:
                return new nd(zzl);
            case 5:
                return zzl;
            case 6:
                wd1 vc1Var = zzm;
                if (vc1Var == null) {
                    synchronized (od.class) {
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

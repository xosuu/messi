package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class f91 extends wc1 {
    private static final f91 zza;
    private static volatile wd1 zzb;
    private int zzc;

    static {
        f91 f91Var = new f91();
        zza = f91Var;
        wc1.t(f91.class, f91Var);
    }

    public static e91 B() {
        return (e91) zza.g();
    }

    public static f91 C() {
        return zza;
    }

    public final int A() {
        return this.zzc;
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
                return new ae1(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case 3:
                return new f91();
            case 4:
                return new e91(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (f91.class) {
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

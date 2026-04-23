package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class x91 extends wc1 {
    private static final x91 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private int zzd;

    static {
        x91 x91Var = new x91();
        zza = x91Var;
        wc1.t(x91.class, x91Var);
    }

    public static w91 C() {
        return (w91) zza.g();
    }

    public static x91 D() {
        return zza;
    }

    public final int A() {
        return this.zzd;
    }

    public final r91 B() {
        int i10 = this.zzc;
        r91 r91Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : r91.SHA224 : r91.SHA512 : r91.SHA256 : r91.SHA384 : r91.SHA1 : r91.UNKNOWN_HASH;
        return r91Var == null ? r91.UNRECOGNIZED : r91Var;
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
                return new ae1(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
            case 3:
                return new x91();
            case 4:
                return new w91(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (x91.class) {
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

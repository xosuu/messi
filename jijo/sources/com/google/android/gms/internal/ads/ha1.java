package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ha1 extends wc1 {
    private static final ha1 zza;
    private static volatile wd1 zzb;
    private int zzc;
    private dd1 zzd = zd1.f11221f;

    static {
        ha1 ha1Var = new ha1();
        zza = ha1Var;
        wc1.t(ha1.class, ha1Var);
    }

    public static ea1 C() {
        return (ea1) zza.g();
    }

    public static ha1 E(InputStream inputStream, pc1 pc1Var) throws zzgyn {
        ic1 hc1Var;
        ha1 ha1Var = zza;
        if (inputStream == null) {
            byte[] bArr = ed1.f3911b;
            int length = bArr.length;
            hc1Var = ic1.e(bArr, 0, 0, false);
        } else {
            hc1Var = new hc1(inputStream);
        }
        wc1 wc1VarS = wc1.s(ha1Var, hc1Var, pc1Var);
        wc1.y(wc1VarS);
        return (ha1) wc1VarS;
    }

    public static void H(ha1 ha1Var, ga1 ga1Var) {
        dd1 dd1Var = ha1Var.zzd;
        if (!((wb1) dd1Var).f10152a) {
            ha1Var.zzd = wc1.h(dd1Var);
        }
        ha1Var.zzd.add(ga1Var);
    }

    public final int A() {
        return this.zzd.size();
    }

    public final int B() {
        return this.zzc;
    }

    public final ga1 D(int i10) {
        return (ga1) this.zzd.get(i10);
    }

    public final dd1 F() {
        return this.zzd;
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
                return new ae1(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", ga1.class});
            case 3:
                return new ha1();
            case 4:
                return new ea1(zza);
            case 5:
                return zza;
            case 6:
                wd1 vc1Var = zzb;
                if (vc1Var == null) {
                    synchronized (ha1.class) {
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

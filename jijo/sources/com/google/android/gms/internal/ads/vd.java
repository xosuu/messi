package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vd extends wc1 {
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
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final bd1 zzn = new qz(27, (g1.a) null);
    private static final vd zzo;
    private static volatile wd1 zzp;
    private sd zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private ad1 zzz = xc1.f10536f;

    static {
        vd vdVar = new vd();
        zzo = vdVar;
        wc1.t(vd.class, vdVar);
    }

    public static void A(vd vdVar, long j10) {
        vdVar.zzu |= 1;
        vdVar.zzv = j10;
    }

    public static void B(vd vdVar, qf qfVar) {
        vdVar.getClass();
        vdVar.zzw = qfVar.f8167a;
        vdVar.zzu |= 2;
    }

    public static void C(vd vdVar, long j10) {
        vdVar.zzu |= 4;
        vdVar.zzx = j10;
    }

    public static void D(vd vdVar, long j10) {
        vdVar.zzu |= 8;
        vdVar.zzy = j10;
    }

    public static void E(vd vdVar, ArrayList arrayList) {
        dd1 dd1Var = vdVar.zzz;
        if (!((wb1) dd1Var).f10152a) {
            int size = dd1Var.size();
            int i10 = size == 0 ? 10 : size + size;
            xc1 xc1Var = (xc1) dd1Var;
            if (i10 < xc1Var.f10538d) {
                throw new IllegalArgumentException();
            }
            vdVar.zzz = new xc1(Arrays.copyOf(xc1Var.f10537b, i10), xc1Var.f10538d, true);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xc1) vdVar.zzz).f(((ef) it.next()).f3931a);
        }
    }

    public static void F(vd vdVar, sd sdVar) {
        vdVar.getClass();
        sdVar.getClass();
        vdVar.zzA = sdVar;
        vdVar.zzu |= 16;
    }

    public static void G(vd vdVar, qf qfVar) {
        vdVar.getClass();
        vdVar.zzB = qfVar.f8167a;
        vdVar.zzu |= 32;
    }

    public static void H(vd vdVar, qf qfVar) {
        vdVar.getClass();
        vdVar.zzC = qfVar.f8167a;
        vdVar.zzu |= 64;
    }

    public static void I(vd vdVar, qf qfVar) {
        vdVar.getClass();
        vdVar.zzD = qfVar.f8167a;
        vdVar.zzu |= NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    public static void J(vd vdVar, int i10) {
        vdVar.zzu |= NotificationCompat.FLAG_LOCAL_ONLY;
        vdVar.zzE = i10;
    }

    public static void K(vd vdVar, qf qfVar) {
        vdVar.getClass();
        vdVar.zzF = qfVar.f8167a;
        vdVar.zzu |= 512;
    }

    public static void L(vd vdVar, yd ydVar) {
        vdVar.getClass();
        vdVar.zzG = ydVar.f10854a;
        vdVar.zzu |= 1024;
    }

    public static void M(vd vdVar, long j10) {
        vdVar.zzu |= 2048;
        vdVar.zzH = j10;
    }

    public static ud P() {
        return (ud) zzo.g();
    }

    public static vd Q(byte[] bArr) throws zzgyn {
        vd vdVar = zzo;
        int length = bArr.length;
        pc1 pc1Var = pc1.f7857a;
        yd1 yd1Var = yd1.f10857c;
        wc1 wc1VarZ = wc1.z(vdVar, bArr, length, pc1.f7858b);
        wc1.y(wc1VarZ);
        return (vd) wc1VarZ;
    }

    public final long N() {
        return this.zzv;
    }

    public final qf O() {
        int i10 = this.zzw;
        qf qfVar = qf.ENUM_FALSE;
        qf qfVar2 = i10 != 0 ? i10 != 1 ? i10 != 1000 ? null : qf.ENUM_UNKNOWN : qf.ENUM_TRUE : qfVar;
        return qfVar2 == null ? qfVar : qfVar2;
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
                pf pfVar = pf.f7872a;
                return new ae1(zzo, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", pfVar, "zzx", "zzy", "zzz", df.f3642a, "zzA", "zzB", pfVar, "zzC", pfVar, "zzD", pfVar, "zzE", "zzF", pfVar, "zzG", xd.f10539a, "zzH"});
            case 3:
                return new vd();
            case 4:
                return new ud(zzo);
            case 5:
                return zzo;
            case 6:
                wd1 vc1Var = zzp;
                if (vc1Var == null) {
                    synchronized (vd.class) {
                        try {
                            vc1Var = zzp;
                            if (vc1Var == null) {
                                vc1Var = new vc1();
                                zzp = vc1Var;
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

package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f11092a;

    static {
        int i10 = yn0.f10944a;
        f11092a = "OpusHead".getBytes(fx0.f4681c);
    }

    public static zzfd a(ik0 ik0Var) {
        long jC;
        long jC2;
        ik0Var.i(8);
        if (t2.b(ik0Var.q()) == 0) {
            jC = ik0Var.D();
            jC2 = ik0Var.D();
        } else {
            jC = ik0Var.C();
            jC2 = ik0Var.C();
        }
        return new zzfd(jC, jC2, ik0Var.D());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
    
        r7 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:309:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0b54  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0bc3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList b(com.google.android.gms.internal.ads.r2 r64, com.google.android.gms.internal.ads.o0 r65, long r66, com.google.android.gms.internal.ads.zzy r68, boolean r69, boolean r70, com.google.android.gms.internal.ads.b3 r71) {
        /*
            Method dump skipped, instruction units count: 3021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z2.b(com.google.android.gms.internal.ads.r2, com.google.android.gms.internal.ads.o0, long, com.google.android.gms.internal.ads.zzy, boolean, boolean, com.google.android.gms.internal.ads.b3):java.util.ArrayList");
    }

    public static int c(ik0 ik0Var) {
        int iV = ik0Var.v();
        int i10 = iV & 127;
        while ((iV & NotificationCompat.FLAG_HIGH_PRIORITY) == 128) {
            iV = ik0Var.v();
            i10 = (i10 << 7) | (iV & 127);
        }
        return i10;
    }

    public static Pair d(ik0 ik0Var, int i10, int i11) throws zzbo {
        Integer num;
        l3 l3Var;
        Pair pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int i14 = ik0Var.f5634b;
        while (i14 - i10 < i11) {
            ik0Var.i(i14);
            int iQ = ik0Var.q();
            b4.f.f0("childAtomSize must be positive", iQ > 0);
            if (ik0Var.q() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = -1;
                int i17 = 0;
                String strA = null;
                Integer numValueOf = null;
                while (i15 - i14 < iQ) {
                    ik0Var.i(i15);
                    int iQ2 = ik0Var.q();
                    int iQ3 = ik0Var.q();
                    if (iQ3 == 1718775137) {
                        numValueOf = Integer.valueOf(ik0Var.q());
                    } else if (iQ3 == 1935894637) {
                        ik0Var.j(4);
                        strA = ik0Var.a(4, fx0.f4681c);
                    } else if (iQ3 == 1935894633) {
                        i16 = i15;
                        i17 = iQ2;
                    }
                    i15 += iQ2;
                }
                if ("cenc".equals(strA) || "cbc1".equals(strA) || "cens".equals(strA) || "cbcs".equals(strA)) {
                    b4.f.f0("frma atom is mandatory", numValueOf != null);
                    b4.f.f0("schi atom is mandatory", i16 != -1);
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 >= i17) {
                            num = numValueOf;
                            l3Var = null;
                            break;
                        }
                        ik0Var.i(i18);
                        int iQ4 = ik0Var.q();
                        if (ik0Var.q() == 1952804451) {
                            int iB = t2.b(ik0Var.q());
                            ik0Var.j(1);
                            if (iB == 0) {
                                ik0Var.j(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iV = ik0Var.v();
                                int i19 = (iV & 240) >> 4;
                                i12 = iV & 15;
                                i13 = i19;
                            }
                            boolean z9 = ik0Var.v() == 1;
                            int iV2 = ik0Var.v();
                            byte[] bArr2 = new byte[16];
                            ik0Var.e(0, bArr2, 16);
                            if (z9 && iV2 == 0) {
                                int iV3 = ik0Var.v();
                                byte[] bArr3 = new byte[iV3];
                                ik0Var.e(0, bArr3, iV3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            l3Var = new l3(z9, strA, iV2, bArr2, i13, i12, bArr);
                        } else {
                            i18 += iQ4;
                        }
                    }
                    b4.f.f0("tenc atom is mandatory", l3Var != null);
                    int i20 = yn0.f10944a;
                    pairCreate = Pair.create(num, l3Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iQ;
        }
        return null;
    }

    public static v2 e(int i10, ik0 ik0Var) {
        ik0Var.i(i10 + 12);
        ik0Var.j(1);
        c(ik0Var);
        ik0Var.j(2);
        int iV = ik0Var.v();
        if ((iV & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            ik0Var.j(2);
        }
        if ((iV & 64) != 0) {
            ik0Var.j(ik0Var.v());
        }
        if ((iV & 32) != 0) {
            ik0Var.j(2);
        }
        ik0Var.j(1);
        c(ik0Var);
        String strD = xm.d(ik0Var.v());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new v2(strD, null, -1L, -1L);
        }
        ik0Var.j(4);
        long jD = ik0Var.D();
        long jD2 = ik0Var.D();
        ik0Var.j(1);
        int iC = c(ik0Var);
        byte[] bArr = new byte[iC];
        ik0Var.e(0, bArr, iC);
        return new v2(strD, bArr, jD2 <= 0 ? -1L : jD2, jD > 0 ? jD : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0297 A[ADDED_TO_REGION, LOOP:13: B:106:0x0297->B:110:0x02a1, LOOP_START, PHI: r17
      0x0297: PHI (r17v3 int) = (r17v2 int), (r17v4 int) binds: [B:105:0x0295, B:110:0x02a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192 A[PHI: r11
      0x0192: PHI (r11v4 int) = (r11v3 int), (r11v3 int), (r11v37 int), (r11v3 int) binds: [B:36:0x00e9, B:43:0x0103, B:61:0x0191, B:42:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.n3 f(com.google.android.gms.internal.ads.k3 r45, com.google.android.gms.internal.ads.r2 r46, com.google.android.gms.internal.ads.o0 r47) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instruction units count: 1552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z2.f(com.google.android.gms.internal.ads.k3, com.google.android.gms.internal.ads.r2, com.google.android.gms.internal.ads.o0):com.google.android.gms.internal.ads.n3");
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(com.google.android.gms.internal.ads.ik0 r31, int r32, int r33, int r34, int r35, java.lang.String r36, boolean r37, com.google.android.gms.internal.ads.zzy r38, androidx.activity.result.h r39, int r40) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instruction units count: 1655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z2.g(com.google.android.gms.internal.ads.ik0, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzy, androidx.activity.result.h, int):void");
    }
}

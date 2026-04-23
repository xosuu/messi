package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bz0 f6134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6135b;

    public k1(int i10, wz0 wz0Var) {
        this.f6135b = i10;
        this.f6134a = wz0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static k1 b(int i10, ik0 ik0Var) {
        String str;
        f1 l1Var;
        String str2;
        int i11 = 4;
        Object[] objArrCopyOf = new Object[4];
        int i12 = ik0Var.f5635c;
        int i13 = 0;
        byte b10 = -2;
        int i14 = 0;
        while (ik0Var.n() > 8) {
            int iR = ik0Var.r();
            int iR2 = ik0Var.f5634b + ik0Var.r();
            ik0Var.h(iR2);
            if (iR != 1414744396) {
                switch (iR) {
                    case 1718776947:
                        if (b10 != 2) {
                            if (b10 == 1) {
                                int iT = ik0Var.t();
                                String str3 = iT != 1 ? iT != 85 ? iT != 255 ? iT != 8192 ? iT != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str3 != null) {
                                    int iT2 = ik0Var.t();
                                    int iR3 = ik0Var.r();
                                    ik0Var.j(6);
                                    int iR4 = yn0.r(ik0Var.z());
                                    int iT3 = ik0Var.t();
                                    byte[] bArr = new byte[iT3];
                                    ik0Var.e(i13, bArr, iT3);
                                    q0 q0Var = new q0();
                                    q0Var.f(str3);
                                    q0Var.f8065y = iT2;
                                    q0Var.f8066z = iR3;
                                    if ("audio/raw".equals(str3) && iR4 != 0) {
                                        q0Var.A = iR4;
                                    }
                                    if ("audio/mp4a-latm".equals(str3) && iT3 > 0) {
                                        q0Var.f8054n = bz0.n(bArr);
                                    }
                                    l1Var = new l1(new y1(q0Var));
                                } else {
                                    fb1.u("Ignoring track with unsupported format tag ", iT);
                                }
                            } else {
                                int i15 = yn0.f10944a;
                                switch (b10) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = "unknown";
                                        break;
                                    case 0:
                                        str = "default";
                                        break;
                                    case 1:
                                        str = "audio";
                                        break;
                                    case 2:
                                        str = "video";
                                        break;
                                    case 3:
                                        str = "text";
                                        break;
                                    case 4:
                                        str = "image";
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                fg0.f("Ignoring strf box for unsupported track type: ".concat(str));
                            }
                            l1Var = null;
                            break;
                        } else {
                            ik0Var.j(i11);
                            int iR5 = ik0Var.r();
                            int iR6 = ik0Var.r();
                            ik0Var.j(i11);
                            int iR7 = ik0Var.r();
                            switch (iR7) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                q0 q0Var2 = new q0();
                                q0Var2.f8057q = iR5;
                                q0Var2.f8058r = iR6;
                                q0Var2.f(str2);
                                l1Var = new l1(new y1(q0Var2));
                            } else {
                                fb1.u("Ignoring track with unsupported compression ", iR7);
                                l1Var = null;
                            }
                        }
                        break;
                    case 1751742049:
                        int iR8 = ik0Var.r();
                        ik0Var.j(8);
                        int iR9 = ik0Var.r();
                        int iR10 = ik0Var.r();
                        ik0Var.j(i11);
                        ik0Var.r();
                        ik0Var.j(12);
                        l1Var = new h1(iR8, iR9, iR10);
                        break;
                    case 1752331379:
                        int iR11 = ik0Var.r();
                        ik0Var.j(12);
                        ik0Var.r();
                        int iR12 = ik0Var.r();
                        int iR13 = ik0Var.r();
                        ik0Var.j(i11);
                        int iR14 = ik0Var.r();
                        int iR15 = ik0Var.r();
                        ik0Var.j(8);
                        l1Var = new i1(iR11, iR12, iR13, iR14, iR15);
                        break;
                    case 1852994675:
                        l1Var = new m1(ik0Var.a(ik0Var.n(), fx0.f4681c));
                        break;
                    default:
                        l1Var = null;
                        break;
                }
            } else {
                l1Var = b(ik0Var.r(), ik0Var);
            }
            if (l1Var != null) {
                if (l1Var.zza() == 1752331379) {
                    int i16 = ((i1) l1Var).f5450a;
                    if (i16 == 1935960438) {
                        b10 = 2;
                    } else if (i16 == 1935963489) {
                        b10 = 1;
                    } else if (i16 != 1937012852) {
                        fg0.f("Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i16))));
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                }
                int i17 = i14 + 1;
                int length = objArrCopyOf.length;
                if (length < i17) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, vy0.d(length, i17));
                }
                objArrCopyOf[i14] = l1Var;
                i14 = i17;
            }
            ik0Var.i(iR2);
            ik0Var.h(i12);
            i11 = 4;
            i13 = 0;
        }
        return new k1(i10, bz0.j(i14, objArrCopyOf));
    }

    public final f1 a(Class cls) {
        bz0 bz0Var = this.f6134a;
        int size = bz0Var.size();
        int i10 = 0;
        while (i10 < size) {
            f1 f1Var = (f1) bz0Var.get(i10);
            i10++;
            if (f1Var.getClass() == cls) {
                return f1Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final int zza() {
        return this.f6135b;
    }
}

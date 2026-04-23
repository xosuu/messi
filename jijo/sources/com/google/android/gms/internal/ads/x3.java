package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x3 extends w3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k6 f10412n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t0 f10415q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public jp0 f10416r;

    @Override // com.google.android.gms.internal.ads.w3
    public final long a(ik0 ik0Var) {
        byte b10 = ik0Var.f5633a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        k6 k6Var = this.f10412n;
        tc1.A(k6Var);
        boolean z9 = ((c8.a[]) k6Var.f6201h)[(b10 >> 1) & (255 >>> (8 - k6Var.f6197a))].f1584b;
        Object obj = k6Var.f6198b;
        int i10 = !z9 ? ((t0) obj).f9009e : ((t0) obj).f9010f;
        int i11 = this.f10414p ? (this.f10413o + i10) / 4 : 0;
        byte[] bArr = ik0Var.f5633a;
        int length = bArr.length;
        int i12 = ik0Var.f5635c + 4;
        if (length < i12) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
            ik0Var.g(bArrCopyOf, bArrCopyOf.length);
        } else {
            ik0Var.h(i12);
        }
        long j10 = i11;
        byte[] bArr2 = ik0Var.f5633a;
        int i13 = ik0Var.f5635c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f10414p = true;
        this.f10413o = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void b(boolean z9) {
        super.b(z9);
        if (z9) {
            this.f10412n = null;
            this.f10415q = null;
            this.f10416r = null;
        }
        this.f10413o = 0;
        this.f10414p = false;
    }

    /* JADX WARN: Type inference failed for: r1v52, types: [byte[], java.io.Serializable] */
    @Override // com.google.android.gms.internal.ads.w3
    public final boolean c(ik0 ik0Var, long j10, m20 m20Var) throws zzbo {
        k6 k6Var;
        int i10;
        t0 t0Var;
        long jFloor;
        if (this.f10412n != null) {
            ((y1) m20Var.f6809b).getClass();
            return false;
        }
        t0 t0Var2 = this.f10415q;
        int i11 = 4;
        if (t0Var2 == null) {
            b4.f.j0(1, ik0Var, false);
            ik0Var.s();
            int iV = ik0Var.v();
            int iS = ik0Var.s();
            int iR = ik0Var.r();
            if (iR <= 0) {
                iR = -1;
            }
            int iR2 = ik0Var.r();
            int i12 = iR2 <= 0 ? -1 : iR2;
            ik0Var.r();
            int iV2 = ik0Var.v();
            int iPow = (int) Math.pow(2.0d, iV2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iV2 & 240) >> 4);
            ik0Var.v();
            ?? CopyOf = Arrays.copyOf(ik0Var.f5633a, ik0Var.f5635c);
            t0 t0Var3 = new t0();
            t0Var3.f9005a = iV;
            t0Var3.f9006b = iS;
            t0Var3.f9007c = iR;
            t0Var3.f9008d = i12;
            t0Var3.f9009e = iPow;
            t0Var3.f9010f = iPow2;
            t0Var3.f9011g = CopyOf;
            this.f10415q = t0Var3;
        } else {
            jp0 jp0Var = this.f10416r;
            if (jp0Var == null) {
                this.f10416r = b4.f.i0(ik0Var, true, true);
            } else {
                int i13 = ik0Var.f5635c;
                byte[] bArr = new byte[i13];
                System.arraycopy(ik0Var.f5633a, 0, bArr, 0, i13);
                int i14 = t0Var2.f9005a;
                int i15 = 5;
                b4.f.j0(5, ik0Var, false);
                int iV3 = ik0Var.v() + 1;
                d1 d1Var = new d1(ik0Var.f5633a);
                d1Var.d(ik0Var.f5634b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 >= iV3) {
                        t0 t0Var4 = t0Var2;
                        int i19 = 6;
                        int iC = d1Var.c(6) + 1;
                        for (int i20 = 0; i20 < iC; i20++) {
                            if (d1Var.c(16) != 0) {
                                throw zzbo.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i21 = 1;
                        int iC2 = d1Var.c(6) + 1;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 < iC2) {
                                int iC3 = d1Var.c(i18);
                                if (iC3 == 0) {
                                    int i24 = 8;
                                    d1Var.d(8);
                                    d1Var.d(16);
                                    d1Var.d(16);
                                    d1Var.d(6);
                                    d1Var.d(8);
                                    int iC4 = d1Var.c(4) + 1;
                                    int i25 = 0;
                                    while (i25 < iC4) {
                                        d1Var.d(i24);
                                        i25++;
                                        i24 = 8;
                                    }
                                } else {
                                    if (iC3 != i21) {
                                        throw zzbo.a("floor type greater than 1 not decodable: " + iC3, null);
                                    }
                                    int iC5 = d1Var.c(i15);
                                    int[] iArr = new int[iC5];
                                    int i26 = -1;
                                    for (int i27 = 0; i27 < iC5; i27++) {
                                        int iC6 = d1Var.c(4);
                                        iArr[i27] = iC6;
                                        if (iC6 > i26) {
                                            i26 = iC6;
                                        }
                                    }
                                    int i28 = i26 + 1;
                                    int[] iArr2 = new int[i28];
                                    int i29 = 0;
                                    while (i29 < i28) {
                                        iArr2[i29] = d1Var.c(i23) + 1;
                                        int iC7 = d1Var.c(i17);
                                        if (iC7 > 0) {
                                            i10 = 8;
                                            d1Var.d(8);
                                        } else {
                                            i10 = 8;
                                        }
                                        int i30 = i28;
                                        int i31 = 0;
                                        for (int i32 = 1; i31 < (i32 << iC7); i32 = 1) {
                                            d1Var.d(i10);
                                            i31++;
                                            i10 = 8;
                                        }
                                        i29++;
                                        i28 = i30;
                                        i17 = 2;
                                        i23 = 3;
                                    }
                                    d1Var.d(2);
                                    int iC8 = d1Var.c(4);
                                    int i33 = 0;
                                    int i34 = 0;
                                    for (int i35 = 0; i35 < iC5; i35++) {
                                        i33 += iArr2[iArr[i35]];
                                        while (i34 < i33) {
                                            d1Var.d(iC8);
                                            i34++;
                                        }
                                    }
                                }
                                i22++;
                                i19 = 6;
                                i17 = 2;
                                i21 = 1;
                                i15 = 5;
                                i18 = 16;
                            } else {
                                int i36 = 1;
                                int iC9 = d1Var.c(i19) + 1;
                                int i37 = 0;
                                while (i37 < iC9) {
                                    if (d1Var.c(16) > 2) {
                                        throw zzbo.a("residueType greater than 2 is not decodable", null);
                                    }
                                    d1Var.d(24);
                                    d1Var.d(24);
                                    d1Var.d(24);
                                    int iC10 = d1Var.c(i19) + i36;
                                    int i38 = 8;
                                    d1Var.d(8);
                                    int[] iArr3 = new int[iC10];
                                    for (int i39 = 0; i39 < iC10; i39++) {
                                        iArr3[i39] = ((d1Var.f() ? d1Var.c(5) : 0) * 8) + d1Var.c(3);
                                    }
                                    int i40 = 0;
                                    while (i40 < iC10) {
                                        int i41 = 0;
                                        while (i41 < i38) {
                                            if ((iArr3[i40] & (1 << i41)) != 0) {
                                                d1Var.d(i38);
                                            }
                                            i41++;
                                            i38 = 8;
                                        }
                                        i40++;
                                        i38 = 8;
                                    }
                                    i37++;
                                    i19 = 6;
                                    i36 = 1;
                                }
                                int iC11 = d1Var.c(i19) + 1;
                                for (int i42 = 0; i42 < iC11; i42++) {
                                    int iC12 = d1Var.c(16);
                                    if (iC12 != 0) {
                                        fg0.c("mapping type other than 0 not supported: " + iC12);
                                    } else {
                                        int iC13 = d1Var.f() ? d1Var.c(4) + 1 : 1;
                                        if (d1Var.f()) {
                                            int iC14 = d1Var.c(8) + 1;
                                            for (int i43 = 0; i43 < iC14; i43++) {
                                                int i44 = i14 - 1;
                                                d1Var.d(b4.f.V(i44));
                                                d1Var.d(b4.f.V(i44));
                                            }
                                        }
                                        if (d1Var.c(2) != 0) {
                                            throw zzbo.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iC13 > 1) {
                                            for (int i45 = 0; i45 < i14; i45++) {
                                                d1Var.d(4);
                                            }
                                        }
                                        for (int i46 = 0; i46 < iC13; i46++) {
                                            d1Var.d(8);
                                            d1Var.d(8);
                                            d1Var.d(8);
                                        }
                                    }
                                }
                                int iC15 = d1Var.c(6);
                                int i47 = iC15 + 1;
                                c8.a[] aVarArr = new c8.a[i47];
                                for (int i48 = 0; i48 < i47; i48++) {
                                    boolean zF = d1Var.f();
                                    d1Var.c(16);
                                    d1Var.c(16);
                                    d1Var.c(8);
                                    aVarArr[i48] = new c8.a(zF);
                                }
                                if (!d1Var.f()) {
                                    throw zzbo.a("framing bit after modes not set as expected", null);
                                }
                                k6Var = new k6(t0Var4, jp0Var, bArr, aVarArr, b4.f.V(iC15));
                            }
                        }
                    } else {
                        if (d1Var.c(24) != 5653314) {
                            throw zzbo.a("expected code book to start with [0x56, 0x43, 0x42] at " + d1Var.a(), null);
                        }
                        int iC16 = d1Var.c(16);
                        int iC17 = d1Var.c(24);
                        if (d1Var.f()) {
                            d1Var.d(5);
                            for (int iC18 = 0; iC18 < iC17; iC18 += d1Var.c(b4.f.V(iC17 - iC18))) {
                            }
                        } else {
                            boolean zF2 = d1Var.f();
                            for (int i49 = 0; i49 < iC17; i49++) {
                                if (!zF2) {
                                    d1Var.d(5);
                                } else if (d1Var.f()) {
                                    d1Var.d(5);
                                }
                            }
                        }
                        int iC19 = d1Var.c(i11);
                        if (iC19 > 2) {
                            throw zzbo.a("lookup type greater than 2 not decodable: " + iC19, null);
                        }
                        if (iC19 != 1) {
                            if (iC19 != 2) {
                                t0Var = t0Var2;
                            }
                            i16++;
                            t0Var2 = t0Var;
                            i11 = 4;
                        } else {
                            i17 = iC19;
                        }
                        d1Var.d(32);
                        d1Var.d(32);
                        int iC20 = d1Var.c(i11) + 1;
                        d1Var.d(1);
                        if (i17 != 1) {
                            t0Var = t0Var2;
                            jFloor = ((long) iC17) * ((long) iC16);
                        } else if (iC16 != 0) {
                            t0Var = t0Var2;
                            jFloor = (long) Math.floor(Math.pow(iC17, 1.0d / ((double) iC16)));
                        } else {
                            t0Var = t0Var2;
                            jFloor = 0;
                        }
                        d1Var.d((int) (jFloor * ((long) iC20)));
                        i16++;
                        t0Var2 = t0Var;
                        i11 = 4;
                    }
                }
            }
        }
        k6Var = null;
        this.f10412n = k6Var;
        if (k6Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        t0 t0Var5 = (t0) k6Var.f6198b;
        arrayList.add((byte[]) t0Var5.f9011g);
        arrayList.add((byte[]) k6Var.f6200f);
        zzbk zzbkVarC0 = b4.f.c0(bz0.l((String[]) ((jp0) k6Var.f6199d).f6060b));
        q0 q0Var = new q0();
        q0Var.f("audio/vorbis");
        q0Var.f8047g = t0Var5.f9008d;
        q0Var.f8048h = t0Var5.f9007c;
        q0Var.f8065y = t0Var5.f9005a;
        q0Var.f8066z = t0Var5.f9006b;
        q0Var.f8054n = arrayList;
        q0Var.f8050j = zzbkVarC0;
        m20Var.f6809b = new y1(q0Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void d(long j10) {
        this.f10045g = j10;
        this.f10414p = j10 != 0;
        t0 t0Var = this.f10415q;
        this.f10413o = t0Var != null ? t0Var.f9009e : 0;
    }
}

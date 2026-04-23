package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m4 implements c4 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f6832t = {0, 7, 8, 15};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f6833u = {0, 119, -120, -1};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f6834v = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f6835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f6836b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Canvas f6837d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h4 f6838f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g4 f6839h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m1.w0 f6840q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f6841s;

    public m4(List list) {
        ik0 ik0Var = new ik0((byte[]) list.get(0));
        int iZ = ik0Var.z();
        int iZ2 = ik0Var.z();
        Paint paint = new Paint();
        this.f6835a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f6836b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f6837d = new Canvas();
        this.f6838f = new h4(719, 575, 0, 719, 0, 575);
        this.f6839h = new g4(0, new int[]{0, -1, -16777216, -8421505}, g(), h());
        this.f6840q = new m1.w0(iZ, iZ2);
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static g4 b(d1 d1Var, int i10) {
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int i11 = 8;
        int iE5 = d1Var.e(8);
        d1Var.m(8);
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrG = g();
        int[] iArrH = h();
        int i12 = i10 - 2;
        while (i12 > 0) {
            int iE6 = d1Var.e(i11);
            int iE7 = d1Var.e(i11);
            int[] iArr2 = (iE7 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? iArr : (iE7 & 64) != 0 ? iArrG : iArrH;
            if ((iE7 & 1) != 0) {
                iE3 = d1Var.e(i11);
                iE4 = d1Var.e(i11);
                iE = d1Var.e(i11);
                iE2 = d1Var.e(i11);
                i12 -= 6;
            } else {
                int iE8 = d1Var.e(6) << 2;
                int iE9 = d1Var.e(4) << 4;
                i12 -= 4;
                iE = d1Var.e(4) << 4;
                iE2 = d1Var.e(2) << 6;
                iE3 = iE8;
                iE4 = iE9;
            }
            if (iE3 == 0) {
                iE2 = 255;
            }
            if (iE3 == 0) {
                iE = 0;
            }
            if (iE3 == 0) {
                iE4 = 0;
            }
            double d10 = iE3;
            double d11 = iE4 - 128;
            double d12 = iE - 128;
            iArr2[iE6] = a((byte) (255 - (iE2 & 255)), Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255)));
            iE5 = iE5;
            iArrH = iArrH;
            i11 = 8;
        }
        return new g4(iE5, iArr, iArrG, iArrH);
    }

    public static i4 d(d1 d1Var) {
        byte[] bArr;
        int iE = d1Var.e(16);
        d1Var.m(4);
        int iE2 = d1Var.e(2);
        boolean zO = d1Var.o();
        d1Var.m(1);
        byte[] bArr2 = yn0.f10949f;
        if (iE2 != 1) {
            if (iE2 == 0) {
                int iE3 = d1Var.e(16);
                int iE4 = d1Var.e(16);
                if (iE3 > 0) {
                    bArr2 = new byte[iE3];
                    tc1.W(d1Var.f3532d == 0);
                    System.arraycopy(d1Var.f3531c, d1Var.f3530b, bArr2, 0, iE3);
                    d1Var.f3530b += iE3;
                    d1Var.p();
                }
                if (iE4 > 0) {
                    bArr = new byte[iE4];
                    tc1.W(d1Var.f3532d == 0);
                    System.arraycopy(d1Var.f3531c, d1Var.f3530b, bArr, 0, iE4);
                    d1Var.f3530b += iE4;
                    d1Var.p();
                }
            }
            return new i4(iE, zO, bArr2, bArr);
        }
        d1Var.m(d1Var.e(8) * 16);
        bArr = bArr2;
        return new i4(iE, zO, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021e A[LOOP:3: B:89:0x016b->B:120:0x021e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147 A[LOOP:2: B:40:0x00ab->B:76:0x0147, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m4.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static byte[] f(int i10, int i11, d1 d1Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) d1Var.e(i11);
        }
        return bArr;
    }

    public static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = a(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(255, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] h() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(63, 1 != (i10 & 1) ? 0 : 255, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = a(255, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = a(127, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = a(255, (1 != (i10 & 1) ? 0 : 43) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = a(255, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final void c(byte[] bArr, int i10, int i11, e4 e4Var) {
        m1.w0 w0Var;
        y3 y3Var;
        m4 m4Var;
        h4 h4Var;
        ArrayList arrayList;
        m1.w0 w0Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        k4 k4Var;
        int i17;
        k4 k4Var2;
        int iE;
        int iE2;
        int i18;
        int iE3;
        m4 m4Var2 = this;
        d1 d1Var = new d1(bArr, i10 + i11);
        d1Var.k(i10);
        while (true) {
            int iA = d1Var.a();
            w0Var = m4Var2.f6840q;
            if (iA >= 48 && d1Var.e(8) == 15) {
                int iE4 = d1Var.e(8);
                int i19 = 16;
                int iE5 = d1Var.e(16);
                int iE6 = d1Var.e(16);
                int iB = d1Var.b() + iE6;
                if (iE6 * 8 > d1Var.a()) {
                    fg0.f("Data field length exceeds limit");
                    d1Var.m(d1Var.a());
                } else {
                    switch (iE4) {
                        case 16:
                            if (iE5 == w0Var.f15642a) {
                                z0.b bVar = (z0.b) w0Var.f15650i;
                                d1Var.e(8);
                                int iE7 = d1Var.e(4);
                                int iE8 = d1Var.e(2);
                                d1Var.m(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i20 = iE6 - 2; i20 > 0; i20 -= 6) {
                                    int iE9 = d1Var.e(8);
                                    d1Var.m(8);
                                    sparseArray.put(iE9, new j4(d1Var.e(16), d1Var.e(16)));
                                }
                                z0.b bVar2 = new z0.b(iE7, iE8, sparseArray);
                                if (iE8 != 0) {
                                    w0Var.f15650i = bVar2;
                                    ((SparseArray) w0Var.f15644c).clear();
                                    ((SparseArray) w0Var.f15645d).clear();
                                    ((SparseArray) w0Var.f15646e).clear();
                                } else if (bVar != null && bVar.f20646a != iE7) {
                                    w0Var.f15650i = bVar2;
                                }
                            }
                            break;
                        case 17:
                            z0.b bVar3 = (z0.b) w0Var.f15650i;
                            if (iE5 == w0Var.f15642a && bVar3 != null) {
                                int iE10 = d1Var.e(8);
                                d1Var.m(4);
                                boolean zO = d1Var.o();
                                d1Var.m(3);
                                int iE11 = d1Var.e(16);
                                int iE12 = d1Var.e(16);
                                d1Var.e(3);
                                int iE13 = d1Var.e(3);
                                d1Var.m(2);
                                int iE14 = d1Var.e(8);
                                int iE15 = d1Var.e(8);
                                int iE16 = d1Var.e(4);
                                int iE17 = d1Var.e(2);
                                d1Var.m(2);
                                int i21 = iE6 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i21 > 0) {
                                    int iE18 = d1Var.e(i19);
                                    int iE19 = d1Var.e(2);
                                    d1Var.e(2);
                                    int iE20 = d1Var.e(12);
                                    d1Var.m(4);
                                    int iE21 = d1Var.e(12);
                                    int i22 = i21 - 6;
                                    if (iE19 == 1 || iE19 == 2) {
                                        d1Var.e(8);
                                        d1Var.e(8);
                                        i21 -= 8;
                                    } else {
                                        i21 = i22;
                                    }
                                    sparseArray2.put(iE18, new l4(iE20, iE21));
                                    i19 = 16;
                                }
                                k4 k4Var3 = new k4(iE10, zO, iE11, iE12, iE13, iE14, iE15, iE16, iE17, sparseArray2);
                                int i23 = bVar3.f20647b;
                                Cloneable cloneable = w0Var.f15644c;
                                if (i23 == 0 && (k4Var2 = (k4) ((SparseArray) cloneable).get(iE10)) != null) {
                                    int i24 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = k4Var2.f6176j;
                                        if (i24 < sparseArray3.size()) {
                                            k4Var3.f6176j.put(sparseArray3.keyAt(i24), (l4) sparseArray3.valueAt(i24));
                                            i24++;
                                        }
                                    }
                                }
                                ((SparseArray) cloneable).put(k4Var3.f6167a, k4Var3);
                            }
                            break;
                        case 18:
                            if (iE5 == w0Var.f15642a) {
                                g4 g4VarB = b(d1Var, iE6);
                                ((SparseArray) w0Var.f15645d).put(g4VarB.f4808a, g4VarB);
                            } else if (iE5 == w0Var.f15643b) {
                                g4 g4VarB2 = b(d1Var, iE6);
                                ((SparseArray) w0Var.f15647f).put(g4VarB2.f4808a, g4VarB2);
                            }
                            break;
                        case 19:
                            if (iE5 == w0Var.f15642a) {
                                i4 i4VarD = d(d1Var);
                                ((SparseArray) w0Var.f15646e).put(i4VarD.f5471a, i4VarD);
                            } else if (iE5 == w0Var.f15643b) {
                                i4 i4VarD2 = d(d1Var);
                                ((SparseArray) w0Var.f15648g).put(i4VarD2.f5471a, i4VarD2);
                            }
                            break;
                        case 20:
                            if (iE5 == w0Var.f15642a) {
                                d1Var.m(4);
                                boolean zO2 = d1Var.o();
                                d1Var.m(3);
                                int iE22 = d1Var.e(16);
                                int iE23 = d1Var.e(16);
                                if (zO2) {
                                    int iE24 = d1Var.e(16);
                                    iE = d1Var.e(16);
                                    iE3 = d1Var.e(16);
                                    iE2 = d1Var.e(16);
                                    i18 = iE24;
                                } else {
                                    iE = iE22;
                                    iE2 = iE23;
                                    i18 = 0;
                                    iE3 = 0;
                                }
                                w0Var.f15649h = new h4(iE22, iE23, i18, iE, iE3, iE2);
                            }
                            break;
                    }
                    d1Var.n(iB - d1Var.b());
                }
            }
        }
        z0.b bVar4 = (z0.b) w0Var.f15650i;
        if (bVar4 == null) {
            zy0 zy0Var = bz0.f3132b;
            y3Var = new y3(wz0.f10382h, -9223372036854775807L, -9223372036854775807L);
        } else {
            h4 h4Var2 = (h4) w0Var.f15649h;
            if (h4Var2 == null) {
                h4Var2 = m4Var2.f6838f;
            }
            Bitmap bitmap = m4Var2.f6841s;
            Canvas canvas = m4Var2.f6837d;
            if (bitmap == null || h4Var2.f5199a + 1 != bitmap.getWidth() || h4Var2.f5200b + 1 != m4Var2.f6841s.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(h4Var2.f5199a + 1, h4Var2.f5200b + 1, Bitmap.Config.ARGB_8888);
                m4Var2.f6841s = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray4 = (SparseArray) bVar4.f20648c;
            int i25 = 0;
            while (i25 < sparseArray4.size()) {
                canvas.save();
                j4 j4Var = (j4) sparseArray4.valueAt(i25);
                k4 k4Var4 = (k4) ((SparseArray) w0Var.f15644c).get(sparseArray4.keyAt(i25));
                int i26 = j4Var.f5795a + h4Var2.f5201c;
                int i27 = j4Var.f5796b + h4Var2.f5203e;
                int iMin = Math.min(k4Var4.f6169c + i26, h4Var2.f5202d);
                int i28 = k4Var4.f6170d;
                int i29 = i27 + i28;
                canvas.clipRect(i26, i27, iMin, Math.min(i29, h4Var2.f5204f));
                SparseArray sparseArray5 = (SparseArray) w0Var.f15645d;
                int i30 = k4Var4.f6172f;
                g4 g4Var = (g4) sparseArray5.get(i30);
                if (g4Var == null && (g4Var = (g4) ((SparseArray) w0Var.f15647f).get(i30)) == null) {
                    g4Var = m4Var2.f6839h;
                }
                int i31 = 0;
                while (true) {
                    SparseArray sparseArray6 = k4Var4.f6176j;
                    if (i31 < sparseArray6.size()) {
                        int iKeyAt = sparseArray6.keyAt(i31);
                        l4 l4Var = (l4) sparseArray6.valueAt(i31);
                        SparseArray sparseArray7 = sparseArray4;
                        i4 i4Var = (i4) ((SparseArray) w0Var.f15646e).get(iKeyAt);
                        if (i4Var == null) {
                            i4Var = (i4) ((SparseArray) w0Var.f15648g).get(iKeyAt);
                        }
                        if (i4Var != null) {
                            Paint paint = i4Var.f5472b ? null : m4Var2.f6835a;
                            w0Var2 = w0Var;
                            int i32 = k4Var4.f6171e;
                            i12 = i31;
                            int i33 = i26 + l4Var.f6485a;
                            int i34 = l4Var.f6486b + i27;
                            int[] iArr = i32 == 3 ? g4Var.f4811d : i32 == 2 ? g4Var.f4810c : g4Var.f4809b;
                            arrayList = arrayList2;
                            h4Var = h4Var2;
                            i14 = i28;
                            i15 = i27;
                            i13 = i29;
                            i16 = i26;
                            k4Var = k4Var4;
                            Paint paint2 = paint;
                            i17 = i25;
                            e(i4Var.f5473c, iArr, i32, i33, i34, paint2, canvas);
                            e(i4Var.f5474d, iArr, i32, i33, i34 + 1, paint2, canvas);
                        } else {
                            h4Var = h4Var2;
                            arrayList = arrayList2;
                            w0Var2 = w0Var;
                            i12 = i31;
                            i13 = i29;
                            i14 = i28;
                            i15 = i27;
                            i16 = i26;
                            k4Var = k4Var4;
                            i17 = i25;
                        }
                        i31 = i12 + 1;
                        k4Var4 = k4Var;
                        i27 = i15;
                        i26 = i16;
                        sparseArray4 = sparseArray7;
                        w0Var = w0Var2;
                        arrayList2 = arrayList;
                        h4Var2 = h4Var;
                        i28 = i14;
                        i29 = i13;
                        i25 = i17;
                        m4Var2 = this;
                    } else {
                        SparseArray sparseArray8 = sparseArray4;
                        h4 h4Var3 = h4Var2;
                        ArrayList arrayList3 = arrayList2;
                        m1.w0 w0Var3 = w0Var;
                        int i35 = i29;
                        int i36 = i28;
                        int i37 = i27;
                        int i38 = i26;
                        k4 k4Var5 = k4Var4;
                        int i39 = i25;
                        float f10 = i37;
                        float f11 = i38;
                        boolean z9 = k4Var5.f6168b;
                        int i40 = k4Var5.f6169c;
                        if (z9) {
                            int i41 = k4Var5.f6171e;
                            int i42 = i41 == 3 ? g4Var.f4811d[k4Var5.f6173g] : i41 == 2 ? g4Var.f4810c[k4Var5.f6174h] : g4Var.f4809b[k4Var5.f6175i];
                            m4Var = this;
                            Paint paint3 = m4Var.f6836b;
                            paint3.setColor(i42);
                            canvas.drawRect(f11, f10, i38 + i40, i35, paint3);
                        } else {
                            m4Var = this;
                        }
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(m4Var.f6841s, i38, i37, i40, i36);
                        h4Var2 = h4Var3;
                        float f12 = h4Var2.f5199a;
                        float f13 = f11 / f12;
                        float f14 = h4Var2.f5200b;
                        arrayList3.add(new c60(null, null, null, bitmapCreateBitmap2, f10 / f14, 0, 0, f13, 0, Integer.MIN_VALUE, -3.4028235E38f, i40 / f12, i36 / f14, Integer.MIN_VALUE, 0.0f));
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.restore();
                        i25 = i39 + 1;
                        m4Var2 = m4Var;
                        arrayList2 = arrayList3;
                        sparseArray4 = sparseArray8;
                        w0Var = w0Var3;
                    }
                }
            }
            y3Var = new y3(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        e4Var.mo0zza(y3Var);
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final void zzb() {
        m1.w0 w0Var = this.f6840q;
        ((SparseArray) w0Var.f15644c).clear();
        ((SparseArray) w0Var.f15645d).clear();
        ((SparseArray) w0Var.f15646e).clear();
        ((SparseArray) w0Var.f15647f).clear();
        ((SparseArray) w0Var.f15648g).clear();
        w0Var.f15649h = null;
        w0Var.f15650i = null;
    }
}

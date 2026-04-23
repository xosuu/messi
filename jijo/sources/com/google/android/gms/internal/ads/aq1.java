package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class aq1 extends dq1 implements yj1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ry0 f2769j = new ry0(new e5(6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f2771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public up1 f2773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l7 f2774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ce1 f2775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mx0 f2776i;

    public aq1(Context context) {
        mx0 mx0Var = new mx0();
        int i10 = up1.f9561u;
        up1 up1Var = new up1(new sp1(context));
        this.f2770c = new Object();
        this.f2771d = context.getApplicationContext();
        this.f2776i = mx0Var;
        this.f2773f = up1Var;
        this.f2775h = ce1.f3257b;
        boolean zF = yn0.f(context);
        this.f2772e = zF;
        if (!zF && yn0.f10944a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f2774g = audioManager == null ? null : new l7(audioManager.getSpatializer());
        }
        boolean z9 = this.f2773f.f9566p;
    }

    public static /* bridge */ /* synthetic */ int e(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int f(y1 y1Var, String str, boolean z9) {
        if (!TextUtils.isEmpty(str) && str.equals(y1Var.f10705d)) {
            return 4;
        }
        String strG = g(str);
        String strG2 = g(y1Var.f10705d);
        if (strG2 == null || strG == null) {
            return (z9 && strG2 == null) ? 1 : 0;
        }
        if (strG2.startsWith(strG) || strG.startsWith(strG2)) {
            return 3;
        }
        int i10 = yn0.f10944a;
        return strG2.split("-", 2)[0].equals(strG.split("-", 2)[0]) ? 2 : 0;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static final Pair j(int i10, qp0 qp0Var, int[][][] iArr, xp1 xp1Var, e5 e5Var) {
        RandomAccess randomAccessN;
        qp0 qp0Var2 = qp0Var;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 2) {
            if (i10 == qp0Var2.h(i11)) {
                kp1 kp1VarI = qp0Var2.i(i11);
                for (int i12 = 0; i12 < kp1VarI.f6365a; i12++) {
                    ow owVarA = kp1VarI.a(i12);
                    wz0 wz0VarS = xp1Var.S(i11, owVarA, iArr[i11][i12]);
                    int i13 = owVarA.f7685a;
                    boolean[] zArr = new boolean[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i14 + 1;
                        yp1 yp1Var = (yp1) wz0VarS.get(i14);
                        int iA = yp1Var.a();
                        if (!zArr[i14] && iA != 0) {
                            if (iA == 1) {
                                randomAccessN = bz0.n(yp1Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(yp1Var);
                                for (int i16 = i15; i16 < i13; i16++) {
                                    yp1 yp1Var2 = (yp1) wz0VarS.get(i16);
                                    if (yp1Var2.a() == 2 && yp1Var.d(yp1Var2)) {
                                        arrayList2.add(yp1Var2);
                                        zArr[i16] = true;
                                    }
                                }
                                randomAccessN = arrayList2;
                            }
                            arrayList.add(randomAccessN);
                        }
                        i14 = i15;
                    }
                }
            }
            i11++;
            qp0Var2 = qp0Var;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, e5Var);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((yp1) list.get(i17)).f11002d;
        }
        yp1 yp1Var3 = (yp1) list.get(0);
        return Pair.create(new bq1(yp1Var3.f11001b, iArr2), Integer.valueOf(yp1Var3.f11000a));
    }

    @Override // com.google.android.gms.internal.ads.dq1
    public final Pair a(qp0 qp0Var, int[][][] iArr, int[] iArr2) {
        up1 up1Var;
        int i10;
        boolean z9;
        String str;
        int[] iArr3;
        int length;
        mp1 mp1VarD;
        l7 l7Var;
        synchronized (this.f2770c) {
            try {
                up1Var = this.f2773f;
                if (up1Var.f9566p && yn0.f10944a >= 32 && (l7Var = this.f2774g) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    tc1.A(looperMyLooper);
                    l7Var.a(this, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i11 = 2;
        bq1[] bq1VarArr = new bq1[2];
        Pair pairJ = j(2, qp0Var, iArr, new ok0(up1Var, 11, iArr2), new e5(9));
        int i12 = 4;
        Pair pairJ2 = pairJ == null ? j(4, qp0Var, iArr, new ks0(up1Var), new e5(7)) : null;
        int i13 = 0;
        if (pairJ2 != null) {
            bq1VarArr[((Integer) pairJ2.second).intValue()] = (bq1) pairJ2.first;
        } else if (pairJ != null) {
            bq1VarArr[((Integer) pairJ.second).intValue()] = (bq1) pairJ.first;
        }
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 >= 2) {
                z9 = false;
                break;
            }
            if (qp0Var.h(i14) == 2 && qp0Var.i(i14).f6365a > 0) {
                z9 = true;
                break;
            }
            i14++;
        }
        Pair pairJ3 = j(1, qp0Var, iArr, new l7(this, up1Var, z9, iArr2), new e5(8));
        if (pairJ3 != null) {
            bq1VarArr[((Integer) pairJ3.second).intValue()] = (bq1) pairJ3.first;
        }
        if (pairJ3 == null) {
            str = null;
        } else {
            bq1 bq1Var = (bq1) pairJ3.first;
            str = bq1Var.f3078a.a(bq1Var.f3079b[0]).f10705d;
        }
        int i15 = 3;
        Pair pairJ4 = j(3, qp0Var, iArr, new cj0(up1Var, 15, str), new e5(10));
        if (pairJ4 != null) {
            bq1VarArr[((Integer) pairJ4.second).intValue()] = (bq1) pairJ4.first;
        }
        int i16 = 0;
        while (i16 < i11) {
            int iH = qp0Var.h(i16);
            if (iH != i11 && iH != i10 && iH != i15 && iH != i12) {
                kp1 kp1VarI = qp0Var.i(i16);
                int[][] iArr4 = iArr[i16];
                int i17 = 0;
                ow owVar = null;
                int i18 = 0;
                rp1 rp1Var = null;
                while (i17 < kp1VarI.f6365a) {
                    ow owVarA = kp1VarI.a(i17);
                    int[] iArr5 = iArr4[i17];
                    rp1 rp1Var2 = rp1Var;
                    while (i13 < owVarA.f7685a) {
                        if (tp1.O(iArr5[i13], up1Var.f9567q)) {
                            rp1 rp1Var3 = new rp1(iArr5[i13], owVarA.a(i13));
                            if (rp1Var2 == null || rp1Var3.compareTo(rp1Var2) > 0) {
                                owVar = owVarA;
                                rp1Var2 = rp1Var3;
                                i18 = i13;
                            }
                        }
                        i13++;
                    }
                    i17++;
                    rp1Var = rp1Var2;
                    i13 = 0;
                }
                bq1VarArr[i16] = owVar == null ? null : new bq1(owVar, new int[]{i18});
            }
            i16++;
            i11 = 2;
            i12 = 4;
            i10 = 1;
            i13 = 0;
            i15 = 3;
        }
        HashMap map = new HashMap();
        int i19 = 0;
        for (int i20 = 2; i19 < i20; i20 = 2) {
            kp1 kp1VarI2 = qp0Var.i(i19);
            for (int i21 = 0; i21 < kp1VarI2.f6365a; i21++) {
                fb1.t(up1Var.f10683j.get(kp1VarI2.a(i21)));
            }
            i19++;
        }
        kp1 kp1VarJ = qp0Var.j();
        for (int i22 = 0; i22 < kp1VarJ.f6365a; i22++) {
            fb1.t(up1Var.f10683j.get(kp1VarJ.a(i22)));
        }
        for (int i23 = 0; i23 < 2; i23++) {
            fb1.t(map.get(Integer.valueOf(qp0Var.h(i23))));
        }
        int i24 = 0;
        for (int i25 = 2; i24 < i25; i25 = 2) {
            kp1 kp1VarI3 = qp0Var.i(i24);
            if (up1Var.c(i24, kp1VarI3)) {
                up1Var.a(i24, kp1VarI3);
                bq1VarArr[i24] = null;
            }
            i24++;
        }
        int i26 = 0;
        for (int i27 = 2; i26 < i27; i27 = 2) {
            int iH2 = qp0Var.h(i26);
            if (up1Var.b(i26) || up1Var.f10684k.contains(Integer.valueOf(iH2))) {
                bq1VarArr[i26] = null;
            }
            i26++;
        }
        mx0 mx0Var = this.f2776i;
        c();
        wz0 wz0VarC = mp1.c(bq1VarArr);
        int i28 = 2;
        cq1[] cq1VarArr = new cq1[2];
        int i29 = 0;
        while (i29 < i28) {
            bq1 bq1Var2 = bq1VarArr[i29];
            if (bq1Var2 != null && (length = (iArr3 = bq1Var2.f3079b).length) != 0) {
                if (length == 1) {
                    mp1VarD = new mp1(bq1Var2.f3078a, iArr3[0]);
                } else {
                    ow owVar2 = bq1Var2.f3078a;
                    bz0 bz0Var = (bz0) wz0VarC.get(i29);
                    mx0Var.getClass();
                    mp1VarD = mx0.d(owVar2, iArr3, bz0Var);
                }
                cq1VarArr[i29] = mp1VarD;
            }
            i29++;
            i28 = 2;
        }
        zj1[] zj1VarArr = new zj1[i28];
        for (int i30 = 0; i30 < i28; i30++) {
            zj1VarArr[i30] = (up1Var.b(i30) || up1Var.f10684k.contains(Integer.valueOf(qp0Var.h(i30))) || (qp0Var.h(i30) != -2 && cq1VarArr[i30] == null)) ? null : zj1.f11252a;
        }
        return Pair.create(zj1VarArr, cq1VarArr);
    }

    @Override // com.google.android.gms.internal.ads.dq1
    public final void b() {
        l7 l7Var;
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        synchronized (this.f2770c) {
            if (yn0.f10944a >= 32 && (l7Var = this.f2774g) != null && (onSpatializerStateChangedListener = (Spatializer.OnSpatializerStateChangedListener) l7Var.f6526f) != null && ((Handler) l7Var.f6525d) != null) {
                ((Spatializer) l7Var.f6524b).removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
                ((Handler) l7Var.f6525d).removeCallbacksAndMessages(null);
                l7Var.f6525d = null;
                l7Var.f6526f = null;
            }
        }
        this.f3721a = null;
        this.f3722b = null;
    }

    public final void d() {
        synchronized (this.f2770c) {
            this.f2773f.getClass();
        }
    }

    public final void h(sp1 sp1Var) {
        boolean z9;
        up1 up1Var = new up1(sp1Var);
        synchronized (this.f2770c) {
            z9 = !this.f2773f.equals(up1Var);
            this.f2773f = up1Var;
        }
        if (z9) {
            if (up1Var.f9566p && this.f2771d == null) {
                fg0.f("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            eq1 eq1Var = this.f3721a;
            if (eq1Var != null) {
                ((aj1) eq1Var).f2711t.c(10);
            }
        }
    }

    public final void i() {
        boolean z9;
        eq1 eq1Var;
        l7 l7Var;
        synchronized (this.f2770c) {
            try {
                z9 = false;
                if (this.f2773f.f9566p && !this.f2772e && yn0.f10944a >= 32 && (l7Var = this.f2774g) != null && l7Var.f6523a) {
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z9 || (eq1Var = this.f3721a) == null) {
            return;
        }
        ((aj1) eq1Var).f2711t.c(10);
    }
}

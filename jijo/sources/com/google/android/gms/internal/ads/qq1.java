package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class qq1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e5 f8259g = new e5(13);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e5 f8260h = new e5(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8266f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pq1[] f8262b = new pq1[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8261a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8263c = -1;

    public final float a() {
        int i10 = this.f8263c;
        ArrayList arrayList = this.f8261a;
        if (i10 != 0) {
            Collections.sort(arrayList, f8260h);
            this.f8263c = 0;
        }
        float f10 = this.f8265e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            float f11 = 0.5f * f10;
            pq1 pq1Var = (pq1) arrayList.get(i12);
            i11 += pq1Var.f7957b;
            if (i11 >= f11) {
                return pq1Var.f7958c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((pq1) arrayList.get(arrayList.size() - 1)).f7958c;
    }

    public final void b(int i10, float f10) {
        pq1 pq1Var;
        int i11 = this.f8263c;
        ArrayList arrayList = this.f8261a;
        if (i11 != 1) {
            Collections.sort(arrayList, f8259g);
            this.f8263c = 1;
        }
        int i12 = this.f8266f;
        pq1[] pq1VarArr = this.f8262b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f8266f = i13;
            pq1Var = pq1VarArr[i13];
        } else {
            pq1Var = new pq1();
        }
        int i14 = this.f8264d;
        this.f8264d = i14 + 1;
        pq1Var.f7956a = i14;
        pq1Var.f7957b = i10;
        pq1Var.f7958c = f10;
        arrayList.add(pq1Var);
        this.f8265e += i10;
        while (true) {
            int i15 = this.f8265e;
            if (i15 <= 2000) {
                return;
            }
            int i16 = i15 - 2000;
            pq1 pq1Var2 = (pq1) arrayList.get(0);
            int i17 = pq1Var2.f7957b;
            if (i17 <= i16) {
                this.f8265e -= i17;
                arrayList.remove(0);
                int i18 = this.f8266f;
                if (i18 < 5) {
                    this.f8266f = i18 + 1;
                    pq1VarArr[i18] = pq1Var2;
                }
            } else {
                pq1Var2.f7957b = i17 - i16;
                this.f8265e -= i16;
            }
        }
    }
}

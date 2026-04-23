package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class hp1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hb0 f5367c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f5366b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5365a = -1;

    public hp1(jk1 jk1Var) {
        this.f5367c = jk1Var;
    }

    public final Object a(int i10) {
        SparseArray sparseArray;
        if (this.f5365a == -1) {
            this.f5365a = 0;
        }
        while (true) {
            int i11 = this.f5365a;
            sparseArray = this.f5366b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f5365a--;
        }
        while (this.f5365a < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f5365a + 1)) {
            this.f5365a++;
        }
        return sparseArray.valueAt(this.f5365a);
    }
}

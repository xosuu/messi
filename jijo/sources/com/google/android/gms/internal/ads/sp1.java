package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sp1 extends qy {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f8946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f8947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f8948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f8949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f8950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f8951r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseArray f8952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f8953t;

    public sp1() {
        this.f8952s = new SparseArray();
        this.f8953t = new SparseBooleanArray();
        this.f8945l = true;
        this.f8946m = true;
        this.f8947n = true;
        this.f8948o = true;
        this.f8949p = true;
        this.f8950q = true;
        this.f8951r = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sp1(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sp1.<init>(android.content.Context):void");
    }

    public /* synthetic */ sp1(up1 up1Var) {
        super(up1Var);
        this.f8945l = up1Var.f9562l;
        this.f8946m = up1Var.f9563m;
        this.f8947n = up1Var.f9564n;
        this.f8948o = up1Var.f9565o;
        this.f8949p = up1Var.f9566p;
        this.f8950q = up1Var.f9567q;
        this.f8951r = up1Var.f9568r;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = up1Var.f9569s;
            if (i10 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i10), new HashMap((Map) sparseArray2.valueAt(i10)));
                i10++;
            } else {
                this.f8952s = sparseArray;
                this.f8953t = up1Var.f9570t.clone();
                return;
            }
        }
    }
}

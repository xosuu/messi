package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class up1 extends xy {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f9561u = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f9563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f9567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f9568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseArray f9569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f9570t;

    static {
        new up1(new sp1());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public up1(sp1 sp1Var) {
        super(sp1Var);
        this.f9562l = sp1Var.f8945l;
        this.f9563m = sp1Var.f8946m;
        this.f9564n = sp1Var.f8947n;
        this.f9565o = sp1Var.f8948o;
        this.f9566p = sp1Var.f8949p;
        this.f9567q = sp1Var.f8950q;
        this.f9568r = sp1Var.f8951r;
        this.f9569s = sp1Var.f8952s;
        this.f9570t = sp1Var.f8953t;
    }

    public final void a(int i10, kp1 kp1Var) {
        Map map = (Map) this.f9569s.get(i10);
        if (map != null) {
            fb1.t(map.get(kp1Var));
        }
    }

    public final boolean b(int i10) {
        return this.f9570t.get(i10);
    }

    public final boolean c(int i10, kp1 kp1Var) {
        Map map = (Map) this.f9569s.get(i10);
        return map != null && map.containsKey(kp1Var);
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && up1.class == obj.getClass()) {
            up1 up1Var = (up1) obj;
            if (super.equals(up1Var) && this.f9562l == up1Var.f9562l && this.f9563m == up1Var.f9563m && this.f9564n == up1Var.f9564n && this.f9565o == up1Var.f9565o && this.f9566p == up1Var.f9566p && this.f9567q == up1Var.f9567q && this.f9568r == up1Var.f9568r) {
                SparseBooleanArray sparseBooleanArray = this.f9570t;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = up1Var.f9570t;
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.f9569s;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = up1Var.f9569s;
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                kp1 kp1Var = (kp1) entry.getKey();
                                                if (!map2.containsKey(kp1Var) || !yn0.c(entry.getValue(), map2.get(kp1Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f9562l ? 1 : 0)) * 961) + (this.f9563m ? 1 : 0)) * 961) + (this.f9564n ? 1 : 0)) * 28629151) + (this.f9565o ? 1 : 0)) * 31) + (this.f9566p ? 1 : 0)) * 31) + (this.f9567q ? 1 : 0)) * 961) + (this.f9568r ? 1 : 0)) * 31;
    }
}

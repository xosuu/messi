package m1;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f15636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15637b;

    public final u0 a(int i10) {
        SparseArray sparseArray = this.f15636a;
        u0 u0Var = (u0) sparseArray.get(i10);
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0();
        sparseArray.put(i10, u0Var2);
        return u0Var2;
    }
}

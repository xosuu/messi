package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f779b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f780c;

    public i0(j0 j0Var, int i10) {
        this.f780c = j0Var;
        this.f778a = i10;
    }

    @Override // androidx.fragment.app.h0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        j0 j0Var = this.f780c;
        s sVar = j0Var.f800s;
        int i10 = this.f778a;
        if (sVar == null || i10 >= 0 || !sVar.k().M()) {
            return j0Var.N(arrayList, arrayList2, i10, this.f779b);
        }
        return false;
    }
}

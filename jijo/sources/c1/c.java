package c1;

import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f[] f1499a;

    public c(f... fVarArr) {
        a0.f(fVarArr, "initializers");
        this.f1499a = fVarArr;
    }

    @Override // androidx.lifecycle.m0
    public final k0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.m0
    public final k0 d(Class cls, e eVar) {
        k0 k0Var = null;
        for (f fVar : this.f1499a) {
            if (a0.b(fVar.f1501a, cls)) {
                Object objD = fVar.f1502b.d(eVar);
                k0Var = objD instanceof k0 ? (k0) objD : null;
            }
        }
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}

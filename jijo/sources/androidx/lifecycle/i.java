package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements q1.b {
    public final void a(q1.f fVar) {
        Object obj;
        boolean z9;
        if (!(fVar instanceof o0)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
        n0 n0VarF = ((o0) fVar).f();
        q1.d dVarA = fVar.a();
        n0VarF.getClass();
        Iterator it = new HashSet(n0VarF.f989a.keySet()).iterator();
        while (it.hasNext()) {
            k0 k0Var = (k0) n0VarF.f989a.get((String) it.next());
            s sVarH = fVar.h();
            HashMap map = k0Var.f978a;
            if (map == null) {
                obj = null;
            } else {
                synchronized (map) {
                    obj = k0Var.f978a.get("androidx.lifecycle.savedstate.vm.tag");
                }
            }
            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
            if (savedStateHandleController != null && !(z9 = savedStateHandleController.f942a)) {
                if (z9) {
                    throw new IllegalStateException("Already attached to lifecycleOwner");
                }
                savedStateHandleController.f942a = true;
                sVarH.a(savedStateHandleController);
                throw null;
            }
        }
        if (new HashSet(n0VarF.f989a.keySet()).isEmpty()) {
            return;
        }
        dVarA.c();
    }
}

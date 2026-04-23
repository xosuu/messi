package androidx.fragment.app;

import android.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class g extends f.h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f775e;

    public g(b1 b1Var, k0.b bVar, boolean z9, boolean z10) {
        Object objS;
        Object objQ;
        super(b1Var, bVar);
        int i10 = b1Var.f732a;
        s sVar = b1Var.f734c;
        if (i10 == 2) {
            if (z9) {
                objQ = sVar.q();
            } else {
                sVar.getClass();
                objQ = null;
            }
            this.f773c = objQ;
            if (z9) {
                sVar.getClass();
            } else {
                sVar.getClass();
            }
            this.f774d = true;
        } else {
            if (z9) {
                objS = sVar.s();
            } else {
                sVar.getClass();
                objS = null;
            }
            this.f773c = objS;
            this.f774d = true;
        }
        if (!z10) {
            this.f775e = null;
        } else if (z9) {
            this.f775e = sVar.u();
        } else {
            sVar.getClass();
            this.f775e = null;
        }
    }

    public final x0 o(Object obj) {
        if (obj == null) {
            return null;
        }
        v0 v0Var = q0.f876a;
        if (obj instanceof Transition) {
            return v0Var;
        }
        x0 x0Var = q0.f877b;
        if (x0Var != null && x0Var.e(obj)) {
            return x0Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((b1) this.f12845a).f734c + " is not a valid framework Transition or AndroidX Transition");
    }
}

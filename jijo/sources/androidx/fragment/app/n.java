package androidx.fragment.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n extends z3.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f839x;

    public n(s sVar) {
        this.f839x = sVar;
    }

    @Override // z3.a
    public final View S(int i10) {
        s sVar = this.f839x;
        View view = sVar.S;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + sVar + " does not have a view");
    }

    @Override // z3.a
    public final boolean T() {
        return this.f839x.S != null;
    }
}

package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class l extends z3.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z3.a f816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f817y;

    public l(m mVar, n nVar) {
        this.f817y = mVar;
        this.f816x = nVar;
    }

    @Override // z3.a
    public final View S(int i10) {
        z3.a aVar = this.f816x;
        if (aVar.T()) {
            return aVar.S(i10);
        }
        Dialog dialog = this.f817y.f829s0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // z3.a
    public final boolean T() {
        return this.f816x.T() || this.f817y.f833w0;
    }
}

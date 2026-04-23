package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f911a;

    public u(f.q qVar) {
        this.f911a = qVar;
    }

    @Override // c.b
    public final void a() {
        w wVar = this.f911a;
        v vVar = (v) wVar.A.f808a;
        vVar.A.b(vVar, vVar, null);
        Bundle bundleA = wVar.f149h.f16385b.a("android:support:fragments");
        if (bundleA != null) {
            Parcelable parcelable = bundleA.getParcelable("android:support:fragments");
            v vVar2 = (v) wVar.A.f808a;
            if (!(vVar2 instanceof androidx.lifecycle.o0)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            vVar2.A.Q(parcelable);
        }
    }
}

package p0;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import o0.d0;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f16179a;

    public e(d dVar) {
        this.f16179a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f16179a.equals(((e) obj).f16179a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16179a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z9) {
        h5.l lVar = (h5.l) ((r0.c) this.f16179a).f16488b;
        AutoCompleteTextView autoCompleteTextView = lVar.f14032h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        int i10 = z9 ? 2 : 1;
        WeakHashMap weakHashMap = v0.f16075a;
        d0.s(lVar.f14062d, i10);
    }
}

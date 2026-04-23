package m1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends o0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f15469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f15470e = new WeakHashMap();

    public f1(g1 g1Var) {
        this.f15469d = g1Var;
    }

    @Override // o0.c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        o0.c cVar = (o0.c) this.f15470e.get(view);
        return cVar != null ? cVar.a(view, accessibilityEvent) : this.f16016a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // o0.c
    public final androidx.fragment.app.k b(View view) {
        o0.c cVar = (o0.c) this.f15470e.get(view);
        return cVar != null ? cVar.b(view) : super.b(view);
    }

    @Override // o0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        o0.c cVar = (o0.c) this.f15470e.get(view);
        if (cVar != null) {
            cVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // o0.c
    public final void d(View view, p0.g gVar) {
        g1 g1Var = this.f15469d;
        boolean zK = g1Var.f15479d.K();
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        View.AccessibilityDelegate accessibilityDelegate = this.f16016a;
        if (!zK) {
            RecyclerView recyclerView = g1Var.f15479d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().P(view, gVar);
                o0.c cVar = (o0.c) this.f15470e.get(view);
                if (cVar != null) {
                    cVar.d(view, gVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // o0.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        o0.c cVar = (o0.c) this.f15470e.get(view);
        if (cVar != null) {
            cVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // o0.c
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        o0.c cVar = (o0.c) this.f15470e.get(viewGroup);
        return cVar != null ? cVar.f(viewGroup, view, accessibilityEvent) : this.f16016a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // o0.c
    public final boolean g(View view, int i10, Bundle bundle) {
        g1 g1Var = this.f15469d;
        if (!g1Var.f15479d.K()) {
            RecyclerView recyclerView = g1Var.f15479d;
            if (recyclerView.getLayoutManager() != null) {
                o0.c cVar = (o0.c) this.f15470e.get(view);
                if (cVar != null) {
                    if (cVar.g(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i10, bundle)) {
                    return true;
                }
                w0 w0Var = recyclerView.getLayoutManager().f15586b.f1042b;
                return false;
            }
        }
        return super.g(view, i10, bundle);
    }

    @Override // o0.c
    public final void h(View view, int i10) {
        o0.c cVar = (o0.c) this.f15470e.get(view);
        if (cVar != null) {
            cVar.h(view, i10);
        } else {
            super.h(view, i10);
        }
    }

    @Override // o0.c
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        o0.c cVar = (o0.c) this.f15470e.get(view);
        if (cVar != null) {
            cVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}

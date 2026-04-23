package k;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14507b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f14506a = i10;
        this.f14507b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f14506a) {
            case 0:
            case 1:
                break;
            default:
                h5.o oVar = (h5.o) this.f14507b;
                int i10 = h5.o.I;
                if (oVar.G != null && (accessibilityManager = oVar.F) != null) {
                    WeakHashMap weakHashMap = v0.f16075a;
                    if (o0.g0.b(oVar)) {
                        p0.c.a(accessibilityManager, oVar.G);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i10 = this.f14506a;
        Object obj = this.f14507b;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                ViewTreeObserver viewTreeObserver = iVar.K;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        iVar.K = view.getViewTreeObserver();
                    }
                    iVar.K.removeGlobalOnLayoutListener(iVar.f14525v);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                i0 i0Var = (i0) obj;
                ViewTreeObserver viewTreeObserver2 = i0Var.B;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        i0Var.B = view.getViewTreeObserver();
                    }
                    i0Var.B.removeGlobalOnLayoutListener(i0Var.f14538v);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                h5.o oVar = (h5.o) obj;
                int i11 = h5.o.I;
                p0.d dVar = oVar.G;
                if (dVar != null && (accessibilityManager = oVar.F) != null) {
                    p0.c.b(accessibilityManager, dVar);
                    break;
                }
                break;
        }
    }
}

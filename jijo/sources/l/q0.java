package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f14976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f14977b;

    public q0(r0 r0Var, k.e eVar) {
        this.f14977b = r0Var;
        this.f14976a = eVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f14977b.T.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f14976a);
        }
    }
}

package k;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class z implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f14625a;

    public z(b0 b0Var) {
        this.f14625a = b0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f14625a.c();
    }
}

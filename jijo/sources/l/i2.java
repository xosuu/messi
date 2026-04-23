package l;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class i2 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k2 f14868a;

    public i2(k2 k2Var) {
        this.f14868a = k2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        if (i10 == 1) {
            k2 k2Var = this.f14868a;
            if (k2Var.L.getInputMethodMode() == 2 || k2Var.L.getContentView() == null) {
                return;
            }
            Handler handler = k2Var.H;
            d2 d2Var = k2Var.D;
            handler.removeCallbacks(d2Var);
            d2Var.run();
        }
    }
}

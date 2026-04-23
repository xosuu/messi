package f;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class h implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f12844b;

    public h(View view, View view2) {
        this.f12843a = view;
        this.f12844b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        m.b(absListView, this.f12843a, this.f12844b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}

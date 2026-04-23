package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements h0, d0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f14624a;

    public static int p(l lVar, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = lVar.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = lVar.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = lVar.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public static boolean x(o oVar) {
        int size = oVar.f14564f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = oVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // k.d0
    public final boolean c(r rVar) {
        return false;
    }

    @Override // k.d0
    public final boolean f(r rVar) {
        return false;
    }

    @Override // k.d0
    public final int k() {
        return 0;
    }

    @Override // k.d0
    public final void l(Context context, o oVar) {
    }

    public abstract void o(o oVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (l) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (l) listAdapter).f14552a.q((MenuItem) listAdapter.getItem(i10), this, (this instanceof i) ^ true ? 0 : 4);
    }

    public abstract void q(View view);

    public abstract void r(boolean z9);

    public abstract void s(int i10);

    public abstract void t(int i10);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z9);

    public abstract void w(int i10);
}

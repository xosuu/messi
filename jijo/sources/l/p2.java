package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends x1 {
    public l2 A;
    public k.r B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f14966y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f14967z;

    public p2(Context context, boolean z9) {
        super(context, z9);
        if (1 == o2.a(context.getResources().getConfiguration())) {
            this.f14966y = 21;
            this.f14967z = 22;
        } else {
            this.f14966y = 22;
            this.f14967z = 21;
        }
    }

    @Override // l.x1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k.l lVar;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.A != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                lVar = (k.l) headerViewListAdapter.getWrappedAdapter();
            } else {
                lVar = (k.l) adapter;
                headersCount = 0;
            }
            k.r rVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= lVar.getCount()) ? null : lVar.getItem(i10);
            k.r rVar = this.B;
            if (rVar != rVarB) {
                k.o oVar = lVar.f14552a;
                if (rVar != null) {
                    this.A.g(oVar, rVar);
                }
                this.B = rVarB;
                if (rVarB != null) {
                    this.A.c(oVar, rVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f14966y) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.f14967z) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (k.l) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (k.l) adapter).f14552a.c(false);
        return true;
    }

    public void setHoverListener(l2 l2Var) {
        this.A = l2Var;
    }

    @Override // l.x1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}

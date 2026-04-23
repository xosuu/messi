package k;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class v implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f14618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f14619b;

    public v(x xVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14619b = xVar;
        this.f14618a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14618a.onMenuItemActionCollapse(this.f14619b.m(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14618a.onMenuItemActionExpand(this.f14619b.m(menuItem));
    }
}

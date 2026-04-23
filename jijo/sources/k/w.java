package k;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class w implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f14620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f14621b;

    public w(x xVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14621b = xVar;
        this.f14620a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f14620a.onMenuItemClick(this.f14621b.m(menuItem));
    }
}

package k;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t extends s implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f14616c;

    @Override // k.s
    public final boolean a() {
        return this.f14614a.isVisible();
    }

    @Override // k.s
    public final View b(MenuItem menuItem) {
        return this.f14614a.onCreateActionView(menuItem);
    }

    @Override // k.s
    public final boolean c() {
        return this.f14614a.overridesItemVisibility();
    }

    @Override // k.s
    public final void d(q qVar) {
        this.f14616c = qVar;
        this.f14614a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z9) {
        q qVar = this.f14616c;
        if (qVar != null) {
            o oVar = ((r) qVar.f14587b).f14601n;
            oVar.f14566h = true;
            oVar.p(true);
        }
    }
}

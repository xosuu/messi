package k;

import androidx.appcompat.view.menu.ActionMenuItemView;
import l.a2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f14488v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f14488v = actionMenuItemView;
    }

    @Override // l.a2
    public final h0 b() {
        l.h hVar;
        c cVar = this.f14488v.f209y;
        if (cVar == null || (hVar = ((l.i) cVar).f14867a.G) == null) {
            return null;
        }
        return hVar.a();
    }

    @Override // l.a2
    public final boolean c() {
        h0 h0VarB;
        ActionMenuItemView actionMenuItemView = this.f14488v;
        n nVar = actionMenuItemView.f207w;
        return nVar != null && nVar.a(actionMenuItemView.f204t) && (h0VarB = b()) != null && h0VarB.a();
    }
}

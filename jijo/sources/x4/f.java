package x4;

import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k.o {
    @Override // k.o, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        k.r rVarA = a(i10, i11, i12, charSequence);
        r rVar = new r(this.f14559a, this, rVarA);
        rVarA.f14602o = rVar;
        rVar.setHeaderTitle(rVarA.f14592e);
        return rVar;
    }
}

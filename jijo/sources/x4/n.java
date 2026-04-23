package x4;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;
import m1.g1;

/* JADX INFO: loaded from: classes.dex */
public final class n extends g1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f18437f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f18437f = qVar;
    }

    @Override // m1.g1, o0.c
    public final void d(View view, p0.g gVar) {
        super.d(view, gVar);
        q qVar = this.f18437f.f18442h.f18432q;
        int i10 = qVar.f18439b.getChildCount() == 0 ? 0 : 1;
        for (int i11 = 0; i11 < qVar.f18442h.f18429d.size(); i11++) {
            int iC = qVar.f18442h.c(i11);
            if (iC == 0 || iC == 1) {
                i10++;
            }
        }
        gVar.f16195a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i10, 1, false));
    }
}

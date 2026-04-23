package n4;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f15965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15966b = 0;

    public g() {
    }

    @Override // b0.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        t(coordinatorLayout, view, i10);
        if (this.f15965a == null) {
            this.f15965a = new h(view);
        }
        h hVar = this.f15965a;
        View view2 = hVar.f15967a;
        hVar.f15968b = view2.getTop();
        hVar.f15969c = view2.getLeft();
        this.f15965a.a();
        int i11 = this.f15966b;
        if (i11 == 0) {
            return true;
        }
        h hVar2 = this.f15965a;
        if (hVar2.f15970d != i11) {
            hVar2.f15970d = i11;
            hVar2.a();
        }
        this.f15966b = 0;
        return true;
    }

    public final int s() {
        h hVar = this.f15965a;
        if (hVar != null) {
            return hVar.f15970d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.p(view, i10);
    }

    public g(int i10) {
    }
}

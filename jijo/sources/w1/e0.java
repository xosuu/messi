package w1;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f18087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f18088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f18089d;

    public e0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f18089d = hVar;
        this.f18086a = viewGroup;
        this.f18087b = view;
        this.f18088c = view2;
    }

    @Override // w1.p
    public final void b(q qVar) {
        this.f18088c.setTag(R.id.s6, null);
        this.f18086a.getOverlay().remove(this.f18087b);
        qVar.v(this);
    }

    @Override // w1.r, w1.p
    public final void c() {
        this.f18086a.getOverlay().remove(this.f18087b);
    }

    @Override // w1.r, w1.p
    public final void d() {
        View view = this.f18087b;
        if (view.getParent() == null) {
            this.f18086a.getOverlay().add(view);
            return;
        }
        h hVar = this.f18089d;
        ArrayList arrayList = hVar.f18136y;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = hVar.C;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) hVar.C.clone();
        int size2 = arrayList3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((p) arrayList3.get(i10)).e();
        }
    }
}

package x4;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h extends o0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f18427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f18428f;

    public h(i iVar, int i10, boolean z9) {
        this.f18428f = iVar;
        this.f18426d = i10;
        this.f18427e = z9;
    }

    @Override // o0.c
    public final void d(View view, p0.g gVar) {
        q qVar;
        this.f16016a.onInitializeAccessibilityNodeInfo(view, gVar.f16195a);
        int i10 = this.f18426d;
        int i11 = 0;
        int i12 = i10;
        while (true) {
            qVar = this.f18428f.f18432q;
            if (i11 >= i10) {
                break;
            }
            if (qVar.f18442h.c(i11) == 2) {
                i12--;
            }
            i11++;
        }
        if (qVar.f18439b.getChildCount() == 0) {
            i12--;
        }
        gVar.h(androidx.fragment.app.k.f(i12, 1, 1, 1, this.f18427e, view.isSelected()));
    }
}

package g5;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class i implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f13867b;

    public i(j jVar, View view) {
        this.f13867b = jVar;
        this.f13866a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f13866a;
        if (view2.getVisibility() == 0) {
            this.f13867b.d(view2);
        }
    }
}

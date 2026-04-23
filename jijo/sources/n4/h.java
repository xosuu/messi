package n4;

import android.view.View;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15970d;

    public h(View view) {
        this.f15967a = view;
    }

    public final void a() {
        int i10 = this.f15970d;
        View view = this.f15967a;
        v0.k(view, i10 - (view.getTop() - this.f15968b));
        v0.j(view, 0 - (view.getLeft() - this.f15969c));
    }
}

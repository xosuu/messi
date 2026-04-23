package m1;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15486a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f15487b;

    public h1(c0 c0Var) {
        this.f15487b = c0Var;
    }

    @Override // m1.t0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0 && this.f15486a) {
            this.f15486a = false;
            this.f15487b.f();
        }
    }

    @Override // m1.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f15486a = true;
    }
}

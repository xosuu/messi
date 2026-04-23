package l;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class z2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f15093b;

    public /* synthetic */ z2(SearchView searchView, int i10) {
        this.f15092a = i10;
        this.f15093b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15092a;
        SearchView searchView = this.f15093b;
        switch (i10) {
            case 0:
                searchView.u();
                break;
            default:
                t0.b bVar = searchView.f300f0;
                if (bVar instanceof k3) {
                    bVar.b(null);
                }
                break;
        }
    }
}

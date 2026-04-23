package m1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15524a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15525b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15526c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15527d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f15529f;

    public k1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f15529f = staggeredGridLayoutManager;
        this.f15528e = i10;
    }

    public final void a() {
        View view = (View) this.f15524a.get(r0.size() - 1);
        j1 j1Var = (j1) view.getLayoutParams();
        this.f15526c = this.f15529f.f1083r.b(view);
        j1Var.getClass();
    }

    public final void b() {
        this.f15524a.clear();
        this.f15525b = Integer.MIN_VALUE;
        this.f15526c = Integer.MIN_VALUE;
        this.f15527d = 0;
    }

    public final int c() {
        return this.f15529f.f1088w ? e(r1.size() - 1, -1) : e(0, this.f15524a.size());
    }

    public final int d() {
        return this.f15529f.f1088w ? e(0, this.f15524a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f15529f;
        int iF = staggeredGridLayoutManager.f1083r.f();
        int iE = staggeredGridLayoutManager.f1083r.e();
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View view = (View) this.f15524a.get(i10);
            int iD = staggeredGridLayoutManager.f1083r.d(view);
            int iB = staggeredGridLayoutManager.f1083r.b(view);
            boolean z9 = iD <= iE;
            boolean z10 = iB >= iF;
            if (z9 && z10 && (iD < iF || iB > iE)) {
                return p0.D(view);
            }
            i10 += i12;
        }
        return -1;
    }

    public final int f(int i10) {
        int i11 = this.f15526c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f15524a.size() == 0) {
            return i10;
        }
        a();
        return this.f15526c;
    }

    public final View g(int i10, int i11) {
        ArrayList arrayList = this.f15524a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f15529f;
        View view = null;
        if (i11 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1088w && p0.D(view2) >= i10) || ((!staggeredGridLayoutManager.f1088w && p0.D(view2) <= i10) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = (View) arrayList.get(i12);
                if ((staggeredGridLayoutManager.f1088w && p0.D(view3) <= i10) || ((!staggeredGridLayoutManager.f1088w && p0.D(view3) >= i10) || !view3.hasFocusable())) {
                    break;
                }
                i12++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i10) {
        int i11 = this.f15525b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f15524a.size() == 0) {
            return i10;
        }
        View view = (View) this.f15524a.get(0);
        j1 j1Var = (j1) view.getLayoutParams();
        this.f15525b = this.f15529f.f1083r.d(view);
        j1Var.getClass();
        return this.f15525b;
    }
}

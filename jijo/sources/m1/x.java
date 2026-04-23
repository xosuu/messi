package m1;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f15661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15662l;

    public final void a(View view) {
        int iC;
        int size = this.f15661k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((e1) this.f15661k.get(i11)).f15445a;
            q0 q0Var = (q0) view3.getLayoutParams();
            if (view3 != view && !q0Var.f15600a.j() && (iC = (q0Var.f15600a.c() - this.f15654d) * this.f15655e) >= 0 && iC < i10) {
                view2 = view3;
                if (iC == 0) {
                    break;
                } else {
                    i10 = iC;
                }
            }
        }
        if (view2 == null) {
            this.f15654d = -1;
        } else {
            this.f15654d = ((q0) view2.getLayoutParams()).f15600a.c();
        }
    }

    public final View b(w0 w0Var) {
        List list = this.f15661k;
        if (list == null) {
            View view = w0Var.i(this.f15654d, Long.MAX_VALUE).f15445a;
            this.f15654d += this.f15655e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((e1) this.f15661k.get(i10)).f15445a;
            q0 q0Var = (q0) view2.getLayoutParams();
            if (!q0Var.f15600a.j() && this.f15654d == q0Var.f15600a.c()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}

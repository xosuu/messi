package m1;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15549b;

    public /* synthetic */ n0(int i10, Object obj) {
        this.f15548a = i10;
        this.f15549b = obj;
    }

    public final int a(View view) {
        int i10 = this.f15548a;
        Object obj = this.f15549b;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((p0) obj).getClass();
                return view.getRight() + ((q0) view.getLayoutParams()).f15601b.right + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((p0) obj).getClass();
                return view.getBottom() + ((q0) view.getLayoutParams()).f15601b.bottom + ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
        }
    }

    public final int b(View view) {
        int i10 = this.f15548a;
        Object obj = this.f15549b;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((p0) obj).getClass();
                return (view.getLeft() - ((q0) view.getLayoutParams()).f15601b.left) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((p0) obj).getClass();
                return (view.getTop() - ((q0) view.getLayoutParams()).f15601b.top) - ((ViewGroup.MarginLayoutParams) q0Var2).topMargin;
        }
    }
}

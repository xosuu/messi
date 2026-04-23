package m1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class z extends a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(p0 p0Var, int i10) {
        super(p0Var);
        this.f15679d = i10;
    }

    @Override // m1.a0
    public final int b(View view) {
        int i10 = this.f15679d;
        p0 p0Var = this.f15400a;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                p0Var.getClass();
                return view.getRight() + ((q0) view.getLayoutParams()).f15601b.right + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                p0Var.getClass();
                return view.getBottom() + ((q0) view.getLayoutParams()).f15601b.bottom + ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
        }
    }

    @Override // m1.a0
    public final int c(View view) {
        int i10 = this.f15679d;
        p0 p0Var = this.f15400a;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                p0Var.getClass();
                Rect rect = ((q0) view.getLayoutParams()).f15601b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                p0Var.getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).f15601b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) q0Var2).topMargin + ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
        }
    }

    @Override // m1.a0
    public final int d(View view) {
        int i10 = this.f15679d;
        p0 p0Var = this.f15400a;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                p0Var.getClass();
                return (view.getLeft() - ((q0) view.getLayoutParams()).f15601b.left) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                p0Var.getClass();
                return (view.getTop() - ((q0) view.getLayoutParams()).f15601b.top) - ((ViewGroup.MarginLayoutParams) q0Var2).topMargin;
        }
    }

    @Override // m1.a0
    public final int e() {
        int i10 = this.f15679d;
        p0 p0Var = this.f15400a;
        switch (i10) {
            case 0:
                return p0Var.f15598n - p0Var.B();
            default:
                return p0Var.f15599o - p0Var.z();
        }
    }

    @Override // m1.a0
    public final int f() {
        int i10 = this.f15679d;
        p0 p0Var = this.f15400a;
        switch (i10) {
            case 0:
                return p0Var.A();
            default:
                return p0Var.C();
        }
    }

    @Override // m1.a0
    public final int g() {
        int i10 = this.f15679d;
        p0 p0Var = this.f15400a;
        switch (i10) {
            case 0:
                return (p0Var.f15598n - p0Var.A()) - p0Var.B();
            default:
                return (p0Var.f15599o - p0Var.C()) - p0Var.z();
        }
    }

    @Override // m1.a0
    public final int i(View view) {
        int i10 = this.f15679d;
        Rect rect = this.f15402c;
        p0 p0Var = this.f15400a;
        switch (i10) {
            case 0:
                p0Var.G(view, rect);
                return rect.right;
            default:
                p0Var.G(view, rect);
                return rect.bottom;
        }
    }

    @Override // m1.a0
    public final int j(View view) {
        int i10 = this.f15679d;
        Rect rect = this.f15402c;
        p0 p0Var = this.f15400a;
        switch (i10) {
            case 0:
                p0Var.G(view, rect);
                return rect.left;
            default:
                p0Var.G(view, rect);
                return rect.top;
        }
    }

    @Override // m1.a0
    public final void k(int i10) {
        int i11 = this.f15679d;
        p0 p0Var = this.f15400a;
        switch (i11) {
            case 0:
                p0Var.K(i10);
                break;
            default:
                p0Var.L(i10);
                break;
        }
    }

    public final int l(View view) {
        int i10 = this.f15679d;
        p0 p0Var = this.f15400a;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                p0Var.getClass();
                Rect rect = ((q0) view.getLayoutParams()).f15601b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q0Var).topMargin + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                p0Var.getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).f15601b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var2).rightMargin;
        }
    }
}

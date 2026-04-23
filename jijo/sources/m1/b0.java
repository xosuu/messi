package m1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends y {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f15409q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i10, Context context, Object obj) {
        super(context);
        this.f15408p = i10;
        this.f15409q = obj;
    }

    @Override // m1.y
    public final float b(DisplayMetrics displayMetrics) {
        switch (this.f15408p) {
        }
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // m1.y
    public final int c(int i10) {
        switch (this.f15408p) {
            case 0:
                return Math.min(100, super.c(i10));
            default:
                return super.c(i10);
        }
    }

    @Override // m1.y
    public final void e(View view, b1 b1Var, z0 z0Var) {
        switch (this.f15408p) {
            case 0:
                c0 c0Var = (c0) this.f15409q;
                int[] iArrA = c0Var.a(c0Var.f15426a.getLayoutManager(), view);
                int i10 = iArrA[0];
                int i11 = iArrA[1];
                int iCeil = (int) Math.ceil(((double) c(Math.max(Math.abs(i10), Math.abs(i11)))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f15671i;
                    z0Var.f15680a = i10;
                    z0Var.f15681b = i11;
                    z0Var.f15682c = iCeil;
                    z0Var.f15684e = decelerateInterpolator;
                    z0Var.f15685f = true;
                }
                break;
            default:
                super.e(view, b1Var, z0Var);
                break;
        }
    }
}

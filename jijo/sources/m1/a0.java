package m1;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f15400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15401b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f15402c = new Rect();

    public a0(p0 p0Var) {
        this.f15400a = p0Var;
    }

    public static z a(p0 p0Var, int i10) {
        if (i10 == 0) {
            return new z(p0Var, 0);
        }
        int i11 = 1;
        if (i10 == 1) {
            return new z(p0Var, i11);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public final int h() {
        if (Integer.MIN_VALUE == this.f15401b) {
            return 0;
        }
        return g() - this.f15401b;
    }

    public abstract int i(View view);

    public abstract int j(View view);

    public abstract void k(int i10);
}

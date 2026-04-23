package m1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e1 f15600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f15601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15603d;

    public q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15601b = new Rect();
        this.f15602c = true;
        this.f15603d = false;
    }

    public q0(int i10, int i11) {
        super(i10, i11);
        this.f15601b = new Rect();
        this.f15602c = true;
        this.f15603d = false;
    }

    public q0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f15601b = new Rect();
        this.f15602c = true;
        this.f15603d = false;
    }

    public q0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f15601b = new Rect();
        this.f15602c = true;
        this.f15603d = false;
    }

    public q0(q0 q0Var) {
        super((ViewGroup.LayoutParams) q0Var);
        this.f15601b = new Rect();
        this.f15602c = true;
        this.f15603d = false;
    }
}

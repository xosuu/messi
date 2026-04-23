package m1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p extends m0 implements s0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final l B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f15561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f15562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f15565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f15566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f15571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f15574p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f15577s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f15584z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15575q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15576r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15578t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15579u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15580v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15581w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f15582x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f15583y = new int[2];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f15584z = valueAnimatorOfFloat;
        this.A = 0;
        l lVar = new l(0, this);
        this.B = lVar;
        m mVar = new m(0 == true ? 1 : 0, this);
        this.f15561c = stateListDrawable;
        this.f15562d = drawable;
        this.f15565g = stateListDrawable2;
        this.f15566h = drawable2;
        this.f15563e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f15564f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f15567i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f15568j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f15559a = i11;
        this.f15560b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new n(this));
        valueAnimatorOfFloat.addUpdateListener(new o(this));
        RecyclerView recyclerView2 = this.f15577s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            p0 p0Var = recyclerView2.f1074x;
            if (p0Var != null) {
                p0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1076y;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f15577s;
            recyclerView3.f1078z.remove(this);
            if (recyclerView3.A == this) {
                recyclerView3.A = null;
            }
            ArrayList arrayList2 = this.f15577s.f1062q0;
            if (arrayList2 != null) {
                arrayList2.remove(mVar);
            }
            this.f15577s.removeCallbacks(lVar);
        }
        this.f15577s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f15577s.f1078z.add(this);
            this.f15577s.h(mVar);
        }
    }

    public static int f(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    @Override // m1.m0
    public final void c(Canvas canvas) {
        if (this.f15575q != this.f15577s.getWidth() || this.f15576r != this.f15577s.getHeight()) {
            this.f15575q = this.f15577s.getWidth();
            this.f15576r = this.f15577s.getHeight();
            g(0);
            return;
        }
        if (this.A != 0) {
            if (this.f15578t) {
                int i10 = this.f15575q;
                int i11 = this.f15563e;
                int i12 = i10 - i11;
                int i13 = this.f15570l;
                int i14 = this.f15569k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f15561c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f15576r;
                int i17 = this.f15564f;
                Drawable drawable = this.f15562d;
                drawable.setBounds(0, 0, i17, i16);
                RecyclerView recyclerView = this.f15577s;
                WeakHashMap weakHashMap = o0.v0.f16075a;
                if (o0.e0.d(recyclerView) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f15579u) {
                int i18 = this.f15576r;
                int i19 = this.f15567i;
                int i20 = i18 - i19;
                int i21 = this.f15573o;
                int i22 = this.f15572n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.f15565g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f15575q;
                int i25 = this.f15568j;
                Drawable drawable2 = this.f15566h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(0.0f, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }

    public final boolean d(float f10, float f11) {
        if (f11 >= this.f15576r - this.f15567i) {
            int i10 = this.f15573o;
            int i11 = this.f15572n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(float f10, float f11) {
        RecyclerView recyclerView = this.f15577s;
        WeakHashMap weakHashMap = o0.v0.f16075a;
        boolean z9 = o0.e0.d(recyclerView) == 1;
        int i10 = this.f15563e;
        if (z9) {
            if (f10 > i10 / 2) {
                return false;
            }
        } else if (f10 < this.f15575q - i10) {
            return false;
        }
        int i11 = this.f15570l;
        int i12 = this.f15569k / 2;
        return f11 >= ((float) (i11 - i12)) && f11 <= ((float) (i12 + i11));
    }

    public final void g(int i10) {
        l lVar = this.B;
        StateListDrawable stateListDrawable = this.f15561c;
        if (i10 == 2 && this.f15580v != 2) {
            stateListDrawable.setState(C);
            this.f15577s.removeCallbacks(lVar);
        }
        if (i10 == 0) {
            this.f15577s.invalidate();
        } else {
            h();
        }
        if (this.f15580v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f15577s.removeCallbacks(lVar);
            this.f15577s.postDelayed(lVar, 1200);
        } else if (i10 == 1) {
            this.f15577s.removeCallbacks(lVar);
            this.f15577s.postDelayed(lVar, 1500);
        }
        this.f15580v = i10;
    }

    public final void h() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f15584z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}

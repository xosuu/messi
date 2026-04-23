package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import b.d;
import b0.b;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.gp0;
import com.google.android.gms.internal.ads.tp1;
import d5.g;
import f.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import m1.k0;
import o0.c;
import o0.d0;
import o0.e0;
import o0.g0;
import o0.h0;
import o0.j0;
import o0.v0;
import p0.f;
import u3.j;
import v0.e;
import x4.z;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b {
    public final j A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public e M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11766a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f11767a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11768b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public HashMap f11769b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11770c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f11771c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11772d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final q4.b f11773d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f11778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f11779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f11783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f11785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f11786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f11787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f11789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f11790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f11793x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d5.j f11794y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11795z;

    public BottomSheetBehavior() {
        this.f11766a = 0;
        this.f11768b = true;
        this.f11780k = -1;
        this.f11781l = -1;
        this.A = new j(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.f11771c0 = new SparseIntArray();
        this.f11773d0 = new q4.b(this);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = v0.f16075a;
        if (j0.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewV = v(viewGroup.getChildAt(i10));
                if (viewV != null) {
                    return viewV;
                }
            }
        }
        return null;
    }

    public static int w(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public final void A(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(g1.a.r(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.I || i10 != 5) {
            int i11 = (i10 == 6 && this.f11768b && y(i10) <= this.D) ? 3 : i10;
            WeakReference weakReference = this.U;
            if (weakReference == null || weakReference.get() == null) {
                B(i10);
                return;
            }
            View view = (View) this.U.get();
            d dVar = new d(this, view, i11, 9, 0);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = v0.f16075a;
                if (g0.b(view)) {
                    view.post(dVar);
                    return;
                }
            }
            dVar.run();
        }
    }

    public final void B(int i10) {
        if (this.L == i10) {
            return;
        }
        this.L = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z9 = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            G(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            G(false);
        }
        F(i10, true);
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            E();
        } else {
            fb1.t(arrayList.get(0));
            throw null;
        }
    }

    public final boolean C(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f10 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    public final void D(int i10, View view, boolean z9) {
        int iY = y(i10);
        e eVar = this.M;
        if (eVar == null || (!z9 ? eVar.r(view, view.getLeft(), iY) : eVar.p(view.getLeft(), iY))) {
            B(i10);
            return;
        }
        B(2);
        F(i10, true);
        this.A.a(i10);
    }

    public final void E() {
        View view;
        int iA;
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.n(view, 524288);
        v0.i(view, 0);
        v0.n(view, 262144);
        v0.i(view, 0);
        v0.n(view, 1048576);
        v0.i(view, 0);
        SparseIntArray sparseIntArray = this.f11771c0;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            v0.n(view, i10);
            v0.i(view, 0);
            sparseIntArray.delete(0);
        }
        int i11 = 13;
        if (!this.f11768b && this.L != 6) {
            String string = view.getResources().getString(R.string.cm);
            gp0 gp0Var = new gp0(i, i11, this);
            ArrayList arrayListF = v0.f(view);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayListF.size()) {
                    int i13 = -1;
                    int i14 = 0;
                    while (true) {
                        int[] iArr = v0.f16079e;
                        if (i14 >= iArr.length || i13 != -1) {
                            break;
                        }
                        int i15 = iArr[i14];
                        boolean z9 = true;
                        for (int i16 = 0; i16 < arrayListF.size(); i16++) {
                            z9 &= ((f) arrayListF.get(i16)).a() != i15;
                        }
                        if (z9) {
                            i13 = i15;
                        }
                        i14++;
                    }
                    iA = i13;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((f) arrayListF.get(i12)).f16190a).getLabel())) {
                        iA = ((f) arrayListF.get(i12)).a();
                        break;
                    }
                    i12++;
                }
            }
            if (iA != -1) {
                f fVar = new f(null, iA, string, gp0Var, null);
                View.AccessibilityDelegate accessibilityDelegateD = v0.d(view);
                c cVar = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof o0.a ? ((o0.a) accessibilityDelegateD).f16006a : new c(accessibilityDelegateD);
                if (cVar == null) {
                    cVar = new c();
                }
                v0.q(view, cVar);
                v0.n(view, fVar.a());
                v0.f(view).add(fVar);
                v0.i(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i17 = 5;
            if (this.L != 5) {
                v0.o(view, f.f16187l, new gp0(i17, i11, this));
            }
        }
        int i18 = this.L;
        int i19 = 4;
        int i20 = 3;
        if (i18 == 3) {
            v0.o(view, f.f16186k, new gp0(this.f11768b ? 4 : 6, i11, this));
            return;
        }
        if (i18 == 4) {
            v0.o(view, f.f16185j, new gp0(this.f11768b ? 3 : 6, i11, this));
        } else {
            if (i18 != 6) {
                return;
            }
            v0.o(view, f.f16186k, new gp0(i19, i11, this));
            v0.o(view, f.f16185j, new gp0(i20, i11, this));
        }
    }

    public final void F(int i10, boolean z9) {
        float f10;
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.L == 3 && (this.f11793x || x() == 0);
        if (this.f11795z == z10 || this.f11778i == null) {
            return;
        }
        this.f11795z = z10;
        if (z9 && (valueAnimator = this.B) != null) {
            if (valueAnimator.isRunning()) {
                this.B.reverse();
                return;
            }
            f10 = z10 ? 0.0f : 1.0f;
            this.B.setFloatValues(1.0f - f10, f10);
            this.B.start();
            return;
        }
        ValueAnimator valueAnimator2 = this.B;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.B.cancel();
        }
        g gVar = this.f11778i;
        f10 = this.f11795z ? 0.0f : 1.0f;
        d5.f fVar = gVar.f12396a;
        if (fVar.f12384j != f10) {
            fVar.f12384j = f10;
            gVar.f12400h = true;
            gVar.invalidateSelf();
        }
    }

    public final void G(boolean z9) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z9) {
                if (this.f11769b0 != null) {
                    return;
                } else {
                    this.f11769b0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.U.get() && z9) {
                    this.f11769b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z9) {
                return;
            }
            this.f11769b0 = null;
        }
    }

    public final void H() {
        View view;
        if (this.U != null) {
            s();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // b0.b
    public final void c(b0.e eVar) {
        this.U = null;
        this.M = null;
    }

    @Override // b0.b
    public final void f() {
        this.U = null;
        this.M = null;
    }

    @Override // b0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        if (!view.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x9 = (int) motionEvent.getX();
            this.Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.n(view2, x9, this.Z)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f11767a0 = true;
                }
            }
            this.N = this.Y == -1 && !coordinatorLayout.n(view, x9, this.Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11767a0 = false;
            this.Y = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (eVar = this.M) != null && eVar.q(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.n(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(((float) this.Z) - motionEvent.getY()) <= ((float) this.M.f17692b)) ? false : true;
    }

    @Override // b0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = v0.f16075a;
        if (d0.b(coordinatorLayout) && !d0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.U == null) {
            this.f11776g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.ct);
            boolean z9 = (Build.VERSION.SDK_INT < 29 || this.f11783n || this.f11775f) ? false : true;
            if (this.f11784o || this.f11785p || this.f11786q || this.f11788s || this.f11789t || this.f11790u || z9) {
                x0 x0Var = new x0(this, z9);
                int iF = e0.f(view);
                int paddingTop = view.getPaddingTop();
                int iE = e0.e(view);
                int paddingBottom = view.getPaddingBottom();
                k0 k0Var = new k0();
                k0Var.f15520a = iF;
                k0Var.f15521b = paddingTop;
                k0Var.f15522c = iE;
                k0Var.f15523d = paddingBottom;
                j0.u(view, new f.f(x0Var, 26, k0Var));
                if (g0.b(view)) {
                    h0.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new z());
                }
            }
            this.U = new WeakReference(view);
            g gVar = this.f11778i;
            if (gVar != null) {
                d0.q(view, gVar);
                g gVar2 = this.f11778i;
                float fI = this.H;
                if (fI == -1.0f) {
                    fI = j0.i(view);
                }
                gVar2.k(fI);
            } else {
                ColorStateList colorStateList = this.f11779j;
                if (colorStateList != null) {
                    v0.s(view, colorStateList);
                }
            }
            E();
            if (d0.c(view) == 0) {
                d0.s(view, 1);
            }
        }
        if (this.M == null) {
            this.M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f11773d0);
        }
        int top = view.getTop();
        coordinatorLayout.p(view, i10);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int i11 = this.T;
        int i12 = i11 - height;
        int i13 = this.f11792w;
        if (i12 < i13) {
            if (this.f11787r) {
                this.R = i11;
            } else {
                this.R = i11 - i13;
            }
        }
        this.D = Math.max(0, i11 - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        s();
        int i14 = this.L;
        if (i14 == 3) {
            v0.k(view, x());
        } else if (i14 == 6) {
            v0.k(view, this.E);
        } else if (this.I && i14 == 5) {
            v0.k(view, this.T);
        } else if (i14 == 4) {
            v0.k(view, this.G);
        } else if (i14 == 1 || i14 == 2) {
            v0.k(view, top - view.getTop());
        }
        F(this.L, false);
        this.V = new WeakReference(v(view));
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            return true;
        }
        fb1.t(arrayList.get(0));
        throw null;
    }

    @Override // b0.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f11780k, marginLayoutParams.width), w(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f11781l, marginLayoutParams.height));
        return true;
    }

    @Override // b0.b
    public final boolean j(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // b0.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < x()) {
                int iX = top - x();
                iArr[1] = iX;
                v0.k(view, -iX);
                B(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i11;
                v0.k(view, -i11);
                B(1);
            }
        } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
            int i14 = this.G;
            if (i13 > i14 && !this.I) {
                int i15 = top - i14;
                iArr[1] = i15;
                v0.k(view, -i15);
                B(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i11;
                v0.k(view, -i11);
                B(1);
            }
        }
        u(view.getTop());
        this.O = i11;
        this.P = true;
    }

    @Override // b0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // b0.b
    public final void n(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i10 = this.f11766a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f11774e = savedState.f11797f;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f11768b = savedState.f11798h;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = savedState.f11799q;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = savedState.f11800s;
            }
        }
        int i11 = savedState.f11796d;
        if (i11 == 1 || i11 == 2) {
            this.L = 4;
        } else {
            this.L = i11;
        }
    }

    @Override // b0.b
    public final Parcelable o(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // b0.b
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        this.O = 0;
        this.P = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // b0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.x()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.B(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.V
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f11768b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.X
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f11770c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.X
            int r6 = r2.Y
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.C(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f11768b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f11768b
            if (r3 == 0) goto L99
        L97:
            r0 = 4
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = 6
        Laf:
            r3 = 0
            r2.D(r0, r4, r3)
            r2.P = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // b0.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.L;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.M;
        if (eVar != null && (this.K || i10 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float fAbs = Math.abs(this.Z - motionEvent.getY());
            e eVar2 = this.M;
            if (fAbs > eVar2.f17692b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void s() {
        int iT = t();
        if (this.f11768b) {
            this.G = Math.max(this.T - iT, this.D);
        } else {
            this.G = this.T - iT;
        }
    }

    public final int t() {
        int i10;
        return this.f11775f ? Math.min(Math.max(this.f11776g, this.T - ((this.S * 9) / 16)), this.R) + this.f11791v : (this.f11783n || this.f11784o || (i10 = this.f11782m) <= 0) ? this.f11774e + this.f11791v : Math.max(this.f11774e, i10 + this.f11777h);
    }

    public final void u(int i10) {
        if (((View) this.U.get()) != null) {
            ArrayList arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.G;
            if (i10 <= i11 && i11 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            fb1.t(arrayList.get(0));
            throw null;
        }
    }

    public final int x() {
        if (this.f11768b) {
            return this.D;
        }
        return Math.max(this.C, this.f11787r ? 0 : this.f11792w);
    }

    public final int y(int i10) {
        if (i10 == 3) {
            return x();
        }
        if (i10 == 4) {
            return this.G;
        }
        if (i10 == 5) {
            return this.T;
        }
        if (i10 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(fb1.g("Invalid state to get top offset: ", i10));
    }

    public final void z(int i10) {
        if (i10 == -1) {
            if (this.f11775f) {
                return;
            } else {
                this.f11775f = true;
            }
        } else {
            if (!this.f11775f && this.f11774e == i10) {
                return;
            }
            this.f11775f = false;
            this.f11774e = Math.max(0, i10);
        }
        H();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11796d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f11797f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f11798h;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f11799q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f11800s;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11796d = parcel.readInt();
            this.f11797f = parcel.readInt();
            this.f11798h = parcel.readInt() == 1;
            this.f11799q = parcel.readInt() == 1;
            this.f11800s = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            parcel.writeInt(this.f11796d);
            parcel.writeInt(this.f11797f);
            parcel.writeInt(this.f11798h ? 1 : 0);
            parcel.writeInt(this.f11799q ? 1 : 0);
            parcel.writeInt(this.f11800s ? 1 : 0);
        }

        public SavedState(android.view.AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f11796d = bottomSheetBehavior.L;
            this.f11797f = bottomSheetBehavior.f11774e;
            this.f11798h = bottomSheetBehavior.f11768b;
            this.f11799q = bottomSheetBehavior.I;
            this.f11800s = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        this.f11766a = 0;
        this.f11768b = true;
        this.f11780k = -1;
        this.f11781l = -1;
        this.A = new j(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.f11771c0 = new SparseIntArray();
        this.f11773d0 = new q4.b(this);
        this.f11777h = context.getResources().getDimensionPixelSize(R.dimen.ra);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4.a.f15191d);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f11779j = tp1.g(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f11794y = d5.j.b(context, attributeSet, R.attr.cd, R.style.vq).a();
        }
        d5.j jVar = this.f11794y;
        if (jVar != null) {
            g gVar = new g(jVar);
            this.f11778i = gVar;
            gVar.j(context);
            ColorStateList colorStateList = this.f11779j;
            if (colorStateList != null) {
                this.f11778i.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f11778i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new q4.a(0, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f11780k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f11781l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            z(i10);
        } else {
            z(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.I != z9) {
            this.I = z9;
            if (!z9 && this.L == 5) {
                A(4);
            }
            E();
        }
        this.f11783n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f11768b != z10) {
            this.f11768b = z10;
            if (this.U != null) {
                s();
            }
            B((this.f11768b && this.L == 6) ? 3 : this.L);
            F(this.L, true);
            E();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f11766a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.F = f10;
            if (this.U != null) {
                this.E = (int) ((1.0f - f10) * this.T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i11 = typedValuePeekValue2.data;
                if (i11 >= 0) {
                    this.C = i11;
                    F(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    F(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f11772d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f11784o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f11785p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f11786q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f11787r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f11788s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f11789t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f11790u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f11793x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f11770c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}

package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.iq1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k0.l;
import k0.m;
import l.a0;
import m1.b1;
import m1.c1;
import m1.d0;
import m1.d1;
import m1.e0;
import m1.e1;
import m1.f0;
import m1.g0;
import m1.g1;
import m1.i0;
import m1.j0;
import m1.k;
import m1.k0;
import m1.l0;
import m1.m0;
import m1.n1;
import m1.p0;
import m1.q0;
import m1.r0;
import m1.s;
import m1.s0;
import m1.t0;
import m1.u0;
import m1.w0;
import m1.x0;
import m1.y;
import m1.y0;
import o0.o;
import o0.p;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements o {
    public static final int[] E0 = {R.attr.nestedScrollingEnabled};
    public static final boolean F0;
    public static final boolean G0;
    public static final Class[] H0;
    public static final e0 I0;
    public s0 A;
    public final int[] A0;
    public boolean B;
    public final ArrayList B0;
    public boolean C;
    public final d0 C0;
    public boolean D;
    public final f0 D0;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public final AccessibilityManager J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public j0 O;
    public EdgeEffect P;
    public EdgeEffect Q;
    public EdgeEffect R;
    public EdgeEffect S;
    public l0 T;
    public int U;
    public int V;
    public VelocityTracker W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f1040a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1041a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f1042b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1043b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f1044c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SavedState f1045d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f1046d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f1047e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1.b f1048f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public r0 f1049f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f1050g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m1.d f1051h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f1052h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final float f1053i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final float f1054j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f1055k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final d1 f1056l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public s f1057m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final iq1 f1058n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final b1 f1059o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public t0 f1060p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f1061q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f1062q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f1063r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1064s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f1065s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f1066t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final f0 f1067t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f1068u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f1069u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f1070v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public g1 f1071v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g0 f1072w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int[] f1073w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p0 f1074x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public p f1075x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f1076y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int[] f1077y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f1078z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final int[] f1079z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Parcelable f1080d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1080d = parcel.readParcelable(classLoader == null ? p0.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            parcel.writeParcelable(this.f1080d, 0);
        }
    }

    static {
        F0 = Build.VERSION.SDK_INT >= 23;
        G0 = true;
        Class cls = Integer.TYPE;
        H0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        I0 = new e0();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xyz.easypro.httpcustom.R.attr.zv);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewD = D(viewGroup.getChildAt(i10));
            if (recyclerViewD != null) {
                return recyclerViewD;
            }
        }
        return null;
    }

    public static e1 I(View view) {
        if (view == null) {
            return null;
        }
        return ((q0) view.getLayoutParams()).f15600a;
    }

    private p getScrollingChildHelper() {
        if (this.f1075x0 == null) {
            this.f1075x0 = new p(this);
        }
        return this.f1075x0;
    }

    public static void j(e1 e1Var) {
        WeakReference weakReference = e1Var.f15446b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == e1Var.f15445a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            e1Var.f15446b = null;
        }
    }

    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z9;
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f1078z;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s0 s0Var = (s0) arrayList.get(i10);
            m1.p pVar = (m1.p) s0Var;
            int i11 = pVar.f15580v;
            if (i11 == 1) {
                boolean zE = pVar.e(motionEvent.getX(), motionEvent.getY());
                boolean zD = pVar.d(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zE || zD)) {
                    if (zD) {
                        pVar.f15581w = 1;
                        pVar.f15574p = (int) motionEvent.getX();
                    } else if (zE) {
                        pVar.f15581w = 2;
                        pVar.f15571m = (int) motionEvent.getY();
                    }
                    pVar.g(2);
                }
            } else {
                z9 = i11 == 2;
            }
            if (z9 && action != 3) {
                this.A = s0Var;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int iE = this.f1051h.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iE; i12++) {
            e1 e1VarI = I(this.f1051h.d(i12));
            if (!e1VarI.q()) {
                int iC = e1VarI.c();
                if (iC < i10) {
                    i10 = iC;
                }
                if (iC > i11) {
                    i11 = iC;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final e1 E(int i10) {
        e1 e1Var = null;
        if (this.K) {
            return null;
        }
        int iH = this.f1051h.h();
        for (int i11 = 0; i11 < iH; i11++) {
            e1 e1VarI = I(this.f1051h.g(i11));
            if (e1VarI != null && !e1VarI.j() && F(e1VarI) == i10) {
                if (!this.f1051h.j(e1VarI.f15445a)) {
                    return e1VarI;
                }
                e1Var = e1VarI;
            }
        }
        return e1Var;
    }

    public final int F(e1 e1Var) {
        if (e1Var.e(524) || !e1Var.g()) {
            return -1;
        }
        m1.b bVar = this.f1048f;
        int i10 = e1Var.f15447c;
        ArrayList arrayList = bVar.f15404b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m1.a aVar = (m1.a) arrayList.get(i11);
            int i12 = aVar.f15396a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = aVar.f15397b;
                    if (i13 <= i10) {
                        int i14 = aVar.f15399d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = aVar.f15397b;
                    if (i15 == i10) {
                        i10 = aVar.f15399d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (aVar.f15399d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (aVar.f15397b <= i10) {
                i10 += aVar.f15399d;
            }
        }
        return i10;
    }

    public final long G(e1 e1Var) {
        return this.f1072w.f15478b ? e1Var.f15449e : e1Var.f15447c;
    }

    public final e1 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        q0 q0Var = (q0) view.getLayoutParams();
        boolean z9 = q0Var.f15602c;
        Rect rect = q0Var.f15601b;
        if (!z9) {
            return rect;
        }
        if (this.f1059o0.f15416g && (q0Var.f15600a.m() || q0Var.f15600a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1076y;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f1066t;
            rect2.set(0, 0, 0, 0);
            ((m0) arrayList.get(i10)).a(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        q0Var.f15602c = false;
        return rect;
    }

    public final boolean K() {
        return !this.D || this.K || this.f1048f.g();
    }

    public final boolean L() {
        return this.M > 0;
    }

    public final void M(int i10) {
        if (this.f1074x == null) {
            return;
        }
        setScrollState(2);
        this.f1074x.i0(i10);
        awakenScrollBars();
    }

    public final void N() {
        int iH = this.f1051h.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ((q0) this.f1051h.g(i10).getLayoutParams()).f15602c = true;
        }
        ArrayList arrayList = (ArrayList) this.f1042b.f15646e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q0 q0Var = (q0) ((e1) arrayList.get(i11)).f15445a.getLayoutParams();
            if (q0Var != null) {
                q0Var.f15602c = true;
            }
        }
    }

    public final void O(int i10, int i11, boolean z9) {
        int i12 = i10 + i11;
        int iH = this.f1051h.h();
        for (int i13 = 0; i13 < iH; i13++) {
            e1 e1VarI = I(this.f1051h.g(i13));
            if (e1VarI != null && !e1VarI.q()) {
                int i14 = e1VarI.f15447c;
                b1 b1Var = this.f1059o0;
                if (i14 >= i12) {
                    e1VarI.n(-i11, z9);
                    b1Var.f15415f = true;
                } else if (i14 >= i10) {
                    e1VarI.b(8);
                    e1VarI.n(-i11, z9);
                    e1VarI.f15447c = i10 - 1;
                    b1Var.f15415f = true;
                }
            }
        }
        w0 w0Var = this.f1042b;
        ArrayList arrayList = (ArrayList) w0Var.f15646e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e1 e1Var = (e1) arrayList.get(size);
            if (e1Var != null) {
                int i15 = e1Var.f15447c;
                if (i15 >= i12) {
                    e1Var.n(-i11, z9);
                } else if (i15 >= i10) {
                    e1Var.b(8);
                    w0Var.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.M++;
    }

    public final void Q(boolean z9) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.M - 1;
        this.M = i11;
        if (i11 < 1) {
            this.M = 0;
            if (z9) {
                int i12 = this.I;
                this.I = 0;
                if (i12 != 0 && (accessibilityManager = this.J) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    p0.b.b(accessibilityEventObtain, i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.B0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    e1 e1Var = (e1) arrayList.get(size);
                    if (e1Var.f15445a.getParent() == this && !e1Var.q() && (i10 = e1Var.f15461q) != -1) {
                        WeakHashMap weakHashMap = v0.f16075a;
                        o0.d0.s(e1Var.f15445a, i10);
                        e1Var.f15461q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.V) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.V = motionEvent.getPointerId(i10);
            int x9 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f1044c0 = x9;
            this.f1041a0 = x9;
            int y8 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f1046d0 = y8;
            this.f1043b0 = y8;
        }
    }

    public final void S() {
        if (this.f1069u0 || !this.B) {
            return;
        }
        WeakHashMap weakHashMap = v0.f16075a;
        o0.d0.m(this, this.C0);
        this.f1069u0 = true;
    }

    public final void T() {
        boolean z9;
        if (this.K) {
            m1.b bVar = this.f1048f;
            bVar.l(bVar.f15404b);
            bVar.l(bVar.f15405c);
            if (this.L) {
                this.f1074x.S();
            }
        }
        if (this.T == null || !this.f1074x.u0()) {
            this.f1048f.c();
        } else {
            this.f1048f.j();
        }
        boolean z10 = this.f1063r0 || this.f1065s0;
        boolean z11 = this.D && this.T != null && ((z9 = this.K) || z10 || this.f1074x.f15590f) && (!z9 || this.f1072w.f15478b);
        b1 b1Var = this.f1059o0;
        b1Var.f15419j = z11;
        b1Var.f15420k = z11 && z10 && !this.K && this.T != null && this.f1074x.u0();
    }

    public final void U(boolean z9) {
        this.L = z9 | this.L;
        this.K = true;
        int iH = this.f1051h.h();
        for (int i10 = 0; i10 < iH; i10++) {
            e1 e1VarI = I(this.f1051h.g(i10));
            if (e1VarI != null && !e1VarI.q()) {
                e1VarI.b(6);
            }
        }
        N();
        w0 w0Var = this.f1042b;
        ArrayList arrayList = (ArrayList) w0Var.f15646e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e1 e1Var = (e1) arrayList.get(i11);
            if (e1Var != null) {
                e1Var.b(6);
                e1Var.a(null);
            }
        }
        g0 g0Var = ((RecyclerView) w0Var.f15650i).f1072w;
        if (g0Var == null || !g0Var.f15478b) {
            w0Var.d();
        }
    }

    public final void V(e1 e1Var, k0 k0Var) {
        e1Var.f15454j &= -8193;
        boolean z9 = this.f1059o0.f15417h;
        d dVar = this.f1061q;
        if (z9 && e1Var.m() && !e1Var.j() && !e1Var.q()) {
            ((s.e) dVar.f1108c).f(G(e1Var), e1Var);
        }
        dVar.c(e1Var, k0Var);
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1066t;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q0) {
            q0 q0Var = (q0) layoutParams;
            if (!q0Var.f15602c) {
                int i10 = rect.left;
                Rect rect2 = q0Var.f15601b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1074x.f0(this, view, this.f1066t, !this.D, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        e0(0);
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.P.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Q;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.R;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.R.isFinished();
        }
        EdgeEffect edgeEffect4 = this.S;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.S.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = v0.f16075a;
            o0.d0.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(int r22, int r23, android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent):boolean");
    }

    public final void Z(int i10, int i11, int[] iArr) {
        e1 e1Var;
        c0();
        P();
        int i12 = m.f14637a;
        l.a("RV Scroll");
        b1 b1Var = this.f1059o0;
        z(b1Var);
        w0 w0Var = this.f1042b;
        int iH0 = i10 != 0 ? this.f1074x.h0(i10, w0Var, b1Var) : 0;
        int iJ0 = i11 != 0 ? this.f1074x.j0(i11, w0Var, b1Var) : 0;
        l.b();
        int iE = this.f1051h.e();
        for (int i13 = 0; i13 < iE; i13++) {
            View viewD = this.f1051h.d(i13);
            e1 e1VarH = H(viewD);
            if (e1VarH != null && (e1Var = e1VarH.f15453i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = e1Var.f15445a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = iH0;
            iArr[1] = iJ0;
        }
    }

    public final void a0(int i10) {
        y yVar;
        if (this.G) {
            return;
        }
        setScrollState(0);
        d1 d1Var = this.f1056l0;
        d1Var.f15440s.removeCallbacks(d1Var);
        d1Var.f15436d.abortAnimation();
        p0 p0Var = this.f1074x;
        if (p0Var != null && (yVar = p0Var.f15589e) != null) {
            yVar.f();
        }
        p0 p0Var2 = this.f1074x;
        if (p0Var2 == null) {
            return;
        }
        p0Var2.i0(i10);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        p0 p0Var = this.f1074x;
        if (p0Var != null) {
            p0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(int i10, int i11, boolean z9) {
        p0 p0Var = this.f1074x;
        if (p0Var == null || this.G) {
            return;
        }
        if (!p0Var.d()) {
            i10 = 0;
        }
        if (!this.f1074x.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z9) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().h(i12, 1);
        }
        this.f1056l0.b(i10, i11, Integer.MIN_VALUE, null);
    }

    public final void c0() {
        int i10 = this.E + 1;
        this.E = i10;
        if (i10 != 1 || this.G) {
            return;
        }
        this.F = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q0) && this.f1074x.f((q0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        p0 p0Var = this.f1074x;
        if (p0Var != null && p0Var.d()) {
            return this.f1074x.j(this.f1059o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        p0 p0Var = this.f1074x;
        if (p0Var != null && p0Var.d()) {
            return this.f1074x.k(this.f1059o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        p0 p0Var = this.f1074x;
        if (p0Var != null && p0Var.d()) {
            return this.f1074x.l(this.f1059o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        p0 p0Var = this.f1074x;
        if (p0Var != null && p0Var.e()) {
            return this.f1074x.m(this.f1059o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        p0 p0Var = this.f1074x;
        if (p0Var != null && p0Var.e()) {
            return this.f1074x.n(this.f1059o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        p0 p0Var = this.f1074x;
        if (p0Var != null && p0Var.e()) {
            return this.f1074x.o(this.f1059o0);
        }
        return 0;
    }

    public final void d0(boolean z9) {
        if (this.E < 1) {
            this.E = 1;
        }
        if (!z9 && !this.G) {
            this.F = false;
        }
        if (this.E == 1) {
            if (z9 && this.F && !this.G && this.f1074x != null && this.f1072w != null) {
                o();
            }
            if (!this.G) {
                this.F = false;
            }
        }
        this.E--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return getScrollingChildHelper().a(f10, f11, z9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z9;
        super.draw(canvas);
        ArrayList arrayList = this.f1076y;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((m0) arrayList.get(i10)).c(canvas);
        }
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z9 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1064s ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.P;
            z9 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1064s) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.Q;
            z9 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.R;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1064s ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.R;
            z9 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.S;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1064s) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.S;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z9 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z9 || this.T == null || arrayList.size() <= 0 || !this.T.f()) && !z9) {
            return;
        }
        WeakHashMap weakHashMap = v0.f16075a;
        o0.d0.k(this);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(int i10) {
        getScrollingChildHelper().i(i10);
    }

    public final void f(e1 e1Var) {
        View view = e1Var.f15445a;
        boolean z9 = view.getParent() == this;
        this.f1042b.j(H(view));
        if (e1Var.l()) {
            this.f1051h.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z9) {
            this.f1051h.a(-1, view, true);
            return;
        }
        m1.d dVar = this.f1051h;
        int iIndexOfChild = dVar.f15430a.f15468a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            dVar.f15431b.h(iIndexOfChild);
            dVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(m0 m0Var) {
        p0 p0Var = this.f1074x;
        if (p0Var != null) {
            p0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1076y;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(m0Var);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p0 p0Var = this.f1074x;
        if (p0Var != null) {
            return p0Var.r();
        }
        throw new IllegalStateException(a0.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p0 p0Var = this.f1074x;
        if (p0Var != null) {
            return p0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(a0.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g0 getAdapter() {
        return this.f1072w;
    }

    @Override // android.view.View
    public int getBaseline() {
        p0 p0Var = this.f1074x;
        if (p0Var == null) {
            return super.getBaseline();
        }
        p0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1064s;
    }

    public g1 getCompatAccessibilityDelegate() {
        return this.f1071v0;
    }

    public j0 getEdgeEffectFactory() {
        return this.O;
    }

    public l0 getItemAnimator() {
        return this.T;
    }

    public int getItemDecorationCount() {
        return this.f1076y.size();
    }

    public p0 getLayoutManager() {
        return this.f1074x;
    }

    public int getMaxFlingVelocity() {
        return this.f1052h0;
    }

    public int getMinFlingVelocity() {
        return this.f1050g0;
    }

    public long getNanoTime() {
        if (G0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r0 getOnFlingListener() {
        return this.f1049f0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1055k0;
    }

    public m1.v0 getRecycledViewPool() {
        return this.f1042b.c();
    }

    public int getScrollState() {
        return this.U;
    }

    public final void h(t0 t0Var) {
        if (this.f1062q0 == null) {
            this.f1062q0 = new ArrayList();
        }
        this.f1062q0.add(t0Var);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(a0.e(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.N > 0) {
            new IllegalStateException(a0.e(this, new StringBuilder(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.B;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.G;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f16056d;
    }

    public final void k() {
        int iH = this.f1051h.h();
        for (int i10 = 0; i10 < iH; i10++) {
            e1 e1VarI = I(this.f1051h.g(i10));
            if (!e1VarI.q()) {
                e1VarI.f15448d = -1;
                e1VarI.f15451g = -1;
            }
        }
        w0 w0Var = this.f1042b;
        ArrayList arrayList = (ArrayList) w0Var.f15646e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e1 e1Var = (e1) arrayList.get(i11);
            e1Var.f15448d = -1;
            e1Var.f15451g = -1;
        }
        ArrayList arrayList2 = (ArrayList) w0Var.f15644c;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            e1 e1Var2 = (e1) arrayList2.get(i12);
            e1Var2.f15448d = -1;
            e1Var2.f15451g = -1;
        }
        ArrayList arrayList3 = (ArrayList) w0Var.f15645d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                e1 e1Var3 = (e1) ((ArrayList) w0Var.f15645d).get(i13);
                e1Var3.f15448d = -1;
                e1Var3.f15451g = -1;
            }
        }
    }

    public final void l(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.P.onRelease();
            zIsFinished = this.P.isFinished();
        }
        EdgeEffect edgeEffect2 = this.R;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.R.onRelease();
            zIsFinished |= this.R.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.Q.onRelease();
            zIsFinished |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.S;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.S.onRelease();
            zIsFinished |= this.S.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = v0.f16075a;
            o0.d0.k(this);
        }
    }

    public final void m() {
        if (!this.D || this.K) {
            int i10 = m.f14637a;
            l.a("RV FullInvalidate");
            o();
            l.b();
            return;
        }
        if (this.f1048f.g()) {
            this.f1048f.getClass();
            if (this.f1048f.g()) {
                int i11 = m.f14637a;
                l.a("RV FullInvalidate");
                o();
                l.b();
            }
        }
    }

    public final void n(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = v0.f16075a;
        setMeasuredDimension(p0.g(i10, paddingRight, o0.d0.e(this)), p0.g(i11, getPaddingBottom() + getPaddingTop(), o0.d0.d(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033f  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [m1.e1] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instruction units count: 931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.M = r0
            r1 = 1
            r5.B = r1
            boolean r2 = r5.D
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r5.D = r2
            m1.p0 r2 = r5.f1074x
            if (r2 == 0) goto L1e
            r2.f15591g = r1
        L1e:
            r5.f1069u0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.G0
            if (r0 == 0) goto L73
            java.lang.ThreadLocal r0 = m1.s.f15609h
            java.lang.Object r1 = r0.get()
            m1.s r1 = (m1.s) r1
            r5.f1057m0 = r1
            if (r1 != 0) goto L6c
            m1.s r1 = new m1.s
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f15611a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f15614f = r2
            r5.f1057m0 = r1
            java.util.WeakHashMap r1 = o0.v0.f16075a
            android.view.Display r1 = o0.e0.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5e
            if (r1 == 0) goto L5e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5e
            goto L60
        L5e:
            r1 = 1114636288(0x42700000, float:60.0)
        L60:
            m1.s r2 = r5.f1057m0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f15613d = r3
            r0.set(r2)
        L6c:
            m1.s r0 = r5.f1057m0
            java.util.ArrayList r0 = r0.f15611a
            r0.add(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        s sVar;
        y yVar;
        super.onDetachedFromWindow();
        l0 l0Var = this.T;
        if (l0Var != null) {
            l0Var.e();
        }
        setScrollState(0);
        d1 d1Var = this.f1056l0;
        d1Var.f15440s.removeCallbacks(d1Var);
        d1Var.f15436d.abortAnimation();
        p0 p0Var = this.f1074x;
        if (p0Var != null && (yVar = p0Var.f15589e) != null) {
            yVar.f();
        }
        this.B = false;
        p0 p0Var2 = this.f1074x;
        if (p0Var2 != null) {
            p0Var2.f15591g = false;
            p0Var2.M(this);
        }
        this.B0.clear();
        removeCallbacks(this.C0);
        this.f1061q.getClass();
        while (n1.f15550d.a() != null) {
        }
        if (!G0 || (sVar = this.f1057m0) == null) {
            return;
        }
        sVar.f15611a.remove(this);
        this.f1057m0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1076y;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m0) arrayList.get(i10)).b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            m1.p0 r0 = r5.f1074x
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.G
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            m1.p0 r0 = r5.f1074x
            boolean r0 = r0.e()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            m1.p0 r3 = r5.f1074x
            boolean r3 = r3.d()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = 0
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            m1.p0 r3 = r5.f1074x
            boolean r3 = r3.e()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            m1.p0 r3 = r5.f1074x
            boolean r3 = r3.d()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = 0
            goto L64
        L62:
            r0 = 0
            goto L3c
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6c:
            float r2 = r5.f1053i0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f1054j0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.Y(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (this.G) {
            return false;
        }
        this.A = null;
        if (B(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        p0 p0Var = this.f1074x;
        if (p0Var == null) {
            return false;
        }
        boolean zD = p0Var.d();
        boolean zE = this.f1074x.e();
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.H) {
                this.H = false;
            }
            this.V = motionEvent.getPointerId(0);
            int x9 = (int) (motionEvent.getX() + 0.5f);
            this.f1044c0 = x9;
            this.f1041a0 = x9;
            int y8 = (int) (motionEvent.getY() + 0.5f);
            this.f1046d0 = y8;
            this.f1043b0 = y8;
            if (this.U == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                e0(1);
            }
            int[] iArr = this.f1079z0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zD;
            if (zE) {
                i10 = (zD ? 1 : 0) | 2;
            }
            getScrollingChildHelper().h(i10, 0);
        } else if (actionMasked == 1) {
            this.W.clear();
            e0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.V);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y9 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.U != 1) {
                int i11 = x10 - this.f1041a0;
                int i12 = y9 - this.f1043b0;
                if (!zD || Math.abs(i11) <= this.f1047e0) {
                    z9 = false;
                } else {
                    this.f1044c0 = x10;
                    z9 = true;
                }
                if (zE && Math.abs(i12) > this.f1047e0) {
                    this.f1046d0 = y9;
                } else if (z9) {
                }
                setScrollState(1);
            }
        } else if (actionMasked == 3) {
            X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.V = motionEvent.getPointerId(actionIndex);
            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1044c0 = x11;
            this.f1041a0 = x11;
            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1046d0 = y10;
            this.f1043b0 = y10;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.U == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14 = m.f14637a;
        l.a("RV OnLayout");
        o();
        l.b();
        this.D = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        p0 p0Var = this.f1074x;
        if (p0Var == null) {
            n(i10, i11);
            return;
        }
        boolean zH = p0Var.H();
        b1 b1Var = this.f1059o0;
        if (!zH) {
            if (this.C) {
                this.f1074x.f15586b.n(i10, i11);
                return;
            }
            if (b1Var.f15420k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g0 g0Var = this.f1072w;
            if (g0Var != null) {
                b1Var.f15414e = g0Var.a();
            } else {
                b1Var.f15414e = 0;
            }
            c0();
            this.f1074x.f15586b.n(i10, i11);
            d0(false);
            b1Var.f15416g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f1074x.f15586b.n(i10, i11);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f1072w == null) {
            return;
        }
        if (b1Var.f15413d == 1) {
            p();
        }
        this.f1074x.l0(i10, i11);
        b1Var.f15418i = true;
        q();
        this.f1074x.n0(i10, i11);
        if (this.f1074x.q0()) {
            this.f1074x.l0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            b1Var.f15418i = true;
            q();
            this.f1074x.n0(i10, i11);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f1045d = savedState;
        super.onRestoreInstanceState(savedState.f570a);
        p0 p0Var = this.f1074x;
        if (p0Var == null || (parcelable2 = this.f1045d.f1080d) == null) {
            return;
        }
        p0Var.Y(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f1045d;
        if (savedState2 != null) {
            savedState.f1080d = savedState2.f1080d;
        } else {
            p0 p0Var = this.f1074x;
            if (p0Var != null) {
                savedState.f1080d = p0Var.Z();
            } else {
                savedState.f1080d = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.S = null;
        this.Q = null;
        this.R = null;
        this.P = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1 A[PHI: r0
      0x00d1: PHI (r0v55 int) = (r0v42 int), (r0v59 int) binds: [B:42:0x00ba, B:46:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 1221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        c0();
        P();
        b1 b1Var = this.f1059o0;
        b1Var.a(6);
        this.f1048f.c();
        b1Var.f15414e = this.f1072w.a();
        b1Var.f15412c = 0;
        b1Var.f15416g = false;
        this.f1074x.W(this.f1042b, b1Var);
        b1Var.f15415f = false;
        this.f1045d = null;
        b1Var.f15419j = b1Var.f15419j && this.T != null;
        b1Var.f15413d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z9) {
        e1 e1VarI = I(view);
        if (e1VarI != null) {
            if (e1VarI.l()) {
                e1VarI.f15454j &= -257;
            } else if (!e1VarI.q()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(e1VarI);
                throw new IllegalArgumentException(a0.e(this, sb));
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        y yVar = this.f1074x.f15589e;
        if ((yVar == null || !yVar.f15667e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        return this.f1074x.f0(this, view, rect, z9, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        ArrayList arrayList = this.f1078z;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s0) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.E != 0 || this.G) {
            this.F = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        p0 p0Var = this.f1074x;
        if (p0Var == null || this.G) {
            return;
        }
        boolean zD = p0Var.d();
        boolean zE = this.f1074x.e();
        if (zD || zE) {
            if (!zD) {
                i10 = 0;
            }
            if (!zE) {
                i11 = 0;
            }
            Y(i10, i11, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iA = accessibilityEvent != null ? p0.b.a(accessibilityEvent) : 0;
            this.I |= iA != 0 ? iA : 0;
        }
    }

    public void setAccessibilityDelegateCompat(g1 g1Var) {
        this.f1071v0 = g1Var;
        v0.q(this, g1Var);
    }

    public void setAdapter(g0 g0Var) {
        setLayoutFrozen(false);
        g0 g0Var2 = this.f1072w;
        y0 y0Var = this.f1040a;
        if (g0Var2 != null) {
            g0Var2.f15477a.unregisterObserver(y0Var);
            this.f1072w.getClass();
        }
        l0 l0Var = this.T;
        if (l0Var != null) {
            l0Var.e();
        }
        p0 p0Var = this.f1074x;
        w0 w0Var = this.f1042b;
        if (p0Var != null) {
            p0Var.b0(w0Var);
            this.f1074x.c0(w0Var);
        }
        ((ArrayList) w0Var.f15644c).clear();
        w0Var.d();
        m1.b bVar = this.f1048f;
        bVar.l(bVar.f15404b);
        bVar.l(bVar.f15405c);
        g0 g0Var3 = this.f1072w;
        this.f1072w = g0Var;
        if (g0Var != null) {
            g0Var.f15477a.registerObserver(y0Var);
        }
        g0 g0Var4 = this.f1072w;
        ((ArrayList) w0Var.f15644c).clear();
        w0Var.d();
        m1.v0 v0VarC = w0Var.c();
        if (g0Var3 != null) {
            v0VarC.f15637b--;
        }
        if (v0VarC.f15637b == 0) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = v0VarC.f15636a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                ((u0) sparseArray.valueAt(i10)).f15626a.clear();
                i10++;
            }
        }
        if (g0Var4 != null) {
            v0VarC.f15637b++;
        }
        this.f1059o0.f15415f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i0 i0Var) {
        if (i0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z9) {
        if (z9 != this.f1064s) {
            this.S = null;
            this.Q = null;
            this.R = null;
            this.P = null;
        }
        this.f1064s = z9;
        super.setClipToPadding(z9);
        if (this.D) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j0 j0Var) {
        j0Var.getClass();
        this.O = j0Var;
        this.S = null;
        this.Q = null;
        this.R = null;
        this.P = null;
    }

    public void setHasFixedSize(boolean z9) {
        this.C = z9;
    }

    public void setItemAnimator(l0 l0Var) {
        l0 l0Var2 = this.T;
        if (l0Var2 != null) {
            l0Var2.e();
            this.T.f15532a = null;
        }
        this.T = l0Var;
        if (l0Var != null) {
            l0Var.f15532a = this.f1067t0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        w0 w0Var = this.f1042b;
        w0Var.f15642a = i10;
        w0Var.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z9) {
        suppressLayout(z9);
    }

    public void setLayoutManager(p0 p0Var) {
        f0 f0Var;
        y yVar;
        if (p0Var == this.f1074x) {
            return;
        }
        setScrollState(0);
        d1 d1Var = this.f1056l0;
        d1Var.f15440s.removeCallbacks(d1Var);
        d1Var.f15436d.abortAnimation();
        p0 p0Var2 = this.f1074x;
        if (p0Var2 != null && (yVar = p0Var2.f15589e) != null) {
            yVar.f();
        }
        p0 p0Var3 = this.f1074x;
        w0 w0Var = this.f1042b;
        if (p0Var3 != null) {
            l0 l0Var = this.T;
            if (l0Var != null) {
                l0Var.e();
            }
            this.f1074x.b0(w0Var);
            this.f1074x.c0(w0Var);
            ((ArrayList) w0Var.f15644c).clear();
            w0Var.d();
            if (this.B) {
                p0 p0Var4 = this.f1074x;
                p0Var4.f15591g = false;
                p0Var4.M(this);
            }
            this.f1074x.o0(null);
            this.f1074x = null;
        } else {
            ((ArrayList) w0Var.f15644c).clear();
            w0Var.d();
        }
        m1.d dVar = this.f1051h;
        dVar.f15431b.g();
        ArrayList arrayList = dVar.f15432c;
        int size = arrayList.size() - 1;
        while (true) {
            f0Var = dVar.f15430a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            f0Var.getClass();
            e1 e1VarI = I(view);
            if (e1VarI != null) {
                int i10 = e1VarI.f15460p;
                RecyclerView recyclerView = f0Var.f15468a;
                if (recyclerView.L()) {
                    e1VarI.f15461q = i10;
                    recyclerView.B0.add(e1VarI);
                } else {
                    WeakHashMap weakHashMap = v0.f16075a;
                    o0.d0.s(e1VarI.f15445a, i10);
                }
                e1VarI.f15460p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = f0Var.f15468a;
        int childCount = recyclerView2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView2.getChildAt(i11);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.f1074x = p0Var;
        if (p0Var != null) {
            if (p0Var.f15586b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(p0Var);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(a0.e(p0Var.f15586b, sb));
            }
            p0Var.o0(this);
            if (this.B) {
                this.f1074x.f15591g = true;
            }
        }
        w0Var.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        p scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f16056d) {
            WeakHashMap weakHashMap = v0.f16075a;
            o0.j0.z(scrollingChildHelper.f16055c);
        }
        scrollingChildHelper.f16056d = z9;
    }

    public void setOnFlingListener(r0 r0Var) {
        this.f1049f0 = r0Var;
    }

    @Deprecated
    public void setOnScrollListener(t0 t0Var) {
        this.f1060p0 = t0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z9) {
        this.f1055k0 = z9;
    }

    public void setRecycledViewPool(m1.v0 v0Var) {
        w0 w0Var = this.f1042b;
        if (((m1.v0) w0Var.f15648g) != null) {
            r1.f15637b--;
        }
        w0Var.f15648g = v0Var;
        if (v0Var == null || ((RecyclerView) w0Var.f15650i).getAdapter() == null) {
            return;
        }
        ((m1.v0) w0Var.f15648g).f15637b++;
    }

    public void setRecyclerListener(x0 x0Var) {
    }

    public void setScrollState(int i10) {
        y yVar;
        if (i10 == this.U) {
            return;
        }
        this.U = i10;
        if (i10 != 2) {
            d1 d1Var = this.f1056l0;
            d1Var.f15440s.removeCallbacks(d1Var);
            d1Var.f15436d.abortAnimation();
            p0 p0Var = this.f1074x;
            if (p0Var != null && (yVar = p0Var.f15589e) != null) {
                yVar.f();
            }
        }
        p0 p0Var2 = this.f1074x;
        if (p0Var2 != null) {
            p0Var2.a0(i10);
        }
        t0 t0Var = this.f1060p0;
        if (t0Var != null) {
            t0Var.a(this, i10);
        }
        ArrayList arrayList = this.f1062q0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((t0) this.f1062q0.get(size)).a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 1) {
            this.f1047e0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f1047e0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(c1 c1Var) {
        this.f1042b.f15649h = c1Var;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().h(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z9) {
        y yVar;
        if (z9 != this.G) {
            i("Do not suppressLayout in layout or scroll");
            if (!z9) {
                this.G = false;
                if (this.F && this.f1074x != null && this.f1072w != null) {
                    requestLayout();
                }
                this.F = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.G = true;
            this.H = true;
            setScrollState(0);
            d1 d1Var = this.f1056l0;
            d1Var.f15440s.removeCallbacks(d1Var);
            d1Var.f15436d.abortAnimation();
            p0 p0Var = this.f1074x;
            if (p0Var == null || (yVar = p0Var.f15589e) == null) {
                return;
            }
            yVar.f();
        }
    }

    public final void t(int i10, int i11) {
        this.N++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        t0 t0Var = this.f1060p0;
        if (t0Var != null) {
            t0Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.f1062q0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((t0) this.f1062q0.get(size)).b(this, i10, i11);
            }
        }
        this.N--;
    }

    public final void u() {
        if (this.S != null) {
            return;
        }
        this.O.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.S = edgeEffect;
        if (this.f1064s) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.P != null) {
            return;
        }
        this.O.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.P = edgeEffect;
        if (this.f1064s) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.R != null) {
            return;
        }
        this.O.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.R = edgeEffect;
        if (this.f1064s) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.Q != null) {
            return;
        }
        this.O.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Q = edgeEffect;
        if (this.f1064s) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1072w + ", layout:" + this.f1074x + ", context:" + getContext();
    }

    public final void z(b1 b1Var) {
        if (getScrollState() != 2) {
            b1Var.getClass();
            return;
        }
        OverScroller overScroller = this.f1056l0.f15436d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        b1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        float fA;
        TypedArray typedArray;
        int i11;
        char c10;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i10);
        this.f1040a = new y0(this);
        this.f1042b = new w0(this);
        int i12 = 1;
        this.f1061q = new d(1);
        this.f1066t = new Rect();
        this.f1068u = new Rect();
        this.f1070v = new RectF();
        this.f1076y = new ArrayList();
        this.f1078z = new ArrayList();
        this.E = 0;
        this.K = false;
        this.L = false;
        this.M = 0;
        this.N = 0;
        this.O = new j0();
        this.T = new k();
        this.U = 0;
        this.V = -1;
        this.f1053i0 = Float.MIN_VALUE;
        this.f1054j0 = Float.MIN_VALUE;
        this.f1055k0 = true;
        this.f1056l0 = new d1(this);
        this.f1058n0 = G0 ? new iq1(i12) : null;
        b1 b1Var = new b1();
        b1Var.f15410a = -1;
        b1Var.f15411b = 0;
        b1Var.f15412c = 0;
        b1Var.f15413d = 1;
        b1Var.f15414e = 0;
        b1Var.f15415f = false;
        b1Var.f15416g = false;
        b1Var.f15417h = false;
        b1Var.f15418i = false;
        b1Var.f15419j = false;
        b1Var.f15420k = false;
        this.f1059o0 = b1Var;
        this.f1063r0 = false;
        this.f1065s0 = false;
        f0 f0Var = new f0(this);
        this.f1067t0 = f0Var;
        this.f1069u0 = false;
        this.f1073w0 = new int[2];
        this.f1077y0 = new int[2];
        this.f1079z0 = new int[2];
        this.A0 = new int[2];
        this.B0 = new ArrayList();
        this.C0 = new d0(this);
        this.D0 = new f0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1047e0 = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = o0.y0.f16087a;
            fA = o0.w0.a(viewConfiguration);
        } else {
            fA = o0.y0.a(viewConfiguration, context);
        }
        this.f1053i0 = fA;
        this.f1054j0 = i13 >= 26 ? o0.w0.b(viewConfiguration) : o0.y0.a(viewConfiguration, context);
        this.f1050g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1052h0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.T.f15532a = f0Var;
        this.f1048f = new m1.b(new f0(this));
        this.f1051h = new m1.d(new f0(this));
        WeakHashMap weakHashMap = v0.f16075a;
        if ((i13 < 26 || o0.m0.b(this) == 0) && i13 >= 26) {
            o0.m0.l(this, 8);
        }
        if (o0.d0.c(this) == 0) {
            o0.d0.s(this, 1);
        }
        this.J = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new g1(this));
        int[] iArr = l1.a.f15123a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        if (i13 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1064s = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(a0.e(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i11 = 4;
            typedArray = typedArrayObtainStyledAttributes;
            c10 = 2;
            new m1.p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.e5), resources.getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.e7), resources.getDimensionPixelOffset(xyz.easypro.httpcustom.R.dimen.e6));
        } else {
            typedArray = typedArrayObtainStyledAttributes;
            i11 = 4;
            c10 = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(H0);
                        objArr = new Object[i11];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c10] = Integer.valueOf(i10);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((p0) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e16);
                }
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        int[] iArr2 = E0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        if (i14 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        }
        boolean z9 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z9);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p0 p0Var = this.f1074x;
        if (p0Var != null) {
            return p0Var.t(layoutParams);
        }
        throw new IllegalStateException(a0.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}

package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.activity.e;
import androidx.customview.view.AbsSavedState;
import b0.g;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l.a0;
import l.h2;
import o0.d0;
import o0.j0;
import o0.v0;
import v0.d;
import z1.b;
import z1.c;
import z1.f;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int[] f1129n0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final g f1130o0 = new g(1);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d f1131p0 = new d(1);
    public int A;
    public int B;
    public float C;
    public float D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public final int L;
    public int M;
    public final int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public VelocityTracker T;
    public final int U;
    public final int V;
    public final int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1132a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f1133a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1134b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f1135b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f1136c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f1137d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final EdgeEffect f1138d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final EdgeEffect f1139e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f1140f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f1141f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f1142g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z1.a f1143h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f1144h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ArrayList f1145i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public f f1146j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ArrayList f1147k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final e f1148l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f1149m0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1150q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Parcelable f1152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ClassLoader f1153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Scroller f1154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h2 f1156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f1158z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1159d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Parcelable f1160f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ClassLoader f1161h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f1159d = parcel.readInt();
            this.f1160f = parcel.readParcelable(classLoader);
            this.f1161h = classLoader;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return a0.h(sb, this.f1159d, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            parcel.writeInt(this.f1159d);
            parcel.writeParcelable(this.f1160f, i10);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1134b = new ArrayList();
        this.f1137d = new c();
        this.f1140f = new Rect();
        this.f1151s = -1;
        this.f1152t = null;
        this.f1153u = null;
        this.C = -3.4028235E38f;
        this.D = Float.MAX_VALUE;
        this.I = 1;
        this.S = -1;
        this.f1141f0 = true;
        this.f1148l0 = new e(11, this);
        this.f1149m0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f1154v = new Scroller(context2, f1131p0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.N = viewConfiguration.getScaledPagingTouchSlop();
        this.U = (int) (400.0f * f10);
        this.V = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1138d0 = new EdgeEffect(context2);
        this.f1139e0 = new EdgeEffect(context2);
        this.W = (int) (25.0f * f10);
        this.f1133a0 = (int) (2.0f * f10);
        this.L = (int) (f10 * 16.0f);
        v0.q(this, new z1.e(this, 0));
        if (d0.c(this) == 0) {
            d0.s(this, 1);
        }
        j0.u(this, new f.f(this));
    }

    public static boolean d(int i10, int i11, int i12, View view, boolean z9) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z9 && view.canScrollHorizontally(-i10);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z9) {
        if (this.G != z9) {
            this.G = z9;
        }
    }

    public final c a(int i10, int i11) {
        c cVar = new c();
        cVar.f20672b = i10;
        cVar.f20671a = this.f1143h.f(this, i10);
        this.f1143h.getClass();
        cVar.f20674d = 1.0f;
        ArrayList arrayList = this.f1134b;
        if (i11 < 0 || i11 >= arrayList.size()) {
            arrayList.add(cVar);
        } else {
            arrayList.add(i11, cVar);
        }
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        c cVarL;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (cVarL = l(childAt)) != null && cVarL.f20672b == this.f1150q) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        c cVarL;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (cVarL = l(childAt)) != null && cVarL.f20672b == this.f1150q) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        z1.d dVar = (z1.d) layoutParams;
        boolean z9 = dVar.f20676a | (view.getClass().getAnnotation(b.class) != null);
        dVar.f20676a = z9;
        if (!this.F) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z9) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            dVar.f20679d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public final void b(f fVar) {
        if (this.f1145i0 == null) {
            this.f1145i0 = new ArrayList();
        }
        this.f1145i0.add(fVar);
    }

    public final boolean c(int i10) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                parent2.getClass();
            }
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        boolean zQ = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f1140f;
            if (i10 == 17) {
                int i11 = k(viewFindNextFocus, rect).left;
                int i12 = k(viewFindFocus, rect).left;
                if (viewFindFocus == null || i11 < i12) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                    zQ = zRequestFocus;
                } else {
                    int i13 = this.f1150q;
                    if (i13 > 0) {
                        y(i13 - 1);
                        zQ = true;
                    }
                }
            } else if (i10 == 66) {
                zRequestFocus = (viewFindFocus == null || k(viewFindNextFocus, rect).left > k(viewFindFocus, rect).left) ? viewFindNextFocus.requestFocus() : q();
                zQ = zRequestFocus;
            }
        } else if (i10 == 17 || i10 == 1) {
            int i14 = this.f1150q;
            if (i14 > 0) {
                y(i14 - 1);
                zQ = true;
            }
        } else if (i10 == 66 || i10 == 2) {
            zQ = q();
        }
        if (zQ) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zQ;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.f1143h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.C)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.D));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof z1.d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f1155w = true;
        if (this.f1154v.isFinished() || !this.f1154v.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1154v.getCurrX();
        int currY = this.f1154v.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!r(currX)) {
                this.f1154v.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = v0.f16075a;
        d0.k(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            boolean r0 = super.dispatchKeyEvent(r5)
            r1 = 1
            if (r0 != 0) goto L60
            int r0 = r5.getAction()
            if (r0 != 0) goto L5f
            int r0 = r5.getKeyCode()
            r2 = 21
            r3 = 2
            if (r0 == r2) goto L47
            r2 = 22
            if (r0 == r2) goto L35
            r2 = 61
            if (r0 == r2) goto L1f
            goto L5f
        L1f:
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L2a
            boolean r5 = r4.c(r3)
            goto L5c
        L2a:
            boolean r5 = r5.hasModifiers(r1)
            if (r5 == 0) goto L5f
            boolean r5 = r4.c(r1)
            goto L5c
        L35:
            boolean r5 = r5.hasModifiers(r3)
            if (r5 == 0) goto L40
            boolean r5 = r4.q()
            goto L5c
        L40:
            r5 = 66
            boolean r5 = r4.c(r5)
            goto L5c
        L47:
            boolean r5 = r5.hasModifiers(r3)
            if (r5 == 0) goto L56
            int r5 = r4.f1150q
            if (r5 <= 0) goto L5f
            int r5 = r5 - r1
            r4.y(r5)
            goto L60
        L56:
            r5 = 17
            boolean r5 = r4.c(r5)
        L5c:
            if (r5 == 0) goto L5f
            goto L60
        L5f:
            r1 = 0
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c cVarL;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (cVarL = l(childAt)) != null && cVarL.f20672b == this.f1150q && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zDraw;
        z1.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f1143h) == null || aVar.c() <= 1)) {
            this.f1138d0.finish();
            this.f1139e0.finish();
            return;
        }
        if (this.f1138d0.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate(getPaddingTop() + (-height), this.C * width);
            this.f1138d0.setSize(height, width);
            zDraw = this.f1138d0.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.f1139e0.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.D + 1.0f)) * width2);
            this.f1139e0.setSize(height2, width2);
            zDraw |= this.f1139e0.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            WeakHashMap weakHashMap = v0.f16075a;
            d0.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1158z;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z9) {
        boolean z10 = this.f1149m0 == 2;
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.f1154v.isFinished()) {
                this.f1154v.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1154v.getCurrX();
                int currY = this.f1154v.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        r(currX);
                    }
                }
            }
        }
        this.H = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1134b;
            if (i10 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar.f20673c) {
                cVar.f20673c = false;
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            e eVar = this.f1148l0;
            if (!z9) {
                eVar.run();
            } else {
                WeakHashMap weakHashMap = v0.f16075a;
                d0.m(this, eVar);
            }
        }
    }

    public final void f() {
        int iC = this.f1143h.c();
        this.f1132a = iC;
        ArrayList arrayList = this.f1134b;
        boolean z9 = arrayList.size() < (this.I * 2) + 1 && arrayList.size() < iC;
        int iMax = this.f1150q;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            z1.a aVar = this.f1143h;
            Object obj = cVar.f20671a;
            int iD = aVar.d();
            if (iD != -1) {
                if (iD == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z10) {
                        this.f1143h.m(this);
                        z10 = true;
                    }
                    this.f1143h.a(this, cVar.f20672b, cVar.f20671a);
                    int i11 = this.f1150q;
                    if (i11 == cVar.f20672b) {
                        iMax = Math.max(0, Math.min(i11, iC - 1));
                    }
                } else {
                    int i12 = cVar.f20672b;
                    if (i12 != iD) {
                        if (i12 == this.f1150q) {
                            iMax = iD;
                        }
                        cVar.f20672b = iD;
                    }
                }
                z9 = true;
            }
            i10++;
        }
        if (z10) {
            this.f1143h.b();
        }
        Collections.sort(arrayList, f1130o0);
        if (z9) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                z1.d dVar = (z1.d) getChildAt(i13).getLayoutParams();
                if (!dVar.f20676a) {
                    dVar.f20678c = 0.0f;
                }
            }
            z(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final int g(float f10, int i10, int i11, int i12) {
        if (Math.abs(i12) <= this.W || Math.abs(i11) <= this.U) {
            i10 += (int) (f10 + (i10 >= this.f1150q ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        ArrayList arrayList = this.f1134b;
        if (arrayList.size() > 0) {
            return Math.max(((c) arrayList.get(0)).f20672b, Math.min(i10, ((c) arrayList.get(arrayList.size() - 1)).f20672b));
        }
        return i10;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        z1.d dVar = new z1.d(-1, -1);
        dVar.f20678c = 0.0f;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public z1.a getAdapter() {
        return this.f1143h;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f1150q;
    }

    public int getOffscreenPageLimit() {
        return this.I;
    }

    public int getPageMargin() {
        return this.f1157y;
    }

    public final void h(int i10) {
        f fVar = this.f1146j0;
        if (fVar != null) {
            fVar.b(i10);
        }
        ArrayList arrayList = this.f1145i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = (f) this.f1145i0.get(i11);
                if (fVar2 != null) {
                    fVar2.b(i10);
                }
            }
        }
    }

    public final void i() {
        if (!this.f1135b0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f1143h != null) {
            VelocityTracker velocityTracker = this.T;
            velocityTracker.computeCurrentVelocity(1000, this.V);
            int xVelocity = (int) velocityTracker.getXVelocity(this.S);
            this.H = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            c cVarM = m();
            z(g(((scrollX / clientWidth) - cVarM.f20675e) / cVarM.f20674d, cVarM.f20672b, xVelocity, (int) (this.O - this.Q)), xVelocity, true, true);
        }
        this.J = false;
        this.K = false;
        VelocityTracker velocityTracker2 = this.T;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.T = null;
        }
        this.f1135b0 = false;
    }

    public final void j(float f10) {
        if (!this.f1135b0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f1143h == null) {
            return;
        }
        this.O += f10;
        float scrollX = getScrollX() - f10;
        float clientWidth = getClientWidth();
        float f11 = this.C * clientWidth;
        float f12 = this.D * clientWidth;
        ArrayList arrayList = this.f1134b;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) arrayList.get(arrayList.size() - 1);
        if (cVar.f20672b != 0) {
            f11 = cVar.f20675e * clientWidth;
        }
        if (cVar2.f20672b != this.f1143h.c() - 1) {
            f12 = cVar2.f20675e * clientWidth;
        }
        if (scrollX < f11) {
            scrollX = f11;
        } else if (scrollX > f12) {
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.O = (scrollX - i10) + this.O;
        scrollTo(i10, getScrollY());
        r(i10);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f1136c0, SystemClock.uptimeMillis(), 2, this.O, 0.0f, 0);
        this.T.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final Rect k(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final c l(View view) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1134b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i10);
            if (this.f1143h.g(view, cVar.f20671a)) {
                return cVar;
            }
            i10++;
        }
    }

    public final c m() {
        c cVar;
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f1157y / clientWidth : 0.0f;
        c cVar2 = null;
        float f12 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z9 = true;
        while (true) {
            ArrayList arrayList = this.f1134b;
            if (i12 >= arrayList.size()) {
                return cVar2;
            }
            c cVar3 = (c) arrayList.get(i12);
            if (z9 || cVar3.f20672b == (i10 = i11 + 1)) {
                cVar = cVar3;
            } else {
                float f13 = f10 + f12 + f11;
                c cVar4 = this.f1137d;
                cVar4.f20675e = f13;
                cVar4.f20672b = i10;
                this.f1143h.getClass();
                cVar4.f20674d = 1.0f;
                i12--;
                cVar = cVar4;
            }
            f10 = cVar.f20675e;
            float f14 = cVar.f20674d + f10 + f11;
            if (!z9 && scrollX < f10) {
                return cVar2;
            }
            if (scrollX < f14 || i12 == arrayList.size() - 1) {
                break;
            }
            int i13 = cVar.f20672b;
            float f15 = cVar.f20674d;
            i12++;
            z9 = false;
            c cVar5 = cVar;
            i11 = i13;
            f12 = f15;
            cVar2 = cVar5;
        }
        return cVar;
    }

    public final c n(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f1134b;
            if (i11 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i11);
            if (cVar.f20672b == i10) {
                return cVar;
            }
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(float r13, int r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f1144h0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            z1.d r9 = (z1.d) r9
            boolean r10 = r9.f20676a
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.f20677b
            r9 = r9 & 7
            if (r9 == r2) goto L50
            r10 = 3
            if (r9 == r10) goto L4a
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5d
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L46:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5d
        L4a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5d
        L50:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L46
        L5d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L68
            r8.offsetLeftAndRight(r3)
        L68:
            r3 = r9
        L69:
            int r7 = r7 + 1
            goto L1b
        L6c:
            z1.f r0 = r12.f1146j0
            if (r0 == 0) goto L73
            r0.c(r13, r14, r15)
        L73:
            java.util.ArrayList r0 = r12.f1145i0
            if (r0 == 0) goto L8d
            int r0 = r0.size()
        L7b:
            if (r1 >= r0) goto L8d
            java.util.ArrayList r3 = r12.f1145i0
            java.lang.Object r3 = r3.get(r1)
            z1.f r3 = (z1.f) r3
            if (r3 == 0) goto L8a
            r3.c(r13, r14, r15)
        L8a:
            int r1 = r1 + 1
            goto L7b
        L8d:
            r12.f1142g0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.o(float, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1141f0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1148l0);
        Scroller scroller = this.f1154v;
        if (scroller != null && !scroller.isFinished()) {
            this.f1154v.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        ArrayList arrayList;
        float f11;
        super.onDraw(canvas);
        if (this.f1157y <= 0 || this.f1158z == null) {
            return;
        }
        ArrayList arrayList2 = this.f1134b;
        if (arrayList2.size() <= 0 || this.f1143h == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f12 = this.f1157y / width;
        int i11 = 0;
        c cVar = (c) arrayList2.get(0);
        float f13 = cVar.f20675e;
        int size = arrayList2.size();
        int i12 = cVar.f20672b;
        int i13 = ((c) arrayList2.get(size - 1)).f20672b;
        while (i12 < i13) {
            while (true) {
                i10 = cVar.f20672b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                cVar = (c) arrayList2.get(i11);
            }
            if (i12 == i10) {
                float f14 = cVar.f20675e;
                float f15 = cVar.f20674d;
                f10 = (f14 + f15) * width;
                f13 = f14 + f15 + f12;
            } else {
                this.f1143h.getClass();
                f10 = (f13 + 1.0f) * width;
                f13 = 1.0f + f12 + f13;
            }
            if (this.f1157y + f10 > scrollX) {
                arrayList = arrayList2;
                f11 = f12;
                this.f1158z.setBounds(Math.round(f10), this.A, Math.round(this.f1157y + f10), this.B);
                this.f1158z.draw(canvas);
            } else {
                arrayList = arrayList2;
                f11 = f12;
            }
            if (f10 > scrollX + r3) {
                return;
            }
            i12++;
            arrayList2 = arrayList;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            w();
            return false;
        }
        if (action != 0) {
            if (this.J) {
                return true;
            }
            if (this.K) {
                return false;
            }
        }
        if (action == 0) {
            float x9 = motionEvent.getX();
            this.Q = x9;
            this.O = x9;
            float y8 = motionEvent.getY();
            this.R = y8;
            this.P = y8;
            this.S = motionEvent.getPointerId(0);
            this.K = false;
            this.f1155w = true;
            this.f1154v.computeScrollOffset();
            if (this.f1149m0 != 2 || Math.abs(this.f1154v.getFinalX() - this.f1154v.getCurrX()) <= this.f1133a0) {
                e(false);
                this.J = false;
            } else {
                this.f1154v.abortAnimation();
                this.H = false;
                t();
                this.J = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.S;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x10 = motionEvent.getX(iFindPointerIndex);
                float f10 = x10 - this.O;
                float fAbs = Math.abs(f10);
                float y9 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y9 - this.R);
                if (f10 != 0.0f) {
                    float f11 = this.O;
                    if ((f11 >= this.M || f10 <= 0.0f) && ((f11 <= getWidth() - this.M || f10 >= 0.0f) && d((int) f10, (int) x10, (int) y9, this, false))) {
                        this.O = x10;
                        this.P = y9;
                        this.K = true;
                        return false;
                    }
                }
                float f12 = this.N;
                if (fAbs > f12 && fAbs * 0.5f > fAbs2) {
                    this.J = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.Q;
                    float f14 = this.N;
                    this.O = f10 > 0.0f ? f13 + f14 : f13 - f14;
                    this.P = y9;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f12) {
                    this.K = true;
                }
                if (this.J && s(x10)) {
                    WeakHashMap weakHashMap = v0.f16075a;
                    d0.k(this);
                }
            }
        } else if (action == 6) {
            p(motionEvent);
        }
        if (this.T == null) {
            this.T = VelocityTracker.obtain();
        }
        this.T.addMovement(motionEvent);
        return this.J;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        c cVarL;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (cVarL = l(childAt)) != null && cVarL.f20672b == this.f1150q && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f570a);
        z1.a aVar = this.f1143h;
        ClassLoader classLoader = savedState.f1161h;
        if (aVar != null) {
            aVar.i(savedState.f1160f, classLoader);
            z(savedState.f1159d, 0, false, true);
        } else {
            this.f1151s = savedState.f1159d;
            this.f1152t = savedState.f1160f;
            this.f1153u = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1159d = this.f1150q;
        z1.a aVar = this.f1143h;
        if (aVar != null) {
            savedState.f1160f = aVar.j();
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f1157y;
            v(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.O = motionEvent.getX(i10);
            this.S = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.T;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q() {
        z1.a aVar = this.f1143h;
        if (aVar == null || this.f1150q >= aVar.c() - 1) {
            return false;
        }
        y(this.f1150q + 1);
        return true;
    }

    public final boolean r(int i10) {
        if (this.f1134b.size() == 0) {
            if (this.f1141f0) {
                return false;
            }
            this.f1142g0 = false;
            o(0.0f, 0, 0);
            if (this.f1142g0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        c cVarM = m();
        int clientWidth = getClientWidth();
        int i11 = this.f1157y;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = cVarM.f20672b;
        float f11 = ((i10 / f10) - cVarM.f20675e) / (cVarM.f20674d + (i11 / f10));
        this.f1142g0 = false;
        o(f11, i13, (int) (i12 * f11));
        if (this.f1142g0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.F) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s(float f10) {
        boolean z9;
        boolean z10;
        float f11 = this.O - f10;
        this.O = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.C * clientWidth;
        float f13 = this.D * clientWidth;
        ArrayList arrayList = this.f1134b;
        boolean z11 = false;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) arrayList.get(arrayList.size() - 1);
        if (cVar.f20672b != 0) {
            f12 = cVar.f20675e * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (cVar2.f20672b != this.f1143h.c() - 1) {
            f13 = cVar2.f20675e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z9) {
                this.f1138d0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.f1139e0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.O = (scrollX - i10) + this.O;
        scrollTo(i10, getScrollY());
        r(i10);
        return z11;
    }

    public void setAdapter(z1.a aVar) {
        ArrayList arrayList;
        z1.a aVar2 = this.f1143h;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f20670b = null;
            }
            this.f1143h.m(this);
            int i10 = 0;
            while (true) {
                arrayList = this.f1134b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i10);
                this.f1143h.a(this, cVar.f20672b, cVar.f20671a);
                i10++;
            }
            this.f1143h.b();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((z1.d) getChildAt(i11).getLayoutParams()).f20676a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f1150q = 0;
            scrollTo(0, 0);
        }
        this.f1143h = aVar;
        this.f1132a = 0;
        if (aVar != null) {
            if (this.f1156x == null) {
                this.f1156x = new h2(2, this);
            }
            this.f1143h.l(this.f1156x);
            this.H = false;
            boolean z9 = this.f1141f0;
            this.f1141f0 = true;
            this.f1132a = this.f1143h.c();
            if (this.f1151s >= 0) {
                this.f1143h.i(this.f1152t, this.f1153u);
                z(this.f1151s, 0, false, true);
                this.f1151s = -1;
                this.f1152t = null;
                this.f1153u = null;
            } else if (z9) {
                requestLayout();
            } else {
                t();
            }
        }
        ArrayList arrayList2 = this.f1147k0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f1147k0.size();
        for (int i12 = 0; i12 < size; i12++) {
            g5.b bVar = (g5.b) this.f1147k0.get(i12);
            TabLayout tabLayout = bVar.f13847b;
            if (tabLayout.f11963d0 == this) {
                tabLayout.g(aVar, bVar.f13846a);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.H = false;
        z(i10, 0, !this.f1141f0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        if (i10 != this.I) {
            this.I = i10;
            t();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.f1146j0 = fVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f1157y;
        this.f1157y = i10;
        int width = getWidth();
        v(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1158z = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f1149m0 == i10) {
            return;
        }
        this.f1149m0 = i10;
        f fVar = this.f1146j0;
        if (fVar != null) {
            fVar.a(i10);
        }
        ArrayList arrayList = this.f1145i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = (f) this.f1145i0.get(i11);
                if (fVar2 != null) {
                    fVar2.a(i10);
                }
            }
        }
    }

    public final void t() {
        u(this.f1150q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc A[PHI: r7 r11 r15
      0x00bc: PHI (r7v15 int) = (r7v14 int), (r7v4 int), (r7v18 int) binds: [B:61:0x00de, B:58:0x00ca, B:50:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r11v32 int) = (r11v1 int), (r11v31 int), (r11v35 int) binds: [B:61:0x00de, B:58:0x00ca, B:50:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:61:0x00de, B:58:0x00ca, B:50:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013b A[PHI: r3 r12
      0x013b: PHI (r3v20 float) = (r3v18 float), (r3v19 float), (r3v17 float) binds: [B:95:0x0162, B:92:0x014c, B:85:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r12v25 int) = (r12v23 int), (r12v24 int), (r12v22 int) binds: [B:95:0x0162, B:92:0x014c, B:85:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(int r18) {
        /*
            Method dump skipped, instruction units count: 875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.u(int):void");
    }

    public final void v(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f1134b.isEmpty()) {
            if (!this.f1154v.isFinished()) {
                this.f1154v.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        c cVarN = n(this.f1150q);
        int iMin = (int) ((cVarN != null ? Math.min(cVarN.f20675e, this.D) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            e(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1158z;
    }

    public final boolean w() {
        this.S = -1;
        this.J = false;
        this.K = false;
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.T = null;
        }
        this.f1138d0.onRelease();
        this.f1139e0.onRelease();
        return this.f1138d0.isFinished() || this.f1139e0.isFinished();
    }

    public final void x(int i10, int i11, boolean z9, boolean z10) {
        int scrollX;
        int iAbs;
        c cVarN = n(i10);
        int iMax = cVarN != null ? (int) (Math.max(this.C, Math.min(cVarN.f20675e, this.D)) * getClientWidth()) : 0;
        if (!z9) {
            if (z10) {
                h(i10);
            }
            e(false);
            scrollTo(iMax, 0);
            r(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f1154v;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f1155w ? this.f1154v.getCurrX() : this.f1154v.getStartX();
                this.f1154v.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i12 = scrollX;
            int scrollY = getScrollY();
            int i13 = iMax - i12;
            int i14 = 0 - scrollY;
            if (i13 == 0 && i14 == 0) {
                e(false);
                t();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i15 = clientWidth / 2;
                float f10 = clientWidth;
                float f11 = i15;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int iAbs2 = Math.abs(i11);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f1143h.getClass();
                    iAbs = (int) (((Math.abs(i13) / ((f10 * 1.0f) + this.f1157y)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f1155w = false;
                this.f1154v.startScroll(i12, scrollY, i13, i14, iMin);
                WeakHashMap weakHashMap = v0.f16075a;
                d0.k(this);
            }
        }
        if (z10) {
            h(i10);
        }
    }

    public final void y(int i10) {
        this.H = false;
        z(i10, 0, true, false);
    }

    public final void z(int i10, int i11, boolean z9, boolean z10) {
        z1.a aVar = this.f1143h;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f1134b;
        if (!z10 && this.f1150q == i10 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f1143h.c()) {
            i10 = this.f1143h.c() - 1;
        }
        int i12 = this.I;
        int i13 = this.f1150q;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).f20673c = true;
            }
        }
        boolean z11 = this.f1150q != i10;
        if (!this.f1141f0) {
            u(i10);
            x(i10, i11, z9, z11);
        } else {
            this.f1150q = i10;
            if (z11) {
                h(i10);
            }
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        z1.d dVar = new z1.d(context, attributeSet);
        dVar.f20678c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1129n0);
        dVar.f20677b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return dVar;
    }

    public void setPageMarginDrawable(int i10) {
        Context context = getContext();
        Object obj = d0.f.f12287a;
        setPageMarginDrawable(d0.c.b(context, i10));
    }
}

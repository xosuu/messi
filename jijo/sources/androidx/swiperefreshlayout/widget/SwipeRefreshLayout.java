package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;
import o0.d0;
import o0.j0;
import o0.o;
import o0.p;
import o0.s;
import o0.v0;
import u1.a;
import u1.d;
import u1.e;
import u1.f;
import u1.g;
import u1.h;
import u1.i;
import u1.j;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements o {
    public static final int[] U = {R.attr.enabled};
    public float A;
    public boolean B;
    public int C;
    public final DecelerateInterpolator D;
    public final a E;
    public int F;
    public int G;
    public final int H;
    public final int I;
    public int J;
    public final e K;
    public g L;
    public g M;
    public h N;
    public h O;
    public boolean P;
    public int Q;
    public final f R;
    public final g S;
    public final g T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f1114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f1115b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1116d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1117f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1118h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f1119q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f1120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f1121t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f1122u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f1123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1126y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f1127z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1116d = false;
        this.f1118h = -1.0f;
        this.f1122u = new int[2];
        this.f1123v = new int[2];
        this.C = -1;
        this.F = -1;
        this.R = new f(this, 0);
        this.S = new g(this, 2);
        this.T = new g(this, 3);
        this.f1117f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1125x = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.D = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.Q = (int) (displayMetrics.density * 40.0f);
        a aVar = new a(getContext());
        float f10 = aVar.getContext().getResources().getDisplayMetrics().density;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = v0.f16075a;
        j0.s(aVar, f10 * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        d0.q(aVar, shapeDrawable);
        this.E = aVar;
        e eVar = new e(getContext());
        this.K = eVar;
        eVar.c(1);
        this.E.setImageDrawable(this.K);
        this.E.setVisibility(8);
        addView(this.E);
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.I = i10;
        this.f1118h = i10;
        this.f1120s = new s();
        this.f1121t = new p(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.Q;
        this.f1126y = i11;
        this.H = i11;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i10) {
        this.E.getBackground().setAlpha(i10);
        this.K.setAlpha(i10);
    }

    public final boolean a() {
        View view = this.f1114a;
        return view instanceof ListView ? s0.h.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f1114a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.E)) {
                    this.f1114a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f10) {
        int i10 = 1;
        if (f10 > this.f1118h) {
            g(true, true);
            return;
        }
        this.f1116d = false;
        e eVar = this.K;
        d dVar = eVar.f17537a;
        dVar.f17517e = 0.0f;
        dVar.f17518f = 0.0f;
        eVar.invalidateSelf();
        f fVar = new f(this, i10);
        this.G = this.f1126y;
        g gVar = this.T;
        gVar.reset();
        gVar.setDuration(200L);
        gVar.setInterpolator(this.D);
        a aVar = this.E;
        aVar.f17508a = fVar;
        aVar.clearAnimation();
        this.E.startAnimation(gVar);
        e eVar2 = this.K;
        d dVar2 = eVar2.f17537a;
        if (dVar2.f17526n) {
            dVar2.f17526n = false;
        }
        eVar2.invalidateSelf();
    }

    public final void d(float f10) {
        h hVar;
        h hVar2;
        e eVar = this.K;
        d dVar = eVar.f17537a;
        if (!dVar.f17526n) {
            dVar.f17526n = true;
        }
        eVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f1118h));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f1118h;
        int i10 = this.J;
        if (i10 <= 0) {
            i10 = this.I;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.H + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.E.getVisibility() != 0) {
            this.E.setVisibility(0);
        }
        this.E.setScaleX(1.0f);
        this.E.setScaleY(1.0f);
        if (f10 < this.f1118h) {
            if (this.K.f17537a.f17532t > 76 && ((hVar2 = this.N) == null || !hVar2.hasStarted() || hVar2.hasEnded())) {
                h hVar3 = new h(this, this.K.f17537a.f17532t, 76);
                hVar3.setDuration(300L);
                a aVar = this.E;
                aVar.f17508a = null;
                aVar.clearAnimation();
                this.E.startAnimation(hVar3);
                this.N = hVar3;
            }
        } else if (this.K.f17537a.f17532t < 255 && ((hVar = this.O) == null || !hVar.hasStarted() || hVar.hasEnded())) {
            h hVar4 = new h(this, this.K.f17537a.f17532t, 255);
            hVar4.setDuration(300L);
            a aVar2 = this.E;
            aVar2.f17508a = null;
            aVar2.clearAnimation();
            this.E.startAnimation(hVar4);
            this.O = hVar4;
        }
        e eVar2 = this.K;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        d dVar2 = eVar2.f17537a;
        dVar2.f17517e = 0.0f;
        dVar2.f17518f = fMin2;
        eVar2.invalidateSelf();
        e eVar3 = this.K;
        float fMin3 = Math.min(1.0f, fMax);
        d dVar3 = eVar3.f17537a;
        if (fMin3 != dVar3.f17528p) {
            dVar3.f17528p = fMin3;
        }
        eVar3.invalidateSelf();
        e eVar4 = this.K;
        eVar4.f17537a.f17519g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i11 - this.f1126y);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return this.f1121t.a(f10, f11, z9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f1121t.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f1121t.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f1121t.e(i10, i11, i12, i13, iArr, 0, null);
    }

    public final void e(float f10) {
        setTargetOffsetTopAndBottom((this.G + ((int) ((this.H - r0) * f10))) - this.E.getTop());
    }

    public final void f() {
        this.E.clearAnimation();
        this.K.stop();
        this.E.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.H - this.f1126y);
        this.f1126y = this.E.getTop();
    }

    public final void g(boolean z9, boolean z10) {
        if (this.f1116d != z9) {
            this.P = z10;
            b();
            this.f1116d = z9;
            f fVar = this.R;
            if (!z9) {
                g gVar = new g(this, 1);
                this.M = gVar;
                gVar.setDuration(150L);
                a aVar = this.E;
                aVar.f17508a = fVar;
                aVar.clearAnimation();
                this.E.startAnimation(this.M);
                return;
            }
            this.G = this.f1126y;
            g gVar2 = this.S;
            gVar2.reset();
            gVar2.setDuration(200L);
            gVar2.setInterpolator(this.D);
            if (fVar != null) {
                this.E.f17508a = fVar;
            }
            this.E.clearAnimation();
            this.E.startAnimation(gVar2);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.F;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.f1120s;
        return sVar.f16065b | sVar.f16064a;
    }

    public int getProgressCircleDiameter() {
        return this.Q;
    }

    public int getProgressViewEndOffset() {
        return this.I;
    }

    public int getProgressViewStartOffset() {
        return this.H;
    }

    public final void h(float f10) {
        float f11 = this.A;
        float f12 = f10 - f11;
        int i10 = this.f1117f;
        if (f12 <= i10 || this.B) {
            return;
        }
        this.f1127z = f11 + i10;
        this.B = true;
        this.K.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1121t.g(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1121t.f16056d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.b()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L80
            boolean r1 = r5.a()
            if (r1 != 0) goto L80
            boolean r1 = r5.f1116d
            if (r1 != 0) goto L80
            boolean r1 = r5.f1124w
            if (r1 == 0) goto L1d
            goto L80
        L1d:
            if (r0 == 0) goto L5c
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L57
            r4 = 2
            if (r0 == r4) goto L43
            r4 = 3
            if (r0 == r4) goto L57
            r3 = 6
            if (r0 == r3) goto L2d
            goto L7d
        L2d:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.C
            if (r3 != r4) goto L7d
            if (r0 != 0) goto L3c
            r2 = 1
        L3c:
            int r6 = r6.getPointerId(r2)
            r5.C = r6
            goto L7d
        L43:
            int r0 = r5.C
            if (r0 != r3) goto L48
            return r2
        L48:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L4f
            return r2
        L4f:
            float r6 = r6.getY(r0)
            r5.h(r6)
            goto L7d
        L57:
            r5.B = r2
            r5.C = r3
            goto L7d
        L5c:
            u1.a r0 = r5.E
            int r0 = r0.getTop()
            int r1 = r5.H
            int r1 = r1 - r0
            r5.setTargetOffsetTopAndBottom(r1)
            int r0 = r6.getPointerId(r2)
            r5.C = r0
            r5.B = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L77
            return r2
        L77:
            float r6 = r6.getY(r0)
            r5.A = r6
        L7d:
            boolean r6 = r5.B
            return r6
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f1114a == null) {
            b();
        }
        View view = this.f1114a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.E.getMeasuredWidth();
        int measuredHeight2 = this.E.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f1126y;
        this.E.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1114a == null) {
            b();
        }
        View view = this.f1114a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.E.measure(View.MeasureSpec.makeMeasureSpec(this.Q, 1073741824), View.MeasureSpec.makeMeasureSpec(this.Q, 1073741824));
        this.F = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.E) {
                this.F = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return dispatchNestedFling(f10, f11, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f1119q;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = i11 - ((int) f10);
                    this.f1119q = 0.0f;
                } else {
                    this.f1119q = f10 - f11;
                    iArr[1] = i11;
                }
                d(this.f1119q);
            }
        }
        int i12 = i10 - iArr[0];
        int i13 = i11 - iArr[1];
        int[] iArr2 = this.f1122u;
        if (dispatchNestedPreScroll(i12, i13, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f1123v);
        if (i13 + this.f1123v[1] >= 0 || a()) {
            return;
        }
        float fAbs = this.f1119q + Math.abs(r11);
        this.f1119q = fAbs;
        d(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f1120s.f16064a = i10;
        startNestedScroll(i10 & 2);
        this.f1119q = 0.0f;
        this.f1124w = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f1116d || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f1120s.f16064a = 0;
        this.f1124w = false;
        float f10 = this.f1119q;
        if (f10 > 0.0f) {
            c(f10);
            this.f1119q = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f1116d || this.f1124w) {
            return false;
        }
        if (actionMasked == 0) {
            this.C = motionEvent.getPointerId(0);
            this.B = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.C);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.B) {
                    float y8 = (motionEvent.getY(iFindPointerIndex) - this.f1127z) * 0.5f;
                    this.B = false;
                    c(y8);
                }
                this.C = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.C);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                float y9 = motionEvent.getY(iFindPointerIndex2);
                h(y9);
                if (this.B) {
                    float f10 = (y9 - this.f1127z) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    d(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.C = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.C) {
                        this.C = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        View view = this.f1114a;
        if (view != null) {
            WeakHashMap weakHashMap = v0.f16075a;
            if (!j0.p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public void setAnimationProgress(float f10) {
        this.E.setScaleX(f10);
        this.E.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        e eVar = this.K;
        d dVar = eVar.f17537a;
        dVar.f17521i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = d0.f.b(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f1118h = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (z9) {
            return;
        }
        f();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        p pVar = this.f1121t;
        if (pVar.f16056d) {
            WeakHashMap weakHashMap = v0.f16075a;
            j0.z(pVar.f16055c);
        }
        pVar.f16056d = z9;
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f1115b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.E.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(d0.f.b(getContext(), i10));
    }

    public void setRefreshing(boolean z9) {
        if (!z9 || this.f1116d == z9) {
            g(z9, false);
            return;
        }
        this.f1116d = z9;
        setTargetOffsetTopAndBottom((this.I + this.H) - this.f1126y);
        this.P = false;
        f fVar = this.R;
        this.E.setVisibility(0);
        this.K.setAlpha(255);
        g gVar = new g(this, 0);
        this.L = gVar;
        gVar.setDuration(this.f1125x);
        if (fVar != null) {
            this.E.f17508a = fVar;
        }
        this.E.clearAnimation();
        this.E.startAnimation(this.L);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.Q = (int) (displayMetrics.density * 56.0f);
            } else {
                this.Q = (int) (displayMetrics.density * 40.0f);
            }
            this.E.setImageDrawable(null);
            this.K.c(i10);
            this.E.setImageDrawable(this.K);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.J = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.E.bringToFront();
        v0.k(this.E, i10);
        this.f1126y = this.E.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f1121t.h(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f1121t.i(0);
    }
}

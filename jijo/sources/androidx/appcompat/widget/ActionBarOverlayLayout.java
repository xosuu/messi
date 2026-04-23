package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.app.NotificationCompat;
import f.d1;
import f.w;
import j.l;
import java.util.WeakHashMap;
import k.o;
import l.n1;
import l.o1;
import l.u3;
import l.x3;
import o0.d0;
import o0.h0;
import o0.i1;
import o0.j0;
import o0.j1;
import o0.k1;
import o0.l1;
import o0.q;
import o0.r;
import o0.r1;
import o0.s;
import o0.t1;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements n1, q, r {
    public static final int[] N = {R.attr.f, android.R.attr.windowContentOverlay};
    public final Rect A;
    public final Rect B;
    public t1 C;
    public t1 D;
    public t1 E;
    public t1 F;
    public l.f G;
    public OverScroller H;
    public ViewPropertyAnimator I;
    public final l.d J;
    public final l.e K;
    public final l.e L;
    public final s M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f251b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f252d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContainer f253f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o1 f254h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f255q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f258u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f259v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f262y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f263z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f251b = 0;
        this.f263z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        t1 t1Var = t1.f16067b;
        this.C = t1Var;
        this.D = t1Var;
        this.E = t1Var;
        this.F = t1Var;
        this.J = new l.d(0, this);
        this.K = new l.e(this, 0);
        this.L = new l.e(this, 1);
        i(context);
        this.M = new s();
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z9) {
        boolean z10;
        l.g gVar = (l.g) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) gVar).leftMargin = i11;
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) gVar).topMargin = i13;
            z10 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) gVar).rightMargin = i15;
            z10 = true;
        }
        if (z9) {
            int i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = i17;
                return true;
            }
        }
        return z10;
    }

    @Override // o0.q
    public final void a(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // o0.q
    public final void b(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // o0.q
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l.g;
    }

    @Override // o0.r
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        e(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f255q == null || this.f256s) {
            return;
        }
        if (this.f253f.getVisibility() == 0) {
            translationY = (int) (this.f253f.getTranslationY() + this.f253f.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f255q.setBounds(0, translationY, getWidth(), this.f255q.getIntrinsicHeight() + translationY);
        this.f255q.draw(canvas);
    }

    @Override // o0.q
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // o0.q
    public final boolean f(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new l.g(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l.g(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f253f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.M;
        return sVar.f16065b | sVar.f16064a;
    }

    public CharSequence getTitle() {
        k();
        return ((x3) this.f254h).f15068a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.K);
        removeCallbacks(this.L);
        ViewPropertyAnimator viewPropertyAnimator = this.I;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(N);
        this.f250a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f255q = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f256s = context.getApplicationInfo().targetSdkVersion < 19;
        this.H = new OverScroller(context);
    }

    public final void j(int i10) {
        k();
        if (i10 == 2) {
            this.f254h.getClass();
        } else if (i10 == 5) {
            this.f254h.getClass();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        o1 wrapper;
        if (this.f252d == null) {
            this.f252d = (ContentFrameLayout) findViewById(R.id.av);
            this.f253f = (ActionBarContainer) findViewById(R.id.aw);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.au);
            if (callbackFindViewById instanceof o1) {
                wrapper = (o1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f254h = wrapper;
        }
    }

    public final void l(o oVar, w wVar) {
        k();
        x3 x3Var = (x3) this.f254h;
        b bVar = x3Var.f15080m;
        Toolbar toolbar = x3Var.f15068a;
        if (bVar == null) {
            b bVar2 = new b(toolbar.getContext());
            x3Var.f15080m = bVar2;
            bVar2.f381u = R.id.bb;
        }
        b bVar3 = x3Var.f15080m;
        bVar3.f377h = wVar;
        if (oVar == null && toolbar.f343a == null) {
            return;
        }
        toolbar.f();
        o oVar2 = toolbar.f343a.B;
        if (oVar2 == oVar) {
            return;
        }
        if (oVar2 != null) {
            oVar2.r(toolbar.f344a0);
            oVar2.r(toolbar.f346b0);
        }
        if (toolbar.f346b0 == null) {
            toolbar.f346b0 = new u3(toolbar);
        }
        bVar3.D = true;
        if (oVar != null) {
            oVar.b(bVar3, toolbar.f361v);
            oVar.b(toolbar.f346b0, toolbar.f361v);
        } else {
            bVar3.l(toolbar.f361v, null);
            toolbar.f346b0.l(toolbar.f361v, null);
            bVar3.h();
            toolbar.f346b0.h();
        }
        toolbar.f343a.setPopupTheme(toolbar.f362w);
        toolbar.f343a.setPresenter(bVar3);
        toolbar.f344a0 = bVar3;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        t1 t1VarH = t1.h(windowInsets, this);
        boolean zG = g(this.f253f, new Rect(t1VarH.b(), t1VarH.d(), t1VarH.c(), t1VarH.a()), false);
        WeakHashMap weakHashMap = v0.f16075a;
        Rect rect = this.f263z;
        j0.b(this, t1VarH, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        r1 r1Var = t1VarH.f16068a;
        t1 t1VarL = r1Var.l(i10, i11, i12, i13);
        this.C = t1VarL;
        if (!this.D.equals(t1VarL)) {
            this.D = this.C;
            zG = true;
        }
        Rect rect2 = this.A;
        if (rect2.equals(rect)) {
            if (zG) {
            }
            return r1Var.a().f16068a.c().f16068a.b().g();
        }
        rect2.set(rect);
        requestLayout();
        return r1Var.a().f16068a.c().f16068a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = v0.f16075a;
        h0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                l.g gVar = (l.g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f253f, i10, 0, i11, 0);
        l.g gVar = (l.g) this.f253f.getLayoutParams();
        int iMax = Math.max(0, this.f253f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
        int iMax2 = Math.max(0, this.f253f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f253f.getMeasuredState());
        WeakHashMap weakHashMap = v0.f16075a;
        boolean z9 = (d0.g(this) & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        if (z9) {
            measuredHeight = this.f250a;
            if (this.f258u && this.f253f.getTabContainer() != null) {
                measuredHeight += this.f250a;
            }
        } else {
            measuredHeight = this.f253f.getVisibility() != 8 ? this.f253f.getMeasuredHeight() : 0;
        }
        Rect rect = this.f263z;
        Rect rect2 = this.B;
        rect2.set(rect);
        t1 t1Var = this.C;
        this.E = t1Var;
        if (this.f257t || z9) {
            g0.c cVarA = g0.c.a(t1Var.b(), this.E.d() + measuredHeight, this.E.c(), this.E.a());
            t1 t1Var2 = this.E;
            int i12 = Build.VERSION.SDK_INT;
            l1 k1Var = i12 >= 30 ? new k1(t1Var2) : i12 >= 29 ? new j1(t1Var2) : new i1(t1Var2);
            k1Var.d(cVarA);
            this.E = k1Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.E = t1Var.f16068a.l(0, measuredHeight, 0, 0);
        }
        g(this.f252d, rect2, true);
        if (!this.F.equals(this.E)) {
            t1 t1Var3 = this.E;
            this.F = t1Var3;
            v0.b(this.f252d, t1Var3);
        }
        measureChildWithMargins(this.f252d, i10, 0, i11, 0);
        l.g gVar2 = (l.g) this.f252d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f252d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar2).leftMargin + ((ViewGroup.MarginLayoutParams) gVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f252d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f252d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        if (!this.f259v || !z9) {
            return false;
        }
        this.H.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.H.getFinalY() > this.f253f.getHeight()) {
            h();
            this.L.run();
        } else {
            h();
            this.K.run();
        }
        this.f260w = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f261x + i11;
        this.f261x = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        d1 d1Var;
        l lVar;
        this.M.f16064a = i10;
        this.f261x = getActionBarHideOffset();
        h();
        l.f fVar = this.G;
        if (fVar == null || (lVar = (d1Var = (d1) fVar).f12819u) == null) {
            return;
        }
        lVar.a();
        d1Var.f12819u = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f253f.getVisibility() != 0) {
            return false;
        }
        return this.f259v;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f259v || this.f260w) {
            return;
        }
        if (this.f261x <= this.f253f.getHeight()) {
            h();
            postDelayed(this.K, 600L);
        } else {
            h();
            postDelayed(this.L, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        k();
        int i11 = this.f262y ^ i10;
        this.f262y = i10;
        boolean z9 = (i10 & 4) == 0;
        boolean z10 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        l.f fVar = this.G;
        if (fVar != null) {
            ((d1) fVar).f12815q = !z10;
            if (z9 || !z10) {
                d1 d1Var = (d1) fVar;
                if (d1Var.f12816r) {
                    d1Var.f12816r = false;
                    d1Var.t0(true);
                }
            } else {
                d1 d1Var2 = (d1) fVar;
                if (!d1Var2.f12816r) {
                    d1Var2.f12816r = true;
                    d1Var2.t0(true);
                }
            }
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 || this.G == null) {
            return;
        }
        WeakHashMap weakHashMap = v0.f16075a;
        h0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f251b = i10;
        l.f fVar = this.G;
        if (fVar != null) {
            ((d1) fVar).f12814p = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        h();
        this.f253f.setTranslationY(-Math.max(0, Math.min(i10, this.f253f.getHeight())));
    }

    public void setActionBarVisibilityCallback(l.f fVar) {
        this.G = fVar;
        if (getWindowToken() != null) {
            ((d1) this.G).f12814p = this.f251b;
            int i10 = this.f262y;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = v0.f16075a;
                h0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z9) {
        this.f258u = z9;
    }

    public void setHideOnContentScrollEnabled(boolean z9) {
        if (z9 != this.f259v) {
            this.f259v = z9;
            if (z9) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        k();
        x3 x3Var = (x3) this.f254h;
        x3Var.f15071d = i10 != 0 ? p7.q.g(x3Var.f15068a.getContext(), i10) : null;
        x3Var.d();
    }

    public void setLogo(int i10) {
        k();
        x3 x3Var = (x3) this.f254h;
        x3Var.f15072e = i10 != 0 ? p7.q.g(x3Var.f15068a.getContext(), i10) : null;
        x3Var.d();
    }

    public void setOverlayMode(boolean z9) {
        this.f257t = z9;
        this.f256s = z9 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z9) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // l.n1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((x3) this.f254h).f15078k = callback;
    }

    @Override // l.n1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        x3 x3Var = (x3) this.f254h;
        if (x3Var.f15074g) {
            return;
        }
        x3Var.f15075h = charSequence;
        if ((x3Var.f15069b & 8) != 0) {
            Toolbar toolbar = x3Var.f15068a;
            toolbar.setTitle(charSequence);
            if (x3Var.f15074g) {
                v0.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new l.g(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        x3 x3Var = (x3) this.f254h;
        x3Var.f15071d = drawable;
        x3Var.d();
    }
}

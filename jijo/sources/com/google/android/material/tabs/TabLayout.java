package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import c2.n;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tp1;
import g4.a0;
import g4.z;
import g5.c;
import g5.f;
import g5.g;
import g5.h;
import g5.j;
import g5.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.h2;
import n0.d;
import o0.d0;
import o0.e0;
import o0.g0;
import o0.j0;
import o0.v0;
import p7.q;
import u.e;
import x4.y;
import xyz.easypro.httpcustom.R;
import z1.a;
import z1.b;

/* JADX INFO: loaded from: classes.dex */
@b
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final d f11956l0 = new d(16);
    public Drawable A;
    public int B;
    public final PorterDuff.Mode C;
    public final float D;
    public final float E;
    public final int F;
    public int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public final int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public boolean T;
    public n U;
    public final TimeInterpolator V;
    public c W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11957a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ArrayList f11958a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11959b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public k f11960b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ValueAnimator f11961c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f11962d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ViewPager f11963d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public a f11964e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f11965f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public h2 f11966f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public h f11967g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11968h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public g5.b f11969h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f11970i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f11971j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final e f11972k0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11973q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11975t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f11976u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f11977v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f11979x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f11980y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f11981z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(j5.a.a(context, attributeSet, R.attr.a3o, R.style.vw), attributeSet, R.attr.a3o);
        this.f11957a = -1;
        this.f11959b = new ArrayList();
        this.f11978w = -1;
        this.B = 0;
        this.G = Integer.MAX_VALUE;
        this.R = -1;
        this.f11958a0 = new ArrayList();
        this.f11972k0 = new e(12, 1);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(this, context2);
        this.f11965f = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayE = y.e(context2, attributeSet, l4.a.C, R.attr.a3o, R.style.vw, 24);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            d5.g gVar = new d5.g();
            gVar.l(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.j(context2);
            WeakHashMap weakHashMap = v0.f16075a;
            gVar.k(j0.i(this));
            d0.q(this, gVar);
        }
        setSelectedTabIndicator(tp1.i(context2, typedArrayE, 5));
        setSelectedTabIndicatorColor(typedArrayE.getColor(8, 0));
        fVar.b(typedArrayE.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayE.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayE.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayE.getBoolean(9, true));
        int dimensionPixelSize = typedArrayE.getDimensionPixelSize(16, 0);
        this.f11975t = dimensionPixelSize;
        this.f11974s = dimensionPixelSize;
        this.f11973q = dimensionPixelSize;
        this.f11968h = dimensionPixelSize;
        this.f11968h = typedArrayE.getDimensionPixelSize(19, dimensionPixelSize);
        this.f11973q = typedArrayE.getDimensionPixelSize(20, dimensionPixelSize);
        this.f11974s = typedArrayE.getDimensionPixelSize(18, dimensionPixelSize);
        this.f11975t = typedArrayE.getDimensionPixelSize(17, dimensionPixelSize);
        if (a0.v(context2, R.attr.pq, false)) {
            this.f11976u = R.attr.a4w;
        } else {
            this.f11976u = R.attr.a42;
        }
        int resourceId = typedArrayE.getResourceId(24, R.style.m8);
        this.f11977v = resourceId;
        int[] iArr = e.a.f12618y;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.D = dimensionPixelSize2;
            this.f11979x = tp1.g(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayE.hasValue(22)) {
                this.f11978w = typedArrayE.getResourceId(22, resourceId);
            }
            int i10 = this.f11978w;
            if (i10 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i10, iArr);
                try {
                    typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListG = tp1.g(context2, typedArrayObtainStyledAttributes, 3);
                    if (colorStateListG != null) {
                        this.f11979x = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{colorStateListG.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListG.getDefaultColor()), this.f11979x.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (typedArrayE.hasValue(25)) {
                this.f11979x = tp1.g(context2, typedArrayE, 25);
            }
            if (typedArrayE.hasValue(23)) {
                this.f11979x = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayE.getColor(23, 0), this.f11979x.getDefaultColor()});
            }
            this.f11980y = tp1.g(context2, typedArrayE, 3);
            this.C = en1.y(typedArrayE.getInt(4, -1), null);
            this.f11981z = tp1.g(context2, typedArrayE, 21);
            this.M = typedArrayE.getInt(6, 300);
            this.V = a0.x(context2, R.attr.x5, m4.a.f15741b);
            this.H = typedArrayE.getDimensionPixelSize(14, -1);
            this.I = typedArrayE.getDimensionPixelSize(13, -1);
            this.F = typedArrayE.getResourceId(0, 0);
            this.K = typedArrayE.getDimensionPixelSize(1, 0);
            this.O = typedArrayE.getInt(15, 1);
            this.L = typedArrayE.getInt(2, 0);
            this.P = typedArrayE.getBoolean(12, false);
            this.T = typedArrayE.getBoolean(26, false);
            typedArrayE.recycle();
            Resources resources = getResources();
            this.E = resources.getDimensionPixelSize(R.dimen.dn);
            this.J = resources.getDimensionPixelSize(R.dimen.dl);
            b();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f11959b;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            g gVar = (g) arrayList.get(i10);
            if (gVar == null || gVar.f13855a == null || TextUtils.isEmpty(gVar.f13856b)) {
                i10++;
            } else if (!this.P) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.H;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.O;
        if (i11 == 0 || i11 == 2) {
            return this.J;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f11965f.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        f fVar = this.f11965f;
        int childCount = fVar.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = fVar.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof j) {
                        ((j) childAt).g();
                    }
                }
                i11++;
            }
        }
    }

    public final void a(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = v0.f16075a;
            if (g0.c(this)) {
                f fVar = this.f11965f;
                int childCount = fVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (fVar.getChildAt(i11).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iC = c(i10, 0.0f);
                if (scrollX != iC) {
                    d();
                    this.f11961c0.setIntValues(scrollX, iC);
                    this.f11961c0.start();
                }
                ValueAnimator valueAnimator = fVar.f13852a;
                if (valueAnimator != null && valueAnimator.isRunning() && fVar.f13854d.f11957a != i10) {
                    fVar.f13852a.cancel();
                }
                fVar.d(i10, this.M, true);
                return;
            }
        }
        h(i10, 0.0f, true, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r4 = this;
            int r0 = r4.O
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L14
        Lb:
            int r0 = r4.K
            int r3 = r4.f11968h
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap r3 = o0.v0.f16075a
            g5.f r3 = r4.f11965f
            o0.e0.k(r3, r0, r2, r2, r2)
            int r0 = r4.O
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L25
            if (r0 == r1) goto L25
            goto L3c
        L25:
            r3.setGravity(r2)
            goto L3c
        L29:
            int r0 = r4.L
            if (r0 == 0) goto L36
            if (r0 == r2) goto L32
            if (r0 == r1) goto L36
            goto L3c
        L32:
            r3.setGravity(r2)
            goto L3c
        L36:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L3c:
            r4.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.b():void");
    }

    public final int c(int i10, float f10) {
        f fVar;
        View childAt;
        int i11 = this.O;
        if ((i11 != 0 && i11 != 2) || (childAt = (fVar = this.f11965f).getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < fVar.getChildCount() ? fVar.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        WeakHashMap weakHashMap = v0.f16075a;
        return e0.d(this) == 0 ? left + i13 : left - i13;
    }

    public final void d() {
        if (this.f11961c0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f11961c0 = valueAnimator;
            valueAnimator.setInterpolator(this.V);
            this.f11961c0.setDuration(this.M);
            this.f11961c0.addUpdateListener(new q4.a(1, this));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e() {
        e eVar;
        j jVar;
        d dVar;
        int currentItem;
        f fVar = this.f11965f;
        int childCount = fVar.getChildCount() - 1;
        while (true) {
            eVar = this.f11972k0;
            jVar = null;
            if (childCount < 0) {
                break;
            }
            j jVar2 = (j) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (jVar2 != null) {
                jVar2.setTab(null);
                jVar2.setSelected(false);
                eVar.b(jVar2);
            }
            requestLayout();
            childCount--;
        }
        ArrayList arrayList = this.f11959b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dVar = f11956l0;
            if (!zHasNext) {
                break;
            }
            g gVar = (g) it.next();
            it.remove();
            gVar.f13860f = null;
            gVar.f13861g = null;
            gVar.f13855a = null;
            gVar.f13862h = -1;
            gVar.f13856b = null;
            gVar.f13857c = null;
            gVar.f13858d = -1;
            gVar.f13859e = null;
            dVar.b(gVar);
        }
        this.f11962d = null;
        a aVar = this.f11964e0;
        if (aVar != null) {
            int iC = aVar.c();
            int i10 = 0;
            while (i10 < iC) {
                g gVar2 = (g) dVar.a();
                if (gVar2 == null) {
                    gVar2 = new g();
                    gVar2.f13858d = -1;
                    gVar2.f13862h = -1;
                }
                gVar2.f13860f = this;
                j jVar3 = eVar != null ? (j) eVar.a() : jVar;
                if (jVar3 == null) {
                    jVar3 = new j(this, getContext());
                }
                jVar3.setTab(gVar2);
                jVar3.setFocusable(true);
                jVar3.setMinimumWidth(getTabMinWidth());
                if (TextUtils.isEmpty(gVar2.f13857c)) {
                    jVar3.setContentDescription(gVar2.f13856b);
                } else {
                    jVar3.setContentDescription(gVar2.f13857c);
                }
                gVar2.f13861g = jVar3;
                int i11 = gVar2.f13862h;
                if (i11 != -1) {
                    jVar3.setId(i11);
                }
                CharSequence charSequenceE = this.f11964e0.e(i10);
                if (TextUtils.isEmpty(gVar2.f13857c) && !TextUtils.isEmpty(charSequenceE)) {
                    gVar2.f13861g.setContentDescription(charSequenceE);
                }
                gVar2.f13856b = charSequenceE;
                j jVar4 = gVar2.f13861g;
                if (jVar4 != null) {
                    jVar4.e();
                }
                int size = arrayList.size();
                if (gVar2.f13860f != this) {
                    throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
                }
                gVar2.f13858d = size;
                arrayList.add(size, gVar2);
                int size2 = arrayList.size();
                int i12 = -1;
                for (int i13 = size + 1; i13 < size2; i13++) {
                    if (((g) arrayList.get(i13)).f13858d == this.f11957a) {
                        i12 = i13;
                    }
                    ((g) arrayList.get(i13)).f13858d = i13;
                }
                this.f11957a = i12;
                j jVar5 = gVar2.f13861g;
                jVar5.setSelected(false);
                jVar5.setActivated(false);
                int i14 = gVar2.f13858d;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (this.O == 1 && this.L == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                fVar.addView(jVar5, i14, layoutParams);
                i10++;
                jVar = null;
            }
            ViewPager viewPager = this.f11963d0;
            if (viewPager == null || iC <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            f((currentItem < 0 || currentItem >= getTabCount()) ? null : (g) arrayList.get(currentItem), true);
        }
    }

    public final void f(g gVar, boolean z9) {
        g gVar2 = this.f11962d;
        ArrayList arrayList = this.f11958a0;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((c) arrayList.get(size)).getClass();
                }
                a(gVar.f13858d);
                return;
            }
            return;
        }
        int i10 = gVar != null ? gVar.f13858d : -1;
        if (z9) {
            if ((gVar2 == null || gVar2.f13858d == -1) && i10 != -1) {
                h(i10, 0.0f, true, true);
            } else {
                a(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        }
        this.f11962d = gVar;
        if (gVar2 != null && gVar2.f13860f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((c) arrayList.get(size2)).getClass();
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                k kVar = (k) ((c) arrayList.get(size3));
                kVar.getClass();
                kVar.f13880a.setCurrentItem(gVar.f13858d);
            }
        }
    }

    public final void g(a aVar, boolean z9) {
        h2 h2Var;
        a aVar2 = this.f11964e0;
        if (aVar2 != null && (h2Var = this.f11966f0) != null) {
            aVar2.f20669a.unregisterObserver(h2Var);
        }
        this.f11964e0 = aVar;
        if (z9 && aVar != null) {
            if (this.f11966f0 == null) {
                this.f11966f0 = new h2(3, this);
            }
            aVar.f20669a.registerObserver(this.f11966f0);
        }
        e();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f11962d;
        if (gVar != null) {
            return gVar.f13858d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f11959b.size();
    }

    public int getTabGravity() {
        return this.L;
    }

    public ColorStateList getTabIconTint() {
        return this.f11980y;
    }

    public int getTabIndicatorAnimationMode() {
        return this.S;
    }

    public int getTabIndicatorGravity() {
        return this.N;
    }

    public int getTabMaxWidth() {
        return this.G;
    }

    public int getTabMode() {
        return this.O;
    }

    public ColorStateList getTabRippleColor() {
        return this.f11981z;
    }

    public Drawable getTabSelectedIndicator() {
        return this.A;
    }

    public ColorStateList getTabTextColors() {
        return this.f11979x;
    }

    public final void h(int i10, float f10, boolean z9, boolean z10) {
        float f11 = i10 + f10;
        int iRound = Math.round(f11);
        if (iRound >= 0) {
            f fVar = this.f11965f;
            if (iRound >= fVar.getChildCount()) {
                return;
            }
            if (z10) {
                fVar.getClass();
                fVar.f13854d.f11957a = Math.round(f11);
                ValueAnimator valueAnimator = fVar.f13852a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.f13852a.cancel();
                }
                fVar.c(fVar.getChildAt(i10), fVar.getChildAt(i10 + 1), f10);
            }
            ValueAnimator valueAnimator2 = this.f11961c0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f11961c0.cancel();
            }
            scrollTo(i10 < 0 ? 0 : c(i10, f10), 0);
            if (z9) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void i(ViewPager viewPager, boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f11963d0;
        if (viewPager2 != null) {
            h hVar = this.f11967g0;
            if (hVar != null && (arrayList2 = viewPager2.f1145i0) != null) {
                arrayList2.remove(hVar);
            }
            g5.b bVar = this.f11969h0;
            if (bVar != null && (arrayList = this.f11963d0.f1147k0) != null) {
                arrayList.remove(bVar);
            }
        }
        k kVar = this.f11960b0;
        ArrayList arrayList3 = this.f11958a0;
        if (kVar != null) {
            arrayList3.remove(kVar);
            this.f11960b0 = null;
        }
        if (viewPager != null) {
            this.f11963d0 = viewPager;
            if (this.f11967g0 == null) {
                this.f11967g0 = new h(this);
            }
            h hVar2 = this.f11967g0;
            hVar2.f13865d = 0;
            hVar2.f13864b = 0;
            viewPager.b(hVar2);
            k kVar2 = new k(viewPager);
            this.f11960b0 = kVar2;
            if (!arrayList3.contains(kVar2)) {
                arrayList3.add(kVar2);
            }
            a adapter = viewPager.getAdapter();
            if (adapter != null) {
                g(adapter, true);
            }
            if (this.f11969h0 == null) {
                this.f11969h0 = new g5.b(this);
            }
            g5.b bVar2 = this.f11969h0;
            bVar2.f13846a = true;
            if (viewPager.f1147k0 == null) {
                viewPager.f1147k0 = new ArrayList();
            }
            viewPager.f1147k0.add(bVar2);
            h(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f11963d0 = null;
            g(null, false);
        }
        this.f11970i0 = z9;
    }

    public final void j(boolean z9) {
        int i10 = 0;
        while (true) {
            f fVar = this.f11965f;
            if (i10 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.O == 1 && this.L == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z9) {
                childAt.requestLayout();
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        en1.H(this);
        if (this.f11963d0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                i((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f11970i0) {
            setupWithViewPager(null);
            this.f11970i0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j jVar;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            f fVar = this.f11965f;
            if (i10 >= fVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fVar.getChildAt(i10);
            if ((childAt instanceof j) && (drawable = (jVar = (j) childAt).f13877u) != null) {
                drawable.setBounds(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
                jVar.f13877u.draw(canvas);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.gms.internal.ads.en1.n(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.I
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.gms.internal.ads.en1.n(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.G = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La9
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.O
            if (r0 == 0) goto L81
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L81
            goto La9
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto La9
            goto L8b
        L81:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La9
        L8b:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        en1.F(this, f10);
    }

    public void setInlineLabel(boolean z9) {
        if (this.P == z9) {
            return;
        }
        this.P = z9;
        int i10 = 0;
        while (true) {
            f fVar = this.f11965f;
            if (i10 >= fVar.getChildCount()) {
                b();
                return;
            }
            View childAt = fVar.getChildAt(i10);
            if (childAt instanceof j) {
                j jVar = (j) childAt;
                jVar.setOrientation(!jVar.f13879w.P ? 1 : 0);
                TextView textView = jVar.f13875s;
                if (textView == null && jVar.f13876t == null) {
                    jVar.h(jVar.f13870b, jVar.f13871d, true);
                } else {
                    jVar.h(textView, jVar.f13876t, false);
                }
            }
            i10++;
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(g5.d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        d();
        this.f11961c0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = z.I(drawable).mutate();
        this.A = drawableMutate;
        tp1.q(drawableMutate, this.B);
        int intrinsicHeight = this.R;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.A.getIntrinsicHeight();
        }
        this.f11965f.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.B = i10;
        tp1.q(this.A, i10);
        j(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.N != i10) {
            this.N = i10;
            WeakHashMap weakHashMap = v0.f16075a;
            d0.k(this.f11965f);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.R = i10;
        this.f11965f.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.L != i10) {
            this.L = i10;
            b();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f11980y != colorStateList) {
            this.f11980y = colorStateList;
            ArrayList arrayList = this.f11959b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar = ((g) arrayList.get(i10)).f13861g;
                if (jVar != null) {
                    jVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(d0.f.c(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.S = i10;
        int i11 = 0;
        if (i10 == 0) {
            this.U = new n(18, i11);
            return;
        }
        int i12 = 1;
        if (i10 == 1) {
            this.U = new g5.a(i11);
        } else {
            if (i10 == 2) {
                this.U = new g5.a(i12);
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z9) {
        this.Q = z9;
        int i10 = f.f13851f;
        f fVar = this.f11965f;
        fVar.a(fVar.f13854d.getSelectedTabPosition());
        WeakHashMap weakHashMap = v0.f16075a;
        d0.k(fVar);
    }

    public void setTabMode(int i10) {
        if (i10 != this.O) {
            this.O = i10;
            b();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f11981z == colorStateList) {
            return;
        }
        this.f11981z = colorStateList;
        int i10 = 0;
        while (true) {
            f fVar = this.f11965f;
            if (i10 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i10);
            if (childAt instanceof j) {
                Context context = getContext();
                int i11 = j.f13868x;
                ((j) childAt).f(context);
            }
            i10++;
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(d0.f.c(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f11979x != colorStateList) {
            this.f11979x = colorStateList;
            ArrayList arrayList = this.f11959b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar = ((g) arrayList.get(i10)).f13861g;
                if (jVar != null) {
                    jVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a aVar) {
        g(aVar, false);
    }

    public void setUnboundedRipple(boolean z9) {
        if (this.T == z9) {
            return;
        }
        this.T = z9;
        int i10 = 0;
        while (true) {
            f fVar = this.f11965f;
            if (i10 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i10);
            if (childAt instanceof j) {
                Context context = getContext();
                int i11 = j.f13868x;
                ((j) childAt).f(context);
            }
            i10++;
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        i(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.W;
        ArrayList arrayList = this.f11958a0;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.W = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(q.g(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}

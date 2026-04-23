package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import b0.b;
import b0.c;
import b0.e;
import b0.f;
import b0.g;
import g4.z;
import j2.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import n0.d;
import o0.d0;
import o0.e0;
import o0.h0;
import o0.j0;
import o0.q;
import o0.r;
import o0.s;
import o0.t1;
import o0.v0;
import s.k;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements q, r {
    public static final String F;
    public static final Class[] G;
    public static final ThreadLocal H;
    public static final g I;
    public static final d J;
    public boolean A;
    public Drawable B;
    public ViewGroup.OnHierarchyChangeListener C;
    public k.q D;
    public final s E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f427b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f428d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f429f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f430h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f431q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f434u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f435v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f436w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f f437x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f438y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public t1 f439z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SparseArray f440d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f440d = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f440d.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            SparseArray sparseArray = this.f440d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f440d.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f440d.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        F = r02 != null ? r02.getName() : null;
        I = new g(0);
        G = new Class[]{Context.class, AttributeSet.class};
        H = new ThreadLocal();
        J = new d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ik);
        this.f426a = new ArrayList();
        this.f427b = new h(3);
        this.f428d = new ArrayList();
        this.f429f = new ArrayList();
        this.f430h = new int[2];
        this.f431q = new int[2];
        this.E = new s();
        int[] iArr = a0.a.f2a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.ik, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.ik, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f434u = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f434u[i10] = (int) (r1[i10] * f10);
            }
        }
        this.B = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new b0.d(this));
        WeakHashMap weakHashMap = v0.f16075a;
        if (d0.c(this) == 0) {
            d0.s(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) J.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i10, Rect rect, Rect rect2, e eVar, int i11, int i12) {
        int i13 = eVar.f1213c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = eVar.f1214d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        int iWidth = i17 != 1 ? i17 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i18 != 16 ? i18 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e m(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f1212b) {
            if (view instanceof b0.a) {
                b behavior = ((b0.a) view).getBehavior();
                b bVar = eVar.f1211a;
                if (bVar != behavior) {
                    if (bVar != null) {
                        bVar.f();
                    }
                    eVar.f1211a = behavior;
                    eVar.f1212b = true;
                    if (behavior != null) {
                        behavior.c(eVar);
                    }
                }
                eVar.f1212b = true;
            } else {
                c cVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    cVar = (c) superclass.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        b bVar2 = (b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        b bVar3 = eVar.f1211a;
                        if (bVar3 != bVar2) {
                            if (bVar3 != null) {
                                bVar3.f();
                            }
                            eVar.f1211a = bVar2;
                            eVar.f1212b = true;
                            if (bVar2 != null) {
                                bVar2.c(eVar);
                            }
                        }
                    } catch (Exception unused) {
                        cVar.value().getClass();
                    }
                }
                eVar.f1212b = true;
            }
        }
        return eVar;
    }

    public static void u(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f1219i;
        if (i11 != i10) {
            v0.j(view, i10 - i11);
            eVar.f1219i = i10;
        }
    }

    public static void v(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f1220j;
        if (i11 != i10) {
            v0.k(view, i10 - i11);
            eVar.f1220j = i10;
        }
    }

    @Override // o0.q
    public final void a(View view, View view2, int i10, int i11) {
        s sVar = this.E;
        if (i11 == 1) {
            sVar.f16065b = i10;
        } else {
            sVar.f16064a = i10;
        }
        this.f436w = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((e) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // o0.q
    public final void b(View view, int i10) {
        s sVar = this.E;
        if (i10 == 1) {
            sVar.f16065b = 0;
        } else {
            sVar.f16064a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i10)) {
                b bVar = eVar.f1211a;
                if (bVar != null) {
                    bVar.q(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    eVar.f1224n = false;
                } else if (i10 == 1) {
                    eVar.f1225o = false;
                }
                eVar.f1226p = false;
            }
        }
        this.f436w = null;
    }

    @Override // o0.q
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        b bVar;
        int childCount = getChildCount();
        boolean z9 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i12) && (bVar = eVar.f1211a) != null) {
                    int[] iArr2 = this.f430h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f430h;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr3[1]) : Math.min(iMax2, iArr3[1]);
                    z9 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z9) {
            o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // o0.r
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        boolean z9 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i14) && (bVar = eVar.f1211a) != null) {
                    int[] iArr2 = this.f430h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.l(this, childAt, i11, i12, i13, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z9 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z9) {
            o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        b bVar = ((e) view.getLayoutParams()).f1211a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // o0.q
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        d(view, i10, i11, i12, i13, 0, this.f431q);
    }

    @Override // o0.q
    public final boolean f(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f1211a;
                if (bVar != null) {
                    boolean zP = bVar.p(this, childAt, view, i10, i11);
                    z9 |= zP;
                    if (i11 == 0) {
                        eVar.f1224n = zP;
                    } else if (i11 == 1) {
                        eVar.f1225o = zP;
                    }
                } else if (i11 == 0) {
                    eVar.f1224n = false;
                } else if (i11 == 1) {
                    eVar.f1225o = false;
                }
            }
        }
        return z9;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f426a);
    }

    public final t1 getLastWindowInsets() {
        return this.f439z;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.E;
        return sVar.f16065b | sVar.f16064a;
    }

    public Drawable getStatusBarBackground() {
        return this.B;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z9) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z9) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        h hVar = this.f427b;
        int i10 = ((k) hVar.f14298b).f16626d;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((k) hVar.f14298b).j(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((k) hVar.f14298b).h(i11));
            }
        }
        ArrayList arrayList3 = this.f429f;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = b0.h.f1230a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = b0.h.f1230a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        b0.h.a(this, view, matrix);
        ThreadLocal threadLocal3 = b0.h.f1231b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final boolean n(View view, int i10, int i11) {
        d dVar = J;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i10, i11);
        } finally {
            rectG.setEmpty();
            dVar.b(rectG);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r26) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.o(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f438y) {
            if (this.f437x == null) {
                this.f437x = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f437x);
        }
        if (this.f439z == null) {
            WeakHashMap weakHashMap = v0.f16075a;
            if (d0.b(this)) {
                h0.c(this);
            }
        }
        this.f433t = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f438y && this.f437x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f437x);
        }
        View view = this.f436w;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f433t = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.A || this.B == null) {
            return;
        }
        t1 t1Var = this.f439z;
        int iD = t1Var != null ? t1Var.d() : 0;
        if (iD > 0) {
            this.B.setBounds(0, 0, getWidth(), iD);
            this.B.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        b bVar;
        WeakHashMap weakHashMap = v0.f16075a;
        int iD = e0.d(this);
        ArrayList arrayList = this.f426a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f1211a) == null || !bVar.h(this, view, iD))) {
                p(view, iD);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f1211a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        b bVar;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f1211a) != null) {
                    zJ |= bVar.j(view);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        c(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        e(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        a(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f570a);
        SparseArray sparseArray = savedState.f440d;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            b bVar = m(childAt).f1211a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f1211a;
            if (id != -1 && bVar != null && (parcelableO = bVar.o(childAt)) != null) {
                sparseArray.append(id, parcelableO);
            }
        }
        savedState.f440d = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f435v
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2a
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.f435v
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            b0.e r6 = (b0.e) r6
            b0.b r6 = r6.f1211a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f435v
            boolean r6 = r6.r(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.f435v
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(android.view.View r13, int r14) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(android.view.View, int):void");
    }

    public final void q(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    public final boolean r(MotionEvent motionEvent, int i10) {
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f428d;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        g gVar = I;
        if (gVar != null) {
            Collections.sort(arrayList, gVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zG = false;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            e eVar = (e) view.getLayoutParams();
            b bVar = eVar.f1211a;
            if (!(zG || z10) || actionMasked == 0) {
                if (!zG && bVar != null) {
                    if (i10 == 0) {
                        zG = bVar.g(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zG = bVar.r(this, view, motionEvent);
                    }
                    if (zG) {
                        this.f435v = view;
                    }
                }
                if (eVar.f1211a == null) {
                    eVar.f1223m = false;
                }
                boolean z11 = eVar.f1223m;
                if (z11) {
                    z9 = true;
                } else {
                    eVar.f1223m = z11;
                    z9 = z11;
                }
                z10 = z9 && !z11;
                if (z9 && !z10) {
                    break;
                }
            } else if (bVar != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    bVar.g(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    bVar.r(this, view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zG;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        b bVar = ((e) view.getLayoutParams()).f1211a;
        if (bVar == null || !bVar.m(this, view, rect, z9)) {
            return super.requestChildRectangleOnScreen(view, rect, z9);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (!z9 || this.f432s) {
            return;
        }
        t(false);
        this.f432s = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z9) {
        super.setFitsSystemWindows(z9);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.C = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.B = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.B.setState(getDrawableState());
                }
                Drawable drawable3 = this.B;
                WeakHashMap weakHashMap = v0.f16075a;
                z.A(drawable3, e0.d(this));
                this.B.setVisible(getVisibility() == 0, false);
                this.B.setCallback(this);
            }
            WeakHashMap weakHashMap2 = v0.f16075a;
            d0.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawableB;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = d0.f.f12287a;
            drawableB = d0.c.b(context, i10);
        } else {
            drawableB = null;
        }
        setStatusBarBackground(drawableB);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.B;
        if (drawable == null || drawable.isVisible() == z9) {
            return;
        }
        this.B.setVisible(z9, false);
    }

    public final void t(boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b bVar = ((e) childAt.getLayoutParams()).f1211a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z9) {
                    bVar.g(this, childAt, motionEventObtain);
                } else {
                    bVar.r(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).f1223m = false;
        }
        this.f435v = null;
        this.f432s = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B;
    }

    public final void w() {
        WeakHashMap weakHashMap = v0.f16075a;
        if (!d0.b(this)) {
            j0.u(this, null);
            return;
        }
        if (this.D == null) {
            this.D = new k.q(3, this);
        }
        j0.u(this, this.D);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}

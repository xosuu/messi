package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import b5.d;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.material.internal.NavigationMenuView;
import d5.g;
import d5.k;
import d5.l;
import g4.c;
import j.j;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.e;
import k.r;
import o0.d0;
import o0.e0;
import o0.j0;
import o0.v0;
import x4.f;
import x4.i;
import x4.n;
import x4.q;
import x4.s;
import x4.y;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends s {
    public static final int[] G = {R.attr.state_checked};
    public static final int[] H = {-16842910};
    public boolean A;
    public boolean B;
    public final int C;
    public final int D;
    public Path E;
    public final RectF F;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f11922t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q f11923u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y4.a f11924v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f11926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j f11927y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f11928z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bundle f11929d;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            parcel.writeBundle(this.f11929d);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet) {
        Context contextA = j5.a.a(context, attributeSet, xyz.easypro.httpcustom.R.attr.xy, xyz.easypro.httpcustom.R.style.vt);
        super(contextA, attributeSet, xyz.easypro.httpcustom.R.attr.xy);
        this.f18454d = new Rect();
        this.f18455f = true;
        this.f18456h = true;
        this.f18457q = true;
        this.f18458s = true;
        int[] iArr = l4.a.f15211x;
        y.a(contextA, attributeSet, xyz.easypro.httpcustom.R.attr.xy, xyz.easypro.httpcustom.R.style.vu);
        y.b(contextA, attributeSet, iArr, xyz.easypro.httpcustom.R.attr.xy, xyz.easypro.httpcustom.R.style.vu, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextA.obtainStyledAttributes(attributeSet, iArr, xyz.easypro.httpcustom.R.attr.xy, xyz.easypro.httpcustom.R.style.vu);
        this.f18452a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        k.q qVar = new k.q(28, this);
        WeakHashMap weakHashMap = v0.f16075a;
        j0.u(this, qVar);
        q qVar2 = new q();
        this.f11923u = qVar2;
        this.f11926x = new int[2];
        this.A = true;
        this.B = true;
        this.C = 0;
        this.D = 0;
        this.F = new RectF();
        Context context2 = getContext();
        f fVar = new f(context2);
        this.f11922t = fVar;
        int[] iArr2 = l4.a.f15209v;
        y.a(context2, attributeSet, xyz.easypro.httpcustom.R.attr.xy, xyz.easypro.httpcustom.R.style.vt);
        y.b(context2, attributeSet, iArr2, xyz.easypro.httpcustom.R.attr.xy, xyz.easypro.httpcustom.R.style.vt, new int[0]);
        ur0 ur0Var = new ur0(context2, 5, context2.obtainStyledAttributes(attributeSet, iArr2, xyz.easypro.httpcustom.R.attr.xy, xyz.easypro.httpcustom.R.style.vt));
        if (ur0Var.H(1)) {
            d0.q(this, ur0Var.y(1));
        }
        this.D = ur0Var.x(7, 0);
        this.C = ur0Var.B(0, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            d5.j jVarA = d5.j.b(context2, attributeSet, xyz.easypro.httpcustom.R.attr.xy, xyz.easypro.httpcustom.R.style.vt).a();
            Drawable background = getBackground();
            g gVar = new g(jVarA);
            if (background instanceof ColorDrawable) {
                gVar.l(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            gVar.j(context2);
            d0.q(this, gVar);
        }
        if (ur0Var.H(8)) {
            setElevation(ur0Var.x(8, 0));
        }
        setFitsSystemWindows(ur0Var.u(2, false));
        this.f11925w = ur0Var.x(3, 0);
        ColorStateList colorStateListV = ur0Var.H(30) ? ur0Var.v(30) : null;
        int iD = ur0Var.H(33) ? ur0Var.D(33, 0) : 0;
        if (iD == 0 && colorStateListV == null) {
            colorStateListV = a(R.attr.textColorSecondary);
        }
        ColorStateList colorStateListV2 = ur0Var.H(14) ? ur0Var.v(14) : a(R.attr.textColorSecondary);
        int iD2 = ur0Var.H(24) ? ur0Var.D(24, 0) : 0;
        if (ur0Var.H(13)) {
            setItemIconSize(ur0Var.x(13, 0));
        }
        ColorStateList colorStateListV3 = ur0Var.H(25) ? ur0Var.v(25) : null;
        if (iD2 == 0 && colorStateListV3 == null) {
            colorStateListV3 = a(R.attr.textColorPrimary);
        }
        Drawable drawableY = ur0Var.y(10);
        if (drawableY == null && (ur0Var.H(17) || ur0Var.H(18))) {
            drawableY = b(ur0Var, tp1.h(getContext(), ur0Var, 19));
            ColorStateList colorStateListH = tp1.h(context2, ur0Var, 16);
            if (colorStateListH != null) {
                qVar2.f18450y = new RippleDrawable(d.b(colorStateListH), null, b(ur0Var, null));
                qVar2.h();
            }
        }
        if (ur0Var.H(11)) {
            setItemHorizontalPadding(ur0Var.x(11, 0));
        }
        if (ur0Var.H(26)) {
            setItemVerticalPadding(ur0Var.x(26, 0));
        }
        setDividerInsetStart(ur0Var.x(6, 0));
        setDividerInsetEnd(ur0Var.x(5, 0));
        setSubheaderInsetStart(ur0Var.x(32, 0));
        setSubheaderInsetEnd(ur0Var.x(31, 0));
        setTopInsetScrimEnabled(ur0Var.u(34, this.A));
        setBottomInsetScrimEnabled(ur0Var.u(4, this.B));
        int iX = ur0Var.x(12, 0);
        setItemMaxLines(ur0Var.B(15, 1));
        fVar.f14563e = new x4.a(1, this);
        qVar2.f18441f = 1;
        qVar2.l(context2, fVar);
        if (iD != 0) {
            qVar2.f18444s = iD;
            qVar2.h();
        }
        qVar2.f18445t = colorStateListV;
        qVar2.h();
        qVar2.f18448w = colorStateListV2;
        qVar2.h();
        int overScrollMode = getOverScrollMode();
        qVar2.M = overScrollMode;
        NavigationMenuView navigationMenuView = qVar2.f18438a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (iD2 != 0) {
            qVar2.f18446u = iD2;
            qVar2.h();
        }
        qVar2.f18447v = colorStateListV3;
        qVar2.h();
        qVar2.f18449x = drawableY;
        qVar2.h();
        qVar2.B = iX;
        qVar2.h();
        fVar.b(qVar2, fVar.f14559a);
        if (qVar2.f18438a == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) qVar2.f18443q.inflate(xyz.easypro.httpcustom.R.layout.be, (ViewGroup) this, false);
            qVar2.f18438a = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new n(qVar2, qVar2.f18438a));
            if (qVar2.f18442h == null) {
                qVar2.f18442h = new i(qVar2);
            }
            int i10 = qVar2.M;
            if (i10 != -1) {
                qVar2.f18438a.setOverScrollMode(i10);
            }
            qVar2.f18439b = (LinearLayout) qVar2.f18443q.inflate(xyz.easypro.httpcustom.R.layout.bb, (ViewGroup) qVar2.f18438a, false);
            qVar2.f18438a.setAdapter(qVar2.f18442h);
        }
        addView(qVar2.f18438a);
        if (ur0Var.H(27)) {
            int iD3 = ur0Var.D(27, 0);
            i iVar = qVar2.f18442h;
            if (iVar != null) {
                iVar.f18431h = true;
            }
            getMenuInflater().inflate(iD3, fVar);
            i iVar2 = qVar2.f18442h;
            if (iVar2 != null) {
                iVar2.f18431h = false;
            }
            qVar2.h();
        }
        if (ur0Var.H(9)) {
            qVar2.f18439b.addView(qVar2.f18443q.inflate(ur0Var.D(9, 0), (ViewGroup) qVar2.f18439b, false));
            NavigationMenuView navigationMenuView3 = qVar2.f18438a;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        ur0Var.M();
        this.f11928z = new e(4, this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f11928z);
    }

    private MenuInflater getMenuInflater() {
        if (this.f11927y == null) {
            this.f11927y = new j(getContext());
        }
        return this.f11927y;
    }

    public final ColorStateList a(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = d0.f.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(xyz.easypro.httpcustom.R.attr.he, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        int[] iArr = H;
        return new ColorStateList(new int[][]{iArr, G, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListC.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final InsetDrawable b(ur0 ur0Var, ColorStateList colorStateList) {
        g gVar = new g(d5.j.a(getContext(), ur0Var.D(17, 0), ur0Var.D(18, 0), new d5.a(0)).a());
        gVar.l(colorStateList);
        return new InsetDrawable((Drawable) gVar, ur0Var.x(22, 0), ur0Var.x(23, 0), ur0Var.x(21, 0), ur0Var.x(20, 0));
    }

    public final View c() {
        return this.f11923u.f18439b.getChildAt(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.E == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.E);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public MenuItem getCheckedItem() {
        return this.f11923u.f18442h.f18430f;
    }

    public int getDividerInsetEnd() {
        return this.f11923u.E;
    }

    public int getDividerInsetStart() {
        return this.f11923u.D;
    }

    public int getHeaderCount() {
        return this.f11923u.f18439b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f11923u.f18449x;
    }

    public int getItemHorizontalPadding() {
        return this.f11923u.f18451z;
    }

    public int getItemIconPadding() {
        return this.f11923u.B;
    }

    public ColorStateList getItemIconTintList() {
        return this.f11923u.f18448w;
    }

    public int getItemMaxLines() {
        return this.f11923u.J;
    }

    public ColorStateList getItemTextColor() {
        return this.f11923u.f18447v;
    }

    public int getItemVerticalPadding() {
        return this.f11923u.A;
    }

    public Menu getMenu() {
        return this.f11922t;
    }

    public int getSubheaderInsetEnd() {
        return this.f11923u.G;
    }

    public int getSubheaderInsetStart() {
        return this.f11923u.F;
    }

    @Override // x4.s, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        en1.H(this);
    }

    @Override // x4.s, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f11928z);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.f11925w;
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), i12), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
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
        Bundle bundle = savedState.f11929d;
        f fVar = this.f11922t;
        fVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = fVar.f14579u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference weakReference : copyOnWriteArrayList) {
                k.d0 d0Var = (k.d0) weakReference.get();
                if (d0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int iK = d0Var.k();
                    if (iK > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(iK)) != null) {
                        d0Var.g(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f11929d = bundle;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f11922t.f14579u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                k.d0 d0Var = (k.d0) weakReference.get();
                if (d0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int iK = d0Var.k();
                    if (iK > 0 && (parcelableN = d0Var.n()) != null) {
                        sparseArray.put(iK, parcelableN);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        boolean z9 = getParent() instanceof DrawerLayout;
        RectF rectF = this.F;
        if (!z9 || (i14 = this.D) <= 0 || !(getBackground() instanceof g)) {
            this.E = null;
            rectF.setEmpty();
            return;
        }
        g gVar = (g) getBackground();
        c cVarE = gVar.f12396a.f12375a.e();
        WeakHashMap weakHashMap = v0.f16075a;
        if (Gravity.getAbsoluteGravity(this.C, e0.d(this)) == 3) {
            float f10 = i14;
            cVarE.f13701f = new d5.a(f10);
            cVarE.f13702g = new d5.a(f10);
        } else {
            float f11 = i14;
            cVarE.f13700e = new d5.a(f11);
            cVarE.f13703h = new d5.a(f11);
        }
        gVar.setShapeAppearanceModel(cVarE.a());
        if (this.E == null) {
            this.E = new Path();
        }
        this.E.reset();
        rectF.set(0.0f, 0.0f, i10, i11);
        l lVar = k.f12423a;
        d5.f fVar = gVar.f12396a;
        lVar.a(fVar.f12375a, fVar.f12384j, rectF, null, this.E);
        invalidate();
    }

    public void setBottomInsetScrimEnabled(boolean z9) {
        this.B = z9;
    }

    public void setCheckedItem(int i10) {
        MenuItem menuItemFindItem = this.f11922t.findItem(i10);
        if (menuItemFindItem != null) {
            this.f11923u.f18442h.i((r) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        q qVar = this.f11923u;
        qVar.E = i10;
        qVar.h();
    }

    public void setDividerInsetStart(int i10) {
        q qVar = this.f11923u;
        qVar.D = i10;
        qVar.h();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        en1.F(this, f10);
    }

    public void setItemBackground(Drawable drawable) {
        q qVar = this.f11923u;
        qVar.f18449x = drawable;
        qVar.h();
    }

    public void setItemBackgroundResource(int i10) {
        Context context = getContext();
        Object obj = d0.f.f12287a;
        setItemBackground(d0.c.b(context, i10));
    }

    public void setItemHorizontalPadding(int i10) {
        q qVar = this.f11923u;
        qVar.f18451z = i10;
        qVar.h();
    }

    public void setItemHorizontalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        q qVar = this.f11923u;
        qVar.f18451z = dimensionPixelSize;
        qVar.h();
    }

    public void setItemIconPadding(int i10) {
        q qVar = this.f11923u;
        qVar.B = i10;
        qVar.h();
    }

    public void setItemIconPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        q qVar = this.f11923u;
        qVar.B = dimensionPixelSize;
        qVar.h();
    }

    public void setItemIconSize(int i10) {
        q qVar = this.f11923u;
        if (qVar.C != i10) {
            qVar.C = i10;
            qVar.H = true;
            qVar.h();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        q qVar = this.f11923u;
        qVar.f18448w = colorStateList;
        qVar.h();
    }

    public void setItemMaxLines(int i10) {
        q qVar = this.f11923u;
        qVar.J = i10;
        qVar.h();
    }

    public void setItemTextAppearance(int i10) {
        q qVar = this.f11923u;
        qVar.f18446u = i10;
        qVar.h();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        q qVar = this.f11923u;
        qVar.f18447v = colorStateList;
        qVar.h();
    }

    public void setItemVerticalPadding(int i10) {
        q qVar = this.f11923u;
        qVar.A = i10;
        qVar.h();
    }

    public void setItemVerticalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        q qVar = this.f11923u;
        qVar.A = dimensionPixelSize;
        qVar.h();
    }

    public void setNavigationItemSelectedListener(y4.a aVar) {
        this.f11924v = aVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        q qVar = this.f11923u;
        if (qVar != null) {
            qVar.M = i10;
            NavigationMenuView navigationMenuView = qVar.f18438a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i10);
            }
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        q qVar = this.f11923u;
        qVar.G = i10;
        qVar.h();
    }

    public void setSubheaderInsetStart(int i10) {
        q qVar = this.f11923u;
        qVar.F = i10;
        qVar.h();
    }

    public void setTopInsetScrimEnabled(boolean z9) {
        this.A = z9;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f11922t.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f11923u.f18442h.i((r) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}

package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import o0.t1;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f676b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f677d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f678f;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.f678f = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f5b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.f676b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f675a == null) {
            this.f675a = new ArrayList();
        }
        this.f675a.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.jl);
        if ((tag instanceof s ? (s) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z9) {
        Object tag = view.getTag(R.id.jl);
        if ((tag instanceof s ? (s) tag : null) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z9);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        t1 t1VarH = t1.h(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f677d;
        t1 t1VarH2 = onApplyWindowInsetsListener != null ? t1.h(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null) : o0.v0.l(this, t1VarH);
        if (!t1VarH2.f16068a.m()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                o0.v0.b(getChildAt(i10), t1VarH2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f678f && this.f675a != null) {
            for (int i10 = 0; i10 < this.f675a.size(); i10++) {
                super.drawChild(canvas, (View) this.f675a.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList arrayList;
        if (!this.f678f || (arrayList = this.f675a) == null || arrayList.size() <= 0 || !this.f675a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f676b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f675a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f678f = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z9) {
        if (z9) {
            a(view);
        }
        super.removeDetachedView(view, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    public void setDrawDisappearingViewsLast(boolean z9) {
        this.f678f = z9;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f677d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f676b == null) {
                this.f676b = new ArrayList();
            }
            this.f676b.add(view);
        }
        super.startViewTransition(view);
    }
}

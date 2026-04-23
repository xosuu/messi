package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import l.x2;
import o0.d0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f228b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f229d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f230f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f231h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f232q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f234t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f235u;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.b bVar = new l.b(this);
        WeakHashMap weakHashMap = v0.f16075a;
        d0.q(this, bVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f12594a);
        boolean z9 = false;
        this.f230f = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f231h = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f235u = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.u_) {
            this.f233s = true;
            this.f232q = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f233s ? !(this.f230f != null || this.f231h != null) : this.f232q == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f230f;
        if (drawable != null && drawable.isStateful()) {
            this.f230f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f231h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f231h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f232q;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f232q.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f230f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f231h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f232q;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f228b = findViewById(R.id.au);
        this.f229d = findViewById(R.id.b4);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f227a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean z10;
        super.onLayout(z9, i10, i11, i12, i13);
        if (this.f233s) {
            Drawable drawable = this.f232q;
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f230f != null) {
                if (this.f228b.getVisibility() == 0) {
                    this.f230f.setBounds(this.f228b.getLeft(), this.f228b.getTop(), this.f228b.getRight(), this.f228b.getBottom());
                } else {
                    View view = this.f229d;
                    if (view == null || view.getVisibility() != 0) {
                        this.f230f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f230f.setBounds(this.f229d.getLeft(), this.f229d.getTop(), this.f229d.getRight(), this.f229d.getBottom());
                    }
                }
                z10 = true;
            } else {
                z10 = false;
            }
            this.f234t = false;
            if (!z10) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f228b == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f235u) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f228b == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f230f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f230f);
        }
        this.f230f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f228b;
            if (view != null) {
                this.f230f.setBounds(view.getLeft(), this.f228b.getTop(), this.f228b.getRight(), this.f228b.getBottom());
            }
        }
        boolean z9 = false;
        if (!this.f233s ? !(this.f230f != null || this.f231h != null) : this.f232q == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f232q;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f232q);
        }
        this.f232q = drawable;
        boolean z9 = this.f233s;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z9 && (drawable2 = this.f232q) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z9 ? !(this.f230f != null || this.f231h != null) : this.f232q == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f231h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f231h);
        }
        this.f231h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f234t && this.f231h != null) {
                throw null;
            }
        }
        boolean z9 = false;
        if (!this.f233s ? !(this.f230f != null || this.f231h != null) : this.f232q == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(x2 x2Var) {
    }

    public void setTransitioning(boolean z9) {
        this.f227a = z9;
        setDescendantFocusability(z9 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f230f;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
        Drawable drawable2 = this.f231h;
        if (drawable2 != null) {
            drawable2.setVisible(z9, false);
        }
        Drawable drawable3 = this.f232q;
        if (drawable3 != null) {
            drawable3.setVisible(z9, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f230f;
        boolean z9 = this.f233s;
        return (drawable == drawable2 && !z9) || (drawable == this.f231h && this.f234t) || ((drawable == this.f232q && z9) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}

package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.gms.internal.ads.yl1;
import l.k;
import l.m0;
import l.n0;
import l.p0;
import l.q;
import l.s0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Spinner {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f387u = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f389b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f390d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SpinnerAdapter f391f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f392h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s0 f393q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f394s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f395t;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r12, android.util.AttributeSet r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f395t;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f388a;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        s0 s0Var = this.f393q;
        return s0Var != null ? s0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        s0 s0Var = this.f393q;
        return s0Var != null ? s0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f393q != null ? this.f394s : super.getDropDownWidth();
    }

    public final s0 getInternalPopup() {
        return this.f393q;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        s0 s0Var = this.f393q;
        return s0Var != null ? s0Var.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f389b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        s0 s0Var = this.f393q;
        return s0Var != null ? s0Var.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f388a;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f388a;
        if (qVar != null) {
            return qVar.f();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s0 s0Var = this.f393q;
        if (s0Var == null || !s0Var.a()) {
            return;
        }
        s0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f393q == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.f273a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new k.e(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        s0 s0Var = this.f393q;
        appCompatSpinner$SavedState.f273a = s0Var != null && s0Var.a();
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k kVar = this.f390d;
        if (kVar == null || !kVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        s0 s0Var = this.f393q;
        if (s0Var == null) {
            return super.performClick();
        }
        if (s0Var.a()) {
            return true;
        }
        this.f393q.m(m0.b(this), m0.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f388a;
        if (qVar != null) {
            qVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q qVar = this.f388a;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        s0 s0Var = this.f393q;
        if (s0Var == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            s0Var.k(i10);
            s0Var.l(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        s0 s0Var = this.f393q;
        if (s0Var != null) {
            s0Var.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f393q != null) {
            this.f394s = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        s0 s0Var = this.f393q;
        if (s0Var != null) {
            s0Var.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(p7.q.g(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        s0 s0Var = this.f393q;
        if (s0Var != null) {
            s0Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f388a;
        if (qVar != null) {
            qVar.n(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f388a;
        if (qVar != null) {
            qVar.o(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f392h) {
            this.f391f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        s0 s0Var = this.f393q;
        if (s0Var != null) {
            Context context = this.f389b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            p0 p0Var = new p0();
            p0Var.f14958a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                p0Var.f14959b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && yl1.w(spinnerAdapter)) {
                n0.a(yl1.h(spinnerAdapter), theme);
            }
            s0Var.p(p0Var);
        }
    }
}

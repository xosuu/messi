package h5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import l.d3;
import l.k2;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class u extends l.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k2 f14098h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AccessibilityManager f14099q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f14100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f14102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14103v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f14104w;

    public u(Context context, AttributeSet attributeSet) {
        super(j5.a.a(context, attributeSet, R.attr.b0, 0), attributeSet);
        this.f14100s = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayE = x4.y.e(context2, attributeSet, l4.a.f15198k, R.attr.b0, R.style.tx, new int[0]);
        if (typedArrayE.hasValue(0) && typedArrayE.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f14101t = typedArrayE.getResourceId(2, R.layout.d0);
        this.f14102u = typedArrayE.getDimensionPixelOffset(1, R.dimen.qg);
        this.f14103v = typedArrayE.getColor(3, 0);
        this.f14104w = tp1.g(context2, typedArrayE, 4);
        this.f14099q = (AccessibilityManager) context2.getSystemService("accessibility");
        k2 k2Var = new k2(context2, null, R.attr.t6, 0);
        this.f14098h = k2Var;
        k2Var.K = true;
        k2Var.L.setFocusable(true);
        k2Var.A = this;
        k2Var.L.setInputMethodMode(2);
        k2Var.p(getAdapter());
        k2Var.B = new d3(this, 1);
        if (typedArrayE.hasValue(5)) {
            setSimpleItems(typedArrayE.getResourceId(5, 0));
        }
        typedArrayE.recycle();
    }

    public static void a(u uVar, Object obj) {
        uVar.setText(uVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f14099q;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.f14098h.dismiss();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.O) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f14102u;
    }

    public int getSimpleItemSelectedColor() {
        return this.f14103v;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f14104w;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.O && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14098h.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                k2 k2Var = this.f14098h;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !k2Var.L.isShowing() ? -1 : k2Var.f14910d.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = k2Var.L.getBackground();
                if (background != null) {
                    Rect rect = this.f14100s;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        AccessibilityManager accessibilityManager = this.f14099q;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z9);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t7) {
        super.setAdapter(t7);
        this.f14098h.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        k2 k2Var = this.f14098h;
        if (k2Var != null) {
            k2Var.h(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f14098h.C = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.r();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f14103v = i10;
        if (getAdapter() instanceof t) {
            ((t) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f14104w = colorStateList;
        if (getAdapter() instanceof t) {
            ((t) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f14099q;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f14098h.e();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new t(this, getContext(), this.f14101t, strArr));
    }
}

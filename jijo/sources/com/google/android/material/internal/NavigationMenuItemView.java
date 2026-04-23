package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import f0.j;
import f0.q;
import g4.z;
import h0.b;
import java.util.WeakHashMap;
import k.e0;
import k.r;
import l.b2;
import o0.d0;
import o0.v0;
import s0.o;
import x4.d;
import z1.e;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends d implements e0 {
    public static final int[] R = {R.attr.state_checked};
    public int H;
    public boolean I;
    public boolean J;
    public final CheckedTextView K;
    public FrameLayout L;
    public r M;
    public ColorStateList N;
    public boolean O;
    public Drawable P;
    public final e Q;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e eVar = new e(this, 3);
        this.Q = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(xyz.easypro.httpcustom.R.layout.bf, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.d3));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(xyz.easypro.httpcustom.R.id.h7);
        this.K = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        v0.q(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.L == null) {
                this.L = (FrameLayout) ((ViewStub) findViewById(xyz.easypro.httpcustom.R.id.h6)).inflate();
            }
            this.L.removeAllViews();
            this.L.addView(view);
        }
    }

    @Override // k.e0
    public final void c(r rVar) {
        StateListDrawable stateListDrawable;
        this.M = rVar;
        int i10 = rVar.f14588a;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(rVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(xyz.easypro.httpcustom.R.attr.gu, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(R, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = v0.f16075a;
            d0.q(this, stateListDrawable);
        }
        setCheckable(rVar.isCheckable());
        setChecked(rVar.isChecked());
        setEnabled(rVar.isEnabled());
        setTitle(rVar.f14592e);
        setIcon(rVar.getIcon());
        setActionView(rVar.getActionView());
        setContentDescription(rVar.f14604q);
        g4.d0.j(this, rVar.f14605r);
        r rVar2 = this.M;
        CharSequence charSequence = rVar2.f14592e;
        CheckedTextView checkedTextView = this.K;
        if (charSequence == null && rVar2.getIcon() == null && this.M.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.L;
            if (frameLayout != null) {
                b2 b2Var = (b2) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) b2Var).width = -1;
                this.L.setLayoutParams(b2Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.L;
        if (frameLayout2 != null) {
            b2 b2Var2 = (b2) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) b2Var2).width = -2;
            this.L.setLayoutParams(b2Var2);
        }
    }

    @Override // k.e0
    public r getItemData() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        r rVar = this.M;
        if (rVar != null && rVar.isCheckable() && this.M.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z9) {
        refreshDrawableState();
        if (this.J != z9) {
            this.J = z9;
            this.Q.h(this.K, 2048);
        }
    }

    public void setChecked(boolean z9) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.K;
        checkedTextView.setChecked(z9);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z9 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.O) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = z.I(drawable).mutate();
                b.h(drawable, this.N);
            }
            int i10 = this.H;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.I) {
            if (this.P == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = q.f13039a;
                Drawable drawableA = j.a(resources, xyz.easypro.httpcustom.R.drawable.i2, theme);
                this.P = drawableA;
                if (drawableA != null) {
                    int i11 = this.H;
                    drawableA.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.P;
        }
        o.e(this.K, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.K.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.H = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.N = colorStateList;
        this.O = colorStateList != null;
        r rVar = this.M;
        if (rVar != null) {
            setIcon(rVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.K.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z9) {
        this.I = z9;
    }

    public void setTextAppearance(int i10) {
        z.B(this.K, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.K.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.K.setText(charSequence);
    }
}

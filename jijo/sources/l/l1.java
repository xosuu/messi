package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends ToggleButton implements s0.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f14930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f14931b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f14932d;

    public l1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        o3.a(getContext(), this);
        q qVar = new q(this);
        this.f14930a = qVar;
        qVar.h(attributeSet, R.attr.buttonStyleToggle);
        b1 b1Var = new b1(this);
        this.f14931b = b1Var;
        b1Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private y getEmojiTextViewHelper() {
        if (this.f14932d == null) {
            this.f14932d = new y(this);
        }
        return this.f14932d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f14930a;
        if (qVar != null) {
            qVar.b();
        }
        b1 b1Var = this.f14931b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f14930a;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f14930a;
        if (qVar != null) {
            return qVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14931b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14931b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f14930a;
        if (qVar != null) {
            qVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q qVar = this.f14930a;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f14931b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f14931b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f14930a;
        if (qVar != null) {
            qVar.n(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f14930a;
        if (qVar != null) {
            qVar.o(mode);
        }
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        b1 b1Var = this.f14931b;
        b1Var.l(colorStateList);
        b1Var.b();
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        b1 b1Var = this.f14931b;
        b1Var.m(mode);
        b1Var.b();
    }
}

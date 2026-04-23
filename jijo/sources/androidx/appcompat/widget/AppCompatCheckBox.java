package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import l.b1;
import l.o3;
import l.p3;
import l.q;
import l.t;
import l.y;
import s0.u;
import s0.v;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements u, v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f267b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f268d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y f269f;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.et);
    }

    private y getEmojiTextViewHelper() {
        if (this.f269f == null) {
            this.f269f = new y(this);
        }
        return this.f269f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f267b;
        if (qVar != null) {
            qVar.b();
        }
        b1 b1Var = this.f268d;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        t tVar = this.f266a;
        if (tVar != null) {
            tVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f267b;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f267b;
        if (qVar != null) {
            return qVar.f();
        }
        return null;
    }

    @Override // s0.u
    public ColorStateList getSupportButtonTintList() {
        t tVar = this.f266a;
        if (tVar != null) {
            return tVar.f14996b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        t tVar = this.f266a;
        if (tVar != null) {
            return tVar.f14997c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f268d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f268d.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f267b;
        if (qVar != null) {
            qVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q qVar = this.f267b;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        t tVar = this.f266a;
        if (tVar != null) {
            if (tVar.f15000f) {
                tVar.f15000f = false;
            } else {
                tVar.f15000f = true;
                tVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f268d;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f268d;
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
        q qVar = this.f267b;
        if (qVar != null) {
            qVar.n(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f267b;
        if (qVar != null) {
            qVar.o(mode);
        }
    }

    @Override // s0.u
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        t tVar = this.f266a;
        if (tVar != null) {
            tVar.f14996b = colorStateList;
            tVar.f14998d = true;
            tVar.a();
        }
    }

    @Override // s0.u
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        t tVar = this.f266a;
        if (tVar != null) {
            tVar.f14997c = mode;
            tVar.f14999e = true;
            tVar.a();
        }
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        b1 b1Var = this.f268d;
        b1Var.l(colorStateList);
        b1Var.b();
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        b1 b1Var = this.f268d;
        b1Var.m(mode);
        b1Var.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p3.a(context);
        o3.a(getContext(), this);
        t tVar = new t(this, 1);
        this.f266a = tVar;
        tVar.c(attributeSet, i10);
        q qVar = new q(this);
        this.f267b = qVar;
        qVar.h(attributeSet, i10);
        b1 b1Var = new b1(this);
        this.f268d = b1Var;
        b1Var.f(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(p7.q.g(getContext(), i10));
    }
}

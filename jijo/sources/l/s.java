package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class s extends CheckedTextView implements s0.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f14989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f14990b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f14991d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y f14992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f4);
        p3.a(context);
        o3.a(getContext(), this);
        b1 b1Var = new b1(this);
        this.f14991d = b1Var;
        b1Var.f(attributeSet, R.attr.f4);
        b1Var.b();
        q qVar = new q(this);
        this.f14990b = qVar;
        qVar.h(attributeSet, R.attr.f4);
        t tVar = new t(this, 0);
        this.f14989a = tVar;
        tVar.c(attributeSet, R.attr.f4);
        getEmojiTextViewHelper().b(attributeSet, R.attr.f4);
    }

    private y getEmojiTextViewHelper() {
        if (this.f14992f == null) {
            this.f14992f = new y(this);
        }
        return this.f14992f;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b1 b1Var = this.f14991d;
        if (b1Var != null) {
            b1Var.b();
        }
        q qVar = this.f14990b;
        if (qVar != null) {
            qVar.b();
        }
        t tVar = this.f14989a;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g4.z.G(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f14990b;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f14990b;
        if (qVar != null) {
            return qVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        t tVar = this.f14989a;
        if (tVar != null) {
            return tVar.f14996b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        t tVar = this.f14989a;
        if (tVar != null) {
            return tVar.f14997c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14991d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14991d.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        z3.a.R(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f14990b;
        if (qVar != null) {
            qVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q qVar = this.f14990b;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        t tVar = this.f14989a;
        if (tVar != null) {
            if (tVar.f15000f) {
                tVar.f15000f = false;
            } else {
                tVar.f15000f = true;
                tVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f14991d;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f14991d;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g4.z.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f14990b;
        if (qVar != null) {
            qVar.n(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f14990b;
        if (qVar != null) {
            qVar.o(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        t tVar = this.f14989a;
        if (tVar != null) {
            tVar.f14996b = colorStateList;
            tVar.f14998d = true;
            tVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14989a;
        if (tVar != null) {
            tVar.f14997c = mode;
            tVar.f14999e = true;
            tVar.b();
        }
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        b1 b1Var = this.f14991d;
        b1Var.l(colorStateList);
        b1Var.b();
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        b1 b1Var = this.f14991d;
        b1Var.m(mode);
        b1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b1 b1Var = this.f14991d;
        if (b1Var != null) {
            b1Var.g(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(p7.q.g(getContext(), i10));
    }
}

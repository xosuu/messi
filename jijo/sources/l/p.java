package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.gms.internal.ads.ur0;

/* JADX INFO: loaded from: classes.dex */
public class p extends AutoCompleteTextView implements s0.v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f14954f = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f14955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f14956b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.f f14957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, xyz.easypro.httpcustom.R.attr.b0);
        p3.a(context);
        o3.a(getContext(), this);
        ur0 ur0VarK = ur0.K(getContext(), attributeSet, f14954f, xyz.easypro.httpcustom.R.attr.b0);
        if (ur0VarK.H(0)) {
            setDropDownBackgroundDrawable(ur0VarK.y(0));
        }
        ur0VarK.M();
        q qVar = new q(this);
        this.f14955a = qVar;
        qVar.h(attributeSet, xyz.easypro.httpcustom.R.attr.b0);
        b1 b1Var = new b1(this);
        this.f14956b = b1Var;
        b1Var.f(attributeSet, xyz.easypro.httpcustom.R.attr.b0);
        b1Var.b();
        f.f fVar = new f.f((EditText) this);
        this.f14957d = fVar;
        fVar.C(attributeSet, xyz.easypro.httpcustom.R.attr.b0);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerB = fVar.B(keyListener);
            if (keyListenerB == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerB);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f14955a;
        if (qVar != null) {
            qVar.b();
        }
        b1 b1Var = this.f14956b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g4.z.G(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f14955a;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f14955a;
        if (qVar != null) {
            return qVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14956b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14956b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        z3.a.R(this, editorInfo, inputConnectionOnCreateInputConnection);
        return this.f14957d.D(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f14955a;
        if (qVar != null) {
            qVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q qVar = this.f14955a;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f14956b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f14956b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g4.z.J(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(p7.q.g(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        ((d5.e) ((z0.b) this.f14957d.f12833d).f20648c).t(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14957d.B(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f14955a;
        if (qVar != null) {
            qVar.n(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f14955a;
        if (qVar != null) {
            qVar.o(mode);
        }
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        b1 b1Var = this.f14956b;
        b1Var.l(colorStateList);
        b1Var.b();
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        b1 b1Var = this.f14956b;
        b1Var.m(mode);
        b1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b1 b1Var = this.f14956b;
        if (b1Var != null) {
            b1Var.g(context, i10);
        }
    }
}

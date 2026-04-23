package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class r extends Button implements s0.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f14982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f14983b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f14984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p3.a(context);
        o3.a(getContext(), this);
        q qVar = new q(this);
        this.f14982a = qVar;
        qVar.h(attributeSet, i10);
        b1 b1Var = new b1(this);
        this.f14983b = b1Var;
        b1Var.f(attributeSet, i10);
        b1Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private y getEmojiTextViewHelper() {
        if (this.f14984d == null) {
            this.f14984d = new y(this);
        }
        return this.f14984d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f14982a;
        if (qVar != null) {
            qVar.b();
        }
        b1 b1Var = this.f14983b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (e4.f14851b) {
            return super.getAutoSizeMaxTextSize();
        }
        b1 b1Var = this.f14983b;
        if (b1Var != null) {
            return Math.round(b1Var.f14802i.f14901e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (e4.f14851b) {
            return super.getAutoSizeMinTextSize();
        }
        b1 b1Var = this.f14983b;
        if (b1Var != null) {
            return Math.round(b1Var.f14802i.f14900d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (e4.f14851b) {
            return super.getAutoSizeStepGranularity();
        }
        b1 b1Var = this.f14983b;
        if (b1Var != null) {
            return Math.round(b1Var.f14802i.f14899c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (e4.f14851b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b1 b1Var = this.f14983b;
        return b1Var != null ? b1Var.f14802i.f14902f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (e4.f14851b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        b1 b1Var = this.f14983b;
        if (b1Var != null) {
            return b1Var.f14802i.f14897a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g4.z.G(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f14982a;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f14982a;
        if (qVar != null) {
            return qVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14983b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14983b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        b1 b1Var = this.f14983b;
        if (b1Var == null || e4.f14851b) {
            return;
        }
        b1Var.f14802i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b1 b1Var = this.f14983b;
        if (b1Var == null || e4.f14851b) {
            return;
        }
        k1 k1Var = b1Var.f14802i;
        if (k1Var.f()) {
            k1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (e4.f14851b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        b1 b1Var = this.f14983b;
        if (b1Var != null) {
            b1Var.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (e4.f14851b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        b1 b1Var = this.f14983b;
        if (b1Var != null) {
            b1Var.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (e4.f14851b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        b1 b1Var = this.f14983b;
        if (b1Var != null) {
            b1Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f14982a;
        if (qVar != null) {
            qVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q qVar = this.f14982a;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g4.z.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z9) {
        b1 b1Var = this.f14983b;
        if (b1Var != null) {
            b1Var.f14794a.setAllCaps(z9);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f14982a;
        if (qVar != null) {
            qVar.n(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f14982a;
        if (qVar != null) {
            qVar.o(mode);
        }
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        b1 b1Var = this.f14983b;
        b1Var.l(colorStateList);
        b1Var.b();
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        b1 b1Var = this.f14983b;
        b1Var.m(mode);
        b1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b1 b1Var = this.f14983b;
        if (b1Var != null) {
            b1Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z9 = e4.f14851b;
        if (z9) {
            super.setTextSize(i10, f10);
            return;
        }
        b1 b1Var = this.f14983b;
        if (b1Var == null || z9) {
            return;
        }
        k1 k1Var = b1Var.f14802i;
        if (k1Var.f()) {
            return;
        }
        k1Var.g(i10, f10);
    }
}

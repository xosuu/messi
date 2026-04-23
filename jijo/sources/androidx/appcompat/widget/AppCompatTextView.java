package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b7.u;
import com.google.android.gms.internal.ads.fb1;
import g4.z;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l.b1;
import l.c1;
import l.d1;
import l.e4;
import l.k1;
import l.o3;
import l.p3;
import l.q;
import l.t0;
import l.y;
import s0.o;
import s0.p;
import s0.v;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f275b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.f f276d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y f277f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f278h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m2.f f279q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Future f280s;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private y getEmojiTextViewHelper() {
        if (this.f277f == null) {
            this.f277f = new y(this);
        }
        return this.f277f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f274a;
        if (qVar != null) {
            qVar.b();
        }
        b1 b1Var = this.f275b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (e4.f14851b) {
            return super.getAutoSizeMaxTextSize();
        }
        b1 b1Var = this.f275b;
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
        b1 b1Var = this.f275b;
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
        b1 b1Var = this.f275b;
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
        b1 b1Var = this.f275b;
        return b1Var != null ? b1Var.f14802i.f14902f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (e4.f14851b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        b1 b1Var = this.f275b;
        if (b1Var != null) {
            return b1Var.f14802i.f14897a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return z.G(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public c1 getSuperCaller() {
        if (this.f279q == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f279q = new d1(this);
            } else if (i10 >= 26) {
                this.f279q = new m2.f(6, this);
            }
        }
        return this.f279q;
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f274a;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f274a;
        if (qVar != null) {
            return qVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f275b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f275b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        l();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        f.f fVar;
        if (Build.VERSION.SDK_INT >= 28 || (fVar = this.f276d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) fVar.f12833d;
        return textClassifier == null ? t0.a((TextView) fVar.f12832b) : textClassifier;
    }

    public m0.g getTextMetricsParamsCompat() {
        return z.o(this);
    }

    public final void l() {
        Future future = this.f280s;
        if (future == null) {
            return;
        }
        try {
            this.f280s = null;
            fb1.t(future.get());
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            z.o(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f275b.getClass();
        b1.h(this, inputConnectionOnCreateInputConnection, editorInfo);
        z3.a.R(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        b1 b1Var = this.f275b;
        if (b1Var == null || e4.f14851b) {
            return;
        }
        b1Var.f14802i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        l();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b1 b1Var = this.f275b;
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
        b1 b1Var = this.f275b;
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
        b1 b1Var = this.f275b;
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
        b1 b1Var = this.f275b;
        if (b1Var != null) {
            b1Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f274a;
        if (qVar != null) {
            qVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q qVar = this.f274a;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f275b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f275b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f275b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f275b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(z.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i10);
        } else {
            z.y(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i10);
        } else {
            z.z(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        u.b(i10);
        if (i10 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(m0.h hVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        z.o(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f274a;
        if (qVar != null) {
            qVar.n(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f274a;
        if (qVar != null) {
            qVar.o(mode);
        }
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        b1 b1Var = this.f275b;
        b1Var.l(colorStateList);
        b1Var.b();
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        b1 b1Var = this.f275b;
        b1Var.m(mode);
        b1Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b1 b1Var = this.f275b;
        if (b1Var != null) {
            b1Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        f.f fVar;
        if (Build.VERSION.SDK_INT >= 28 || (fVar = this.f276d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            fVar.f12833d = textClassifier;
        }
    }

    public void setTextFuture(Future<m0.h> future) {
        this.f280s = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(m0.g gVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i10 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic2 = gVar.f15386b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i11 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i11 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i11 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i11 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i11 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i11 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i11 = 7;
            }
        }
        o.h(this, i11);
        TextPaint textPaint = gVar.f15385a;
        if (i10 >= 23) {
            getPaint().set(textPaint);
            p.e(this, gVar.f15387c);
            p.h(this, gVar.f15388d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z9 = e4.f14851b;
        if (z9) {
            super.setTextSize(i10, f10);
            return;
        }
        b1 b1Var = this.f275b;
        if (b1Var == null || z9) {
            return;
        }
        k1 k1Var = b1Var.f14802i;
        if (k1Var.f()) {
            return;
        }
        k1Var.g(i10, f10);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.f278h) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            k.q qVar = g0.g.f13608a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.f278h = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f278h = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p3.a(context);
        this.f278h = false;
        this.f279q = null;
        o3.a(getContext(), this);
        q qVar = new q(this);
        this.f274a = qVar;
        qVar.h(attributeSet, i10);
        b1 b1Var = new b1(this);
        this.f275b = b1Var;
        b1Var.f(attributeSet, i10);
        b1Var.b();
        this.f276d = new f.f((TextView) this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? p7.q.g(context, i10) : null, i11 != 0 ? p7.q.g(context, i11) : null, i12 != 0 ? p7.q.g(context, i12) : null, i13 != 0 ? p7.q.g(context, i13) : null);
        b1 b1Var = this.f275b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? p7.q.g(context, i10) : null, i11 != 0 ? p7.q.g(context, i11) : null, i12 != 0 ? p7.q.g(context, i12) : null, i13 != 0 ? p7.q.g(context, i13) : null);
        b1 b1Var = this.f275b;
        if (b1Var != null) {
            b1Var.b();
        }
    }
}

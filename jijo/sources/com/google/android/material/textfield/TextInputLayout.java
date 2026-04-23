package com.google.android.material.textfield;

import a5.d;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.material.internal.CheckableImageButton;
import d0.f;
import d5.e;
import d5.g;
import d5.j;
import g4.a0;
import g4.c;
import g4.z;
import h5.b0;
import h5.i;
import h5.l;
import h5.n;
import h5.o;
import h5.r;
import h5.s;
import h5.u;
import h5.w;
import h5.y;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.r1;
import l.u2;
import l.v;
import l.y2;
import o0.d0;
import o0.e0;
import o0.g0;
import o0.m;
import o0.m0;
import o0.v0;
import p7.q;
import w1.h;
import w1.t;
import x4.b;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int[][] K0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public AppCompatTextView A;
    public int A0;
    public int B;
    public int B0;
    public int C;
    public int C0;
    public CharSequence D;
    public boolean D0;
    public boolean E;
    public final b E0;
    public AppCompatTextView F;
    public boolean F0;
    public ColorStateList G;
    public boolean G0;
    public int H;
    public ValueAnimator H0;
    public h I;
    public boolean I0;
    public h J;
    public boolean J0;
    public ColorStateList K;
    public ColorStateList L;
    public boolean M;
    public CharSequence N;
    public boolean O;
    public g P;
    public g Q;
    public StateListDrawable R;
    public boolean S;
    public g T;
    public g U;
    public j V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f11984a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f11985a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f11986b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f11987b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f11988c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f11989d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f11990d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f11991e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f11992f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f11993f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f11994g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f11995h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f11996h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final Rect f11997i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Rect f11998j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final RectF f11999k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Typeface f12000l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ColorDrawable f12001m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f12002n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final LinkedHashSet f12003o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ColorDrawable f12004p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12005q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f12006q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Drawable f12007r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12008s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ColorStateList f12009s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12010t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ColorStateList f12011t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12012u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f12013u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f12014v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f12015v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12016w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f12017w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12018x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ColorStateList f12019x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12020y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f12021y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b0 f12022z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f12023z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f12024d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f12025f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12024d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f12025f = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f12024d) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            TextUtils.writeToParcel(this.f12024d, parcel, i10);
            parcel.writeInt(this.f12025f ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        ?? r42;
        super(j5.a.a(context, attributeSet, xyz.easypro.httpcustom.R.attr.a5c, xyz.easypro.httpcustom.R.style.vy), attributeSet, xyz.easypro.httpcustom.R.attr.a5c);
        this.f12005q = -1;
        this.f12008s = -1;
        this.f12010t = -1;
        this.f12012u = -1;
        this.f12014v = new s(this);
        this.f12022z = new y();
        this.f11997i0 = new Rect();
        this.f11998j0 = new Rect();
        this.f11999k0 = new RectF();
        this.f12003o0 = new LinkedHashSet();
        b bVar = new b(this);
        this.E0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f11984a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = m4.a.f15740a;
        bVar.Q = linearInterpolator;
        bVar.h(false);
        bVar.P = linearInterpolator;
        bVar.h(false);
        if (bVar.f18404g != 8388659) {
            bVar.f18404g = 8388659;
            bVar.h(false);
        }
        int[] iArr = l4.a.F;
        x4.y.a(context2, attributeSet, xyz.easypro.httpcustom.R.attr.a5c, xyz.easypro.httpcustom.R.style.vy);
        x4.y.b(context2, attributeSet, iArr, xyz.easypro.httpcustom.R.attr.a5c, xyz.easypro.httpcustom.R.style.vy, 22, 20, 38, 43, 47);
        ur0 ur0Var = new ur0(context2, 5, context2.obtainStyledAttributes(attributeSet, iArr, xyz.easypro.httpcustom.R.attr.a5c, xyz.easypro.httpcustom.R.style.vy));
        w wVar = new w(this, ur0Var);
        this.f11986b = wVar;
        this.M = ur0Var.u(46, true);
        setHint(ur0Var.G(4));
        this.G0 = ur0Var.u(45, true);
        this.F0 = ur0Var.u(40, true);
        if (ur0Var.H(6)) {
            setMinEms(ur0Var.B(6, -1));
        } else if (ur0Var.H(3)) {
            setMinWidth(ur0Var.x(3, -1));
        }
        if (ur0Var.H(5)) {
            setMaxEms(ur0Var.B(5, -1));
        } else if (ur0Var.H(2)) {
            setMaxWidth(ur0Var.x(2, -1));
        }
        this.V = j.b(context2, attributeSet, xyz.easypro.httpcustom.R.attr.a5c, xyz.easypro.httpcustom.R.style.vy).a();
        this.f11985a0 = context2.getResources().getDimensionPixelOffset(xyz.easypro.httpcustom.R.dimen.su);
        this.f11988c0 = ur0Var.w(9, 0);
        this.f11991e0 = ur0Var.x(16, context2.getResources().getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.sv));
        this.f11993f0 = ur0Var.x(17, context2.getResources().getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.sw));
        this.f11990d0 = this.f11991e0;
        float dimension = ((TypedArray) ur0Var.f9601d).getDimension(13, -1.0f);
        float dimension2 = ((TypedArray) ur0Var.f9601d).getDimension(12, -1.0f);
        float dimension3 = ((TypedArray) ur0Var.f9601d).getDimension(10, -1.0f);
        float dimension4 = ((TypedArray) ur0Var.f9601d).getDimension(11, -1.0f);
        c cVarE = this.V.e();
        if (dimension >= 0.0f) {
            cVarE.f13700e = new d5.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            cVarE.f13701f = new d5.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            cVarE.f13702g = new d5.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            cVarE.f13703h = new d5.a(dimension4);
        }
        this.V = cVarE.a();
        ColorStateList colorStateListH = tp1.h(context2, ur0Var, 7);
        if (colorStateListH != null) {
            int defaultColor = colorStateListH.getDefaultColor();
            this.f12021y0 = defaultColor;
            this.f11996h0 = defaultColor;
            if (colorStateListH.isStateful()) {
                this.f12023z0 = colorStateListH.getColorForState(new int[]{-16842910}, -1);
                this.A0 = colorStateListH.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.B0 = colorStateListH.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.A0 = this.f12021y0;
                ColorStateList colorStateListC = f.c(context2, xyz.easypro.httpcustom.R.color.r2);
                this.f12023z0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                this.B0 = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f11996h0 = 0;
            this.f12021y0 = 0;
            this.f12023z0 = 0;
            this.A0 = 0;
            this.B0 = 0;
        }
        if (ur0Var.H(1)) {
            ColorStateList colorStateListV = ur0Var.v(1);
            this.f12011t0 = colorStateListV;
            this.f12009s0 = colorStateListV;
        }
        ColorStateList colorStateListH2 = tp1.h(context2, ur0Var, 14);
        this.f12017w0 = ((TypedArray) ur0Var.f9601d).getColor(14, 0);
        this.f12013u0 = f.b(context2, xyz.easypro.httpcustom.R.color.rs);
        this.C0 = f.b(context2, xyz.easypro.httpcustom.R.color.rt);
        this.f12015v0 = f.b(context2, xyz.easypro.httpcustom.R.color.rw);
        if (colorStateListH2 != null) {
            setBoxStrokeColorStateList(colorStateListH2);
        }
        if (ur0Var.H(15)) {
            setBoxStrokeErrorColor(tp1.h(context2, ur0Var, 15));
        }
        if (ur0Var.D(47, -1) != -1) {
            r42 = 0;
            setHintTextAppearance(ur0Var.D(47, 0));
        } else {
            r42 = 0;
        }
        int iD = ur0Var.D(38, r42);
        CharSequence charSequenceG = ur0Var.G(33);
        int iB = ur0Var.B(32, 1);
        boolean zU = ur0Var.u(34, r42);
        int iD2 = ur0Var.D(43, r42);
        boolean zU2 = ur0Var.u(42, r42);
        CharSequence charSequenceG2 = ur0Var.G(41);
        int iD3 = ur0Var.D(55, r42);
        CharSequence charSequenceG3 = ur0Var.G(54);
        boolean zU3 = ur0Var.u(18, r42);
        setCounterMaxLength(ur0Var.B(19, -1));
        this.C = ur0Var.D(22, 0);
        this.B = ur0Var.D(20, 0);
        setBoxBackgroundMode(ur0Var.B(8, 0));
        setErrorContentDescription(charSequenceG);
        setErrorAccessibilityLiveRegion(iB);
        setCounterOverflowTextAppearance(this.B);
        setHelperTextTextAppearance(iD2);
        setErrorTextAppearance(iD);
        setCounterTextAppearance(this.C);
        setPlaceholderText(charSequenceG3);
        setPlaceholderTextAppearance(iD3);
        if (ur0Var.H(39)) {
            setErrorTextColor(ur0Var.v(39));
        }
        if (ur0Var.H(44)) {
            setHelperTextColor(ur0Var.v(44));
        }
        if (ur0Var.H(48)) {
            setHintTextColor(ur0Var.v(48));
        }
        if (ur0Var.H(23)) {
            setCounterTextColor(ur0Var.v(23));
        }
        if (ur0Var.H(21)) {
            setCounterOverflowTextColor(ur0Var.v(21));
        }
        if (ur0Var.H(56)) {
            setPlaceholderTextColor(ur0Var.v(56));
        }
        o oVar = new o(this, ur0Var);
        this.f11989d = oVar;
        boolean zU4 = ur0Var.u(0, true);
        ur0Var.M();
        WeakHashMap weakHashMap = v0.f16075a;
        d0.s(this, 2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 >= 26) {
            m0.l(this, 1);
        }
        frameLayout.addView(wVar);
        frameLayout.addView(oVar);
        addView(frameLayout);
        setEnabled(zU4);
        setHelperTextEnabled(zU2);
        setErrorEnabled(zU);
        setCounterEnabled(zU3);
        setHelperText(charSequenceG2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f11992f;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.P;
        }
        int i10 = a0.i(this.f11992f, xyz.easypro.httpcustom.R.attr.gu);
        int i11 = this.f11987b0;
        int[][] iArr = K0;
        if (i11 != 2) {
            if (i11 != 1) {
                return null;
            }
            g gVar = this.P;
            int i12 = this.f11996h0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{a0.p(0.1f, i10, i12), i12}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.P;
        TypedValue typedValueY = a0.y(xyz.easypro.httpcustom.R.attr.ho, context, "TextInputLayout");
        int i13 = typedValueY.resourceId;
        int iB = i13 != 0 ? f.b(context, i13) : typedValueY.data;
        g gVar3 = new g(gVar2.f12396a.f12375a);
        int iP = a0.p(0.1f, i10, iB);
        gVar3.l(new ColorStateList(iArr, new int[]{iP, 0}));
        gVar3.setTint(iB);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iP, iB});
        g gVar4 = new g(gVar2.f12396a.f12375a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.R == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.R = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.R.addState(new int[0], f(false));
        }
        return this.R;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.Q == null) {
            this.Q = f(true);
        }
        return this.Q;
    }

    public static void k(ViewGroup viewGroup, boolean z9) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z9);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z9);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f11992f != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z9 = editText instanceof TextInputEditText;
        }
        this.f11992f = editText;
        int i10 = this.f12005q;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f12010t);
        }
        int i11 = this.f12008s;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f12012u);
        }
        this.S = false;
        i();
        setTextInputAccessibilityDelegate(new h5.a0(this));
        Typeface typeface = this.f11992f.getTypeface();
        b bVar = this.E0;
        bVar.m(typeface);
        float textSize = this.f11992f.getTextSize();
        if (bVar.f18405h != textSize) {
            bVar.f18405h = textSize;
            bVar.h(false);
        }
        float letterSpacing = this.f11992f.getLetterSpacing();
        if (bVar.W != letterSpacing) {
            bVar.W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f11992f.getGravity();
        int i12 = (gravity & (-113)) | 48;
        if (bVar.f18404g != i12) {
            bVar.f18404g = i12;
            bVar.h(false);
        }
        if (bVar.f18402f != gravity) {
            bVar.f18402f = gravity;
            bVar.h(false);
        }
        this.f11992f.addTextChangedListener(new y2(this, 1));
        if (this.f12009s0 == null) {
            this.f12009s0 = this.f11992f.getHintTextColors();
        }
        if (this.M) {
            if (TextUtils.isEmpty(this.N)) {
                CharSequence hint = this.f11992f.getHint();
                this.f11995h = hint;
                setHint(hint);
                this.f11992f.setHint((CharSequence) null);
            }
            this.O = true;
        }
        if (this.A != null) {
            n(this.f11992f.getText());
        }
        q();
        this.f12014v.b();
        this.f11986b.bringToFront();
        o oVar = this.f11989d;
        oVar.bringToFront();
        Iterator it = this.f12003o0.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(this);
        }
        oVar.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        t(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.N)) {
            return;
        }
        this.N = charSequence;
        b bVar = this.E0;
        if (charSequence == null || !TextUtils.equals(bVar.A, charSequence)) {
            bVar.A = charSequence;
            bVar.B = null;
            Bitmap bitmap = bVar.E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.E = null;
            }
            bVar.h(false);
        }
        if (this.D0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z9) {
        if (this.E == z9) {
            return;
        }
        if (z9) {
            AppCompatTextView appCompatTextView = this.F;
            if (appCompatTextView != null) {
                this.f11984a.addView(appCompatTextView);
                this.F.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.F;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.F = null;
        }
        this.E = z9;
    }

    public final void a(float f10) {
        b bVar = this.E0;
        if (bVar.f18394b == f10) {
            return;
        }
        int i10 = 2;
        if (this.H0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.H0 = valueAnimator;
            valueAnimator.setInterpolator(a0.x(getContext(), xyz.easypro.httpcustom.R.attr.x5, m4.a.f15741b));
            this.H0.setDuration(a0.w(getContext(), xyz.easypro.httpcustom.R.attr.wv, 167));
            this.H0.addUpdateListener(new q4.a(i10, this));
        }
        this.H0.setFloatValues(bVar.f18394b, f10);
        this.H0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f11984a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        s();
        setEditText((EditText) view);
    }

    public final void b() {
        int i10;
        int i11;
        g gVar = this.P;
        if (gVar == null) {
            return;
        }
        j jVar = gVar.f12396a.f12375a;
        j jVar2 = this.V;
        if (jVar != jVar2) {
            gVar.setShapeAppearanceModel(jVar2);
        }
        if (this.f11987b0 == 2 && (i10 = this.f11990d0) > -1 && (i11 = this.f11994g0) != 0) {
            g gVar2 = this.P;
            gVar2.f12396a.f12385k = i10;
            gVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i11);
            d5.f fVar = gVar2.f12396a;
            if (fVar.f12378d != colorStateListValueOf) {
                fVar.f12378d = colorStateListValueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int iB = this.f11996h0;
        if (this.f11987b0 == 1) {
            iB = g0.a.b(this.f11996h0, a0.h(getContext(), xyz.easypro.httpcustom.R.attr.ho, 0));
        }
        this.f11996h0 = iB;
        this.P.l(ColorStateList.valueOf(iB));
        g gVar3 = this.T;
        if (gVar3 != null && this.U != null) {
            if (this.f11990d0 > -1 && this.f11994g0 != 0) {
                gVar3.l(this.f11992f.isFocused() ? ColorStateList.valueOf(this.f12013u0) : ColorStateList.valueOf(this.f11994g0));
                this.U.l(ColorStateList.valueOf(this.f11994g0));
            }
            invalidate();
        }
        r();
    }

    public final int c() {
        float fD;
        if (!this.M) {
            return 0;
        }
        int i10 = this.f11987b0;
        b bVar = this.E0;
        if (i10 == 0) {
            fD = bVar.d();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fD = bVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final h d() {
        h hVar = new h();
        hVar.J = 3;
        hVar.f18126d = a0.w(getContext(), xyz.easypro.httpcustom.R.attr.wx, 87);
        hVar.f18127f = a0.x(getContext(), xyz.easypro.httpcustom.R.attr.x7, m4.a.f15740a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f11992f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f11995h != null) {
            boolean z9 = this.O;
            this.O = false;
            CharSequence hint = editText.getHint();
            this.f11992f.setHint(this.f11995h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f11992f.setHint(hint);
                this.O = z9;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f11984a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f11992f) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.J0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.J0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i10;
        super.draw(canvas);
        boolean z9 = this.M;
        b bVar = this.E0;
        if (z9) {
            bVar.getClass();
            int iSave = canvas.save();
            if (bVar.B != null) {
                RectF rectF = bVar.f18400e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.N;
                    textPaint.setTextSize(bVar.G);
                    float f10 = bVar.f18413p;
                    float f11 = bVar.f18414q;
                    float f12 = bVar.F;
                    if (f12 != 1.0f) {
                        canvas.scale(f12, f12, f10, f11);
                    }
                    if (bVar.f18399d0 <= 1 || bVar.C) {
                        canvas.translate(f10, f11);
                        bVar.Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f18413p - bVar.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f11);
                        float f13 = alpha;
                        textPaint.setAlpha((int) (bVar.f18395b0 * f13));
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31) {
                            float f14 = bVar.H;
                            float f15 = bVar.I;
                            float f16 = bVar.J;
                            int i12 = bVar.K;
                            textPaint.setShadowLayer(f14, f15, f16, g0.a.d(i12, (textPaint.getAlpha() * Color.alpha(i12)) / 255));
                        }
                        bVar.Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f18393a0 * f13));
                        if (i11 >= 31) {
                            float f17 = bVar.H;
                            float f18 = bVar.I;
                            float f19 = bVar.J;
                            int i13 = bVar.K;
                            textPaint.setShadowLayer(f17, f18, f19, g0.a.d(i13, (Color.alpha(i13) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f18397c0;
                        float f20 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, textPaint);
                        if (i11 >= 31) {
                            textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                        }
                        String strTrim = bVar.f18397c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i10 = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i10 = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.Y.getLineEnd(i10), str.length()), 0.0f, f20, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.U == null || (gVar = this.T) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f11992f.isFocused()) {
            Rect bounds = this.U.getBounds();
            Rect bounds2 = this.T.getBounds();
            float f21 = bVar.f18394b;
            int iCenterX = bounds2.centerX();
            bounds.left = m4.a.a(f21, iCenterX, bounds2.left);
            bounds.right = m4.a.a(f21, iCenterX, bounds2.right);
            this.U.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.I0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.I0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            x4.b r3 = r4.E0
            if (r3 == 0) goto L2f
            r3.L = r1
            android.content.res.ColorStateList r1 = r3.f18408k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f18407j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            android.widget.EditText r3 = r4.f11992f
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = o0.v0.f16075a
            boolean r3 = o0.g0.c(r4)
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            r4.t(r0, r2)
        L47:
            r4.q()
            r4.w()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.I0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.M && !TextUtils.isEmpty(this.N) && (this.P instanceof i);
    }

    public final g f(boolean z9) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(xyz.easypro.httpcustom.R.dimen.s8);
        float f10 = z9 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f11992f;
        float popupElevation = editText instanceof u ? ((u) editText).getPopupElevation() : getResources().getDimensionPixelOffset(xyz.easypro.httpcustom.R.dimen.i3);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(xyz.easypro.httpcustom.R.dimen.qi);
        d5.i iVar = new d5.i();
        d5.i iVar2 = new d5.i();
        d5.i iVar3 = new d5.i();
        d5.i iVar4 = new d5.i();
        e eVarL = en1.l();
        e eVarL2 = en1.l();
        e eVarL3 = en1.l();
        e eVarL4 = en1.l();
        d5.a aVar = new d5.a(f10);
        d5.a aVar2 = new d5.a(f10);
        d5.a aVar3 = new d5.a(dimensionPixelOffset);
        d5.a aVar4 = new d5.a(dimensionPixelOffset);
        j jVar = new j();
        jVar.f12411a = iVar;
        jVar.f12412b = iVar2;
        jVar.f12413c = iVar3;
        jVar.f12414d = iVar4;
        jVar.f12415e = aVar;
        jVar.f12416f = aVar2;
        jVar.f12417g = aVar4;
        jVar.f12418h = aVar3;
        jVar.f12419i = eVarL;
        jVar.f12420j = eVarL2;
        jVar.f12421k = eVarL3;
        jVar.f12422l = eVarL4;
        Context context = getContext();
        Paint paint = g.I;
        TypedValue typedValueY = a0.y(xyz.easypro.httpcustom.R.attr.ho, context, g.class.getSimpleName());
        int i10 = typedValueY.resourceId;
        int iB = i10 != 0 ? f.b(context, i10) : typedValueY.data;
        g gVar = new g();
        gVar.j(context);
        gVar.l(ColorStateList.valueOf(iB));
        gVar.k(popupElevation);
        gVar.setShapeAppearanceModel(jVar);
        d5.f fVar = gVar.f12396a;
        if (fVar.f12382h == null) {
            fVar.f12382h = new Rect();
        }
        gVar.f12396a.f12382h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i10, boolean z9) {
        int compoundPaddingLeft = this.f11992f.getCompoundPaddingLeft() + i10;
        return (getPrefixText() == null || z9) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f11992f;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i10 = this.f11987b0;
        if (i10 == 1 || i10 == 2) {
            return this.P;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f11996h0;
    }

    public int getBoxBackgroundMode() {
        return this.f11987b0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f11988c0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zV = en1.v(this);
        RectF rectF = this.f11999k0;
        return zV ? this.V.f12418h.a(rectF) : this.V.f12417g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zV = en1.v(this);
        RectF rectF = this.f11999k0;
        return zV ? this.V.f12417g.a(rectF) : this.V.f12418h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zV = en1.v(this);
        RectF rectF = this.f11999k0;
        return zV ? this.V.f12415e.a(rectF) : this.V.f12416f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zV = en1.v(this);
        RectF rectF = this.f11999k0;
        return zV ? this.V.f12416f.a(rectF) : this.V.f12415e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f12017w0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f12019x0;
    }

    public int getBoxStrokeWidth() {
        return this.f11991e0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f11993f0;
    }

    public int getCounterMaxLength() {
        return this.f12018x;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f12016w && this.f12020y && (appCompatTextView = this.A) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.L;
    }

    public ColorStateList getCounterTextColor() {
        return this.K;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f12009s0;
    }

    public EditText getEditText() {
        return this.f11992f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f11989d.f14051s.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f11989d.f14051s.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f11989d.f14057y;
    }

    public int getEndIconMode() {
        return this.f11989d.f14053u;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f11989d.f14058z;
    }

    public CheckableImageButton getEndIconView() {
        return this.f11989d.f14051s;
    }

    public CharSequence getError() {
        s sVar = this.f12014v;
        if (sVar.f14085q) {
            return sVar.f14084p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f12014v.f14088t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f12014v.f14087s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f12014v.f14086r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f11989d.f14047d.getDrawable();
    }

    public CharSequence getHelperText() {
        s sVar = this.f12014v;
        if (sVar.f14092x) {
            return sVar.f14091w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f12014v.f14093y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.M) {
            return this.N;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.E0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.E0;
        return bVar.e(bVar.f18408k);
    }

    public ColorStateList getHintTextColor() {
        return this.f12011t0;
    }

    public b0 getLengthCounter() {
        return this.f12022z;
    }

    public int getMaxEms() {
        return this.f12008s;
    }

    public int getMaxWidth() {
        return this.f12012u;
    }

    public int getMinEms() {
        return this.f12005q;
    }

    public int getMinWidth() {
        return this.f12010t;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f11989d.f14051s.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f11989d.f14051s.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.E) {
            return this.D;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.H;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.G;
    }

    public CharSequence getPrefixText() {
        return this.f11986b.f14110d;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f11986b.f14109b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f11986b.f14109b;
    }

    public j getShapeAppearanceModel() {
        return this.V;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f11986b.f14111f.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f11986b.f14111f.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f11986b.f14114s;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f11986b.f14115t;
    }

    public CharSequence getSuffixText() {
        return this.f11989d.B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f11989d.C.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f11989d.C;
    }

    public Typeface getTypeface() {
        return this.f12000l0;
    }

    public final int h(int i10, boolean z9) {
        int compoundPaddingRight = i10 - this.f11992f.getCompoundPaddingRight();
        return (getPrefixText() == null || !z9) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final void i() {
        int i10 = this.f11987b0;
        if (i10 == 0) {
            this.P = null;
            this.T = null;
            this.U = null;
        } else if (i10 == 1) {
            this.P = new g(this.V);
            this.T = new g();
            this.U = new g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(l.a0.h(new StringBuilder(), this.f11987b0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.M || (this.P instanceof i)) {
                this.P = new g(this.V);
            } else {
                j jVar = this.V;
                int i11 = i.K;
                this.P = new h5.h(jVar);
            }
            this.T = null;
            this.U = null;
        }
        r();
        w();
        if (this.f11987b0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f11988c0 = getResources().getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.n_);
            } else if (tp1.l(getContext())) {
                this.f11988c0 = getResources().getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.n9);
            }
        }
        if (this.f11992f != null && this.f11987b0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f11992f;
                WeakHashMap weakHashMap = v0.f16075a;
                e0.k(editText, e0.f(editText), getResources().getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.n8), e0.e(this.f11992f), getResources().getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.n7));
            } else if (tp1.l(getContext())) {
                EditText editText2 = this.f11992f;
                WeakHashMap weakHashMap2 = v0.f16075a;
                e0.k(editText2, e0.f(editText2), getResources().getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.n6), e0.e(this.f11992f), getResources().getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.n5));
            }
        }
        if (this.f11987b0 != 0) {
            s();
        }
        EditText editText3 = this.f11992f;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f11987b0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(TextView textView, int i10) {
        try {
            z.B(textView, i10);
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        z.B(textView, xyz.easypro.httpcustom.R.style.kh);
        textView.setTextColor(f.b(getContext(), xyz.easypro.httpcustom.R.color.d0));
    }

    public final boolean m() {
        s sVar = this.f12014v;
        return (sVar.f14083o != 1 || sVar.f14086r == null || TextUtils.isEmpty(sVar.f14084p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((y) this.f12022z).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z9 = this.f12020y;
        int i10 = this.f12018x;
        String string = null;
        if (i10 == -1) {
            this.A.setText(String.valueOf(length));
            this.A.setContentDescription(null);
            this.f12020y = false;
        } else {
            this.f12020y = length > i10;
            Context context = getContext();
            this.A.setContentDescription(context.getString(this.f12020y ? xyz.easypro.httpcustom.R.string.dh : xyz.easypro.httpcustom.R.string.dg, Integer.valueOf(length), Integer.valueOf(this.f12018x)));
            if (z9 != this.f12020y) {
                o();
            }
            m0.b bVarC = m0.b.c();
            AppCompatTextView appCompatTextView = this.A;
            String string2 = getContext().getString(xyz.easypro.httpcustom.R.string.di, Integer.valueOf(length), Integer.valueOf(this.f12018x));
            if (string2 == null) {
                bVarC.getClass();
            } else {
                string = bVarC.d(string2, bVarC.f15383c).toString();
            }
            appCompatTextView.setText(string);
        }
        if (this.f11992f == null || z9 == this.f12020y) {
            return;
        }
        t(false, false);
        w();
        q();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.A;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.f12020y ? this.B : this.C);
            if (!this.f12020y && (colorStateList2 = this.K) != null) {
                this.A.setTextColor(colorStateList2);
            }
            if (!this.f12020y || (colorStateList = this.L) == null) {
                return;
            }
            this.A.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.E0.g(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        EditText editText = this.f11992f;
        if (editText != null) {
            ThreadLocal threadLocal = x4.c.f18424a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f11997i0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = x4.c.f18424a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            x4.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = x4.c.f18425b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.T;
            if (gVar != null) {
                int i14 = rect.bottom;
                gVar.setBounds(rect.left, i14 - this.f11991e0, rect.right, i14);
            }
            g gVar2 = this.U;
            if (gVar2 != null) {
                int i15 = rect.bottom;
                gVar2.setBounds(rect.left, i15 - this.f11993f0, rect.right, i15);
            }
            if (this.M) {
                float textSize = this.f11992f.getTextSize();
                b bVar = this.E0;
                if (bVar.f18405h != textSize) {
                    bVar.f18405h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f11992f.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (bVar.f18404g != i16) {
                    bVar.f18404g = i16;
                    bVar.h(false);
                }
                if (bVar.f18402f != gravity) {
                    bVar.f18402f = gravity;
                    bVar.h(false);
                }
                if (this.f11992f == null) {
                    throw new IllegalStateException();
                }
                boolean zV = en1.v(this);
                int i17 = rect.bottom;
                Rect rect2 = this.f11998j0;
                rect2.bottom = i17;
                int i18 = this.f11987b0;
                if (i18 == 1) {
                    rect2.left = g(rect.left, zV);
                    rect2.top = rect.top + this.f11988c0;
                    rect2.right = h(rect.right, zV);
                } else if (i18 != 2) {
                    rect2.left = g(rect.left, zV);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zV);
                } else {
                    rect2.left = this.f11992f.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f11992f.getPaddingRight();
                }
                int i19 = rect2.left;
                int i20 = rect2.top;
                int i21 = rect2.right;
                int i22 = rect2.bottom;
                Rect rect3 = bVar.f18398d;
                if (rect3.left != i19 || rect3.top != i20 || rect3.right != i21 || rect3.bottom != i22) {
                    rect3.set(i19, i20, i21, i22);
                    bVar.M = true;
                }
                if (this.f11992f == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.O;
                textPaint.setTextSize(bVar.f18405h);
                textPaint.setTypeface(bVar.f18418u);
                textPaint.setLetterSpacing(bVar.W);
                float f10 = -textPaint.ascent();
                rect2.left = this.f11992f.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f11987b0 != 1 || this.f11992f.getMinLines() > 1) ? rect.top + this.f11992f.getCompoundPaddingTop() : (int) (rect.centerY() - (f10 / 2.0f));
                rect2.right = rect.right - this.f11992f.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f11987b0 != 1 || this.f11992f.getMinLines() > 1) ? rect.bottom - this.f11992f.getCompoundPaddingBottom() : (int) (rect2.top + f10);
                rect2.bottom = compoundPaddingBottom;
                int i23 = rect2.left;
                int i24 = rect2.top;
                int i25 = rect2.right;
                Rect rect4 = bVar.f18396c;
                if (rect4.left != i23 || rect4.top != i24 || rect4.right != i25 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i23, i24, i25, compoundPaddingBottom);
                    bVar.M = true;
                }
                bVar.h(false);
                if (!e() || this.D0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        EditText editText;
        int iMax;
        super.onMeasure(i10, i11);
        EditText editText2 = this.f11992f;
        int i12 = 1;
        o oVar = this.f11989d;
        boolean z9 = false;
        if (editText2 != null && this.f11992f.getMeasuredHeight() < (iMax = Math.max(oVar.getMeasuredHeight(), this.f11986b.getMeasuredHeight()))) {
            this.f11992f.setMinimumHeight(iMax);
            z9 = true;
        }
        boolean zP = p();
        if (z9 || zP) {
            this.f11992f.post(new h5.z(this, i12));
        }
        if (this.F != null && (editText = this.f11992f) != null) {
            this.F.setGravity(editText.getGravity());
            this.F.setPadding(this.f11992f.getCompoundPaddingLeft(), this.f11992f.getCompoundPaddingTop(), this.f11992f.getCompoundPaddingRight(), this.f11992f.getCompoundPaddingBottom());
        }
        oVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f570a);
        setError(savedState.f12024d);
        if (savedState.f12025f) {
            post(new h5.z(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z9 = i10 == 1;
        if (z9 != this.W) {
            d5.c cVar = this.V.f12415e;
            RectF rectF = this.f11999k0;
            float fA = cVar.a(rectF);
            float fA2 = this.V.f12416f.a(rectF);
            float fA3 = this.V.f12418h.a(rectF);
            float fA4 = this.V.f12417g.a(rectF);
            j jVar = this.V;
            b4.f fVar = jVar.f12411a;
            b4.f fVar2 = jVar.f12412b;
            b4.f fVar3 = jVar.f12414d;
            b4.f fVar4 = jVar.f12413c;
            e eVarL = en1.l();
            e eVarL2 = en1.l();
            e eVarL3 = en1.l();
            e eVarL4 = en1.l();
            c.b(fVar2);
            c.b(fVar);
            c.b(fVar4);
            c.b(fVar3);
            d5.a aVar = new d5.a(fA2);
            d5.a aVar2 = new d5.a(fA);
            d5.a aVar3 = new d5.a(fA4);
            d5.a aVar4 = new d5.a(fA3);
            j jVar2 = new j();
            jVar2.f12411a = fVar2;
            jVar2.f12412b = fVar;
            jVar2.f12413c = fVar3;
            jVar2.f12414d = fVar4;
            jVar2.f12415e = aVar;
            jVar2.f12416f = aVar2;
            jVar2.f12417g = aVar4;
            jVar2.f12418h = aVar3;
            jVar2.f12419i = eVarL;
            jVar2.f12420j = eVarL2;
            jVar2.f12421k = eVarL3;
            jVar2.f12422l = eVarL4;
            this.W = z9;
            setShapeAppearanceModel(jVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m()) {
            savedState.f12024d = getError();
        }
        o oVar = this.f11989d;
        savedState.f12025f = oVar.f14053u != 0 && oVar.f14051s.isChecked();
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p() {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        PorterDuffColorFilter porterDuffColorFilterH;
        EditText editText = this.f11992f;
        if (editText == null || this.f11987b0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = r1.f14985a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = v.f15029b;
            synchronized (v.class) {
                porterDuffColorFilterH = u2.h(errorCurrentTextColors, mode);
            }
            drawableMutate.setColorFilter(porterDuffColorFilterH);
            return;
        }
        if (this.f12020y && (appCompatTextView = this.A) != null) {
            drawableMutate.setColorFilter(v.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            z.a(drawableMutate);
            this.f11992f.refreshDrawableState();
        }
    }

    public final void r() {
        EditText editText = this.f11992f;
        if (editText == null || this.P == null) {
            return;
        }
        if ((this.S || editText.getBackground() == null) && this.f11987b0 != 0) {
            EditText editText2 = this.f11992f;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap weakHashMap = v0.f16075a;
            d0.q(editText2, editTextBoxBackground);
            this.S = true;
        }
    }

    public final void s() {
        if (this.f11987b0 != 1) {
            FrameLayout frameLayout = this.f11984a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f11996h0 != i10) {
            this.f11996h0 = i10;
            this.f12021y0 = i10;
            this.A0 = i10;
            this.B0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(f.b(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f12021y0 = defaultColor;
        this.f11996h0 = defaultColor;
        this.f12023z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.A0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.B0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f11987b0) {
            return;
        }
        this.f11987b0 = i10;
        if (this.f11992f != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f11988c0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        c cVarE = this.V.e();
        d5.c cVar = this.V.f12415e;
        b4.f fVarJ = en1.j(i10);
        cVarE.f13696a = fVarJ;
        c.b(fVarJ);
        cVarE.f13700e = cVar;
        d5.c cVar2 = this.V.f12416f;
        b4.f fVarJ2 = en1.j(i10);
        cVarE.f13697b = fVarJ2;
        c.b(fVarJ2);
        cVarE.f13701f = cVar2;
        d5.c cVar3 = this.V.f12418h;
        b4.f fVarJ3 = en1.j(i10);
        cVarE.f13699d = fVarJ3;
        c.b(fVarJ3);
        cVarE.f13703h = cVar3;
        d5.c cVar4 = this.V.f12417g;
        b4.f fVarJ4 = en1.j(i10);
        cVarE.f13698c = fVarJ4;
        c.b(fVarJ4);
        cVarE.f13702g = cVar4;
        this.V = cVarE.a();
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f12017w0 != i10) {
            this.f12017w0 = i10;
            w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f12013u0 = colorStateList.getDefaultColor();
            this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f12015v0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f12017w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f12017w0 != colorStateList.getDefaultColor()) {
            this.f12017w0 = colorStateList.getDefaultColor();
        }
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f12019x0 != colorStateList) {
            this.f12019x0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f11991e0 = i10;
        w();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f11993f0 = i10;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z9) {
        if (this.f12016w != z9) {
            s sVar = this.f12014v;
            if (z9) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.A = appCompatTextView;
                appCompatTextView.setId(xyz.easypro.httpcustom.R.id.wg);
                Typeface typeface = this.f12000l0;
                if (typeface != null) {
                    this.A.setTypeface(typeface);
                }
                this.A.setMaxLines(1);
                sVar.a(this.A, 2);
                m.h((ViewGroup.MarginLayoutParams) this.A.getLayoutParams(), getResources().getDimensionPixelOffset(xyz.easypro.httpcustom.R.dimen.sx));
                o();
                if (this.A != null) {
                    EditText editText = this.f11992f;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                sVar.g(this.A, 2);
                this.A = null;
            }
            this.f12016w = z9;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f12018x != i10) {
            if (i10 > 0) {
                this.f12018x = i10;
            } else {
                this.f12018x = -1;
            }
            if (!this.f12016w || this.A == null) {
                return;
            }
            EditText editText = this.f11992f;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.B != i10) {
            this.B = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.C != i10) {
            this.C = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f12009s0 = colorStateList;
        this.f12011t0 = colorStateList;
        if (this.f11992f != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        k(this, z9);
        super.setEnabled(z9);
    }

    public void setEndIconActivated(boolean z9) {
        this.f11989d.f14051s.setActivated(z9);
    }

    public void setEndIconCheckable(boolean z9) {
        this.f11989d.f14051s.setCheckable(z9);
    }

    public void setEndIconContentDescription(int i10) {
        o oVar = this.f11989d;
        CharSequence text = i10 != 0 ? oVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = oVar.f14051s;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        o oVar = this.f11989d;
        Drawable drawableG = i10 != 0 ? q.g(oVar.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = oVar.f14051s;
        checkableImageButton.setImageDrawable(drawableG);
        if (drawableG != null) {
            ColorStateList colorStateList = oVar.f14055w;
            PorterDuff.Mode mode = oVar.f14056x;
            TextInputLayout textInputLayout = oVar.f14045a;
            en1.b(textInputLayout, checkableImageButton, colorStateList, mode);
            en1.B(textInputLayout, checkableImageButton, oVar.f14055w);
        }
    }

    public void setEndIconMinSize(int i10) {
        o oVar = this.f11989d;
        if (i10 < 0) {
            oVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != oVar.f14057y) {
            oVar.f14057y = i10;
            CheckableImageButton checkableImageButton = oVar.f14051s;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = oVar.f14047d;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f11989d.f(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        o oVar = this.f11989d;
        View.OnLongClickListener onLongClickListener = oVar.A;
        CheckableImageButton checkableImageButton = oVar.f14051s;
        checkableImageButton.setOnClickListener(onClickListener);
        en1.G(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o oVar = this.f11989d;
        oVar.A = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f14051s;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        en1.G(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        o oVar = this.f11989d;
        oVar.f14058z = scaleType;
        oVar.f14051s.setScaleType(scaleType);
        oVar.f14047d.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        o oVar = this.f11989d;
        if (oVar.f14055w != colorStateList) {
            oVar.f14055w = colorStateList;
            en1.b(oVar.f14045a, oVar.f14051s, colorStateList, oVar.f14056x);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        o oVar = this.f11989d;
        if (oVar.f14056x != mode) {
            oVar.f14056x = mode;
            en1.b(oVar.f14045a, oVar.f14051s, oVar.f14055w, mode);
        }
    }

    public void setEndIconVisible(boolean z9) {
        this.f11989d.g(z9);
    }

    public void setError(CharSequence charSequence) {
        s sVar = this.f12014v;
        if (!sVar.f14085q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            sVar.f();
            return;
        }
        sVar.c();
        sVar.f14084p = charSequence;
        sVar.f14086r.setText(charSequence);
        int i10 = sVar.f14082n;
        if (i10 != 1) {
            sVar.f14083o = 1;
        }
        sVar.i(i10, sVar.f14083o, sVar.h(sVar.f14086r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        s sVar = this.f12014v;
        sVar.f14088t = i10;
        AppCompatTextView appCompatTextView = sVar.f14086r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = v0.f16075a;
            g0.f(appCompatTextView, i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        s sVar = this.f12014v;
        sVar.f14087s = charSequence;
        AppCompatTextView appCompatTextView = sVar.f14086r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z9) {
        s sVar = this.f12014v;
        if (sVar.f14085q == z9) {
            return;
        }
        sVar.c();
        TextInputLayout textInputLayout = sVar.f14076h;
        if (z9) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(sVar.f14075g, null);
            sVar.f14086r = appCompatTextView;
            appCompatTextView.setId(xyz.easypro.httpcustom.R.id.wh);
            sVar.f14086r.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f14086r.setTypeface(typeface);
            }
            int i10 = sVar.f14089u;
            sVar.f14089u = i10;
            AppCompatTextView appCompatTextView2 = sVar.f14086r;
            if (appCompatTextView2 != null) {
                textInputLayout.l(appCompatTextView2, i10);
            }
            ColorStateList colorStateList = sVar.f14090v;
            sVar.f14090v = colorStateList;
            AppCompatTextView appCompatTextView3 = sVar.f14086r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = sVar.f14087s;
            sVar.f14087s = charSequence;
            AppCompatTextView appCompatTextView4 = sVar.f14086r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i11 = sVar.f14088t;
            sVar.f14088t = i11;
            AppCompatTextView appCompatTextView5 = sVar.f14086r;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = v0.f16075a;
                g0.f(appCompatTextView5, i11);
            }
            sVar.f14086r.setVisibility(4);
            sVar.a(sVar.f14086r, 0);
        } else {
            sVar.f();
            sVar.g(sVar.f14086r, 0);
            sVar.f14086r = null;
            textInputLayout.q();
            textInputLayout.w();
        }
        sVar.f14085q = z9;
    }

    public void setErrorIconDrawable(int i10) {
        o oVar = this.f11989d;
        oVar.h(i10 != 0 ? q.g(oVar.getContext(), i10) : null);
        en1.B(oVar.f14045a, oVar.f14047d, oVar.f14048f);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        o oVar = this.f11989d;
        CheckableImageButton checkableImageButton = oVar.f14047d;
        View.OnLongClickListener onLongClickListener = oVar.f14050q;
        checkableImageButton.setOnClickListener(onClickListener);
        en1.G(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o oVar = this.f11989d;
        oVar.f14050q = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f14047d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        en1.G(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        o oVar = this.f11989d;
        if (oVar.f14048f != colorStateList) {
            oVar.f14048f = colorStateList;
            en1.b(oVar.f14045a, oVar.f14047d, colorStateList, oVar.f14049h);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        o oVar = this.f11989d;
        if (oVar.f14049h != mode) {
            oVar.f14049h = mode;
            en1.b(oVar.f14045a, oVar.f14047d, oVar.f14048f, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        s sVar = this.f12014v;
        sVar.f14089u = i10;
        AppCompatTextView appCompatTextView = sVar.f14086r;
        if (appCompatTextView != null) {
            sVar.f14076h.l(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        s sVar = this.f12014v;
        sVar.f14090v = colorStateList;
        AppCompatTextView appCompatTextView = sVar.f14086r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z9) {
        if (this.F0 != z9) {
            this.F0 = z9;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        s sVar = this.f12014v;
        if (zIsEmpty) {
            if (sVar.f14092x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sVar.f14092x) {
            setHelperTextEnabled(true);
        }
        sVar.c();
        sVar.f14091w = charSequence;
        sVar.f14093y.setText(charSequence);
        int i10 = sVar.f14082n;
        if (i10 != 2) {
            sVar.f14083o = 2;
        }
        sVar.i(i10, sVar.f14083o, sVar.h(sVar.f14093y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        s sVar = this.f12014v;
        sVar.A = colorStateList;
        AppCompatTextView appCompatTextView = sVar.f14093y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z9) {
        s sVar = this.f12014v;
        if (sVar.f14092x == z9) {
            return;
        }
        sVar.c();
        if (z9) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(sVar.f14075g, null);
            sVar.f14093y = appCompatTextView;
            appCompatTextView.setId(xyz.easypro.httpcustom.R.id.wi);
            sVar.f14093y.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f14093y.setTypeface(typeface);
            }
            sVar.f14093y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = sVar.f14093y;
            WeakHashMap weakHashMap = v0.f16075a;
            g0.f(appCompatTextView2, 1);
            int i10 = sVar.f14094z;
            sVar.f14094z = i10;
            AppCompatTextView appCompatTextView3 = sVar.f14093y;
            if (appCompatTextView3 != null) {
                z.B(appCompatTextView3, i10);
            }
            ColorStateList colorStateList = sVar.A;
            sVar.A = colorStateList;
            AppCompatTextView appCompatTextView4 = sVar.f14093y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            sVar.a(sVar.f14093y, 1);
            sVar.f14093y.setAccessibilityDelegate(new r(sVar));
        } else {
            sVar.c();
            int i11 = sVar.f14082n;
            if (i11 == 2) {
                sVar.f14083o = 0;
            }
            sVar.i(i11, sVar.f14083o, sVar.h(sVar.f14093y, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            sVar.g(sVar.f14093y, 1);
            sVar.f14093y = null;
            TextInputLayout textInputLayout = sVar.f14076h;
            textInputLayout.q();
            textInputLayout.w();
        }
        sVar.f14092x = z9;
    }

    public void setHelperTextTextAppearance(int i10) {
        s sVar = this.f12014v;
        sVar.f14094z = i10;
        AppCompatTextView appCompatTextView = sVar.f14093y;
        if (appCompatTextView != null) {
            z.B(appCompatTextView, i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.M) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z9) {
        this.G0 = z9;
    }

    public void setHintEnabled(boolean z9) {
        if (z9 != this.M) {
            this.M = z9;
            if (z9) {
                CharSequence hint = this.f11992f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.N)) {
                        setHint(hint);
                    }
                    this.f11992f.setHint((CharSequence) null);
                }
                this.O = true;
            } else {
                this.O = false;
                if (!TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.f11992f.getHint())) {
                    this.f11992f.setHint(this.N);
                }
                setHintInternal(null);
            }
            if (this.f11992f != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        b bVar = this.E0;
        View view = bVar.f18392a;
        d dVar = new d(view.getContext(), i10);
        ColorStateList colorStateList = dVar.f38j;
        if (colorStateList != null) {
            bVar.f18408k = colorStateList;
        }
        float f10 = dVar.f39k;
        if (f10 != 0.0f) {
            bVar.f18406i = f10;
        }
        ColorStateList colorStateList2 = dVar.f29a;
        if (colorStateList2 != null) {
            bVar.U = colorStateList2;
        }
        bVar.S = dVar.f33e;
        bVar.T = dVar.f34f;
        bVar.R = dVar.f35g;
        bVar.V = dVar.f37i;
        a5.a aVar = bVar.f18422y;
        if (aVar != null) {
            aVar.f22f = true;
        }
        x4.a aVar2 = new x4.a(0, bVar);
        dVar.a();
        bVar.f18422y = new a5.a(aVar2, dVar.f42n);
        dVar.c(view.getContext(), bVar.f18422y);
        bVar.h(false);
        this.f12011t0 = bVar.f18408k;
        if (this.f11992f != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f12011t0 != colorStateList) {
            if (this.f12009s0 == null) {
                b bVar = this.E0;
                if (bVar.f18408k != colorStateList) {
                    bVar.f18408k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f12011t0 = colorStateList;
            if (this.f11992f != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(b0 b0Var) {
        this.f12022z = b0Var;
    }

    public void setMaxEms(int i10) {
        this.f12008s = i10;
        EditText editText = this.f11992f;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f12012u = i10;
        EditText editText = this.f11992f;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f12005q = i10;
        EditText editText = this.f11992f;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f12010t = i10;
        EditText editText = this.f11992f;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        o oVar = this.f11989d;
        oVar.f14051s.setContentDescription(i10 != 0 ? oVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        o oVar = this.f11989d;
        oVar.f14051s.setImageDrawable(i10 != 0 ? q.g(oVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z9) {
        o oVar = this.f11989d;
        if (z9 && oVar.f14053u != 1) {
            oVar.f(1);
        } else if (z9) {
            oVar.getClass();
        } else {
            oVar.f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        o oVar = this.f11989d;
        oVar.f14055w = colorStateList;
        en1.b(oVar.f14045a, oVar.f14051s, colorStateList, oVar.f14056x);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        o oVar = this.f11989d;
        oVar.f14056x = mode;
        en1.b(oVar.f14045a, oVar.f14051s, oVar.f14055w, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.F == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.F = appCompatTextView;
            appCompatTextView.setId(xyz.easypro.httpcustom.R.id.wj);
            AppCompatTextView appCompatTextView2 = this.F;
            WeakHashMap weakHashMap = v0.f16075a;
            d0.s(appCompatTextView2, 2);
            h hVarD = d();
            this.I = hVarD;
            hVarD.f18125b = 67L;
            this.J = d();
            setPlaceholderTextAppearance(this.H);
            setPlaceholderTextColor(this.G);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.E) {
                setPlaceholderTextEnabled(true);
            }
            this.D = charSequence;
        }
        EditText editText = this.f11992f;
        u(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.H = i10;
        AppCompatTextView appCompatTextView = this.F;
        if (appCompatTextView != null) {
            z.B(appCompatTextView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            AppCompatTextView appCompatTextView = this.F;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        w wVar = this.f11986b;
        wVar.getClass();
        wVar.f14110d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        wVar.f14109b.setText(charSequence);
        wVar.d();
    }

    public void setPrefixTextAppearance(int i10) {
        z.B(this.f11986b.f14109b, i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f11986b.f14109b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(j jVar) {
        g gVar = this.P;
        if (gVar == null || gVar.f12396a.f12375a == jVar) {
            return;
        }
        this.V = jVar;
        b();
    }

    public void setStartIconCheckable(boolean z9) {
        this.f11986b.f14111f.setCheckable(z9);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f11986b.f14111f;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? q.g(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        w wVar = this.f11986b;
        if (i10 < 0) {
            wVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != wVar.f14114s) {
            wVar.f14114s = i10;
            CheckableImageButton checkableImageButton = wVar.f14111f;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        w wVar = this.f11986b;
        View.OnLongClickListener onLongClickListener = wVar.f14116u;
        CheckableImageButton checkableImageButton = wVar.f14111f;
        checkableImageButton.setOnClickListener(onClickListener);
        en1.G(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        w wVar = this.f11986b;
        wVar.f14116u = onLongClickListener;
        CheckableImageButton checkableImageButton = wVar.f14111f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        en1.G(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        w wVar = this.f11986b;
        wVar.f14115t = scaleType;
        wVar.f14111f.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        w wVar = this.f11986b;
        if (wVar.f14112h != colorStateList) {
            wVar.f14112h = colorStateList;
            en1.b(wVar.f14108a, wVar.f14111f, colorStateList, wVar.f14113q);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        w wVar = this.f11986b;
        if (wVar.f14113q != mode) {
            wVar.f14113q = mode;
            en1.b(wVar.f14108a, wVar.f14111f, wVar.f14112h, mode);
        }
    }

    public void setStartIconVisible(boolean z9) {
        this.f11986b.b(z9);
    }

    public void setSuffixText(CharSequence charSequence) {
        o oVar = this.f11989d;
        oVar.getClass();
        oVar.B = TextUtils.isEmpty(charSequence) ? null : charSequence;
        oVar.C.setText(charSequence);
        oVar.m();
    }

    public void setSuffixTextAppearance(int i10) {
        z.B(this.f11989d.C, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f11989d.C.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(h5.a0 a0Var) {
        EditText editText = this.f11992f;
        if (editText != null) {
            v0.q(editText, a0Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f12000l0) {
            this.f12000l0 = typeface;
            this.E0.m(typeface);
            s sVar = this.f12014v;
            if (typeface != sVar.B) {
                sVar.B = typeface;
                AppCompatTextView appCompatTextView = sVar.f14086r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = sVar.f14093y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.A;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z9, boolean z10) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f11992f;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f11992f;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f12009s0;
        b bVar = this.E0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f12009s0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.C0) : this.C0));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.f12014v.f14086r;
            bVar.i(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f12020y && (appCompatTextView = this.A) != null) {
            bVar.i(appCompatTextView.getTextColors());
        } else if (z12 && (colorStateList = this.f12011t0) != null && bVar.f18408k != colorStateList) {
            bVar.f18408k = colorStateList;
            bVar.h(false);
        }
        o oVar = this.f11989d;
        w wVar = this.f11986b;
        if (z11 || !this.F0 || (isEnabled() && z12)) {
            if (z10 || this.D0) {
                ValueAnimator valueAnimator = this.H0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.H0.cancel();
                }
                if (z9 && this.G0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.D0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f11992f;
                u(editText3 != null ? editText3.getText() : null);
                wVar.f14117v = false;
                wVar.d();
                oVar.D = false;
                oVar.m();
                return;
            }
            return;
        }
        if (z10 || !this.D0) {
            ValueAnimator valueAnimator2 = this.H0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.H0.cancel();
            }
            if (z9 && this.G0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && (!((i) this.P).J.isEmpty()) && e()) {
                ((i) this.P).p(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.D0 = true;
            AppCompatTextView appCompatTextView3 = this.F;
            if (appCompatTextView3 != null && this.E) {
                appCompatTextView3.setText((CharSequence) null);
                t.a(this.f11984a, this.J);
                this.F.setVisibility(4);
            }
            wVar.f14117v = true;
            wVar.d();
            oVar.D = true;
            oVar.m();
        }
    }

    public final void u(Editable editable) {
        ((y) this.f12022z).getClass();
        FrameLayout frameLayout = this.f11984a;
        if ((editable != null && editable.length() != 0) || this.D0) {
            AppCompatTextView appCompatTextView = this.F;
            if (appCompatTextView == null || !this.E) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            t.a(frameLayout, this.J);
            this.F.setVisibility(4);
            return;
        }
        if (this.F == null || !this.E || TextUtils.isEmpty(this.D)) {
            return;
        }
        this.F.setText(this.D);
        t.a(frameLayout, this.I);
        this.F.setVisibility(0);
        this.F.bringToFront();
        announceForAccessibility(this.D);
    }

    public final void v(boolean z9, boolean z10) {
        int defaultColor = this.f12019x0.getDefaultColor();
        int colorForState = this.f12019x0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f12019x0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z9) {
            this.f11994g0 = colorForState2;
        } else if (z10) {
            this.f11994g0 = colorForState;
        } else {
            this.f11994g0 = defaultColor;
        }
    }

    public final void w() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.P == null || this.f11987b0 == 0) {
            return;
        }
        boolean z9 = false;
        boolean z10 = isFocused() || ((editText2 = this.f11992f) != null && editText2.hasFocus());
        boolean z11 = isHovered() || ((editText = this.f11992f) != null && editText.isHovered());
        if (m() || (this.A != null && this.f12020y)) {
            z9 = true;
        }
        if (!isEnabled()) {
            this.f11994g0 = this.C0;
        } else if (m()) {
            if (this.f12019x0 != null) {
                v(z10, z11);
            } else {
                this.f11994g0 = getErrorCurrentTextColors();
            }
        } else if (!this.f12020y || (appCompatTextView = this.A) == null) {
            if (z10) {
                this.f11994g0 = this.f12017w0;
            } else if (z11) {
                this.f11994g0 = this.f12015v0;
            } else {
                this.f11994g0 = this.f12013u0;
            }
        } else if (this.f12019x0 != null) {
            v(z10, z11);
        } else {
            this.f11994g0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Context context = getContext();
            TypedValue typedValueU = a0.u(context, xyz.easypro.httpcustom.R.attr.gt);
            ColorStateList colorStateListValueOf = null;
            if (typedValueU != null) {
                int i10 = typedValueU.resourceId;
                if (i10 != 0) {
                    colorStateListValueOf = f.c(context, i10);
                } else {
                    int i11 = typedValueU.data;
                    if (i11 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i11);
                    }
                }
            }
            EditText editText3 = this.f11992f;
            if (editText3 != null && editText3.getTextCursorDrawable() != null && colorStateListValueOf != null) {
                Drawable textCursorDrawable = this.f11992f.getTextCursorDrawable();
                if (z9) {
                    ColorStateList colorStateListValueOf2 = this.f12019x0;
                    if (colorStateListValueOf2 == null) {
                        colorStateListValueOf2 = ColorStateList.valueOf(this.f11994g0);
                    }
                    colorStateListValueOf = colorStateListValueOf2;
                }
                h0.b.h(textCursorDrawable, colorStateListValueOf);
            }
        }
        o oVar = this.f11989d;
        oVar.k();
        CheckableImageButton checkableImageButton = oVar.f14047d;
        ColorStateList colorStateList = oVar.f14048f;
        TextInputLayout textInputLayout = oVar.f14045a;
        en1.B(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = oVar.f14055w;
        CheckableImageButton checkableImageButton2 = oVar.f14051s;
        en1.B(textInputLayout, checkableImageButton2, colorStateList2);
        if (oVar.b() instanceof l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                en1.b(textInputLayout, checkableImageButton2, oVar.f14055w, oVar.f14056x);
            } else {
                Drawable drawableMutate = z.I(checkableImageButton2.getDrawable()).mutate();
                h0.b.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        w wVar = this.f11986b;
        en1.B(wVar.f14108a, wVar.f14111f, wVar.f14112h);
        if (this.f11987b0 == 2) {
            int i12 = this.f11990d0;
            if (z10 && isEnabled()) {
                this.f11990d0 = this.f11993f0;
            } else {
                this.f11990d0 = this.f11991e0;
            }
            if (this.f11990d0 != i12 && e() && !this.D0) {
                if (e()) {
                    ((i) this.P).p(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f11987b0 == 1) {
            if (!isEnabled()) {
                this.f11996h0 = this.f12023z0;
            } else if (z11 && !z10) {
                this.f11996h0 = this.B0;
            } else if (z10) {
                this.f11996h0 = this.A0;
            } else {
                this.f11996h0 = this.f12021y0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f11986b.a(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f11989d.f14051s.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f11989d.f14051s.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f11989d.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f11989d.f14051s;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        o oVar = this.f11989d;
        CheckableImageButton checkableImageButton = oVar.f14051s;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = oVar.f14055w;
            PorterDuff.Mode mode = oVar.f14056x;
            TextInputLayout textInputLayout = oVar.f14045a;
            en1.b(textInputLayout, checkableImageButton, colorStateList, mode);
            en1.B(textInputLayout, checkableImageButton, oVar.f14055w);
        }
    }
}

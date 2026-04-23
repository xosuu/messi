package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.ur0;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f14794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q3 f14795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q3 f14796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q3 f14797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q3 f14798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q3 f14799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q3 f14800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q3 f14801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f14802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14803j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14804k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f14805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14806m;

    public b1(TextView textView) {
        this.f14794a = textView;
        this.f14802i = new k1(textView);
    }

    public static q3 c(Context context, v vVar, int i10) {
        ColorStateList colorStateListI;
        synchronized (vVar) {
            colorStateListI = vVar.f15031a.i(context, i10);
        }
        if (colorStateListI == null) {
            return null;
        }
        q3 q3Var = new q3(0);
        q3Var.f14979b = true;
        q3Var.f14980c = colorStateListI;
        return q3Var;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i10 >= 30) {
            r0.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i10 >= 30) {
            r0.a.a(editorInfo, text);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = text.length();
        if (i13 < 0 || i11 > length) {
            r0.b.a(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            r0.b.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            r0.b.a(editorInfo, text, i13, i11);
            return;
        }
        int i15 = i11 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(text.length() - i11, i17 - Math.min(i13, (int) (((double) i17) * 0.8d)));
        int iMin2 = Math.min(i13, i17 - iMin);
        int i18 = i13 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i18))) {
            i18++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i11 + iMin) - 1))) {
            iMin--;
        }
        int i19 = iMin2 + i16;
        r0.b.a(editorInfo, i16 != i15 ? TextUtils.concat(text.subSequence(i18, i18 + iMin2), text.subSequence(i11, iMin + i11)) : text.subSequence(i18, i19 + iMin + i18), iMin2, i19);
    }

    public final void a(Drawable drawable, q3 q3Var) {
        if (drawable == null || q3Var == null) {
            return;
        }
        v.e(drawable, q3Var, this.f14794a.getDrawableState());
    }

    public final void b() {
        q3 q3Var = this.f14795b;
        TextView textView = this.f14794a;
        if (q3Var != null || this.f14796c != null || this.f14797d != null || this.f14798e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f14795b);
            a(compoundDrawables[1], this.f14796c);
            a(compoundDrawables[2], this.f14797d);
            a(compoundDrawables[3], this.f14798e);
        }
        if (this.f14799f == null && this.f14800g == null) {
            return;
        }
        Drawable[] drawableArrA = w0.a(textView);
        a(drawableArrA[0], this.f14799f);
        a(drawableArrA[2], this.f14800g);
    }

    public final ColorStateList d() {
        q3 q3Var = this.f14801h;
        if (q3Var != null) {
            return (ColorStateList) q3Var.f14980c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        q3 q3Var = this.f14801h;
        if (q3Var != null) {
            return (PorterDuff.Mode) q3Var.f14981d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i10) {
        boolean zU;
        ColorStateList colorStateListV;
        boolean z9;
        ColorStateList colorStateListV2;
        ColorStateList colorStateListV3;
        String strE;
        String strE2;
        int i11;
        int i12;
        float fApplyDimension;
        Paint.FontMetricsInt fontMetricsInt;
        int i13;
        int resourceId;
        int i14;
        int i15;
        TextView textView = this.f14794a;
        Context context = textView.getContext();
        v vVarA = v.a();
        int[] iArr = e.a.f12601h;
        ur0 ur0VarK = ur0.K(context, attributeSet, iArr, i10);
        o0.v0.p(textView, textView.getContext(), iArr, attributeSet, (TypedArray) ur0VarK.f9601d, i10);
        int iD = ur0VarK.D(0, -1);
        if (ur0VarK.H(3)) {
            this.f14795b = c(context, vVarA, ur0VarK.D(3, 0));
        }
        if (ur0VarK.H(1)) {
            this.f14796c = c(context, vVarA, ur0VarK.D(1, 0));
        }
        if (ur0VarK.H(4)) {
            this.f14797d = c(context, vVarA, ur0VarK.D(4, 0));
        }
        if (ur0VarK.H(2)) {
            this.f14798e = c(context, vVarA, ur0VarK.D(2, 0));
        }
        int i16 = Build.VERSION.SDK_INT;
        int i17 = 5;
        if (ur0VarK.H(5)) {
            this.f14799f = c(context, vVarA, ur0VarK.D(5, 0));
        }
        if (ur0VarK.H(6)) {
            this.f14800g = c(context, vVarA, ur0VarK.D(6, 0));
        }
        ur0VarK.M();
        boolean z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = e.a.f12618y;
        if (iD != -1) {
            ur0 ur0Var = new ur0(context, i17, context.obtainStyledAttributes(iD, iArr2));
            if (z10 || !ur0Var.H(14)) {
                zU = false;
                z9 = false;
            } else {
                zU = ur0Var.u(14, false);
                z9 = true;
            }
            n(context, ur0Var);
            if (i16 < 23) {
                if (ur0Var.H(3)) {
                    colorStateListV2 = ur0Var.v(3);
                    i15 = 4;
                } else {
                    i15 = 4;
                    colorStateListV2 = null;
                }
                colorStateListV3 = ur0Var.H(i15) ? ur0Var.v(i15) : null;
                colorStateListV = ur0Var.H(5) ? ur0Var.v(5) : null;
            } else {
                colorStateListV = null;
                colorStateListV2 = null;
                colorStateListV3 = null;
            }
            if (ur0Var.H(15)) {
                strE = ur0Var.E(15);
                i14 = 26;
            } else {
                i14 = 26;
                strE = null;
            }
            strE2 = (i16 < i14 || !ur0Var.H(13)) ? null : ur0Var.E(13);
            ur0Var.M();
        } else {
            zU = false;
            colorStateListV = null;
            z9 = false;
            colorStateListV2 = null;
            colorStateListV3 = null;
            strE = null;
            strE2 = null;
        }
        ur0 ur0Var2 = new ur0(context, i17, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (z10 || !ur0Var2.H(14)) {
            i11 = 23;
        } else {
            zU = ur0Var2.u(14, false);
            i11 = 23;
            z9 = true;
        }
        if (i16 < i11) {
            if (ur0Var2.H(3)) {
                colorStateListV2 = ur0Var2.v(3);
            }
            if (ur0Var2.H(4)) {
                colorStateListV3 = ur0Var2.v(4);
            }
            if (ur0Var2.H(5)) {
                colorStateListV = ur0Var2.v(5);
            }
        }
        ColorStateList colorStateList = colorStateListV2;
        ColorStateList colorStateList2 = colorStateListV3;
        if (ur0Var2.H(15)) {
            strE = ur0Var2.E(15);
        }
        String str = strE;
        if (i16 >= 26 && ur0Var2.H(13)) {
            strE2 = ur0Var2.E(13);
        }
        String str2 = strE2;
        if (i16 >= 28 && ur0Var2.H(0) && ur0Var2.x(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, ur0Var2);
        ur0Var2.M();
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            textView.setHintTextColor(colorStateList2);
        }
        if (colorStateListV != null) {
            textView.setLinkTextColor(colorStateListV);
        }
        if (!z10 && z9) {
            textView.setAllCaps(zU);
        }
        Typeface typeface = this.f14805l;
        if (typeface != null) {
            if (this.f14804k == -1) {
                textView.setTypeface(typeface, this.f14803j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            z0.d(textView, str2);
        }
        if (str != null) {
            if (i16 >= 24) {
                y0.b(textView, y0.a(str));
            } else {
                w0.c(textView, x0.a(str.split(",")[0]));
            }
        }
        int[] iArr3 = e.a.f12602i;
        k1 k1Var = this.f14802i;
        Context context2 = k1Var.f14906j;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = k1Var.f14905i;
        o0.v0.p(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i10);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            k1Var.f14897a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            fApplyDimension = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
            i12 = 1;
        } else {
            i12 = 1;
            fApplyDimension = -1.0f;
        }
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i18 = 0; i18 < length; i18++) {
                    iArr4[i18] = typedArrayObtainTypedArray.getDimensionPixelSize(i18, -1);
                }
                k1Var.f14902f = k1.b(iArr4);
                k1Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!k1Var.j()) {
            k1Var.f14897a = 0;
        } else if (k1Var.f14897a == 1) {
            if (!k1Var.f14903g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (fApplyDimension == -1.0f) {
                    i13 = 2;
                    fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i13 = 2;
                }
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                k1Var.k(fApplyDimension, dimension2, dimension);
            }
            k1Var.h();
        }
        if (e4.f14851b && k1Var.f14897a != 0) {
            int[] iArr5 = k1Var.f14902f;
            if (iArr5.length > 0) {
                if (z0.a(textView) != -1.0f) {
                    z0.b(textView, Math.round(k1Var.f14900d), Math.round(k1Var.f14901e), Math.round(k1Var.f14899c), 0);
                } else {
                    z0.c(textView, iArr5, 0);
                }
            }
        }
        ur0 ur0Var3 = new ur0(context, 5, context.obtainStyledAttributes(attributeSet, iArr3));
        int iD2 = ur0Var3.D(8, -1);
        Drawable drawableB = iD2 != -1 ? vVarA.b(context, iD2) : null;
        int iD3 = ur0Var3.D(13, -1);
        Drawable drawableB2 = iD3 != -1 ? vVarA.b(context, iD3) : null;
        int iD4 = ur0Var3.D(9, -1);
        Drawable drawableB3 = iD4 != -1 ? vVarA.b(context, iD4) : null;
        int iD5 = ur0Var3.D(6, -1);
        Drawable drawableB4 = iD5 != -1 ? vVarA.b(context, iD5) : null;
        int iD6 = ur0Var3.D(10, -1);
        Drawable drawableB5 = iD6 != -1 ? vVarA.b(context, iD6) : null;
        int iD7 = ur0Var3.D(7, -1);
        Drawable drawableB6 = iD7 != -1 ? vVarA.b(context, iD7) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = w0.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            w0.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = w0.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                w0.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (ur0Var3.H(11)) {
            ColorStateList colorStateListV4 = ur0Var3.v(11);
            if (Build.VERSION.SDK_INT >= 24) {
                s0.p.f(textView, colorStateListV4);
            } else if (textView instanceof s0.v) {
                ((s0.v) textView).setSupportCompoundDrawablesTintList(colorStateListV4);
            }
        }
        if (ur0Var3.H(12)) {
            fontMetricsInt = null;
            PorterDuff.Mode modeC = r1.c(ur0Var3.B(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                s0.p.g(textView, modeC);
            } else if (textView instanceof s0.v) {
                ((s0.v) textView).setSupportCompoundDrawablesTintMode(modeC);
            }
        } else {
            fontMetricsInt = null;
        }
        int iX = ur0Var3.x(15, -1);
        int iX2 = ur0Var3.x(18, -1);
        int iX3 = ur0Var3.x(19, -1);
        ur0Var3.M();
        if (iX != -1) {
            g4.z.y(textView, iX);
        }
        if (iX2 != -1) {
            g4.z.z(textView, iX2);
        }
        if (iX3 != -1) {
            b7.u.b(iX3);
            if (iX3 != textView.getPaint().getFontMetricsInt(fontMetricsInt)) {
                textView.setLineSpacing(iX3 - r1, 1.0f);
            }
        }
    }

    public final void g(Context context, int i10) {
        String strE;
        ColorStateList colorStateListV;
        ColorStateList colorStateListV2;
        ColorStateList colorStateListV3;
        ur0 ur0Var = new ur0(context, 5, context.obtainStyledAttributes(i10, e.a.f12618y));
        boolean zH = ur0Var.H(14);
        TextView textView = this.f14794a;
        if (zH) {
            textView.setAllCaps(ur0Var.u(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (ur0Var.H(3) && (colorStateListV3 = ur0Var.v(3)) != null) {
                textView.setTextColor(colorStateListV3);
            }
            if (ur0Var.H(5) && (colorStateListV2 = ur0Var.v(5)) != null) {
                textView.setLinkTextColor(colorStateListV2);
            }
            if (ur0Var.H(4) && (colorStateListV = ur0Var.v(4)) != null) {
                textView.setHintTextColor(colorStateListV);
            }
        }
        if (ur0Var.H(0) && ur0Var.x(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, ur0Var);
        if (i11 >= 26 && ur0Var.H(13) && (strE = ur0Var.E(13)) != null) {
            z0.d(textView, strE);
        }
        ur0Var.M();
        Typeface typeface = this.f14805l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f14803j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        k1 k1Var = this.f14802i;
        if (k1Var.j()) {
            DisplayMetrics displayMetrics = k1Var.f14906j.getResources().getDisplayMetrics();
            k1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (k1Var.h()) {
                k1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        k1 k1Var = this.f14802i;
        if (k1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = k1Var.f14906j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                k1Var.f14902f = k1.b(iArrCopyOf);
                if (!k1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                k1Var.f14903g = false;
            }
            if (k1Var.h()) {
                k1Var.a();
            }
        }
    }

    public final void k(int i10) {
        k1 k1Var = this.f14802i;
        if (k1Var.j()) {
            if (i10 == 0) {
                k1Var.f14897a = 0;
                k1Var.f14900d = -1.0f;
                k1Var.f14901e = -1.0f;
                k1Var.f14899c = -1.0f;
                k1Var.f14902f = new int[0];
                k1Var.f14898b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(fb1.g("Unknown auto-size text type: ", i10));
            }
            DisplayMetrics displayMetrics = k1Var.f14906j.getResources().getDisplayMetrics();
            k1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (k1Var.h()) {
                k1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f14801h == null) {
            this.f14801h = new q3(0);
        }
        q3 q3Var = this.f14801h;
        q3Var.f14980c = colorStateList;
        q3Var.f14979b = colorStateList != null;
        this.f14795b = q3Var;
        this.f14796c = q3Var;
        this.f14797d = q3Var;
        this.f14798e = q3Var;
        this.f14799f = q3Var;
        this.f14800g = q3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f14801h == null) {
            this.f14801h = new q3(0);
        }
        q3 q3Var = this.f14801h;
        q3Var.f14981d = mode;
        q3Var.f14978a = mode != null;
        this.f14795b = q3Var;
        this.f14796c = q3Var;
        this.f14797d = q3Var;
        this.f14798e = q3Var;
        this.f14799f = q3Var;
        this.f14800g = q3Var;
    }

    public final void n(Context context, ur0 ur0Var) {
        String strE;
        this.f14803j = ur0Var.B(2, this.f14803j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iB = ur0Var.B(11, -1);
            this.f14804k = iB;
            if (iB != -1) {
                this.f14803j &= 2;
            }
        }
        if (!ur0Var.H(10) && !ur0Var.H(12)) {
            if (ur0Var.H(1)) {
                this.f14806m = false;
                int iB2 = ur0Var.B(1, 1);
                if (iB2 == 1) {
                    this.f14805l = Typeface.SANS_SERIF;
                    return;
                } else if (iB2 == 2) {
                    this.f14805l = Typeface.SERIF;
                    return;
                } else {
                    if (iB2 != 3) {
                        return;
                    }
                    this.f14805l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f14805l = null;
        int i11 = ur0Var.H(12) ? 12 : 10;
        int i12 = this.f14804k;
        int i13 = this.f14803j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = ur0Var.A(i11, this.f14803j, new u0(this, i12, i13, new WeakReference(this.f14794a)));
                if (typefaceA != null) {
                    if (i10 < 28 || this.f14804k == -1) {
                        this.f14805l = typefaceA;
                    } else {
                        this.f14805l = a1.a(Typeface.create(typefaceA, 0), this.f14804k, (this.f14803j & 2) != 0);
                    }
                }
                this.f14806m = this.f14805l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f14805l != null || (strE = ur0Var.E(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f14804k == -1) {
            this.f14805l = Typeface.create(strE, this.f14803j);
        } else {
            this.f14805l = a1.a(Typeface.create(strE, 0), this.f14804k, (this.f14803j & 2) != 0);
        }
    }
}

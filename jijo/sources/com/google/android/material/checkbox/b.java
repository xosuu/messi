package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.ur0;
import f0.j;
import f0.q;
import g4.a0;
import g4.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;
import x1.c;
import x1.d;
import x1.e;
import x4.y;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AppCompatCheckBox {
    public static final int[] K = {R.attr.a29};
    public static final int[] L = {R.attr.a28};
    public static final int[][] M = {new int[]{android.R.attr.state_enabled, R.attr.a28}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int N = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public ColorStateList A;
    public ColorStateList B;
    public PorterDuff.Mode C;
    public int D;
    public int[] E;
    public boolean F;
    public CharSequence G;
    public CompoundButton.OnCheckedChangeListener H;
    public final e I;
    public final s4.a J;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f11825h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashSet f11826q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f11827s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11828t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11829u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11830v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f11831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f11832x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f11833y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11834z;

    public b(Context context, AttributeSet attributeSet) {
        e eVar;
        int next;
        super(j5.a.a(context, attributeSet, R.attr.et, R.style.a1i), attributeSet, R.attr.et);
        this.f11825h = new LinkedHashSet();
        this.f11826q = new LinkedHashSet();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new e(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = q.f13039a;
            Drawable drawableA = j.a(resources, R.drawable.h4, theme);
            eVar.f18309a = drawableA;
            drawableA.setCallback(eVar.f18307q);
            new d(eVar.f18309a.getConstantState());
        } else {
            int i10 = e.f18302s;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.h4);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Resources resources2 = context2.getResources();
                Resources.Theme theme2 = context2.getTheme();
                e eVar2 = new e(context2);
                eVar2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                eVar = eVar2;
            } catch (IOException | XmlPullParserException unused) {
                eVar = null;
            }
        }
        this.I = eVar;
        this.J = new s4.a(this);
        Context context3 = getContext();
        this.f11832x = z.k(this);
        this.A = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = l4.a.f15203p;
        y.a(context3, attributeSet, R.attr.et, R.style.a1i);
        y.b(context3, attributeSet, iArr, R.attr.et, R.style.a1i, new int[0]);
        ur0 ur0Var = new ur0(context3, 5, context3.obtainStyledAttributes(attributeSet, iArr, R.attr.et, R.style.a1i));
        this.f11833y = ur0Var.y(2);
        if (this.f11832x != null && a0.v(context3, R.attr.pq, false)) {
            int iD = ur0Var.D(0, 0);
            int iD2 = ur0Var.D(1, 0);
            if (iD == N && iD2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f11832x = p7.q.g(context3, R.drawable.h3);
                this.f11834z = true;
                if (this.f11833y == null) {
                    this.f11833y = p7.q.g(context3, R.drawable.h5);
                }
            }
        }
        this.B = tp1.h(context3, ur0Var, 3);
        this.C = en1.y(ur0Var.B(4, -1), PorterDuff.Mode.SRC_IN);
        this.f11828t = ur0Var.u(10, false);
        this.f11829u = ur0Var.u(6, true);
        this.f11830v = ur0Var.u(9, false);
        this.f11831w = ur0Var.G(8);
        if (ur0Var.H(7)) {
            setCheckedState(ur0Var.B(7, 0));
        }
        ur0Var.M();
        a();
    }

    private String getButtonStateDescription() {
        int i10 = this.D;
        return i10 == 1 ? getResources().getString(R.string.nc) : i10 == 0 ? getResources().getString(R.string.ne) : getResources().getString(R.string.nd);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f11827s == null) {
            int i10 = a0.i(this, R.attr.gt);
            int i11 = a0.i(this, R.attr.gw);
            int i12 = a0.i(this, R.attr.ho);
            int i13 = a0.i(this, R.attr.h8);
            this.f11827s = new ColorStateList(M, new int[]{a0.p(1.0f, i12, i11), a0.p(1.0f, i12, i10), a0.p(0.54f, i12, i13), a0.p(0.38f, i12, i13), a0.p(0.38f, i12, i13)});
        }
        return this.f11827s;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.A;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        int intrinsicWidth;
        int intrinsicHeight;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        l.d dVar;
        this.f11832x = tp1.f(this.f11832x, this.A, s0.b.b(this));
        this.f11833y = tp1.f(this.f11833y, this.B, this.C);
        int i10 = 2;
        if (this.f11834z) {
            e eVar = this.I;
            if (eVar != null) {
                Drawable drawable = eVar.f18309a;
                s4.a aVar = this.J;
                if (drawable != null) {
                    ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(aVar.a());
                }
                ArrayList arrayList = eVar.f18306h;
                c cVar = eVar.f18303b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (eVar.f18306h.size() == 0 && (dVar = eVar.f18305f) != null) {
                        cVar.f18298b.removeListener(dVar);
                        eVar.f18305f = null;
                    }
                }
                Drawable drawable2 = eVar.f18309a;
                if (drawable2 != null) {
                    ((AnimatedVectorDrawable) drawable2).registerAnimationCallback(aVar.a());
                } else if (aVar != null) {
                    if (eVar.f18306h == null) {
                        eVar.f18306h = new ArrayList();
                    }
                    if (!eVar.f18306h.contains(aVar)) {
                        eVar.f18306h.add(aVar);
                        if (eVar.f18305f == null) {
                            eVar.f18305f = new l.d(i10, eVar);
                        }
                        cVar.f18298b.addListener(eVar.f18305f);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f11832x;
                if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.f2, R.id.y0, eVar, false);
                    ((AnimatedStateListDrawable) this.f11832x).addTransition(R.id.kv, R.id.y0, eVar, false);
                }
            }
        }
        Drawable drawable4 = this.f11832x;
        if (drawable4 != null && (colorStateList2 = this.A) != null) {
            h0.b.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f11833y;
        if (drawable5 != null && (colorStateList = this.B) != null) {
            h0.b.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f11832x;
        Drawable drawable7 = this.f11833y;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            if (drawable7.getIntrinsicWidth() == -1 || drawable7.getIntrinsicHeight() == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
                intrinsicHeight = drawable6.getIntrinsicHeight();
            } else if (drawable7.getIntrinsicWidth() > drawable6.getIntrinsicWidth() || drawable7.getIntrinsicHeight() > drawable6.getIntrinsicHeight()) {
                float intrinsicWidth2 = drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight();
                if (intrinsicWidth2 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth3 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth3 / intrinsicWidth2);
                    intrinsicWidth = intrinsicWidth3;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
                }
            } else {
                intrinsicWidth = drawable7.getIntrinsicWidth();
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                int intrinsicWidth4 = (drawable6.getIntrinsicWidth() - intrinsicWidth) / 2;
                int intrinsicHeight2 = (drawable6.getIntrinsicHeight() - intrinsicHeight) / 2;
                layerDrawable.setLayerInset(1, intrinsicWidth4, intrinsicHeight2, intrinsicWidth4, intrinsicHeight2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f11832x;
    }

    public Drawable getButtonIconDrawable() {
        return this.f11833y;
    }

    public ColorStateList getButtonIconTintList() {
        return this.B;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.C;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.A;
    }

    public int getCheckedState() {
        return this.D;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f11831w;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.D == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11828t && this.A == null && this.B == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K);
        }
        if (this.f11830v) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, L);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i12 = iArrOnCreateDrawableState[i11];
            if (i12 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i12 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i11] = 16842912;
                break;
            }
            i11++;
        }
        this.E = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableK;
        if (!this.f11829u || !TextUtils.isEmpty(getText()) || (drawableK = z.k(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableK.getIntrinsicWidth()) / 2) * (en1.v(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableK.getBounds();
            h0.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f11830v) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f11831w));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialCheckBox$SavedState materialCheckBox$SavedState = (MaterialCheckBox$SavedState) parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        setCheckedState(materialCheckBox$SavedState.f11824a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.f11824a = getCheckedState();
        return materialCheckBox$SavedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(p7.q.g(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f11833y = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(p7.q.g(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.B == colorStateList) {
            return;
        }
        this.B = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.C == mode) {
            return;
        }
        this.C = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.A == colorStateList) {
            return;
        }
        this.A = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z9) {
        this.f11829u = z9;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        setCheckedState(z9 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.D != i10) {
            this.D = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.G == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.F) {
                return;
            }
            this.F = true;
            LinkedHashSet linkedHashSet = this.f11826q;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    fb1.t(it.next());
                    throw null;
                }
            }
            if (this.D != 2 && (onCheckedChangeListener = this.H) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i11 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.F = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f11831w = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z9) {
        if (this.f11830v == z9) {
            return;
        }
        this.f11830v = z9;
        refreshDrawableState();
        Iterator it = this.f11825h.iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.H = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.G = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f11828t = z9;
        if (z9) {
            s0.b.c(this, getMaterialThemeColorsTintList());
        } else {
            s0.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f11832x = drawable;
        this.f11834z = false;
        a();
    }
}

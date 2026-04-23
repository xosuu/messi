package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.material.chip.Chip;
import d5.u;
import g4.z;
import h0.i;
import h0.j;
import j5.a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import o0.d0;
import o0.e0;
import o0.j0;
import o0.v0;
import p7.q;
import r8.f;
import t4.b;
import t4.c;
import t4.d;
import t4.e;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.activities.ProxifiedApps;
import team.dev.epro.apkcustom.activities.ResponseChecker;
import x4.w;
import x4.y;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements d, u, Checkable {
    public static final Rect I = new Rect();
    public static final int[] J = {R.attr.state_selected};
    public static final int[] K = {R.attr.state_checkable};
    public int A;
    public int B;
    public CharSequence C;
    public final c D;
    public boolean E;
    public final Rect F;
    public final RectF G;
    public final b H;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f11835h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InsetDrawable f11836q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f11837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View.OnClickListener f11838t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f11839u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11840v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11842x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11843y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11844z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, xyz.easypro.httpcustom.R.attr.fm, xyz.easypro.httpcustom.R.style.a19), attributeSet, xyz.easypro.httpcustom.R.attr.fm);
        this.F = new Rect();
        this.G = new RectF();
        final int i10 = 0;
        this.H = new b(i10, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        e eVar = new e(context2, attributeSet);
        Context context3 = eVar.f16874q0;
        int[] iArr = l4.a.f15192e;
        TypedArray typedArrayE = y.e(context3, attributeSet, iArr, xyz.easypro.httpcustom.R.attr.fm, xyz.easypro.httpcustom.R.style.a19, new int[0]);
        eVar.R0 = typedArrayE.hasValue(37);
        Context context4 = eVar.f16874q0;
        ColorStateList colorStateListG = tp1.g(context4, typedArrayE, 24);
        if (eVar.J != colorStateListG) {
            eVar.J = colorStateListG;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList colorStateListG2 = tp1.g(context4, typedArrayE, 11);
        if (eVar.K != colorStateListG2) {
            eVar.K = colorStateListG2;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = typedArrayE.getDimension(19, 0.0f);
        if (eVar.L != dimension) {
            eVar.L = dimension;
            eVar.invalidateSelf();
            eVar.w();
        }
        if (typedArrayE.hasValue(12)) {
            eVar.C(typedArrayE.getDimension(12, 0.0f));
        }
        eVar.H(tp1.g(context4, typedArrayE, 22));
        eVar.I(typedArrayE.getDimension(23, 0.0f));
        eVar.R(tp1.g(context4, typedArrayE, 36));
        CharSequence text = typedArrayE.getText(5);
        text = text == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : text;
        boolean zEquals = TextUtils.equals(eVar.Q, text);
        w wVar = eVar.f16880w0;
        if (!zEquals) {
            eVar.Q = text;
            wVar.f18478d = true;
            eVar.invalidateSelf();
            eVar.w();
        }
        a5.d dVar = (!typedArrayE.hasValue(0) || (resourceId3 = typedArrayE.getResourceId(0, 0)) == 0) ? null : new a5.d(context4, resourceId3);
        dVar.f39k = typedArrayE.getDimension(1, dVar.f39k);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            dVar.f38j = tp1.g(context4, typedArrayE, 2);
        }
        wVar.b(dVar, context4);
        int i12 = typedArrayE.getInt(3, 0);
        if (i12 == 1) {
            eVar.O0 = TextUtils.TruncateAt.START;
        } else if (i12 == 2) {
            eVar.O0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i12 == 3) {
            eVar.O0 = TextUtils.TruncateAt.END;
        }
        eVar.G(typedArrayE.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.G(typedArrayE.getBoolean(15, false));
        }
        eVar.D(tp1.i(context4, typedArrayE, 14));
        if (typedArrayE.hasValue(17)) {
            eVar.F(tp1.g(context4, typedArrayE, 17));
        }
        eVar.E(typedArrayE.getDimension(16, -1.0f));
        eVar.O(typedArrayE.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.O(typedArrayE.getBoolean(26, false));
        }
        eVar.J(tp1.i(context4, typedArrayE, 25));
        eVar.N(tp1.g(context4, typedArrayE, 30));
        eVar.L(typedArrayE.getDimension(28, 0.0f));
        eVar.y(typedArrayE.getBoolean(6, false));
        eVar.B(typedArrayE.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.B(typedArrayE.getBoolean(8, false));
        }
        eVar.z(tp1.i(context4, typedArrayE, 7));
        if (typedArrayE.hasValue(9)) {
            eVar.A(tp1.g(context4, typedArrayE, 9));
        }
        eVar.f16864g0 = (!typedArrayE.hasValue(39) || (resourceId2 = typedArrayE.getResourceId(39, 0)) == 0) ? null : m4.b.a(context4, resourceId2);
        eVar.f16865h0 = (!typedArrayE.hasValue(33) || (resourceId = typedArrayE.getResourceId(33, 0)) == 0) ? null : m4.b.a(context4, resourceId);
        float dimension2 = typedArrayE.getDimension(21, 0.0f);
        if (eVar.f16866i0 != dimension2) {
            eVar.f16866i0 = dimension2;
            eVar.invalidateSelf();
            eVar.w();
        }
        eVar.Q(typedArrayE.getDimension(35, 0.0f));
        eVar.P(typedArrayE.getDimension(34, 0.0f));
        float dimension3 = typedArrayE.getDimension(41, 0.0f);
        if (eVar.f16869l0 != dimension3) {
            eVar.f16869l0 = dimension3;
            eVar.invalidateSelf();
            eVar.w();
        }
        float dimension4 = typedArrayE.getDimension(40, 0.0f);
        if (eVar.f16870m0 != dimension4) {
            eVar.f16870m0 = dimension4;
            eVar.invalidateSelf();
            eVar.w();
        }
        eVar.M(typedArrayE.getDimension(29, 0.0f));
        eVar.K(typedArrayE.getDimension(27, 0.0f));
        float dimension5 = typedArrayE.getDimension(13, 0.0f);
        if (eVar.f16873p0 != dimension5) {
            eVar.f16873p0 = dimension5;
            eVar.invalidateSelf();
            eVar.w();
        }
        eVar.Q0 = typedArrayE.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayE.recycle();
        y.a(context2, attributeSet, xyz.easypro.httpcustom.R.attr.fm, xyz.easypro.httpcustom.R.style.a19);
        y.b(context2, attributeSet, iArr, xyz.easypro.httpcustom.R.attr.fm, xyz.easypro.httpcustom.R.style.a19, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, xyz.easypro.httpcustom.R.attr.fm, xyz.easypro.httpcustom.R.style.a19);
        this.f11844z = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.B = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(en1.n(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.k(j0.i(this));
        y.a(context2, attributeSet, xyz.easypro.httpcustom.R.attr.fm, xyz.easypro.httpcustom.R.style.a19);
        y.b(context2, attributeSet, iArr, xyz.easypro.httpcustom.R.attr.fm, xyz.easypro.httpcustom.R.style.a19, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, xyz.easypro.httpcustom.R.attr.fm, xyz.easypro.httpcustom.R.style.a19);
        if (i11 < 23) {
            setTextColor(tp1.g(context2, typedArrayObtainStyledAttributes2, 2));
        }
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.D = new c(this, this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new g3.a(this, 2));
        }
        setChecked(this.f11840v);
        setText(eVar.Q);
        setEllipsize(eVar.O0);
        i();
        if (!this.f11835h.P0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.f11844z) {
            setMinHeight(this.B);
        }
        this.A = e0.d(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: t4.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                int i13 = i10;
                KeyEvent.Callback callback = this;
                switch (i13) {
                    case 0:
                        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) callback).f11839u;
                        if (onCheckedChangeListener != null) {
                            onCheckedChangeListener.onCheckedChanged(compoundButton, z9);
                        }
                        break;
                    case 1:
                        ProxifiedApps proxifiedApps = (ProxifiedApps) callback;
                        proxifiedApps.H.setEnabled(z9);
                        f fVar = proxifiedApps.K;
                        fVar.f16563u = z9;
                        fVar.d();
                        fb1.s(App.f17100w.f17415a, "isProxified", z9);
                        break;
                    default:
                        ResponseChecker responseChecker = (ResponseChecker) callback;
                        if (z9) {
                            responseChecker.K.setVisibility(0);
                        } else {
                            responseChecker.K.setVisibility(8);
                        }
                        fb1.s(App.f17100w.f17415a, "cb_proxy_checker", z9);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.G;
        rectF.setEmpty();
        if (d() && this.f11838t != null) {
            e eVar = this.f11835h;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.U()) {
                float f10 = eVar.f16873p0 + eVar.f16872o0 + eVar.f16858a0 + eVar.f16871n0 + eVar.f16870m0;
                if (z.n(eVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.F;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private a5.d getTextAppearance() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16880w0.f18480f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z9) {
        if (this.f11842x != z9) {
            this.f11842x = z9;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z9) {
        if (this.f11841w != z9) {
            this.f11841w = z9;
            refreshDrawableState();
        }
    }

    public final void c(int i10) {
        this.B = i10;
        if (!this.f11844z) {
            InsetDrawable insetDrawable = this.f11836q;
            if (insetDrawable == null) {
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f11836q = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i10 - ((int) this.f11835h.L));
        int iMax2 = Math.max(0, i10 - this.f11835h.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f11836q;
            if (insetDrawable2 == null) {
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f11836q = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f11836q != null) {
            Rect rect = new Rect();
            this.f11836q.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                g();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f11836q = new InsetDrawable((Drawable) this.f11835h, i11, i12, i11, i12);
        g();
    }

    public final boolean d() {
        e eVar = this.f11835h;
        if (eVar != null) {
            Object obj = eVar.X;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof i) {
                obj = ((j) ((i) obj)).f13921q;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.E
            if (r0 != 0) goto L9
            boolean r7 = super.dispatchHoverEvent(r7)
            return r7
        L9:
            t4.c r0 = r6.D
            android.view.accessibility.AccessibilityManager r1 = r0.f17679h
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L5c
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1a
            goto L5c
        L1a:
            int r1 = r7.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r3 = 128(0x80, float:1.8E-43)
            r4 = 7
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L40
            r4 = 9
            if (r1 == r4) goto L40
            r4 = 10
            if (r1 == r4) goto L30
            goto L5c
        L30:
            int r1 = r0.f17684m
            if (r1 == r5) goto L5c
            if (r1 != r5) goto L37
            goto L62
        L37:
            r0.f17684m = r5
            r0.w(r5, r3)
            r0.w(r1, r2)
            goto L62
        L40:
            float r1 = r7.getX()
            float r4 = r7.getY()
            int r1 = r0.x(r1, r4)
            int r4 = r0.f17684m
            if (r4 != r1) goto L51
            goto L59
        L51:
            r0.f17684m = r1
            r0.w(r1, r3)
            r0.w(r4, r2)
        L59:
            if (r1 == r5) goto L5c
            goto L62
        L5c:
            boolean r7 = super.dispatchHoverEvent(r7)
            if (r7 == 0) goto L64
        L62:
            r7 = 1
            goto L65
        L64:
            r7 = 0
        L65:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.E
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            t4.c r0 = r9.D
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 1
            if (r1 == r2) goto L89
            int r1 = r10.getKeyCode()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 61
            r5 = 0
            if (r1 == r4) goto L6c
            r4 = 66
            if (r1 == r4) goto L55
            switch(r1) {
                case 19: goto L28;
                case 20: goto L28;
                case 21: goto L28;
                case 22: goto L28;
                case 23: goto L55;
                default: goto L27;
            }
        L27:
            goto L89
        L28:
            boolean r6 = r10.hasNoModifiers()
            if (r6 == 0) goto L89
            r6 = 19
            if (r1 == r6) goto L40
            r6 = 21
            if (r1 == r6) goto L3d
            r6 = 22
            if (r1 == r6) goto L42
            r4 = 130(0x82, float:1.82E-43)
            goto L42
        L3d:
            r4 = 17
            goto L42
        L40:
            r4 = 33
        L42:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r6 = 0
            r7 = 0
        L49:
            if (r6 >= r1) goto L82
            boolean r8 = r0.o(r4, r5)
            if (r8 == 0) goto L82
            int r6 = r6 + 1
            r7 = 1
            goto L49
        L55:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L89
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L89
            int r1 = r0.f17683l
            if (r1 == r3) goto L84
            r4 = 16
            boolean r1 = r0.q(r1, r4)
            goto L84
        L6c:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L78
            r1 = 2
            boolean r7 = r0.o(r1, r5)
            goto L82
        L78:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto L89
            boolean r7 = r0.o(r2, r5)
        L82:
            if (r7 == 0) goto L89
        L84:
            int r0 = r0.f17683l
            if (r0 == r3) goto L89
            return r2
        L89:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f11835h;
        if (eVar == null || !e.v(eVar.X)) {
            return;
        }
        e eVar2 = this.f11835h;
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f11843y) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f11842x) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f11841w) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f11843y) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f11842x) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f11841w) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        if (Arrays.equals(eVar2.K0, iArr)) {
            return;
        }
        eVar2.K0 = iArr;
        if (eVar2.U() && eVar2.x(eVar2.getState(), iArr)) {
            invalidate();
        }
    }

    public final boolean e() {
        e eVar = this.f11835h;
        return eVar != null && eVar.f16860c0;
    }

    public final void f() {
        e eVar;
        if (!d() || (eVar = this.f11835h) == null || !eVar.W || this.f11838t == null) {
            v0.q(this, null);
            this.E = false;
        } else {
            v0.q(this, this.D);
            this.E = true;
        }
    }

    public final void g() {
        this.f11837s = new RippleDrawable(b5.d.b(this.f11835h.P), getBackgroundDrawable(), null);
        e eVar = this.f11835h;
        if (eVar.L0) {
            eVar.L0 = false;
            eVar.M0 = null;
            eVar.onStateChange(eVar.getState());
        }
        RippleDrawable rippleDrawable = this.f11837s;
        WeakHashMap weakHashMap = v0.f16075a;
        d0.q(this, rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.C)) {
            return this.C;
        }
        if (!e()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f11836q;
        return insetDrawable == null ? this.f11835h : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16862e0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16863f0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.K;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return Math.max(0.0f, eVar.t());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f11835h;
    }

    public float getChipEndPadding() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16873p0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getChipIcon() {
        Object obj;
        e eVar = this.f11835h;
        if (eVar == null || (obj = eVar.S) == null) {
            return null;
        }
        if (obj instanceof i) {
            obj = ((j) ((i) obj)).f13921q;
        }
        return obj;
    }

    public float getChipIconSize() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.U;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.T;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.L;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16866i0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.N;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.O;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getCloseIcon() {
        Object obj;
        e eVar = this.f11835h;
        if (eVar == null || (obj = eVar.X) == null) {
            return null;
        }
        if (obj instanceof i) {
            obj = ((j) ((i) obj)).f13921q;
        }
        return obj;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16859b0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16872o0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16858a0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16871n0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.Z;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.O0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.E) {
            c cVar = this.D;
            if (cVar.f17683l == 1 || cVar.f17682k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public m4.b getHideMotionSpec() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16865h0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16868k0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16867j0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.P;
        }
        return null;
    }

    public d5.j getShapeAppearanceModel() {
        return this.f11835h.f12396a.f12375a;
    }

    public m4.b getShowMotionSpec() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16864g0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16870m0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f11835h;
        if (eVar != null) {
            return eVar.f16869l0;
        }
        return 0.0f;
    }

    public final void h() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f11835h) == null) {
            return;
        }
        int iS = (int) (eVar.s() + eVar.f16873p0 + eVar.f16870m0);
        e eVar2 = this.f11835h;
        int iR = (int) (eVar2.r() + eVar2.f16866i0 + eVar2.f16869l0);
        if (this.f11836q != null) {
            Rect rect = new Rect();
            this.f11836q.getPadding(rect);
            iR += rect.left;
            iS += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = v0.f16075a;
        e0.k(this, iR, paddingTop, iS, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        e eVar = this.f11835h;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        a5.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.H);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        en1.I(this, this.f11835h);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J);
        }
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z9, int i10, Rect rect) {
        super.onFocusChanged(z9, i10, rect);
        if (this.E) {
            c cVar = this.D;
            int i11 = cVar.f17683l;
            if (i11 != Integer.MIN_VALUE) {
                cVar.j(i11);
            }
            if (z9) {
                cVar.o(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.A != i10) {
            this.A = i10;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L51
        L21:
            boolean r0 = r5.f11841w
            if (r0 == 0) goto L51
            if (r1 != 0) goto L57
            r5.setCloseIconPressed(r2)
            goto L57
        L2b:
            boolean r0 = r5.f11841w
            if (r0 == 0) goto L44
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f11838t
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.E
            if (r0 == 0) goto L42
            t4.c r0 = r5.D
            r0.w(r3, r3)
        L42:
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r5.setCloseIconPressed(r2)
            if (r0 != 0) goto L57
            goto L51
        L4b:
            if (r1 == 0) goto L51
            r5.setCloseIconPressed(r3)
            goto L57
        L51:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L58
        L57:
            r2 = 1
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f11837s) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f11837s) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z9) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.y(z9);
        }
    }

    public void setCheckableResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.y(eVar.f16874q0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        e eVar = this.f11835h;
        if (eVar == null) {
            this.f11840v = z9;
        } else if (eVar.f16860c0) {
            super.setChecked(z9);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.z(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z9) {
        setCheckedIconVisible(z9);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.z(q.g(eVar.f16874q0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.A(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.A(d0.f.c(eVar.f16874q0, i10));
        }
    }

    public void setCheckedIconVisible(boolean z9) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.B(z9);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f11835h;
        if (eVar == null || eVar.K == colorStateList) {
            return;
        }
        eVar.K = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateListC;
        e eVar = this.f11835h;
        if (eVar == null || eVar.K == (colorStateListC = d0.f.c(eVar.f16874q0, i10))) {
            return;
        }
        eVar.K = colorStateListC;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.C(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.C(eVar.f16874q0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f11835h;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.N0 = new WeakReference(null);
            }
            this.f11835h = eVar;
            eVar.P0 = false;
            eVar.N0 = new WeakReference(this);
            c(this.B);
        }
    }

    public void setChipEndPadding(float f10) {
        e eVar = this.f11835h;
        if (eVar == null || eVar.f16873p0 == f10) {
            return;
        }
        eVar.f16873p0 = f10;
        eVar.invalidateSelf();
        eVar.w();
    }

    public void setChipEndPaddingResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            float dimension = eVar.f16874q0.getResources().getDimension(i10);
            if (eVar.f16873p0 != dimension) {
                eVar.f16873p0 = dimension;
                eVar.invalidateSelf();
                eVar.w();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.D(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z9) {
        setChipIconVisible(z9);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.D(q.g(eVar.f16874q0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.E(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.E(eVar.f16874q0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.F(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.F(d0.f.c(eVar.f16874q0, i10));
        }
    }

    public void setChipIconVisible(boolean z9) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.G(z9);
        }
    }

    public void setChipMinHeight(float f10) {
        e eVar = this.f11835h;
        if (eVar == null || eVar.L == f10) {
            return;
        }
        eVar.L = f10;
        eVar.invalidateSelf();
        eVar.w();
    }

    public void setChipMinHeightResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            float dimension = eVar.f16874q0.getResources().getDimension(i10);
            if (eVar.L != dimension) {
                eVar.L = dimension;
                eVar.invalidateSelf();
                eVar.w();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        e eVar = this.f11835h;
        if (eVar == null || eVar.f16866i0 == f10) {
            return;
        }
        eVar.f16866i0 = f10;
        eVar.invalidateSelf();
        eVar.w();
    }

    public void setChipStartPaddingResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            float dimension = eVar.f16874q0.getResources().getDimension(i10);
            if (eVar.f16866i0 != dimension) {
                eVar.f16866i0 = dimension;
                eVar.invalidateSelf();
                eVar.w();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.H(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.H(d0.f.c(eVar.f16874q0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.I(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.I(eVar.f16874q0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.J(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f11835h;
        if (eVar == null || eVar.f16859b0 == charSequence) {
            return;
        }
        m0.b bVarC = m0.b.c();
        eVar.f16859b0 = bVarC.d(charSequence, bVarC.f15383c);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z9) {
        setCloseIconVisible(z9);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.K(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.K(eVar.f16874q0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.J(q.g(eVar.f16874q0, i10));
        }
        f();
    }

    public void setCloseIconSize(float f10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.L(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.L(eVar.f16874q0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.M(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.M(eVar.f16874q0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.N(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.N(d0.f.c(eVar.f16874q0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.k(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f11835h == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.O0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z9) {
        this.f11844z = z9;
        c(this.B);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            return;
        }
        super.setGravity(i10);
    }

    public void setHideMotionSpec(m4.b bVar) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.f16865h0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.f16865h0 = m4.b.a(eVar.f16874q0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.P(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.P(eVar.f16874q0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.Q(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.Q(eVar.f16874q0.getResources().getDimension(i10));
        }
    }

    public void setInternalOnCheckedChangeListener(x4.e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f11835h == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.Q0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f11839u = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f11838t = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.R(colorStateList);
        }
        if (this.f11835h.L0) {
            return;
        }
        g();
    }

    public void setRippleColorResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.R(d0.f.c(eVar.f16874q0, i10));
            if (this.f11835h.L0) {
                return;
            }
            g();
        }
    }

    @Override // d5.u
    public void setShapeAppearanceModel(d5.j jVar) {
        this.f11835h.setShapeAppearanceModel(jVar);
    }

    public void setShowMotionSpec(m4.b bVar) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.f16864g0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.f16864g0 = m4.b.a(eVar.f16874q0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z9) {
        if (!z9) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z9);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e eVar = this.f11835h;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        super.setText(eVar.P0 ? null : charSequence, bufferType);
        e eVar2 = this.f11835h;
        if (eVar2 == null || TextUtils.equals(eVar2.Q, charSequence)) {
            return;
        }
        eVar2.Q = charSequence;
        eVar2.f16880w0.f18478d = true;
        eVar2.invalidateSelf();
        eVar2.w();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e eVar = this.f11835h;
        if (eVar != null) {
            Context context2 = eVar.f16874q0;
            eVar.f16880w0.b(new a5.d(context2, i10), context2);
        }
        i();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        e eVar = this.f11835h;
        if (eVar == null || eVar.f16870m0 == f10) {
            return;
        }
        eVar.f16870m0 = f10;
        eVar.invalidateSelf();
        eVar.w();
    }

    public void setTextEndPaddingResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            float dimension = eVar.f16874q0.getResources().getDimension(i10);
            if (eVar.f16870m0 != dimension) {
                eVar.f16870m0 = dimension;
                eVar.invalidateSelf();
                eVar.w();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        e eVar = this.f11835h;
        if (eVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            w wVar = eVar.f16880w0;
            a5.d dVar = wVar.f18480f;
            if (dVar != null) {
                dVar.f39k = fApplyDimension;
                wVar.f18475a.setTextSize(fApplyDimension);
                eVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f10) {
        e eVar = this.f11835h;
        if (eVar == null || eVar.f16869l0 == f10) {
            return;
        }
        eVar.f16869l0 = f10;
        eVar.invalidateSelf();
        eVar.w();
    }

    public void setTextStartPaddingResource(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            float dimension = eVar.f16874q0.getResources().getDimension(i10);
            if (eVar.f16869l0 != dimension) {
                eVar.f16869l0 = dimension;
                eVar.invalidateSelf();
                eVar.w();
            }
        }
    }

    public void setCheckedIconVisible(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.B(eVar.f16874q0.getResources().getBoolean(i10));
        }
    }

    public void setChipIconVisible(int i10) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.G(eVar.f16874q0.getResources().getBoolean(i10));
        }
    }

    public void setCloseIconVisible(boolean z9) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.O(z9);
        }
        f();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        e eVar = this.f11835h;
        if (eVar != null) {
            Context context = eVar.f16874q0;
            eVar.f16880w0.b(new a5.d(context, i10), context);
        }
        i();
    }

    public void setTextAppearance(a5.d dVar) {
        e eVar = this.f11835h;
        if (eVar != null) {
            eVar.f16880w0.b(dVar, eVar.f16874q0);
        }
        i();
    }
}

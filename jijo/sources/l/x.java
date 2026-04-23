package l;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class x extends EditText implements o0.v, s0.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f15051b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.f f15052d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s0.t f15053f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.f f15054h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w f15055q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.ko);
        p3.a(context);
        o3.a(getContext(), this);
        q qVar = new q(this);
        this.f15050a = qVar;
        qVar.h(attributeSet, R.attr.ko);
        b1 b1Var = new b1(this);
        this.f15051b = b1Var;
        b1Var.f(attributeSet, R.attr.ko);
        b1Var.b();
        this.f15052d = new f.f((TextView) this);
        this.f15053f = new s0.t();
        f.f fVar = new f.f((EditText) this);
        this.f15054h = fVar;
        fVar.C(attributeSet, R.attr.ko);
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

    private w getSuperCaller() {
        if (this.f15055q == null) {
            this.f15055q = new w(this);
        }
        return this.f15055q;
    }

    @Override // o0.v
    public final o0.h a(o0.h hVar) {
        return this.f15053f.a(this, hVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f15050a;
        if (qVar != null) {
            qVar.b();
        }
        b1 b1Var = this.f15051b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g4.z.G(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f15050a;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f15050a;
        if (qVar != null) {
            return qVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f15051b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f15051b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        f.f fVar;
        if (Build.VERSION.SDK_INT >= 28 || (fVar = this.f15052d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) fVar.f12833d;
        return textClassifier == null ? t0.a((TextView) fVar.f12832b) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r1
      0x0057: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006a, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            l.b1 r1 = r7.f15051b
            r1.getClass()
            l.b1.h(r7, r0, r8)
            z3.a.R(r7, r8, r0)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = o0.v0.h(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            j6.n.e(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            r0.c r2 = new r0.c
            r6 = 0
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4d
            r0.d r1 = new r0.d
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = r0.b.f16486a
            if (r1 < r5) goto L59
            java.lang.String[] r1 = j6.n.f(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            r0.e r1 = new r0.e
            r1.<init>(r0, r2)
            goto L4b
        L77:
            f.f r1 = r7.f15054h
            android.view.inputmethod.InputConnection r8 = r1.D(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.x.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && o0.v0.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && i0.a(dragEvent, this, activity)) {
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 || o0.v0.h(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            o0.e dVar = i11 >= 31 ? new o0.d(primaryClip, 1) : new o0.f(primaryClip, 1);
            dVar.e(i10 == 16908322 ? 0 : 1);
            o0.v0.m(this, dVar.a());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f15050a;
        if (qVar != null) {
            qVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q qVar = this.f15050a;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f15051b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b1 b1Var = this.f15051b;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g4.z.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        ((d5.e) ((z0.b) this.f15054h.f12833d).f20648c).t(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f15054h.B(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f15050a;
        if (qVar != null) {
            qVar.n(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f15050a;
        if (qVar != null) {
            qVar.o(mode);
        }
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        b1 b1Var = this.f15051b;
        b1Var.l(colorStateList);
        b1Var.b();
    }

    @Override // s0.v
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        b1 b1Var = this.f15051b;
        b1Var.m(mode);
        b1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b1 b1Var = this.f15051b;
        if (b1Var != null) {
            b1Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        f.f fVar;
        if (Build.VERSION.SDK_INT >= 28 || (fVar = this.f15052d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            fVar.f12833d = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}

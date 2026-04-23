package f;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends androidx.activity.k implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f12943d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f12944f;

    /* JADX WARN: Type inference failed for: r2v2, types: [f.l0] */
    public m0(Context context, int i10) {
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.jt, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        super(context, i11);
        this.f12944f = new o0.l() { // from class: f.l0
            @Override // o0.l
            public final boolean b(KeyEvent keyEvent) {
                return this.f12916a.i(keyEvent);
            }
        };
        u uVarF = f();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.jt, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((k0) uVarF).f12897f0 = i10;
        uVarF.f();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().a(view, layoutParams);
    }

    @Override // f.r
    public final void c() {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return z3.a.w(this.f12944f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // f.r
    public final void e() {
    }

    public final u f() {
        if (this.f12943d == null) {
            t0 t0Var = u.f12969a;
            this.f12943d = new k0(getContext(), getWindow(), this, this);
        }
        return this.f12943d;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        k0 k0Var = (k0) f();
        k0Var.y();
        return k0Var.f12913x.findViewById(i10);
    }

    @Override // f.r
    public final void g() {
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        f().c();
    }

    @Override // androidx.activity.k, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().b();
        super.onCreate(bundle);
        f().f();
    }

    @Override // androidx.activity.k, android.app.Dialog
    public final void onStop() {
        super.onStop();
        k0 k0Var = (k0) f();
        k0Var.E();
        b4.f fVar = k0Var.A;
        if (fVar != null) {
            fVar.L(false);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(int i10) {
        f().j(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().m(charSequence);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        f().k(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        f().m(getContext().getString(i10));
    }
}

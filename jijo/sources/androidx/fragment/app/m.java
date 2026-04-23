package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.internal.ads.fb1;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class m extends s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Handler f818h0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f827q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Dialog f829s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f830t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f831u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f832v0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final x f819i0 = new x(2, this);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final i f820j0 = new i(this);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final j f821k0 = new j(this);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f822l0 = 0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f823m0 = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f824n0 = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f825o0 = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f826p0 = -1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final k f828r0 = new k(this);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f833w0 = false;

    @Override // androidx.fragment.app.s
    public void A(Bundle bundle) {
        super.A(bundle);
        this.f818h0 = new Handler();
        this.f825o0 = this.J == 0;
        if (bundle != null) {
            this.f822l0 = bundle.getInt("android:style", 0);
            this.f823m0 = bundle.getInt("android:theme", 0);
            this.f824n0 = bundle.getBoolean("android:cancelable", true);
            this.f825o0 = bundle.getBoolean("android:showsDialog", this.f825o0);
            this.f826p0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.s
    public final void E() {
        this.Q = true;
        Dialog dialog = this.f829s0;
        if (dialog != null) {
            this.f830t0 = true;
            dialog.setOnDismissListener(null);
            this.f829s0.dismiss();
            if (!this.f831u0) {
                onDismiss(this.f829s0);
            }
            this.f829s0 = null;
            this.f833w0 = false;
        }
    }

    @Override // androidx.fragment.app.s
    public void F() {
        this.Q = true;
        if (!this.f832v0 && !this.f831u0) {
            this.f831u0 = true;
        }
        k kVar = this.f828r0;
        androidx.lifecycle.x xVar = this.f885c0;
        xVar.getClass();
        androidx.lifecycle.x.a("removeObserver");
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) xVar.f1009b.c(kVar);
        if (wVar == null) {
            return;
        }
        wVar.c();
        wVar.b(false);
    }

    @Override // androidx.fragment.app.s
    public final LayoutInflater G(Bundle bundle) {
        LayoutInflater layoutInflaterG = super.G(bundle);
        boolean z9 = this.f825o0;
        if (!z9 || this.f827q0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            return layoutInflaterG;
        }
        if (z9 && !this.f833w0) {
            try {
                this.f827q0 = true;
                Dialog dialogB0 = b0();
                this.f829s0 = dialogB0;
                if (this.f825o0) {
                    c0(dialogB0, this.f822l0);
                    Context contextL = l();
                    if (contextL instanceof Activity) {
                        this.f829s0.setOwnerActivity((Activity) contextL);
                    }
                    this.f829s0.setCancelable(this.f824n0);
                    this.f829s0.setOnCancelListener(this.f820j0);
                    this.f829s0.setOnDismissListener(this.f821k0);
                    this.f833w0 = true;
                } else {
                    this.f829s0 = null;
                }
                this.f827q0 = false;
            } catch (Throwable th) {
                this.f827q0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        Dialog dialog = this.f829s0;
        return dialog != null ? layoutInflaterG.cloneInContext(dialog.getContext()) : layoutInflaterG;
    }

    @Override // androidx.fragment.app.s
    public void K(Bundle bundle) {
        Dialog dialog = this.f829s0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f822l0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f823m0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z9 = this.f824n0;
        if (!z9) {
            bundle.putBoolean("android:cancelable", z9);
        }
        boolean z10 = this.f825o0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.f826p0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.s
    public void L() {
        this.Q = true;
        Dialog dialog = this.f829s0;
        if (dialog != null) {
            this.f830t0 = false;
            dialog.show();
            View decorView = this.f829s0.getWindow().getDecorView();
            decorView.setTag(R.id.yc, this);
            decorView.setTag(R.id.yf, this);
            decorView.setTag(R.id.ye, this);
        }
    }

    @Override // androidx.fragment.app.s
    public void M() {
        this.Q = true;
        Dialog dialog = this.f829s0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.s
    public final void N(Bundle bundle) {
        Bundle bundle2;
        this.Q = true;
        if (this.f829s0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f829s0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.s
    public final void O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.O(layoutInflater, viewGroup, bundle);
        if (this.S != null || this.f829s0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f829s0.onRestoreInstanceState(bundle2);
    }

    public final void Z(boolean z9, boolean z10) {
        if (this.f831u0) {
            return;
        }
        this.f831u0 = true;
        this.f832v0 = false;
        Dialog dialog = this.f829s0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f829s0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.f818h0.getLooper()) {
                    onDismiss(this.f829s0);
                } else {
                    this.f818h0.post(this.f819i0);
                }
            }
        }
        this.f830t0 = true;
        if (this.f826p0 >= 0) {
            j0 j0VarP = p();
            int i10 = this.f826p0;
            if (i10 < 0) {
                throw new IllegalArgumentException(fb1.g("Bad id: ", i10));
            }
            j0VarP.v(new i0(j0VarP, i10), false);
            this.f826p0 = -1;
            return;
        }
        a aVar = new a(p());
        aVar.i(this);
        if (z9) {
            aVar.d(true);
        } else {
            aVar.d(false);
        }
    }

    public Dialog b0() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new Dialog(T(), this.f823m0);
    }

    public void c0(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void d0(j0 j0Var, String str) {
        this.f831u0 = false;
        this.f832v0 = true;
        j0Var.getClass();
        a aVar = new a(j0Var);
        aVar.e(0, this, str, 1);
        aVar.d(false);
    }

    @Override // androidx.fragment.app.s
    public final z3.a e() {
        return new l(this, new n(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f830t0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        Z(true, true);
    }

    @Override // androidx.fragment.app.s
    public void z(Context context) {
        super.z(context);
        this.f885c0.d(this.f828r0);
        if (this.f832v0) {
            return;
        }
        this.f831u0 = false;
    }
}

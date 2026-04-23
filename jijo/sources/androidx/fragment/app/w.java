package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.ur0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends androidx.activity.i implements androidx.core.app.c, androidx.core.app.d {
    public final k A;
    public boolean C;
    public boolean D;
    public final androidx.lifecycle.s B = new androidx.lifecycle.s(this);
    public boolean E = true;

    public w() {
        f.q qVar = (f.q) this;
        this.A = new k(new v(qVar));
        this.f149h.f16385b.b("android:support:fragments", new t(qVar));
        k(new u(qVar));
    }

    public static boolean p(j0 j0Var) {
        boolean zP = false;
        for (s sVar : j0Var.f784c.f()) {
            if (sVar != null) {
                v vVar = sVar.F;
                if ((vVar == null ? null : vVar.B) != null) {
                    zP |= p(sVar.k());
                }
                y0 y0Var = sVar.f884b0;
                androidx.lifecycle.l lVar = androidx.lifecycle.l.f983f;
                androidx.lifecycle.l lVar2 = androidx.lifecycle.l.f982d;
                if (y0Var != null) {
                    y0Var.c();
                    if (y0Var.f929b.f993e.a(lVar)) {
                        androidx.lifecycle.s sVar2 = sVar.f884b0.f929b;
                        sVar2.d("setCurrentState");
                        sVar2.f(lVar2);
                        zP = true;
                    }
                }
                if (sVar.f882a0.f993e.a(lVar)) {
                    androidx.lifecycle.s sVar3 = sVar.f882a0;
                    sVar3.d("setCurrentState");
                    sVar3.f(lVar2);
                    zP = true;
                }
            }
        }
        return zP;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.C);
        printWriter.print(" mResumed=");
        printWriter.print(this.D);
        printWriter.print(" mStopped=");
        printWriter.print(this.E);
        if (getApplication() != null) {
            ur0 ur0Var = new ur0(f(), d1.b.f12295d);
            String canonicalName = d1.b.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            s.l lVar = ((d1.b) ur0Var.t(d1.b.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f12296c;
            if (lVar.f16630d > 0) {
                printWriter.print(str2);
                printWriter.println("Loaders:");
                if (lVar.f16630d > 0) {
                    fb1.t(lVar.f16629b[0]);
                    printWriter.print(str2);
                    printWriter.print("  #");
                    printWriter.print(lVar.f16628a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        this.A.d().u(str, fileDescriptor, printWriter, strArr);
    }

    public final j0 n() {
        return this.A.d();
    }

    @Override // androidx.activity.i, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.A.e();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.i, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        k kVar = this.A;
        kVar.e();
        super.onConfigurationChanged(configuration);
        ((v) kVar.f808a).A.h(configuration);
    }

    @Override // androidx.activity.i, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B.e(androidx.lifecycle.k.ON_CREATE);
        j0 j0Var = ((v) this.A.f808a).A;
        j0Var.A = false;
        j0Var.B = false;
        j0Var.H.f815h = false;
        j0Var.s(1);
    }

    @Override // androidx.activity.i, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            super.onCreatePanelMenu(i10, menu);
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        return ((v) this.A.f808a).A.j(menu, getMenuInflater()) | true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((v) this.A.f808a).A.f787f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((v) this.A.f808a).A.k();
        this.B.e(androidx.lifecycle.k.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((v) this.A.f808a).A.l();
    }

    @Override // androidx.activity.i, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        k kVar = this.A;
        if (i10 == 0) {
            return ((v) kVar.f808a).A.n(menuItem);
        }
        if (i10 != 6) {
            return false;
        }
        return ((v) kVar.f808a).A.i();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z9) {
        ((v) this.A.f808a).A.m(z9);
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onNewIntent(Intent intent) {
        this.A.e();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.i, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            ((v) this.A.f808a).A.o();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.D = false;
        ((v) this.A.f808a).A.s(5);
        this.B.e(androidx.lifecycle.k.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z9) {
        ((v) this.A.f808a).A.q(z9);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.B.e(androidx.lifecycle.k.ON_RESUME);
        j0 j0Var = ((v) this.A.f808a).A;
        j0Var.A = false;
        j0Var.B = false;
        j0Var.H.f815h = false;
        j0Var.s(7);
    }

    @Override // androidx.activity.i, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(0, view, menu);
            return ((v) this.A.f808a).A.r() | true;
        }
        super.onPreparePanel(i10, view, menu);
        return true;
    }

    @Override // androidx.activity.i, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.A.e();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        k kVar = this.A;
        kVar.e();
        super.onResume();
        this.D = true;
        ((v) kVar.f808a).A.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        k kVar = this.A;
        kVar.e();
        super.onStart();
        this.E = false;
        boolean z9 = this.C;
        Object obj = kVar.f808a;
        if (!z9) {
            this.C = true;
            j0 j0Var = ((v) obj).A;
            j0Var.A = false;
            j0Var.B = false;
            j0Var.H.f815h = false;
            j0Var.s(4);
        }
        ((v) obj).A.x(true);
        this.B.e(androidx.lifecycle.k.ON_START);
        j0 j0Var2 = ((v) obj).A;
        j0Var2.A = false;
        j0Var2.B = false;
        j0Var2.H.f815h = false;
        j0Var2.s(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.A.e();
    }

    @Override // android.app.Activity
    public void onStop() {
        k kVar;
        super.onStop();
        this.E = true;
        do {
            kVar = this.A;
        } while (p(kVar.d()));
        j0 j0Var = ((v) kVar.f808a).A;
        j0Var.B = true;
        j0Var.H.f815h = true;
        j0Var.s(4);
        this.B.e(androidx.lifecycle.k.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((v) this.A.f808a).A.f787f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}

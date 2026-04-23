package f;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import l.c4;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends androidx.fragment.app.w implements r, d {
    public k0 F;

    public q() {
        this.f149h.f16385b.b("androidx:appcompat", new o(this));
        k(new p(this));
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        q().a(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.q.attachBaseContext(android.content.Context):void");
    }

    @Override // f.r
    public final void c() {
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        b4.f fVarR = r();
        if (getWindow().hasFeature(0)) {
            if (fVarR == null || !fVarR.e()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.k, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        b4.f fVarR = r();
        if (keyCode == 82 && fVarR != null && fVarR.E(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // f.r
    public final void e() {
    }

    @Override // android.app.Activity
    public final View findViewById(int i10) {
        k0 k0Var = (k0) q();
        k0Var.y();
        return k0Var.f12913x.findViewById(i10);
    }

    @Override // f.r
    public final void g() {
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        k0 k0Var = (k0) q();
        if (k0Var.B == null) {
            k0Var.E();
            b4.f fVar = k0Var.A;
            k0Var.B = new j.j(fVar != null ? fVar.r() : k0Var.f12912w);
        }
        return k0Var.B;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = c4.f14838a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        q().c();
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q().e(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent intentH;
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        b4.f fVarR = r();
        if (menuItem.getItemId() != 16908332 || fVarR == null || (fVarR.o() & 4) == 0 || (intentH = p7.q.h(this)) == null) {
            return false;
        }
        if (!androidx.core.app.l.c(this, intentH)) {
            androidx.core.app.l.b(this, intentH);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent intentH2 = p7.q.h(this);
        if (intentH2 == null) {
            intentH2 = p7.q.h(this);
        }
        if (intentH2 != null) {
            ComponentName component = intentH2.getComponent();
            if (component == null) {
                component = intentH2.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            try {
                Intent intentI = p7.q.i(this, component);
                while (intentI != null) {
                    arrayList.add(size, intentI);
                    intentI = p7.q.i(this, intentI.getComponent());
                }
                arrayList.add(intentH2);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = d0.f.f12287a;
        d0.a.a(this, intentArr, null);
        try {
            int i11 = androidx.core.app.e.f455b;
            androidx.core.app.a.a(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((k0) q()).y();
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        k0 k0Var = (k0) q();
        k0Var.E();
        b4.f fVar = k0Var.A;
        if (fVar != null) {
            fVar.L(true);
        }
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public void onStart() throws IllegalAccessException {
        super.onStart();
        ((k0) q()).o(true, false);
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public final void onStop() {
        super.onStop();
        k0 k0Var = (k0) q();
        k0Var.E();
        b4.f fVar = k0Var.A;
        if (fVar != null) {
            fVar.L(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        q().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        b4.f fVarR = r();
        if (getWindow().hasFeature(0)) {
            if (fVarR == null || !fVarR.G()) {
                super.openOptionsMenu();
            }
        }
    }

    public final u q() {
        if (this.F == null) {
            t0 t0Var = u.f12969a;
            this.F = new k0(this, null, this, this);
        }
        return this.F;
    }

    public final b4.f r() {
        k0 k0Var = (k0) q();
        k0Var.E();
        return k0Var.A;
    }

    public final void s() {
        getWindow().getDecorView().setTag(R.id.yc, this);
        getWindow().getDecorView().setTag(R.id.yf, this);
        View decorView = getWindow().getDecorView();
        g4.a0.f(decorView, "<this>");
        decorView.setTag(R.id.ye, this);
        View decorView2 = getWindow().getDecorView();
        g4.a0.f(decorView2, "<this>");
        decorView2.setTag(R.id.yd, this);
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        s();
        q().j(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        ((k0) q()).f12897f0 = i10;
    }

    public final void t(Toolbar toolbar) {
        k0 k0Var = (k0) q();
        if (k0Var.f12911v instanceof Activity) {
            k0Var.E();
            b4.f fVar = k0Var.A;
            if (fVar instanceof d1) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            k0Var.B = null;
            if (fVar != null) {
                fVar.A();
            }
            k0Var.A = null;
            if (toolbar != null) {
                Object obj = k0Var.f12911v;
                y0 y0Var = new y0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : k0Var.C, k0Var.f12914y);
                k0Var.A = y0Var;
                k0Var.f12914y.f12826b = y0Var.f12990e;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                k0Var.f12914y.f12826b = null;
            }
            k0Var.c();
        }
    }

    @Override // androidx.activity.i, android.app.Activity
    public void setContentView(View view) {
        s();
        q().k(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        q().l(view, layoutParams);
    }
}

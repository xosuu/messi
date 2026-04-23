package f;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f12825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w0 f12826b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12827d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12828f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12829h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k0 f12830q;

    public e0(k0 k0Var, Window.Callback callback) {
        this.f12830q = k0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f12825a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f12827d = true;
            callback.onContentChanged();
        } finally {
            this.f12827d = false;
        }
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f12825a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f12825a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f12825a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f12825a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z9 = this.f12828f;
        Window.Callback callback = this.f12825a;
        return z9 ? callback.dispatchKeyEvent(keyEvent) : this.f12830q.w(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.f12825a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        k0 k0Var = this.f12830q;
        k0Var.E();
        b4.f fVar = k0Var.A;
        if (fVar != null && fVar.C(keyCode, keyEvent)) {
            return true;
        }
        j0 j0Var = k0Var.Y;
        if (j0Var != null && k0Var.J(j0Var, keyEvent.getKeyCode(), keyEvent)) {
            j0 j0Var2 = k0Var.Y;
            if (j0Var2 == null) {
                return true;
            }
            j0Var2.f12881l = true;
            return true;
        }
        if (k0Var.Y == null) {
            j0 j0VarD = k0Var.D(0);
            k0Var.K(j0VarD, keyEvent);
            boolean zJ = k0Var.J(j0VarD, keyEvent.getKeyCode(), keyEvent);
            j0VarD.f12880k = false;
            if (zJ) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f12825a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f12825a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f12825a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f12825a.onDetachedFromWindow();
    }

    public final boolean f(int i10, Menu menu) {
        return this.f12825a.onMenuOpened(i10, menu);
    }

    public final void g(int i10, Menu menu) {
        this.f12825a.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z9) {
        j.o.a(this.f12825a, z9);
    }

    public final void i(List list, Menu menu, int i10) {
        j.n.a(this.f12825a, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f12825a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z9) {
        this.f12825a.onWindowFocusChanged(z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j.g l(android.view.ActionMode.Callback r11) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e0.l(android.view.ActionMode$Callback):j.g");
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f12827d) {
            this.f12825a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof k.o)) {
            return this.f12825a.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        w0 w0Var = this.f12826b;
        if (w0Var != null) {
            View view = i10 == 0 ? new View(w0Var.f12982a.f12988c.f15068a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f12825a.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f12825a.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        f(i10, menu);
        k0 k0Var = this.f12830q;
        if (i10 == 108) {
            k0Var.E();
            b4.f fVar = k0Var.A;
            if (fVar != null) {
                fVar.j(true);
            }
        } else {
            k0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f12829h) {
            this.f12825a.onPanelClosed(i10, menu);
            return;
        }
        g(i10, menu);
        k0 k0Var = this.f12830q;
        if (i10 == 108) {
            k0Var.E();
            b4.f fVar = k0Var.A;
            if (fVar != null) {
                fVar.j(false);
                return;
            }
            return;
        }
        if (i10 != 0) {
            k0Var.getClass();
            return;
        }
        j0 j0VarD = k0Var.D(i10);
        if (j0VarD.f12882m) {
            k0Var.u(j0VarD, false);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        k.o oVar = menu instanceof k.o ? (k.o) menu : null;
        if (i10 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.f14582x = true;
        }
        w0 w0Var = this.f12826b;
        if (w0Var != null && i10 == 0) {
            y0 y0Var = w0Var.f12982a;
            if (!y0Var.f12991f) {
                y0Var.f12988c.f15079l = true;
                y0Var.f12991f = true;
            }
        }
        boolean zOnPreparePanel = this.f12825a.onPreparePanel(i10, view, menu);
        if (oVar != null) {
            oVar.f14582x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        k.o oVar = this.f12830q.D(0).f12877h;
        if (oVar != null) {
            i(list, oVar, i10);
        } else {
            i(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.m.a(this.f12825a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        this.f12830q.getClass();
        return l(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f12825a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        this.f12830q.getClass();
        if (i10 != 0) {
            return j.m.b(this.f12825a, callback, i10);
        }
        return l(callback);
    }
}

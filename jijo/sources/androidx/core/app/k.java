package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends Activity implements androidx.lifecycle.q, o0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.s f496a;

    @Override // o0.l
    public final boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !z3.a.v(decorView, keyEvent)) {
            return z3.a.w(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !z3.a.v(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public void i() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.d0.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.s sVar = this.f496a;
        sVar.d("markState");
        androidx.lifecycle.l lVar = androidx.lifecycle.l.f982d;
        sVar.d("setCurrentState");
        sVar.f(lVar);
        super.onSaveInstanceState(bundle);
    }
}

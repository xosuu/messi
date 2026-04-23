package h5;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f14059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f14060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f14061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f14062d;

    public p(o oVar) {
        this.f14059a = oVar.f14045a;
        this.f14060b = oVar;
        this.f14061c = oVar.getContext();
        this.f14062d = oVar.f14051s;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public p0.d h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof l;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(p0.g gVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z9) {
    }

    public final void q() {
        this.f14060b.e(false);
    }

    public abstract void r();

    public void s() {
    }
}

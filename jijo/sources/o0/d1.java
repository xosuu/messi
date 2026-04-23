package o0;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f16019a;

    public d1(View view) {
        this.f16019a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f16019a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f16019a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = (View) this.f16019a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(e1 e1Var) {
        View view = (View) this.f16019a.get();
        if (view != null) {
            if (e1Var != null) {
                view.animate().setListener(new b1(this, e1Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f16019a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}

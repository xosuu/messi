package o0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f16082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f16083b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f16084d;

    public w(ViewGroup viewGroup, Runnable runnable) {
        this.f16082a = viewGroup;
        this.f16083b = viewGroup.getViewTreeObserver();
        this.f16084d = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        w wVar = new w(viewGroup, runnable);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(wVar);
        viewGroup.addOnAttachStateChangeListener(wVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f16083b.isAlive();
        View view = this.f16082a;
        if (zIsAlive) {
            this.f16083b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f16084d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f16083b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f16083b.isAlive();
        View view2 = this.f16082a;
        if (zIsAlive) {
            this.f16083b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}

package w1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AnimatorListenerAdapter implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f18092c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18095f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18093d = true;

    public f0(int i10, View view) {
        this.f18090a = view;
        this.f18091b = i10;
        this.f18092c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // w1.p
    public final void a() {
    }

    @Override // w1.p
    public final void b(q qVar) {
        if (!this.f18095f) {
            y.f18150a.w(this.f18090a, this.f18091b);
            ViewGroup viewGroup = this.f18092c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        qVar.v(this);
    }

    @Override // w1.p
    public final void c() {
        f(false);
    }

    @Override // w1.p
    public final void d() {
        f(true);
    }

    @Override // w1.p
    public final void e() {
    }

    public final void f(boolean z9) {
        ViewGroup viewGroup;
        if (!this.f18093d || this.f18094e == z9 || (viewGroup = this.f18092c) == null) {
            return;
        }
        this.f18094e = z9;
        q7.b.u(viewGroup, z9);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f18095f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f18095f) {
            y.f18150a.w(this.f18090a, this.f18091b);
            ViewGroup viewGroup = this.f18092c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f18095f) {
            return;
        }
        y.f18150a.w(this.f18090a, this.f18091b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f18095f) {
            return;
        }
        y.f18150a.w(this.f18090a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

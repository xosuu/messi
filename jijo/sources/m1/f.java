package m1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f15465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15467e;

    public /* synthetic */ f(k kVar, Object obj, View view, ViewPropertyAnimator viewPropertyAnimator, int i10) {
        this.f15463a = i10;
        this.f15467e = kVar;
        this.f15464b = obj;
        this.f15465c = view;
        this.f15466d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f15463a) {
            case 1:
                this.f15465c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f15463a;
        Object obj = this.f15467e;
        View view = this.f15465c;
        Object obj2 = this.f15466d;
        Object obj3 = this.f15464b;
        switch (i10) {
            case 0:
                ((ViewPropertyAnimator) obj2).setListener(null);
                view.setAlpha(1.0f);
                k kVar = (k) obj;
                e1 e1Var = (e1) obj3;
                kVar.c(e1Var);
                kVar.f15518q.remove(e1Var);
                kVar.i();
                break;
            case 1:
                ((ViewPropertyAnimator) obj2).setListener(null);
                k kVar2 = (k) obj;
                e1 e1Var2 = (e1) obj3;
                kVar2.c(e1Var2);
                kVar2.f15516o.remove(e1Var2);
                kVar2.i();
                break;
            default:
                ((ViewGroup) obj3).endViewTransition(view);
                animator.removeListener(this);
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) obj2;
                View view2 = sVar.S;
                if (view2 != null && sVar.L) {
                    view2.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f15463a;
        Object obj = this.f15467e;
        switch (i10) {
            case 0:
                ((k) obj).getClass();
                break;
            case 1:
                ((k) obj).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public f(k kVar, e1 e1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f15463a = 0;
        this.f15467e = kVar;
        this.f15464b = e1Var;
        this.f15466d = viewPropertyAnimator;
        this.f15465c = view;
    }
}

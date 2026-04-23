package m1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f15482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f15483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f15484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f15485e;

    public /* synthetic */ h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f15481a = i10;
        this.f15485e = kVar;
        this.f15482b = iVar;
        this.f15483c = viewPropertyAnimator;
        this.f15484d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f15481a;
        k kVar = this.f15485e;
        i iVar = this.f15482b;
        View view = this.f15484d;
        ViewPropertyAnimator viewPropertyAnimator = this.f15483c;
        switch (i10) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.c(iVar.f15488a);
                kVar.f15519r.remove(iVar.f15488a);
                kVar.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.c(iVar.f15489b);
                kVar.f15519r.remove(iVar.f15489b);
                kVar.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f15481a;
        k kVar = this.f15485e;
        i iVar = this.f15482b;
        switch (i10) {
            case 0:
                e1 e1Var = iVar.f15488a;
                kVar.getClass();
                break;
            default:
                e1 e1Var2 = iVar.f15489b;
                kVar.getClass();
                break;
        }
    }
}

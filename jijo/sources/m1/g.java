package m1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f15471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f15473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f15475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f15476f;

    public g(k kVar, e1 e1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f15476f = kVar;
        this.f15471a = e1Var;
        this.f15472b = i10;
        this.f15473c = view;
        this.f15474d = i11;
        this.f15475e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f15472b;
        View view = this.f15473c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f15474d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15475e.setListener(null);
        k kVar = this.f15476f;
        e1 e1Var = this.f15471a;
        kVar.c(e1Var);
        kVar.f15517p.remove(e1Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f15476f.getClass();
    }
}

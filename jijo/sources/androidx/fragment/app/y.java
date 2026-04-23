package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0.b f927e;

    public y(ViewGroup viewGroup, View view, s sVar, d0 d0Var, k0.b bVar) {
        this.f923a = viewGroup;
        this.f924b = view;
        this.f925c = sVar;
        this.f926d = d0Var;
        this.f927e = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f923a;
        View view = this.f924b;
        viewGroup.endViewTransition(view);
        s sVar = this.f925c;
        q qVar = sVar.V;
        Animator animator2 = qVar == null ? null : qVar.f862b;
        sVar.i().f862b = null;
        if (animator2 == null || viewGroup.indexOfChild(view) >= 0) {
            return;
        }
        this.f926d.c(sVar, this.f927e);
    }
}

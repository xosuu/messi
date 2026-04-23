package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f744e;

    public c(ViewGroup viewGroup, View view, boolean z9, b1 b1Var, f fVar) {
        this.f740a = viewGroup;
        this.f741b = view;
        this.f742c = z9;
        this.f743d = b1Var;
        this.f744e = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f740a;
        View view = this.f741b;
        viewGroup.endViewTransition(view);
        if (this.f742c) {
            g1.a.a(this.f743d.f732a, view);
        }
        this.f744e.b();
    }
}

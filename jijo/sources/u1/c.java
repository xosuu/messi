package u1;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f17511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17512b;

    public c(e eVar, d dVar) {
        this.f17512b = eVar;
        this.f17511a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f17512b;
        d dVar = this.f17511a;
        eVar.a(1.0f, dVar, true);
        dVar.f17523k = dVar.f17517e;
        dVar.f17524l = dVar.f17518f;
        dVar.f17525m = dVar.f17519g;
        dVar.a((dVar.f17522j + 1) % dVar.f17521i.length);
        if (!eVar.f17542q) {
            eVar.f17541h += 1.0f;
            return;
        }
        eVar.f17542q = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f17526n) {
            dVar.f17526n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17512b.f17541h = 0.0f;
    }
}

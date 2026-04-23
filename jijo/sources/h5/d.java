package h5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f14016b;

    public /* synthetic */ d(e eVar, int i10) {
        this.f14015a = i10;
        this.f14016b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14015a) {
            case 1:
                this.f14016b.f14060b.g(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f14015a) {
            case 0:
                this.f14016b.f14060b.g(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

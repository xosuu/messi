package m1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15545a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15546b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15547c;

    public n(View view) {
        this.f15547c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f15545a) {
            case 0:
                this.f15546b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f15545a;
        Object obj = this.f15547c;
        switch (i10) {
            case 0:
                if (!this.f15546b) {
                    p pVar = (p) obj;
                    if (((Float) pVar.f15584z.getAnimatedValue()).floatValue() != 0.0f) {
                        pVar.A = 2;
                        pVar.f15577s.invalidate();
                    } else {
                        pVar.A = 0;
                        pVar.g(0);
                    }
                } else {
                    this.f15546b = false;
                }
                break;
            default:
                View view = (View) obj;
                w1.y.f18150a.z(view, 1.0f);
                if (this.f15546b) {
                    view.setLayerType(0, null);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f15545a) {
            case 1:
                View view = (View) this.f15547c;
                WeakHashMap weakHashMap = o0.v0.f16075a;
                if (o0.d0.h(view) && view.getLayerType() == 0) {
                    this.f15546b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public n(p pVar) {
        this.f15547c = pVar;
    }
}

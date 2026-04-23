package m1;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f15554a;

    public o(p pVar) {
        this.f15554a = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        p pVar = this.f15554a;
        pVar.f15561c.setAlpha(iFloatValue);
        pVar.f15562d.setAlpha(iFloatValue);
        pVar.f15577s.invalidate();
    }
}

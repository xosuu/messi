package g5;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f13850c;

    public e(f fVar, View view, View view2) {
        this.f13850c = fVar;
        this.f13848a = view;
        this.f13849b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f13850c.c(this.f13848a, this.f13849b, valueAnimator.getAnimatedFraction());
    }
}

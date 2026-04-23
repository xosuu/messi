package u1;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17510b;

    public /* synthetic */ b(Object obj, d dVar) {
        this.f17510b = obj;
        this.f17509a = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e eVar = (e) this.f17510b;
        d dVar = (d) this.f17509a;
        eVar.getClass();
        e.d(fFloatValue, dVar);
        eVar.a(fFloatValue, dVar, false);
        eVar.invalidateSelf();
    }
}

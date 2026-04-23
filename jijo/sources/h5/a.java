package h5;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f14009b;

    public /* synthetic */ a(p pVar, int i10) {
        this.f14008a = i10;
        this.f14009b = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f14008a;
        p pVar = this.f14009b;
        switch (i10) {
            case 0:
                e eVar = (e) pVar;
                eVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = eVar.f14062d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            case 1:
                e eVar2 = (e) pVar;
                eVar2.getClass();
                eVar2.f14062d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                l lVar = (l) pVar;
                lVar.getClass();
                lVar.f14062d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}

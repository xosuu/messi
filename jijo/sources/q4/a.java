package q4;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import d5.f;
import d5.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16431b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f16430a = i10;
        this.f16431b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f16430a;
        Object obj = this.f16431b;
        switch (i10) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) obj).f11778i;
                if (gVar != null) {
                    f fVar = gVar.f12396a;
                    if (fVar.f12384j != fFloatValue) {
                        fVar.f12384j = fFloatValue;
                        gVar.f12400h = true;
                        gVar.invalidateSelf();
                    }
                }
                break;
            case 1:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            default:
                ((TextInputLayout) obj).E0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}

package o0;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {
    public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
    }
}

package team.dev.epro.apkcustom.widgets;

import android.animation.ValueAnimator;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FreshDownloadView f17399b;

    static {
        NativeUtil.classesInit0(208);
    }

    public /* synthetic */ c(FreshDownloadView freshDownloadView, int i10) {
        this.f17398a = i10;
        this.f17399b = freshDownloadView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final native void onAnimationUpdate(ValueAnimator valueAnimator);
}

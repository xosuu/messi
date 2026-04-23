package team.dev.epro.apkcustom.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FreshDownloadView f17397b;

    static {
        NativeUtil.classesInit0(206);
    }

    public /* synthetic */ b(FreshDownloadView freshDownloadView, int i10) {
        this.f17396a = i10;
        this.f17397b = freshDownloadView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final native void onAnimationCancel(Animator animator);

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final native void onAnimationEnd(Animator animator);

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final native void onAnimationStart(Animator animator);
}

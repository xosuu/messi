package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f751a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f755e;

    public d(ViewGroup viewGroup, s sVar, d0 d0Var, k0.b bVar) {
        this.f752b = viewGroup;
        this.f753c = sVar;
        this.f754d = d0Var;
        this.f755e = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i10 = this.f751a;
        ViewGroup viewGroup = this.f752b;
        switch (i10) {
            case 0:
                viewGroup.post(new x(1, this));
                break;
            default:
                viewGroup.post(new x(0, this));
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public d(h hVar, ViewGroup viewGroup, View view, f fVar) {
        this.f755e = hVar;
        this.f752b = viewGroup;
        this.f753c = view;
        this.f754d = fVar;
    }
}

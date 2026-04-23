package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Animation f931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Animator f932b;

    public z(Animation animation) {
        this.f931a = animation;
        this.f932b = null;
    }

    public z(Animator animator) {
        this.f931a = null;
        this.f932b = animator;
    }
}

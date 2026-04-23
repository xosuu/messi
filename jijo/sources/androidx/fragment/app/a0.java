package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f721b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f722d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f723f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f724h;

    public a0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f724h = true;
        this.f720a = viewGroup;
        this.f721b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f724h = true;
        if (this.f722d) {
            return !this.f723f;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f722d = true;
            o0.w.a(this.f720a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9 = this.f722d;
        ViewGroup viewGroup = this.f720a;
        if (z9 || !this.f724h) {
            viewGroup.endViewTransition(this.f721b);
            this.f723f = true;
        } else {
            this.f724h = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f10) {
        this.f724h = true;
        if (this.f722d) {
            return !this.f723f;
        }
        if (!super.getTransformation(j10, transformation, f10)) {
            this.f722d = true;
            o0.w.a(this.f720a, this);
        }
        return true;
    }
}

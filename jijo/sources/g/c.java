package g;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObjectAnimator f13539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13540c;

    public c(AnimationDrawable animationDrawable, boolean z9, boolean z10) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i10 = z9 ? numberOfFrames - 1 : 0;
        int i11 = z9 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f13542b = numberOfFrames2;
        int[] iArr = dVar.f13541a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f13541a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f13541a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            int duration = animationDrawable.getDuration(z9 ? (numberOfFrames2 - i13) - 1 : i13);
            iArr2[i13] = duration;
            i12 += duration;
        }
        dVar.f13543c = i12;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
        h.a.a(objectAnimatorOfInt, true);
        objectAnimatorOfInt.setDuration(dVar.f13543c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f13540c = z10;
        this.f13539b = objectAnimatorOfInt;
    }

    @Override // q7.b
    public final boolean e() {
        return this.f13540c;
    }

    @Override // q7.b
    public final void r() {
        this.f13539b.reverse();
    }

    @Override // q7.b
    public final void s() {
        this.f13539b.start();
    }

    @Override // q7.b
    public final void t() {
        this.f13539b.cancel();
    }
}

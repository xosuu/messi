package v0;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17689a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.f17689a) {
            case 0:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            default:
                float f12 = f10 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }
}

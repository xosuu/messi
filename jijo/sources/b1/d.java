package b1;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f1235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1236b;

    public d(float[] fArr) {
        this.f1235a = fArr;
        this.f1236b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1235a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f1236b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float f13 = fArr[iMin];
        return fb1.c(fArr[iMin + 1], f13, f12, f13);
    }
}

package m1;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15531b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f15530a = i10;
        this.f15531b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15530a;
        Object obj = this.f15531b;
        switch (i10) {
            case 0:
                p pVar = (p) obj;
                int i11 = pVar.A;
                ValueAnimator valueAnimator = pVar.f15584z;
                if (i11 == 1) {
                    valueAnimator.cancel();
                } else if (i11 != 2) {
                }
                pVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).w0();
                break;
        }
    }
}

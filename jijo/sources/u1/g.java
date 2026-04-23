package u1;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f17546b;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i10) {
        this.f17545a = i10;
        this.f17546b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        int i10 = this.f17545a;
        SwipeRefreshLayout swipeRefreshLayout = this.f17546b;
        switch (i10) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f10);
                break;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f10);
                break;
            case 2:
                swipeRefreshLayout.getClass();
                int iAbs = swipeRefreshLayout.I - Math.abs(swipeRefreshLayout.H);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.G + ((int) ((iAbs - r5) * f10))) - swipeRefreshLayout.E.getTop());
                e eVar = swipeRefreshLayout.K;
                float f11 = 1.0f - f10;
                d dVar = eVar.f17537a;
                if (f11 != dVar.f17528p) {
                    dVar.f17528p = f11;
                }
                eVar.invalidateSelf();
                break;
            case 3:
                swipeRefreshLayout.e(f10);
                break;
            default:
                swipeRefreshLayout.getClass();
                swipeRefreshLayout.setAnimationProgress(((-0.0f) * f10) + 0.0f);
                swipeRefreshLayout.e(f10);
                break;
        }
    }
}

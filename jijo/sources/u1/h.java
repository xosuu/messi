package u1;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17548b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f17549d;

    public h(SwipeRefreshLayout swipeRefreshLayout, int i10, int i11) {
        this.f17549d = swipeRefreshLayout;
        this.f17547a = i10;
        this.f17548b = i11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        this.f17549d.K.setAlpha((int) (((this.f17548b - r0) * f10) + this.f17547a));
    }
}

package u1;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import t8.a0;
import t8.s;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f17544b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i10) {
        this.f17543a = i10;
        this.f17544b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j jVar;
        int i10 = this.f17543a;
        SwipeRefreshLayout swipeRefreshLayout = this.f17544b;
        switch (i10) {
            case 0:
                if (!swipeRefreshLayout.f1116d) {
                    swipeRefreshLayout.f();
                } else {
                    swipeRefreshLayout.K.setAlpha(255);
                    swipeRefreshLayout.K.start();
                    if (swipeRefreshLayout.P && (jVar = swipeRefreshLayout.f1115b) != null) {
                        a0 a0Var = ((s) jVar).f17087a;
                        a0Var.f17028l0.setRefreshing(false);
                        a0Var.n0();
                    }
                    swipeRefreshLayout.f1126y = swipeRefreshLayout.E.getTop();
                }
                break;
            default:
                swipeRefreshLayout.getClass();
                g gVar = new g(swipeRefreshLayout, 1);
                swipeRefreshLayout.M = gVar;
                gVar.setDuration(150L);
                a aVar = swipeRefreshLayout.E;
                aVar.f17508a = null;
                aVar.clearAnimation();
                swipeRefreshLayout.E.startAnimation(swipeRefreshLayout.M);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

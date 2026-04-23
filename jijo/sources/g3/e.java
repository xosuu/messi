package g3;

import android.animation.ValueAnimator;
import android.graphics.Color;
import com.github.clans.fab.FloatingActionMenu;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FloatingActionMenu f13650e;

    public /* synthetic */ e(FloatingActionMenu floatingActionMenu, int i10, int i11, int i12, int i13) {
        this.f13646a = i13;
        this.f13650e = floatingActionMenu;
        this.f13647b = i10;
        this.f13648c = i11;
        this.f13649d = i12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f13646a;
        FloatingActionMenu floatingActionMenu = this.f13650e;
        int i11 = this.f13647b;
        int i12 = this.f13649d;
        int i13 = this.f13648c;
        switch (i10) {
            case 0:
                floatingActionMenu.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), i11, i13, i12));
                break;
            default:
                floatingActionMenu.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), i11, i13, i12));
                break;
        }
    }
}

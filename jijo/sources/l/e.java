package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f14847b;

    public /* synthetic */ e(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f14846a = i10;
        this.f14847b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14846a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f14847b;
        switch (i10) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.I = actionBarOverlayLayout.f253f.animate().translationY(0.0f).setListener(actionBarOverlayLayout.J);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.I = actionBarOverlayLayout.f253f.animate().translationY(-actionBarOverlayLayout.f253f.getHeight()).setListener(actionBarOverlayLayout.J);
                break;
        }
    }
}

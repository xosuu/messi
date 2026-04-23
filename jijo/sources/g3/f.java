package g3;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f13652b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13653d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FloatingActionMenu f13654f;

    public /* synthetic */ f(FloatingActionMenu floatingActionMenu, FloatingActionButton floatingActionButton, boolean z9, int i10) {
        this.f13651a = i10;
        this.f13654f = floatingActionMenu;
        this.f13652b = floatingActionButton;
        this.f13653d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13651a;
        FloatingActionButton floatingActionButton = this.f13652b;
        boolean z9 = this.f13653d;
        FloatingActionMenu floatingActionMenu = this.f13654f;
        switch (i10) {
            case 0:
                if (!floatingActionMenu.f1845v) {
                    if (floatingActionButton != floatingActionMenu.f1826h) {
                        floatingActionButton.m(z9);
                    }
                    k kVar = (k) floatingActionButton.getTag(R.id.j1);
                    if (kVar != null && kVar.C) {
                        if (z9 && kVar.f13676z != null) {
                            kVar.A.cancel();
                            kVar.startAnimation(kVar.f13676z);
                        }
                        kVar.setVisibility(0);
                        break;
                    }
                }
                break;
            default:
                if (floatingActionMenu.f1845v) {
                    if (floatingActionButton != floatingActionMenu.f1826h) {
                        floatingActionButton.g(z9);
                    }
                    k kVar2 = (k) floatingActionButton.getTag(R.id.j1);
                    if (kVar2 != null && kVar2.C) {
                        if (z9 && kVar2.A != null) {
                            kVar2.f13676z.cancel();
                            kVar2.startAnimation(kVar2.A);
                        }
                        kVar2.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}

package g3;

import com.github.clans.fab.FloatingActionMenu;
import com.google.android.gms.internal.ads.cj0;
import com.google.android.gms.internal.ads.i90;
import com.google.android.gms.internal.ads.kp;
import com.google.android.gms.internal.ads.ol1;
import com.google.android.gms.internal.ads.ri1;
import com.google.android.gms.internal.ads.ui1;
import com.google.android.gms.internal.ads.yn0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13658b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13659d;

    public /* synthetic */ h(Object obj, boolean z9, int i10) {
        this.f13657a = i10;
        this.f13659d = obj;
        this.f13658b = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9 = this.f13658b;
        int i10 = this.f13657a;
        Object obj = this.f13659d;
        switch (i10) {
            case 0:
                if (z9) {
                    FloatingActionMenu floatingActionMenu = (FloatingActionMenu) obj;
                    floatingActionMenu.startAnimation(floatingActionMenu.f1829j0);
                }
                FloatingActionMenu floatingActionMenu2 = (FloatingActionMenu) obj;
                floatingActionMenu2.setVisibility(4);
                floatingActionMenu2.f1830k0 = false;
                break;
            case 1:
                ((kp) obj).n(z9);
                break;
            case 2:
                i90 i90Var = (i90) obj;
                i90Var.f5531l.e(null, i90Var.f5540u.zzf(), i90Var.f5540u.zzl(), i90Var.f5540u.zzm(), z9, i90Var.o(), 0);
                break;
            default:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                int i11 = yn0.f10944a;
                ui1 ui1Var = ((ri1) ((ol1) cj0Var.f3302d)).f8608a;
                if (ui1Var.L != z9) {
                    ui1Var.L = z9;
                    c8.a aVar = new c8.a(5, z9);
                    x.e eVar = ui1Var.f9507k;
                    eVar.j(23, aVar);
                    eVar.i();
                    break;
                }
                break;
        }
    }
}

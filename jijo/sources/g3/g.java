package g3;

import com.github.clans.fab.FloatingActionMenu;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingActionMenu f13656b;

    public /* synthetic */ g(FloatingActionMenu floatingActionMenu, int i10) {
        this.f13655a = i10;
        this.f13656b = floatingActionMenu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13655a;
        FloatingActionMenu floatingActionMenu = this.f13656b;
        switch (i10) {
            case 0:
                floatingActionMenu.f1845v = true;
                i iVar = floatingActionMenu.f1833n0;
                if (iVar != null) {
                    x4.a aVar = (x4.a) iVar;
                    if (App.f17100w.f17415a.getBoolean("mainFragment", true)) {
                        ((MainActivity) aVar.f18391b).V.setVisibility(0);
                        ((MainActivity) aVar.f18391b).X.setVisibility(8);
                    } else {
                        MainActivity mainActivity = (MainActivity) aVar.f18391b;
                        String strI0 = App.f17101x.i0();
                        a9.b bVar = MainActivity.N0;
                        if (!Boolean.valueOf(mainActivity.L(strI0)[2]).booleanValue()) {
                            ((MainActivity) aVar.f18391b).X.setVisibility(0);
                            try {
                                if (Boolean.valueOf(((MainActivity) aVar.f18391b).L(App.f17101x.i0())[19]).booleanValue()) {
                                    ((MainActivity) aVar.f18391b).X.setVisibility(8);
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                floatingActionMenu.f1845v = false;
                break;
        }
    }
}

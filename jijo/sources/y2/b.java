package y2;

import com.balsikandar.crashreporter.ui.CrashReporterActivity;
import com.github.clans.fab.FloatingActionMenu;
import f.q;
import g3.h;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import z1.f;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20449a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f20450b;

    public b(CrashReporterActivity crashReporterActivity) {
        this.f20450b = crashReporterActivity;
    }

    @Override // z1.f
    public final void a(int i10) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z1.f
    public final void b(int i10) {
        int i11 = this.f20449a;
        q qVar = this.f20450b;
        switch (i11) {
            case 0:
                ((CrashReporterActivity) qVar).H = i10;
                break;
            default:
                MainActivity mainActivity = (MainActivity) qVar;
                mainActivity.f17114b0 = i10;
                App.f17100w.f17415a.edit().putInt("currentPosition", mainActivity.f17114b0).commit();
                boolean z9 = false;
                Object[] objArr = 0;
                if (i10 == 0) {
                    if (!App.f17100w.f17415a.getBoolean("mainFragment", true) && App.f17100w.f17415a.getBoolean("isFreeVPN", false)) {
                        mainActivity.Y.m(false);
                        mainActivity.P.p0();
                    } else {
                        mainActivity.Y.g(false);
                        mainActivity.U.b();
                    }
                } else if (!App.f17100w.f17415a.getBoolean("mainFragment", true) && App.f17100w.f17415a.getBoolean("isFreeVPN", false)) {
                    mainActivity.Y.g(false);
                } else {
                    FloatingActionMenu floatingActionMenu = mainActivity.U;
                    if (floatingActionMenu.getVisibility() != 4 && !floatingActionMenu.f1830k0) {
                        floatingActionMenu.f1830k0 = true;
                        if (!floatingActionMenu.f1845v) {
                            floatingActionMenu.setVisibility(4);
                            floatingActionMenu.f1830k0 = false;
                        } else {
                            floatingActionMenu.a(false);
                            floatingActionMenu.f1847x.postDelayed(new h(floatingActionMenu, z9, objArr == true ? 1 : 0), floatingActionMenu.U * floatingActionMenu.f1843u);
                        }
                    }
                }
                break;
        }
    }

    @Override // z1.f
    public final void c(float f10, int i10, int i11) {
    }

    public b(MainActivity mainActivity) {
        this.f20450b = mainActivity;
    }
}

package p8;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.internal.ads.ur0;
import f.k0;
import f.x;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class p implements x0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.c f16349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DrawerLayout f16350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.i f16351c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16355g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16357i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16352d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16353e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16356h = false;

    /* JADX WARN: Multi-variable type inference failed */
    public p(MainActivity mainActivity, Activity activity, DrawerLayout drawerLayout, Toolbar toolbar) {
        this.f16357i = mainActivity;
        int i10 = 0;
        if (toolbar != null) {
            this.f16349a = new ur0(toolbar);
            toolbar.setNavigationOnClickListener(new f.b(i10, this));
        } else if (activity instanceof f.d) {
            k0 k0Var = (k0) ((f.q) ((f.d) activity)).q();
            k0Var.getClass();
            this.f16349a = new x(k0Var);
        } else {
            this.f16349a = new f.f(activity);
        }
        this.f16350b = drawerLayout;
        this.f16354f = R.string.pc;
        this.f16355g = R.string.pb;
        f.c cVar = this.f16349a;
        this.f16351c = new g.i(cVar.o());
        cVar.k();
    }

    public final void a(float f10) {
        if (f10 == 1.0f) {
            g.i iVar = this.f16351c;
            if (!iVar.f13594i) {
                iVar.f13594i = true;
                iVar.invalidateSelf();
            }
        } else if (f10 == 0.0f) {
            g.i iVar2 = this.f16351c;
            if (iVar2.f13594i) {
                iVar2.f13594i = false;
                iVar2.invalidateSelf();
            }
        }
        g.i iVar3 = this.f16351c;
        if (iVar3.f13595j != f10) {
            iVar3.f13595j = f10;
            iVar3.invalidateSelf();
        }
    }

    public final void b() {
        DrawerLayout drawerLayout = this.f16350b;
        View viewE = drawerLayout.e(8388611);
        if (viewE == null || !DrawerLayout.n(viewE)) {
            a(0.0f);
        } else {
            a(1.0f);
        }
        if (this.f16353e) {
            g.i iVar = this.f16351c;
            View viewE2 = drawerLayout.e(8388611);
            int i10 = (viewE2 == null || !DrawerLayout.n(viewE2)) ? this.f16354f : this.f16355g;
            boolean z9 = this.f16356h;
            f.c cVar = this.f16349a;
            if (!z9 && !cVar.d()) {
                this.f16356h = true;
            }
            cVar.a(iVar, i10);
        }
    }
}

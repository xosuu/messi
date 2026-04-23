package x0;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v0.e f18282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.activity.e f18283d = new androidx.activity.e(7, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f18284e;

    public e(DrawerLayout drawerLayout, int i10) {
        this.f18284e = drawerLayout;
        this.f18281b = i10;
    }

    @Override // t3.i
    public final int e(View view, int i10) {
        DrawerLayout drawerLayout = this.f18284e;
        if (drawerLayout.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i10, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i10, width));
    }

    @Override // t3.i
    public final int f(View view, int i10) {
        return view.getTop();
    }

    @Override // t3.i
    public final int m(View view) {
        this.f18284e.getClass();
        if (DrawerLayout.o(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // t3.i
    public final void p(int i10, int i11) {
        int i12 = i10 & 1;
        DrawerLayout drawerLayout = this.f18284e;
        View viewE = i12 == 1 ? drawerLayout.e(3) : drawerLayout.e(5);
        if (viewE == null || drawerLayout.i(viewE) != 0) {
            return;
        }
        this.f18282c.b(viewE, i11);
    }

    @Override // t3.i
    public final void q() {
        this.f18284e.postDelayed(this.f18283d, 160L);
    }

    @Override // t3.i
    public final void r(View view, int i10) {
        ((d) view.getLayoutParams()).f18279c = false;
        int i11 = this.f18281b == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f18284e;
        View viewE = drawerLayout.e(i11);
        if (viewE != null) {
            drawerLayout.b(viewE);
        }
    }

    @Override // t3.i
    public final void s(int i10) throws Exception {
        this.f18284e.v(this.f18282c.f17710t, i10);
    }

    @Override // t3.i
    public final void t(View view, int i10, int i11) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f18284e;
        float width2 = (drawerLayout.a(view, 3) ? i10 + width : drawerLayout.getWidth() - i10) / width;
        drawerLayout.s(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // t3.i
    public final void u(View view, float f10, float f11) {
        int i10;
        DrawerLayout drawerLayout = this.f18284e;
        drawerLayout.getClass();
        float f12 = ((d) view.getLayoutParams()).f18278b;
        int width = view.getWidth();
        if (drawerLayout.a(view, 3)) {
            i10 = (f10 > 0.0f || (f10 == 0.0f && f12 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f10 < 0.0f || (f10 == 0.0f && f12 > 0.5f)) {
                width2 -= width;
            }
            i10 = width2;
        }
        this.f18282c.p(i10, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // t3.i
    public final boolean y(View view, int i10) {
        DrawerLayout drawerLayout = this.f18284e;
        drawerLayout.getClass();
        return DrawerLayout.o(view) && drawerLayout.a(view, this.f18281b) && drawerLayout.i(view) == 0;
    }
}

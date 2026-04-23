package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends o implements SubMenu {
    public final r A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o f14545z;

    public j0(Context context, o oVar, r rVar) {
        super(context);
        this.f14545z = oVar;
        this.A = rVar;
    }

    @Override // k.o
    public final boolean d(r rVar) {
        return this.f14545z.d(rVar);
    }

    @Override // k.o
    public final boolean e(o oVar, MenuItem menuItem) {
        return super.e(oVar, menuItem) || this.f14545z.e(oVar, menuItem);
    }

    @Override // k.o
    public final boolean f(r rVar) {
        return this.f14545z.f(rVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // k.o
    public final String j() {
        r rVar = this.A;
        int i10 = rVar != null ? rVar.f14588a : 0;
        if (i10 == 0) {
            return null;
        }
        return fb1.g("android:menu:actionviewstates:", i10);
    }

    @Override // k.o
    public final o k() {
        return this.f14545z.k();
    }

    @Override // k.o
    public final boolean m() {
        return this.f14545z.m();
    }

    @Override // k.o
    public final boolean n() {
        return this.f14545z.n();
    }

    @Override // k.o
    public final boolean o() {
        return this.f14545z.o();
    }

    @Override // k.o, android.view.Menu
    public final void setGroupDividerEnabled(boolean z9) {
        this.f14545z.setGroupDividerEnabled(z9);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // k.o, android.view.Menu
    public final void setQwertyMode(boolean z9) {
        this.f14545z.setQwertyMode(z9);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }
}

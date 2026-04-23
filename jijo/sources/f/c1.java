package f;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends j.b implements k.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12796d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k.o f12797f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j.a f12798h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f12799q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d1 f12800s;

    public c1(d1 d1Var, Context context, z zVar) {
        this.f12800s = d1Var;
        this.f12796d = context;
        this.f12798h = zVar;
        k.o oVar = new k.o(context);
        oVar.f14570l = 1;
        this.f12797f = oVar;
        oVar.f14563e = this;
    }

    @Override // j.b
    public final void a() {
        d1 d1Var = this.f12800s;
        if (d1Var.f12809k != this) {
            return;
        }
        if (d1Var.f12816r) {
            d1Var.f12810l = this;
            d1Var.f12811m = this.f12798h;
        } else {
            this.f12798h.e(this);
        }
        this.f12798h = null;
        d1Var.q0(false);
        ActionBarContextView actionBarContextView = d1Var.f12806h;
        if (actionBarContextView.f246w == null) {
            actionBarContextView.e();
        }
        d1Var.f12803e.setHideOnContentScrollEnabled(d1Var.f12821w);
        d1Var.f12809k = null;
    }

    @Override // j.b
    public final View b() {
        WeakReference weakReference = this.f12799q;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.b
    public final k.o c() {
        return this.f12797f;
    }

    @Override // j.b
    public final MenuInflater d() {
        return new j.j(this.f12796d);
    }

    @Override // j.b
    public final CharSequence e() {
        return this.f12800s.f12806h.getSubtitle();
    }

    @Override // j.b
    public final CharSequence f() {
        return this.f12800s.f12806h.getTitle();
    }

    @Override // j.b
    public final void g() {
        if (this.f12800s.f12809k != this) {
            return;
        }
        k.o oVar = this.f12797f;
        oVar.w();
        try {
            this.f12798h.f(this, oVar);
        } finally {
            oVar.v();
        }
    }

    @Override // j.b
    public final boolean h() {
        return this.f12800s.f12806h.E;
    }

    @Override // j.b
    public final void i(View view) {
        this.f12800s.f12806h.setCustomView(view);
        this.f12799q = new WeakReference(view);
    }

    @Override // j.b
    public final void j(int i10) {
        k(this.f12800s.f12801c.getResources().getString(i10));
    }

    @Override // j.b
    public final void k(CharSequence charSequence) {
        this.f12800s.f12806h.setSubtitle(charSequence);
    }

    @Override // j.b
    public final void l(int i10) {
        m(this.f12800s.f12801c.getResources().getString(i10));
    }

    @Override // j.b
    public final void m(CharSequence charSequence) {
        this.f12800s.f12806h.setTitle(charSequence);
    }

    @Override // k.m
    public final boolean n(k.o oVar, MenuItem menuItem) {
        j.a aVar = this.f12798h;
        if (aVar != null) {
            return aVar.a(this, menuItem);
        }
        return false;
    }

    @Override // j.b
    public final void o(boolean z9) {
        this.f14220b = z9;
        this.f12800s.f12806h.setTitleOptional(z9);
    }

    @Override // k.m
    public final void q(k.o oVar) {
        if (this.f12798h == null) {
            return;
        }
        g();
        androidx.appcompat.widget.b bVar = this.f12800s.f12806h.f239f;
        if (bVar != null) {
            bVar.o();
        }
    }
}

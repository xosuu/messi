package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b implements k.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f14227d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f14228f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f14229h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f14230q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k.o f14232t;

    @Override // j.b
    public final void a() {
        if (this.f14231s) {
            return;
        }
        this.f14231s = true;
        this.f14229h.e(this);
    }

    @Override // j.b
    public final View b() {
        WeakReference weakReference = this.f14230q;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.b
    public final k.o c() {
        return this.f14232t;
    }

    @Override // j.b
    public final MenuInflater d() {
        return new j(this.f14228f.getContext());
    }

    @Override // j.b
    public final CharSequence e() {
        return this.f14228f.getSubtitle();
    }

    @Override // j.b
    public final CharSequence f() {
        return this.f14228f.getTitle();
    }

    @Override // j.b
    public final void g() {
        this.f14229h.f(this, this.f14232t);
    }

    @Override // j.b
    public final boolean h() {
        return this.f14228f.E;
    }

    @Override // j.b
    public final void i(View view) {
        this.f14228f.setCustomView(view);
        this.f14230q = view != null ? new WeakReference(view) : null;
    }

    @Override // j.b
    public final void j(int i10) {
        k(this.f14227d.getString(i10));
    }

    @Override // j.b
    public final void k(CharSequence charSequence) {
        this.f14228f.setSubtitle(charSequence);
    }

    @Override // j.b
    public final void l(int i10) {
        m(this.f14227d.getString(i10));
    }

    @Override // j.b
    public final void m(CharSequence charSequence) {
        this.f14228f.setTitle(charSequence);
    }

    @Override // k.m
    public final boolean n(k.o oVar, MenuItem menuItem) {
        return this.f14229h.a(this, menuItem);
    }

    @Override // j.b
    public final void o(boolean z9) {
        this.f14220b = z9;
        this.f14228f.setTitleOptional(z9);
    }

    @Override // k.m
    public final void q(k.o oVar) {
        g();
        androidx.appcompat.widget.b bVar = this.f14228f.f239f;
        if (bVar != null) {
            bVar.o();
        }
    }
}

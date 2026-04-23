package a5;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class a extends t.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Typeface f20b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x4.a f21d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22f;

    public a(x4.a aVar, Typeface typeface) {
        super(4);
        this.f20b = typeface;
        this.f21d = aVar;
    }

    @Override // t.a
    public final void k(int i10) {
        if (this.f22f) {
            return;
        }
        x4.b bVar = (x4.b) this.f21d.f18391b;
        if (bVar.j(this.f20b)) {
            bVar.h(false);
        }
    }

    @Override // t.a
    public final void l(Typeface typeface, boolean z9) {
        if (this.f22f) {
            return;
        }
        x4.b bVar = (x4.b) this.f21d.f18391b;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}

package a5;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.a f23b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f24c;

    public b(d dVar, t.a aVar) {
        this.f24c = dVar;
        this.f23b = aVar;
    }

    @Override // q7.b
    public final void m(int i10) {
        this.f24c.f41m = true;
        this.f23b.k(i10);
    }

    @Override // q7.b
    public final void n(Typeface typeface) {
        d dVar = this.f24c;
        dVar.f42n = Typeface.create(typeface, dVar.f31c);
        dVar.f41m = true;
        this.f23b.l(dVar.f42n, false);
    }
}

package k7;

import java.io.IOException;
import p7.k;
import p7.t;
import p7.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f14727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14728b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14729d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f14730f;

    public a(g gVar) {
        this.f14730f = gVar;
        this.f14727a = new k(gVar.f14746c.b());
    }

    public final void a(IOException iOException, boolean z9) {
        g gVar = this.f14730f;
        int i10 = gVar.f14748e;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException("state: " + gVar.f14748e);
        }
        k kVar = this.f14727a;
        v vVar = kVar.f16284e;
        kVar.f16284e = v.f16306d;
        vVar.a();
        vVar.b();
        gVar.f14748e = 6;
        i7.d dVar = gVar.f14745b;
        if (dVar != null) {
            dVar.h(!z9, gVar, iOException);
        }
    }

    @Override // p7.t
    public final v b() {
        return this.f14727a;
    }

    @Override // p7.t
    public long x(p7.e eVar, long j10) throws IOException {
        try {
            long jX = this.f14730f.f14746c.x(eVar, j10);
            if (jX > 0) {
                this.f14729d += jX;
            }
            return jX;
        } catch (IOException e10) {
            a(e10, false);
            throw e10;
        }
    }
}

package k7;

import p7.k;
import p7.s;
import p7.v;

/* JADX INFO: loaded from: classes.dex */
public final class b implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f14731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14732b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f14733d;

    public b(g gVar) {
        this.f14733d = gVar;
        this.f14731a = new k(gVar.f14747d.b());
    }

    @Override // p7.s
    public final v b() {
        return this.f14731a;
    }

    @Override // p7.s, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f14732b) {
            return;
        }
        this.f14732b = true;
        this.f14733d.f14747d.w("0\r\n\r\n");
        g gVar = this.f14733d;
        k kVar = this.f14731a;
        gVar.getClass();
        v vVar = kVar.f16284e;
        kVar.f16284e = v.f16306d;
        vVar.a();
        vVar.b();
        this.f14733d.f14748e = 3;
    }

    @Override // p7.s, java.io.Flushable
    public final synchronized void flush() {
        if (this.f14732b) {
            return;
        }
        this.f14733d.f14747d.flush();
    }

    @Override // p7.s
    public final void h(p7.e eVar, long j10) {
        if (this.f14732b) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return;
        }
        g gVar = this.f14733d;
        gVar.f14747d.d(j10);
        gVar.f14747d.w("\r\n");
        gVar.f14747d.h(eVar, j10);
        gVar.f14747d.w("\r\n");
    }
}

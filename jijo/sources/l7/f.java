package l7;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p7.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15264b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15265d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f15266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, v vVar) {
        super(vVar);
        this.f15266f = gVar;
        this.f15264b = false;
        this.f15265d = 0L;
    }

    @Override // p7.j, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f15264b) {
            return;
        }
        this.f15264b = true;
        g gVar = this.f15266f;
        gVar.f15270b.h(false, gVar, null);
    }

    @Override // p7.t
    public final long x(p7.e eVar, long j10) throws IOException {
        try {
            long jX = this.f16283a.x(eVar, j10);
            if (jX > 0) {
                this.f15265d += jX;
            }
            return jX;
        } catch (IOException e10) {
            if (!this.f15264b) {
                this.f15264b = true;
                g gVar = this.f15266f;
                gVar.f15270b.h(false, gVar, e10);
            }
            throw e10;
        }
    }
}

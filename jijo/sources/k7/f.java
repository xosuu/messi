package k7;

import java.io.IOException;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14743h;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14728b) {
            return;
        }
        if (!this.f14743h) {
            a(null, false);
        }
        this.f14728b = true;
    }

    @Override // k7.a, p7.t
    public final long x(p7.e eVar, long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.g("byteCount < 0: ", j10));
        }
        if (this.f14728b) {
            throw new IllegalStateException("closed");
        }
        if (this.f14743h) {
            return -1L;
        }
        long jX = super.x(eVar, j10);
        if (jX != -1) {
            return jX;
        }
        this.f14743h = true;
        a(null, true);
        return -1L;
    }
}

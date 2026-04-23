package k7;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14742h;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14728b) {
            return;
        }
        if (this.f14742h != 0) {
            if (!g7.b.q(this, 100, TimeUnit.MILLISECONDS)) {
                a(null, false);
            }
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
        long j11 = this.f14742h;
        if (j11 == 0) {
            return -1L;
        }
        long jX = super.x(eVar, Math.min(j11, j10));
        if (jX == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(protocolException, false);
            throw protocolException;
        }
        long j12 = this.f14742h - jX;
        this.f14742h = j12;
        if (j12 == 0) {
            a(null, true);
        }
        return jX;
    }
}

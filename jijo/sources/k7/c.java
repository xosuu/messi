package k7;

import f7.q;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f14734h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f14735q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14736s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f14737t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, q qVar) {
        super(gVar);
        this.f14737t = gVar;
        this.f14735q = -1L;
        this.f14736s = true;
        this.f14734h = qVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14728b) {
            return;
        }
        if (this.f14736s) {
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
        if (!this.f14736s) {
            return -1L;
        }
        long j11 = this.f14735q;
        if (j11 == 0 || j11 == -1) {
            g gVar = this.f14737t;
            if (j11 != -1) {
                gVar.f14746c.m();
            }
            try {
                this.f14735q = gVar.f14746c.z();
                String strTrim = gVar.f14746c.m().trim();
                if (this.f14735q < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f14735q + strTrim + "\"");
                }
                if (this.f14735q == 0) {
                    this.f14736s = false;
                    j7.f.d(gVar.f14744a.f13377u, this.f14734h, gVar.h());
                    a(null, true);
                }
                if (!this.f14736s) {
                    return -1L;
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }
        long jX = super.x(eVar, Math.min(j10, this.f14735q));
        if (jX != -1) {
            this.f14735q -= jX;
            return jX;
        }
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a(protocolException, false);
        throw protocolException;
    }
}

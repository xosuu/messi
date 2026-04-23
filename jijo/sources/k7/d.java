package k7;

import java.net.ProtocolException;
import p7.k;
import p7.s;
import p7.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f14738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14739b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14740d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f14741f;

    public d(g gVar, long j10) {
        this.f14741f = gVar;
        this.f14738a = new k(gVar.f14747d.b());
        this.f14740d = j10;
    }

    @Override // p7.s
    public final v b() {
        return this.f14738a;
    }

    @Override // p7.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        if (this.f14739b) {
            return;
        }
        this.f14739b = true;
        if (this.f14740d > 0) {
            throw new ProtocolException("unexpected end of stream");
        }
        g gVar = this.f14741f;
        gVar.getClass();
        k kVar = this.f14738a;
        v vVar = kVar.f16284e;
        kVar.f16284e = v.f16306d;
        vVar.a();
        vVar.b();
        gVar.f14748e = 3;
    }

    @Override // p7.s, java.io.Flushable
    public final void flush() {
        if (this.f14739b) {
            return;
        }
        this.f14741f.f14747d.flush();
    }

    @Override // p7.s
    public final void h(p7.e eVar, long j10) throws ProtocolException {
        if (this.f14739b) {
            throw new IllegalStateException("closed");
        }
        long j11 = eVar.f16276b;
        byte[] bArr = g7.b.f13888a;
        if (j10 < 0 || 0 > j11 || j11 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (j10 <= this.f14740d) {
            this.f14741f.f14747d.h(eVar, j10);
            this.f14740d -= j10;
        } else {
            throw new ProtocolException("expected " + this.f14740d + " bytes but received " + j10);
        }
    }
}

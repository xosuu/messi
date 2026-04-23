package l7;

import java.io.IOException;
import java.io.InterruptedIOException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes.dex */
public final class v implements p7.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.e f15331a = new p7.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7.e f15332b = new p7.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15333d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15334f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15335h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f15336q;

    public v(x xVar, long j10) {
        this.f15336q = xVar;
        this.f15333d = j10;
    }

    @Override // p7.t
    public final p7.v b() {
        return this.f15336q.f15347i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f15336q) {
            this.f15334f = true;
            this.f15332b.a();
            this.f15336q.notifyAll();
        }
        this.f15336q.a();
    }

    @Override // p7.t
    public final long x(p7.e eVar, long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(l.a0.g("byteCount < 0: ", j10));
        }
        synchronized (this.f15336q) {
            try {
                x xVar = this.f15336q;
                xVar.f15347i.i();
                while (this.f15332b.f16276b == 0 && !this.f15335h && !this.f15334f && xVar.f15349k == null) {
                    try {
                        try {
                            xVar.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        xVar.f15347i.n();
                        throw th;
                    }
                }
                xVar.f15347i.n();
                if (this.f15334f) {
                    throw new IOException("stream closed");
                }
                x xVar2 = this.f15336q;
                if (xVar2.f15349k != null) {
                    throw new StreamResetException(xVar2.f15349k);
                }
                p7.e eVar2 = this.f15332b;
                long j11 = eVar2.f16276b;
                if (j11 == 0) {
                    return -1L;
                }
                long jX = eVar2.x(eVar, Math.min(j10, j11));
                x xVar3 = this.f15336q;
                long j12 = xVar3.f15339a + jX;
                xVar3.f15339a = j12;
                if (j12 >= xVar3.f15342d.f15315z.j() / 2) {
                    x xVar4 = this.f15336q;
                    xVar4.f15342d.G(xVar4.f15341c, xVar4.f15339a);
                    this.f15336q.f15339a = 0L;
                }
                synchronized (this.f15336q.f15342d) {
                    try {
                        r rVar = this.f15336q.f15342d;
                        long j13 = rVar.f15313x + jX;
                        rVar.f15313x = j13;
                        if (j13 >= rVar.f15315z.j() / 2) {
                            r rVar2 = this.f15336q.f15342d;
                            rVar2.G(0, rVar2.f15313x);
                            this.f15336q.f15342d.f15313x = 0L;
                        }
                    } finally {
                    }
                }
                return jX;
            } finally {
            }
        }
    }
}

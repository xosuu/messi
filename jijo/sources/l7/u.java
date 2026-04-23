package l7;

import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class u implements p7.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.e f15327a = new p7.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15328b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15329d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f15330f;

    public u(x xVar) {
        this.f15330f = xVar;
    }

    public final void a(boolean z9) {
        x xVar;
        long jMin;
        x xVar2;
        synchronized (this.f15330f) {
            this.f15330f.f15348j.i();
            while (true) {
                try {
                    xVar = this.f15330f;
                    if (xVar.f15340b > 0 || this.f15329d || this.f15328b || xVar.f15349k != null) {
                        break;
                    }
                    try {
                        xVar.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } finally {
                    this.f15330f.f15348j.n();
                }
            }
            xVar.f15348j.n();
            this.f15330f.b();
            jMin = Math.min(this.f15330f.f15340b, this.f15327a.f16276b);
            xVar2 = this.f15330f;
            xVar2.f15340b -= jMin;
        }
        xVar2.f15348j.i();
        try {
            x xVar3 = this.f15330f;
            xVar3.f15342d.E(xVar3.f15341c, z9 && jMin == this.f15327a.f16276b, this.f15327a, jMin);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p7.s
    public final p7.v b() {
        return this.f15330f.f15348j;
    }

    @Override // p7.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f15330f) {
            try {
                if (this.f15328b) {
                    return;
                }
                x xVar = this.f15330f;
                if (!xVar.f15346h.f15329d) {
                    if (this.f15327a.f16276b > 0) {
                        while (this.f15327a.f16276b > 0) {
                            a(true);
                        }
                    } else {
                        xVar.f15342d.E(xVar.f15341c, true, null, 0L);
                    }
                }
                synchronized (this.f15330f) {
                    this.f15328b = true;
                }
                this.f15330f.f15342d.flush();
                this.f15330f.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p7.s, java.io.Flushable
    public final void flush() {
        synchronized (this.f15330f) {
            this.f15330f.b();
        }
        while (this.f15327a.f16276b > 0) {
            a(false);
            this.f15330f.f15342d.flush();
        }
    }

    @Override // p7.s
    public final void h(p7.e eVar, long j10) {
        p7.e eVar2 = this.f15327a;
        eVar2.h(eVar, j10);
        while (eVar2.f16276b >= 16384) {
            a(false);
        }
    }
}

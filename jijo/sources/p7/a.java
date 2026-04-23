package p7;

import com.google.android.gms.internal.ads.go;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16260a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16261b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16262d;

    public a(OutputStream outputStream, l7.w wVar) {
        this.f16261b = wVar;
        this.f16262d = outputStream;
    }

    @Override // p7.s
    public final v b() {
        switch (this.f16260a) {
            case 0:
                return (c) this.f16262d;
            default:
                return (v) this.f16261b;
        }
    }

    @Override // p7.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i10 = this.f16260a;
        Object obj = this.f16262d;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.i();
                try {
                    try {
                        ((s) this.f16261b).close();
                        cVar.j(true);
                        return;
                    } catch (IOException e10) {
                        c cVar2 = (c) obj;
                        if (!cVar2.k()) {
                            throw e10;
                        }
                        throw cVar2.l(e10);
                    }
                } catch (Throwable th) {
                    cVar.j(false);
                    throw th;
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // p7.s, java.io.Flushable
    public final void flush() throws IOException {
        int i10 = this.f16260a;
        Object obj = this.f16262d;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.i();
                try {
                    try {
                        ((s) this.f16261b).flush();
                        cVar.j(true);
                        return;
                    } catch (IOException e10) {
                        c cVar2 = (c) obj;
                        if (!cVar2.k()) {
                            throw e10;
                        }
                        throw cVar2.l(e10);
                    }
                } catch (Throwable th) {
                    cVar.j(false);
                    throw th;
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // p7.s
    public final void h(e eVar, long j10) throws IOException {
        int i10 = this.f16260a;
        Object obj = this.f16262d;
        Object obj2 = this.f16261b;
        switch (i10) {
            case 0:
                w.a(eVar.f16276b, 0L, j10);
                while (j10 > 0) {
                    go goVar = eVar.f16275a;
                    long j11 = 0;
                    while (true) {
                        if (j11 < 65536) {
                            j11 += (long) (goVar.f5002b - goVar.f5001a);
                            if (j11 >= j10) {
                                j11 = j10;
                            } else {
                                goVar = (go) goVar.f5006f;
                            }
                        }
                    }
                    c cVar = (c) obj;
                    cVar.i();
                    try {
                        try {
                            ((s) obj2).h(eVar, j11);
                            j10 -= j11;
                            cVar.j(true);
                        } catch (IOException e10) {
                            c cVar2 = (c) obj;
                            if (!cVar2.k()) {
                                throw e10;
                            }
                            throw cVar2.l(e10);
                        }
                    } catch (Throwable th) {
                        cVar.j(false);
                        throw th;
                    }
                }
                return;
            default:
                w.a(eVar.f16276b, 0L, j10);
                while (j10 > 0) {
                    ((v) obj2).f();
                    go goVar2 = eVar.f16275a;
                    int iMin = (int) Math.min(j10, goVar2.f5002b - goVar2.f5001a);
                    ((OutputStream) obj).write((byte[]) goVar2.f5005e, goVar2.f5001a, iMin);
                    int i11 = goVar2.f5001a + iMin;
                    goVar2.f5001a = i11;
                    long j12 = iMin;
                    j10 -= j12;
                    eVar.f16276b -= j12;
                    if (i11 == goVar2.f5002b) {
                        eVar.f16275a = goVar2.a();
                        q.n(goVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f16260a) {
            case 0:
                return "AsyncTimeout.sink(" + ((s) this.f16261b) + ")";
            default:
                return "sink(" + ((OutputStream) this.f16262d) + ")";
        }
    }

    public a(l7.w wVar, a aVar) {
        this.f16262d = wVar;
        this.f16261b = aVar;
    }
}

package p7;

import com.google.android.gms.internal.ads.go;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16263a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16264b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16265d;

    public b(InputStream inputStream, v vVar) {
        this.f16264b = vVar;
        this.f16265d = inputStream;
    }

    @Override // p7.t
    public final v b() {
        switch (this.f16263a) {
            case 0:
                return (c) this.f16265d;
            default:
                return (v) this.f16264b;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i10 = this.f16263a;
        Object obj = this.f16265d;
        try {
            switch (i10) {
                case 0:
                    try {
                        ((t) this.f16264b).close();
                        ((c) obj).j(true);
                        return;
                    } catch (IOException e10) {
                        c cVar = (c) obj;
                        if (!cVar.k()) {
                            throw e10;
                        }
                        throw cVar.l(e10);
                    }
                default:
                    ((InputStream) obj).close();
                    return;
            }
        } catch (Throwable th) {
            ((c) obj).j(false);
            throw th;
        }
        ((c) obj).j(false);
        throw th;
    }

    public final String toString() {
        switch (this.f16263a) {
            case 0:
                return "AsyncTimeout.source(" + ((t) this.f16264b) + ")";
            default:
                return "source(" + ((InputStream) this.f16265d) + ")";
        }
    }

    @Override // p7.t
    public final long x(e eVar, long j10) throws IOException {
        int i10 = this.f16263a;
        Object obj = this.f16265d;
        Object obj2 = this.f16264b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.i();
                try {
                    try {
                        long jX = ((t) obj2).x(eVar, j10);
                        cVar.j(true);
                        return jX;
                    } catch (IOException e10) {
                        c cVar2 = (c) obj;
                        if (cVar2.k()) {
                            throw cVar2.l(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th) {
                    cVar.j(false);
                    throw th;
                }
            default:
                if (j10 < 0) {
                    throw new IllegalArgumentException(a0.g("byteCount < 0: ", j10));
                }
                if (j10 == 0) {
                    return 0L;
                }
                try {
                    ((v) obj2).f();
                    go goVarG = eVar.G(1);
                    int i11 = ((InputStream) obj).read((byte[]) goVarG.f5005e, goVarG.f5002b, (int) Math.min(j10, 8192 - goVarG.f5002b));
                    if (i11 == -1) {
                        return -1L;
                    }
                    goVarG.f5002b += i11;
                    long j11 = i11;
                    eVar.f16276b += j11;
                    return j11;
                } catch (AssertionError e11) {
                    Logger logger = n.f16294a;
                    if (e11.getCause() == null || e11.getMessage() == null || !e11.getMessage().contains("getsockname failed")) {
                        throw e11;
                    }
                    throw new IOException(e11);
                }
        }
    }

    public b(l7.w wVar, b bVar) {
        this.f16265d = wVar;
        this.f16264b = bVar;
    }
}

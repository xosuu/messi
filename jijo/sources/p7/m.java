package p7;

import com.google.android.gms.internal.ads.go;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f16291b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16292d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16293f;

    public m(p pVar, Inflater inflater) {
        this.f16290a = pVar;
        this.f16291b = inflater;
    }

    @Override // p7.t
    public final v b() {
        return this.f16290a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f16293f) {
            return;
        }
        this.f16291b.end();
        this.f16293f = true;
        this.f16290a.close();
    }

    @Override // p7.t
    public final long x(e eVar, long j10) throws IOException {
        boolean z9;
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.g("byteCount < 0: ", j10));
        }
        if (this.f16293f) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            Inflater inflater = this.f16291b;
            boolean zNeedsInput = inflater.needsInput();
            g gVar = this.f16290a;
            z9 = false;
            if (zNeedsInput) {
                int i10 = this.f16292d;
                if (i10 != 0) {
                    int remaining = i10 - inflater.getRemaining();
                    this.f16292d -= remaining;
                    gVar.i(remaining);
                }
                if (inflater.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                if (gVar.n()) {
                    z9 = true;
                } else {
                    go goVar = gVar.f().f16275a;
                    int i11 = goVar.f5002b;
                    int i12 = goVar.f5001a;
                    int i13 = i11 - i12;
                    this.f16292d = i13;
                    inflater.setInput((byte[]) goVar.f5005e, i12, i13);
                }
            }
            try {
                go goVarG = eVar.G(1);
                int iInflate = inflater.inflate((byte[]) goVarG.f5005e, goVarG.f5002b, (int) Math.min(j10, 8192 - goVarG.f5002b));
                if (iInflate > 0) {
                    goVarG.f5002b += iInflate;
                    long j11 = iInflate;
                    eVar.f16276b += j11;
                    return j11;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                }
                int i14 = this.f16292d;
                if (i14 != 0) {
                    int remaining2 = i14 - inflater.getRemaining();
                    this.f16292d -= remaining2;
                    gVar.i(remaining2);
                }
                if (goVarG.f5001a != goVarG.f5002b) {
                    return -1L;
                }
                eVar.f16275a = goVarG.a();
                q.n(goVarG);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!z9);
        throw new EOFException("source exhausted prematurely");
    }
}

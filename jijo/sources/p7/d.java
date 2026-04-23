package p7;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f16273b;

    public /* synthetic */ d(g gVar, int i10) {
        this.f16272a = i10;
        this.f16273b = gVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i10 = this.f16272a;
        g gVar = this.f16273b;
        switch (i10) {
            case 0:
                return (int) Math.min(((e) gVar).f16276b, 2147483647L);
            default:
                p pVar = (p) gVar;
                if (pVar.f16300d) {
                    throw new IOException("closed");
                }
                return (int) Math.min(pVar.f16298a.f16276b, 2147483647L);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f16272a) {
            case 0:
                break;
            default:
                ((p) this.f16273b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f16272a;
        g gVar = this.f16273b;
        switch (i10) {
            case 0:
                e eVar = (e) gVar;
                if (eVar.f16276b > 0) {
                    return eVar.C() & 255;
                }
                return -1;
            default:
                p pVar = (p) gVar;
                if (pVar.f16300d) {
                    throw new IOException("closed");
                }
                e eVar2 = pVar.f16298a;
                if (eVar2.f16276b == 0 && pVar.f16299b.x(eVar2, 8192L) == -1) {
                    return -1;
                }
                return eVar2.C() & 255;
        }
    }

    public final String toString() {
        int i10 = this.f16272a;
        g gVar = this.f16273b;
        switch (i10) {
            case 0:
                return ((e) gVar) + ".inputStream()";
            default:
                return ((p) gVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f16272a;
        g gVar = this.f16273b;
        switch (i12) {
            case 0:
                return ((e) gVar).A(bArr, i10, i11);
            default:
                p pVar = (p) gVar;
                if (!pVar.f16300d) {
                    w.a(bArr.length, i10, i11);
                    e eVar = pVar.f16298a;
                    if (eVar.f16276b == 0 && pVar.f16299b.x(eVar, 8192L) == -1) {
                        return -1;
                    }
                    return eVar.A(bArr, i10, i11);
                }
                throw new IOException("closed");
        }
    }
}

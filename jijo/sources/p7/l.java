package p7;

import com.google.android.gms.internal.ads.go;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f16286b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Inflater f16287d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f16288f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16285a = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CRC32 f16289h = new CRC32();

    public l(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f16287d = inflater;
        Logger logger = n.f16294a;
        p pVar = new p(tVar);
        this.f16286b = pVar;
        this.f16288f = new m(pVar, inflater);
    }

    public static void a(int i10, int i11, String str) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    @Override // p7.t
    public final v b() {
        return this.f16286b.f16299b.b();
    }

    public final void c(e eVar, long j10, long j11) {
        go goVar = eVar.f16275a;
        while (true) {
            int i10 = goVar.f5002b;
            int i11 = goVar.f5001a;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            goVar = (go) goVar.f5006f;
        }
        while (j11 > 0) {
            int i12 = (int) (((long) goVar.f5001a) + j10);
            int iMin = (int) Math.min(goVar.f5002b - i12, j11);
            this.f16289h.update((byte[]) goVar.f5005e, i12, iMin);
            j11 -= (long) iMin;
            goVar = (go) goVar.f5006f;
            j10 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16288f.close();
    }

    @Override // p7.t
    public final long x(e eVar, long j10) throws IOException {
        p pVar;
        e eVar2;
        long j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.g("byteCount < 0: ", j10));
        }
        if (j10 == 0) {
            return 0L;
        }
        int i10 = this.f16285a;
        CRC32 crc32 = this.f16289h;
        p pVar2 = this.f16286b;
        if (i10 == 0) {
            pVar2.v(10L);
            e eVar3 = pVar2.f16298a;
            byte bE = eVar3.e(3L);
            boolean z9 = ((bE >> 1) & 1) == 1;
            if (z9) {
                eVar2 = eVar3;
                c(pVar2.f16298a, 0L, 10L);
            } else {
                eVar2 = eVar3;
            }
            a(8075, pVar2.t(), "ID1ID2");
            pVar2.i(8L);
            if (((bE >> 2) & 1) == 1) {
                pVar2.v(2L);
                if (z9) {
                    c(pVar2.f16298a, 0L, 2L);
                }
                short sT = eVar2.t();
                Charset charset = w.f16310a;
                long j12 = (short) (((sT & 255) << 8) | ((sT & 65280) >>> 8));
                pVar2.v(j12);
                if (z9) {
                    c(pVar2.f16298a, 0L, j12);
                    j11 = j12;
                } else {
                    j11 = j12;
                }
                pVar2.i(j11);
            }
            if (((bE >> 3) & 1) == 1) {
                long jA = pVar2.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    throw new EOFException();
                }
                if (z9) {
                    pVar = pVar2;
                    c(pVar2.f16298a, 0L, jA + 1);
                } else {
                    pVar = pVar2;
                }
                pVar.i(jA + 1);
            } else {
                pVar = pVar2;
            }
            if (((bE >> 4) & 1) == 1) {
                long jA2 = pVar.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z9) {
                    c(pVar.f16298a, 0L, jA2 + 1);
                }
                pVar.i(jA2 + 1);
            }
            if (z9) {
                pVar.v(2L);
                short sT2 = eVar2.t();
                Charset charset2 = w.f16310a;
                a((short) (((sT2 & 255) << 8) | ((sT2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f16285a = 1;
        } else {
            pVar = pVar2;
        }
        if (this.f16285a == 1) {
            long j13 = eVar.f16276b;
            long jX = this.f16288f.x(eVar, j10);
            if (jX != -1) {
                c(eVar, j13, jX);
                return jX;
            }
            this.f16285a = 2;
        }
        if (this.f16285a == 2) {
            pVar.v(4L);
            e eVar4 = pVar.f16298a;
            int iK = eVar4.k();
            Charset charset3 = w.f16310a;
            a(((iK & 255) << 24) | ((iK & (-16777216)) >>> 24) | ((iK & 16711680) >>> 8) | ((iK & 65280) << 8), (int) crc32.getValue(), "CRC");
            pVar.v(4L);
            int iK2 = eVar4.k();
            a(((iK2 & 255) << 24) | ((iK2 & (-16777216)) >>> 24) | ((iK2 & 16711680) >>> 8) | ((65280 & iK2) << 8), (int) this.f16287d.getBytesWritten(), "ISIZE");
            this.f16285a = 3;
            if (!pVar.n()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}

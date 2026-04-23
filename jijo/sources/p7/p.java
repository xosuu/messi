package p7;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class p implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f16298a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f16299b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16300d;

    public p(t tVar) {
        if (tVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f16299b = tVar;
    }

    @Override // p7.g
    public final d B() {
        return new d(this, 1);
    }

    @Override // p7.g
    public final byte C() throws EOFException {
        v(1L);
        return this.f16298a.C();
    }

    public final long a(byte b10, long j10, long j11) {
        if (this.f16300d) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j11)));
        }
        while (jMax < j11) {
            long jU = this.f16298a.u(b10, jMax, j11);
            if (jU != -1) {
                return jU;
            }
            e eVar = this.f16298a;
            long j12 = eVar.f16276b;
            if (j12 >= j11 || this.f16299b.x(eVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j12);
        }
        return -1L;
    }

    @Override // p7.t
    public final v b() {
        return this.f16299b.b();
    }

    public final void c(byte[] bArr) throws EOFException {
        e eVar = this.f16298a;
        int i10 = 0;
        try {
            v(bArr.length);
            eVar.getClass();
            while (i10 < bArr.length) {
                int iA = eVar.A(bArr, i10, bArr.length - i10);
                if (iA == -1) {
                    throw new EOFException();
                }
                i10 += iA;
            }
        } catch (EOFException e10) {
            while (true) {
                long j10 = eVar.f16276b;
                if (j10 <= 0) {
                    throw e10;
                }
                int iA2 = eVar.A(bArr, i10, (int) j10);
                if (iA2 == -1) {
                    throw new AssertionError();
                }
                i10 += iA2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f16300d) {
            return;
        }
        this.f16300d = true;
        this.f16299b.close();
        this.f16298a.a();
    }

    public final boolean e(long j10) {
        e eVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.g("byteCount < 0: ", j10));
        }
        if (this.f16300d) {
            throw new IllegalStateException("closed");
        }
        do {
            eVar = this.f16298a;
            if (eVar.f16276b >= j10) {
                return true;
            }
        } while (this.f16299b.x(eVar, 8192L) != -1);
        return false;
    }

    @Override // p7.g
    public final e f() {
        return this.f16298a;
    }

    @Override // p7.g
    public final h g(long j10) throws EOFException {
        v(j10);
        return this.f16298a.g(j10);
    }

    @Override // p7.g
    public final void i(long j10) throws EOFException {
        if (this.f16300d) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            e eVar = this.f16298a;
            if (eVar.f16276b == 0 && this.f16299b.x(eVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, eVar.f16276b);
            eVar.i(jMin);
            j10 -= jMin;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16300d;
    }

    @Override // p7.g
    public final int k() throws EOFException {
        v(4L);
        return this.f16298a.k();
    }

    @Override // p7.g
    public final String m() {
        return r(Long.MAX_VALUE);
    }

    @Override // p7.g
    public final boolean n() {
        if (this.f16300d) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f16298a;
        return eVar.n() && this.f16299b.x(eVar, 8192L) == -1;
    }

    @Override // p7.g
    public final byte[] p(long j10) throws EOFException {
        v(j10);
        return this.f16298a.p(j10);
    }

    @Override // p7.g
    public final String r(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.g("limit < 0: ", j10));
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jA = a((byte) 10, 0L, j11);
        e eVar = this.f16298a;
        if (jA != -1) {
            return eVar.F(jA);
        }
        if (j11 < Long.MAX_VALUE && e(j11) && eVar.e(j11 - 1) == 13 && e(1 + j11) && eVar.e(j11) == 10) {
            return eVar.F(j11);
        }
        e eVar2 = new e();
        eVar.c(eVar2, 0L, Math.min(32L, eVar.f16276b));
        StringBuilder sb = new StringBuilder("\\n not found: limit=");
        sb.append(Math.min(eVar.f16276b, j10));
        sb.append(" content=");
        try {
            sb.append(new h(eVar2.p(eVar2.f16276b)).i());
            sb.append((char) 8230);
            throw new EOFException(sb.toString());
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        e eVar = this.f16298a;
        if (eVar.f16276b == 0 && this.f16299b.x(eVar, 8192L) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    @Override // p7.g
    public final short t() throws EOFException {
        v(2L);
        return this.f16298a.t();
    }

    public final String toString() {
        return "buffer(" + this.f16299b + ")";
    }

    @Override // p7.g
    public final void v(long j10) throws EOFException {
        if (!e(j10)) {
            throw new EOFException();
        }
    }

    @Override // p7.t
    public final long x(e eVar, long j10) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.g("byteCount < 0: ", j10));
        }
        if (this.f16300d) {
            throw new IllegalStateException("closed");
        }
        e eVar2 = this.f16298a;
        if (eVar2.f16276b == 0 && this.f16299b.x(eVar2, 8192L) == -1) {
            return -1L;
        }
        return eVar2.x(eVar, Math.min(j10, eVar2.f16276b));
    }

    @Override // p7.g
    public final long z() throws EOFException {
        e eVar;
        byte bE;
        v(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean zE = e(i11);
            eVar = this.f16298a;
            if (!zE) {
                break;
            }
            bE = eVar.e(i10);
            if ((bE < 48 || bE > 57) && ((bE < 97 || bE > 102) && (bE < 65 || bE > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bE)));
        }
        return eVar.z();
    }
}

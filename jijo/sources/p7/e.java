package p7;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.go;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f16274d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public go f16275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16276b;

    public final int A(byte[] bArr, int i10, int i11) {
        w.a(bArr.length, i10, i11);
        go goVar = this.f16275a;
        if (goVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, goVar.f5002b - goVar.f5001a);
        System.arraycopy((byte[]) goVar.f5005e, goVar.f5001a, bArr, i10, iMin);
        int i12 = goVar.f5001a + iMin;
        goVar.f5001a = i12;
        this.f16276b -= (long) iMin;
        if (i12 == goVar.f5002b) {
            this.f16275a = goVar.a();
            q.n(goVar);
        }
        return iMin;
    }

    @Override // p7.g
    public final d B() {
        return new d(this, 0);
    }

    @Override // p7.g
    public final byte C() {
        long j10 = this.f16276b;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        go goVar = this.f16275a;
        int i10 = goVar.f5001a;
        int i11 = goVar.f5002b;
        int i12 = i10 + 1;
        byte b10 = ((byte[]) goVar.f5005e)[i10];
        this.f16276b = j10 - 1;
        if (i12 == i11) {
            this.f16275a = goVar.a();
            q.n(goVar);
        } else {
            goVar.f5001a = i12;
        }
        return b10;
    }

    public final String D(long j10, Charset charset) {
        w.a(this.f16276b, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException(a0.g("byteCount > Integer.MAX_VALUE: ", j10));
        }
        if (j10 == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        go goVar = this.f16275a;
        int i10 = goVar.f5001a;
        if (((long) i10) + j10 > goVar.f5002b) {
            return new String(p(j10), charset);
        }
        String str = new String((byte[]) goVar.f5005e, i10, (int) j10, charset);
        int i11 = (int) (((long) goVar.f5001a) + j10);
        goVar.f5001a = i11;
        this.f16276b -= j10;
        if (i11 == goVar.f5002b) {
            this.f16275a = goVar.a();
            q.n(goVar);
        }
        return str;
    }

    public final String E() {
        try {
            return D(this.f16276b, w.f16310a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String F(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (e(j11) == 13) {
                String strD = D(j11, w.f16310a);
                i(2L);
                return strD;
            }
        }
        String strD2 = D(j10, w.f16310a);
        i(1L);
        return strD2;
    }

    public final go G(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        go goVar = this.f16275a;
        if (goVar == null) {
            go goVarO = q.o();
            this.f16275a = goVarO;
            goVarO.f5007g = goVarO;
            goVarO.f5006f = goVarO;
            return goVarO;
        }
        go goVar2 = (go) goVar.f5007g;
        if (goVar2.f5002b + i10 <= 8192 && goVar2.f5004d) {
            return goVar2;
        }
        go goVarO2 = q.o();
        goVar2.b(goVarO2);
        return goVarO2;
    }

    public final void H(int i10, byte[] bArr, int i11) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = i11;
        w.a(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            go goVarG = G(1);
            int iMin = Math.min(i12 - i10, 8192 - goVarG.f5002b);
            System.arraycopy(bArr, i10, (byte[]) goVarG.f5005e, goVarG.f5002b, iMin);
            i10 += iMin;
            goVarG.f5002b += iMin;
        }
        this.f16276b += j10;
    }

    public final void I(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        hVar.p(this);
    }

    public final long J(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long jX = tVar.x(this, 8192L);
            if (jX == -1) {
                return j10;
            }
            j10 += jX;
        }
    }

    public final void K(int i10) {
        go goVarG = G(1);
        byte[] bArr = (byte[]) goVarG.f5005e;
        int i11 = goVarG.f5002b;
        goVarG.f5002b = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f16276b++;
    }

    public final void L(long j10) {
        if (j10 == 0) {
            K(48);
            return;
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        go goVarG = G(iNumberOfTrailingZeros);
        byte[] bArr = (byte[]) goVarG.f5005e;
        int i10 = goVarG.f5002b;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f16274d[(int) (15 & j10)];
            j10 >>>= 4;
        }
        goVarG.f5002b += iNumberOfTrailingZeros;
        this.f16276b += (long) iNumberOfTrailingZeros;
    }

    public final void M(int i10) {
        go goVarG = G(4);
        byte[] bArr = (byte[]) goVarG.f5005e;
        int i11 = goVarG.f5002b;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        goVarG.f5002b = i11 + 4;
        this.f16276b += 4;
    }

    public final void N(int i10) {
        go goVarG = G(2);
        byte[] bArr = (byte[]) goVarG.f5005e;
        int i11 = goVarG.f5002b;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        goVarG.f5002b = i11 + 2;
        this.f16276b += 2;
    }

    public final void O(int i10, int i11, String str) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(fb1.g("beginIndex < 0: ", i10));
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(a0.f("endIndex < beginIndex: ", i11, " < ", i10));
        }
        if (i11 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                go goVarG = G(1);
                byte[] bArr = (byte[]) goVarG.f5005e;
                int i12 = goVarG.f5002b - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt;
                while (i13 < iMin) {
                    char cCharAt2 = str.charAt(i13);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i13 + i12] = (byte) cCharAt2;
                    i13++;
                }
                int i14 = goVarG.f5002b;
                int i15 = (i12 + i13) - i14;
                goVarG.f5002b = i14 + i15;
                this.f16276b += (long) i15;
                i10 = i13;
            } else {
                if (cCharAt < 2048) {
                    K((cCharAt >> 6) | 192);
                    K((cCharAt & '?') | NotificationCompat.FLAG_HIGH_PRIORITY);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    K((cCharAt >> '\f') | 224);
                    K(((cCharAt >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    K((cCharAt & '?') | NotificationCompat.FLAG_HIGH_PRIORITY);
                } else {
                    int i16 = i10 + 1;
                    char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        K(63);
                        i10 = i16;
                    } else {
                        int i17 = (((cCharAt & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        K((i17 >> 18) | 240);
                        K(((i17 >> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        K(((i17 >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        K((i17 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    public final void P(int i10) {
        if (i10 < 128) {
            K(i10);
            return;
        }
        if (i10 < 2048) {
            K((i10 >> 6) | 192);
            K((i10 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
            return;
        }
        if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                K(63);
                return;
            }
            K((i10 >> 12) | 224);
            K(((i10 >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
            K((i10 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
            return;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
        }
        K((i10 >> 18) | 240);
        K(((i10 >> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
        K(((i10 >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
        K((i10 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
    }

    public final void a() {
        try {
            i(this.f16276b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p7.t
    public final v b() {
        return v.f16306d;
    }

    public final void c(e eVar, long j10, long j11) {
        if (eVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        w.a(this.f16276b, j10, j11);
        if (j11 == 0) {
            return;
        }
        eVar.f16276b += j11;
        go goVar = this.f16275a;
        while (true) {
            long j12 = goVar.f5002b - goVar.f5001a;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            goVar = (go) goVar.f5006f;
        }
        while (j11 > 0) {
            go goVarC = goVar.c();
            int i10 = (int) (((long) goVarC.f5001a) + j10);
            goVarC.f5001a = i10;
            goVarC.f5002b = Math.min(i10 + ((int) j11), goVarC.f5002b);
            go goVar2 = eVar.f16275a;
            if (goVar2 == null) {
                goVarC.f5007g = goVarC;
                goVarC.f5006f = goVarC;
                eVar.f16275a = goVarC;
            } else {
                ((go) goVar2.f5007g).b(goVarC);
            }
            j11 -= (long) (goVarC.f5002b - goVarC.f5001a);
            goVar = (go) goVar.f5006f;
            j10 = 0;
        }
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f16276b != 0) {
            go goVarC = this.f16275a.c();
            eVar.f16275a = goVarC;
            goVarC.f5007g = goVarC;
            goVarC.f5006f = goVarC;
            go goVar = this.f16275a;
            while (true) {
                goVar = (go) goVar.f5006f;
                if (goVar == this.f16275a) {
                    break;
                }
                ((go) eVar.f16275a.f5007g).b(goVar.c());
            }
            eVar.f16276b = this.f16276b;
        }
        return eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p7.s
    public final void close() {
    }

    @Override // p7.f
    public final /* bridge */ /* synthetic */ f d(long j10) {
        L(j10);
        return this;
    }

    public final byte e(long j10) {
        int i10;
        w.a(this.f16276b, j10, 1L);
        long j11 = this.f16276b;
        if (j11 - j10 <= j10) {
            long j12 = j10 - j11;
            go goVar = this.f16275a;
            do {
                goVar = (go) goVar.f5007g;
                int i11 = goVar.f5002b;
                i10 = goVar.f5001a;
                j12 += (long) (i11 - i10);
            } while (j12 < 0);
            return ((byte[]) goVar.f5005e)[i10 + ((int) j12)];
        }
        go goVar2 = this.f16275a;
        while (true) {
            int i12 = goVar2.f5002b;
            int i13 = goVar2.f5001a;
            long j13 = i12 - i13;
            if (j10 < j13) {
                return ((byte[]) goVar2.f5005e)[i13 + ((int) j10)];
            }
            j10 -= j13;
            goVar2 = (go) goVar2.f5006f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j10 = this.f16276b;
        if (j10 != eVar.f16276b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        go goVar = this.f16275a;
        go goVar2 = eVar.f16275a;
        int i10 = goVar.f5001a;
        int i11 = goVar2.f5001a;
        while (j11 < this.f16276b) {
            long jMin = Math.min(goVar.f5002b - i10, goVar2.f5002b - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (((byte[]) goVar.f5005e)[i10] != ((byte[]) goVar2.f5005e)[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == goVar.f5002b) {
                goVar = (go) goVar.f5006f;
                i10 = goVar.f5001a;
            }
            if (i11 == goVar2.f5002b) {
                goVar2 = (go) goVar2.f5006f;
                i11 = goVar2.f5001a;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // p7.g
    public final e f() {
        return this;
    }

    @Override // p7.f, p7.s, java.io.Flushable
    public final void flush() {
    }

    @Override // p7.g
    public final h g(long j10) {
        return new h(p(j10));
    }

    @Override // p7.s
    public final void h(e eVar, long j10) {
        go goVarO;
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (eVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        w.a(eVar.f16276b, 0L, j10);
        while (j10 > 0) {
            go goVar = eVar.f16275a;
            int i10 = goVar.f5002b - goVar.f5001a;
            if (j10 < i10) {
                go goVar2 = this.f16275a;
                go goVar3 = goVar2 != null ? (go) goVar2.f5007g : null;
                if (goVar3 != null && goVar3.f5004d) {
                    if ((((long) goVar3.f5002b) + j10) - ((long) (goVar3.f5003c ? 0 : goVar3.f5001a)) <= 8192) {
                        goVar.d(goVar3, (int) j10);
                        eVar.f16276b -= j10;
                        this.f16276b += j10;
                        return;
                    }
                }
                int i11 = (int) j10;
                if (i11 <= 0 || i11 > i10) {
                    throw new IllegalArgumentException();
                }
                if (i11 >= 1024) {
                    goVarO = goVar.c();
                } else {
                    goVarO = q.o();
                    System.arraycopy((byte[]) goVar.f5005e, goVar.f5001a, (byte[]) goVarO.f5005e, 0, i11);
                }
                goVarO.f5002b = goVarO.f5001a + i11;
                goVar.f5001a += i11;
                ((go) goVar.f5007g).b(goVarO);
                eVar.f16275a = goVarO;
            }
            go goVar4 = eVar.f16275a;
            long j11 = goVar4.f5002b - goVar4.f5001a;
            eVar.f16275a = goVar4.a();
            go goVar5 = this.f16275a;
            if (goVar5 == null) {
                this.f16275a = goVar4;
                goVar4.f5007g = goVar4;
                goVar4.f5006f = goVar4;
            } else {
                ((go) goVar5.f5007g).b(goVar4);
                go goVar6 = (go) goVar4.f5007g;
                if (goVar6 == goVar4) {
                    throw new IllegalStateException();
                }
                if (goVar6.f5004d) {
                    int i12 = goVar4.f5002b - goVar4.f5001a;
                    if (i12 <= (8192 - goVar6.f5002b) + (goVar6.f5003c ? 0 : goVar6.f5001a)) {
                        goVar4.d(goVar6, i12);
                        goVar4.a();
                        q.n(goVar4);
                    }
                }
            }
            eVar.f16276b -= j11;
            this.f16276b += j11;
            j10 -= j11;
        }
    }

    public final int hashCode() {
        go goVar = this.f16275a;
        if (goVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = goVar.f5002b;
            for (int i12 = goVar.f5001a; i12 < i11; i12++) {
                i10 = (i10 * 31) + ((byte[]) goVar.f5005e)[i12];
            }
            goVar = (go) goVar.f5006f;
        } while (goVar != this.f16275a);
        return i10;
    }

    @Override // p7.g
    public final void i(long j10) throws EOFException {
        while (j10 > 0) {
            if (this.f16275a == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, r0.f5002b - r0.f5001a);
            long j11 = iMin;
            this.f16276b -= j11;
            j10 -= j11;
            go goVar = this.f16275a;
            int i10 = goVar.f5001a + iMin;
            goVar.f5001a = i10;
            if (i10 == goVar.f5002b) {
                this.f16275a = goVar.a();
                q.n(goVar);
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p7.f
    public final /* bridge */ /* synthetic */ f j(int i10) {
        N(i10);
        return this;
    }

    @Override // p7.g
    public final int k() {
        long j10 = this.f16276b;
        if (j10 < 4) {
            throw new IllegalStateException("size < 4: " + this.f16276b);
        }
        go goVar = this.f16275a;
        int i10 = goVar.f5001a;
        int i11 = goVar.f5002b;
        if (i11 - i10 < 4) {
            return ((C() & 255) << 24) | ((C() & 255) << 16) | ((C() & 255) << 8) | (C() & 255);
        }
        byte[] bArr = (byte[]) goVar.f5005e;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f16276b = j10 - 4;
        if (i14 == i11) {
            this.f16275a = goVar.a();
            q.n(goVar);
        } else {
            goVar.f5001a = i14;
        }
        return i15;
    }

    @Override // p7.f
    public final /* bridge */ /* synthetic */ f l(int i10) {
        M(i10);
        return this;
    }

    @Override // p7.g
    public final String m() {
        return r(Long.MAX_VALUE);
    }

    @Override // p7.g
    public final boolean n() {
        return this.f16276b == 0;
    }

    @Override // p7.f
    public final /* bridge */ /* synthetic */ f o(int i10) {
        K(i10);
        return this;
    }

    @Override // p7.g
    public final byte[] p(long j10) throws EOFException {
        w.a(this.f16276b, 0L, j10);
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException(a0.g("byteCount > Integer.MAX_VALUE: ", j10));
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int iA = A(bArr, i11, i10 - i11);
            if (iA == -1) {
                throw new EOFException();
            }
            i11 += iA;
        }
        return bArr;
    }

    @Override // p7.f
    public final f q(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        H(0, bArr, bArr.length);
        return this;
    }

    @Override // p7.g
    public final String r(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.g("limit < 0: ", j10));
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jU = u((byte) 10, 0L, j11);
        if (jU != -1) {
            return F(jU);
        }
        if (j11 < this.f16276b && e(j11 - 1) == 13 && e(j11) == 10) {
            return F(j11);
        }
        e eVar = new e();
        c(eVar, 0L, Math.min(32L, this.f16276b));
        StringBuilder sb = new StringBuilder("\\n not found: limit=");
        sb.append(Math.min(this.f16276b, j10));
        sb.append(" content=");
        try {
            sb.append(new h(eVar.p(eVar.f16276b)).i());
            sb.append((char) 8230);
            throw new EOFException(sb.toString());
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        go goVar = this.f16275a;
        if (goVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), goVar.f5002b - goVar.f5001a);
        byteBuffer.put((byte[]) goVar.f5005e, goVar.f5001a, iMin);
        int i10 = goVar.f5001a + iMin;
        goVar.f5001a = i10;
        this.f16276b -= (long) iMin;
        if (i10 == goVar.f5002b) {
            this.f16275a = goVar.a();
            q.n(goVar);
        }
        return iMin;
    }

    @Override // p7.f
    public final /* bridge */ /* synthetic */ f s(h hVar) {
        I(hVar);
        return this;
    }

    @Override // p7.g
    public final short t() {
        long j10 = this.f16276b;
        if (j10 < 2) {
            throw new IllegalStateException("size < 2: " + this.f16276b);
        }
        go goVar = this.f16275a;
        int i10 = goVar.f5001a;
        int i11 = goVar.f5002b;
        if (i11 - i10 < 2) {
            return (short) (((C() & 255) << 8) | (C() & 255));
        }
        byte[] bArr = (byte[]) goVar.f5005e;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f16276b = j10 - 2;
        if (i14 == i11) {
            this.f16275a = goVar.a();
            q.n(goVar);
        } else {
            goVar.f5001a = i14;
        }
        return (short) i15;
    }

    public final String toString() {
        long j10 = this.f16276b;
        if (j10 <= 2147483647L) {
            int i10 = (int) j10;
            return (i10 == 0 ? h.f16278h : new r(this, i10)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f16276b);
    }

    public final long u(byte b10, long j10, long j11) {
        go goVar;
        long j12 = 0;
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f16276b), Long.valueOf(j10), Long.valueOf(j11)));
        }
        long j13 = this.f16276b;
        long j14 = j11 > j13 ? j13 : j11;
        if (j10 == j14 || (goVar = this.f16275a) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                goVar = (go) goVar.f5007g;
                j13 -= (long) (goVar.f5002b - goVar.f5001a);
            }
        } else {
            while (true) {
                long j15 = ((long) (goVar.f5002b - goVar.f5001a)) + j12;
                if (j15 >= j10) {
                    break;
                }
                goVar = (go) goVar.f5006f;
                j12 = j15;
            }
            j13 = j12;
        }
        long j16 = j10;
        while (j13 < j14) {
            byte[] bArr = (byte[]) goVar.f5005e;
            int iMin = (int) Math.min(goVar.f5002b, (((long) goVar.f5001a) + j14) - j13);
            for (int i10 = (int) ((((long) goVar.f5001a) + j16) - j13); i10 < iMin; i10++) {
                if (bArr[i10] == b10) {
                    return ((long) (i10 - goVar.f5001a)) + j13;
                }
            }
            j13 += (long) (goVar.f5002b - goVar.f5001a);
            goVar = (go) goVar.f5006f;
            j16 = j13;
        }
        return -1L;
    }

    @Override // p7.g
    public final void v(long j10) throws EOFException {
        if (this.f16276b < j10) {
            throw new EOFException();
        }
    }

    @Override // p7.f
    public final f w(String str) {
        O(0, str.length(), str);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            go goVarG = G(1);
            int iMin = Math.min(i10, 8192 - goVarG.f5002b);
            byteBuffer.get((byte[]) goVarG.f5005e, goVarG.f5002b, iMin);
            i10 -= iMin;
            goVarG.f5002b += iMin;
        }
        this.f16276b += (long) iRemaining;
        return iRemaining;
    }

    @Override // p7.t
    public final long x(e eVar, long j10) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.g("byteCount < 0: ", j10));
        }
        long j11 = this.f16276b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        eVar.h(this, j10);
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094 A[EDGE_INSN: B:43:0x0094->B:37:0x0094 BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // p7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long z() {
        /*
            r15 = this;
            long r0 = r15.f16276b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L9b
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            com.google.android.gms.internal.ads.go r6 = r15.f16275a
            java.lang.Object r7 = r6.f5005e
            byte[] r7 = (byte[]) r7
            int r8 = r6.f5001a
            int r9 = r6.f5002b
        L15:
            if (r8 >= r9) goto L80
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L24
            r11 = 57
            if (r10 > r11) goto L24
            int r11 = r10 + (-48)
            goto L39
        L24:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-87)
            goto L39
        L2f:
            r11 = 65
            if (r10 < r11) goto L64
            r11 = 70
            if (r10 > r11) goto L64
            int r11 = r10 + (-55)
        L39:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L49
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L15
        L49:
            p7.e r0 = new p7.e
            r0.<init>()
            r0.L(r4)
            r0.K(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.E()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L64:
            if (r0 == 0) goto L68
            r1 = 1
            goto L80
        L68:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L80:
            if (r8 != r9) goto L8c
            com.google.android.gms.internal.ads.go r7 = r6.a()
            r15.f16275a = r7
            p7.q.n(r6)
            goto L8e
        L8c:
            r6.f5001a = r8
        L8e:
            if (r1 != 0) goto L94
            com.google.android.gms.internal.ads.go r6 = r15.f16275a
            if (r6 != 0) goto Lb
        L94:
            long r1 = r15.f16276b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f16276b = r1
            return r4
        L9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.e.z():long");
    }
}

package l7;

import com.google.android.gms.internal.ads.gp0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f15350s = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.f f15351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15352b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p7.e f15353d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15354f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15355h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f15356q;

    public y(p7.f fVar, boolean z9) {
        this.f15351a = fVar;
        this.f15352b = z9;
        p7.e eVar = new p7.e();
        this.f15353d = eVar;
        this.f15356q = new c(eVar);
        this.f15354f = 16384;
    }

    public final void A(int i10, ArrayList arrayList, boolean z9) throws IOException {
        if (this.f15355h) {
            throw new IOException("closed");
        }
        this.f15356q.d(arrayList);
        p7.e eVar = this.f15353d;
        long j10 = eVar.f16276b;
        int iMin = (int) Math.min(this.f15354f, j10);
        long j11 = iMin;
        byte b10 = j10 == j11 ? (byte) 4 : (byte) 0;
        if (z9) {
            b10 = (byte) (b10 | 1);
        }
        e(i10, iMin, (byte) 1, b10);
        this.f15351a.h(eVar, j11);
        if (j10 > j11) {
            I(i10, j10 - j11);
        }
    }

    public final synchronized void D(int i10, int i11, boolean z9) {
        if (this.f15355h) {
            throw new IOException("closed");
        }
        e(0, 8, (byte) 6, z9 ? (byte) 1 : (byte) 0);
        this.f15351a.l(i10);
        this.f15351a.l(i11);
        this.f15351a.flush();
    }

    public final synchronized void E(int i10, a aVar) {
        if (this.f15355h) {
            throw new IOException("closed");
        }
        if (aVar.f15239a == -1) {
            throw new IllegalArgumentException();
        }
        e(i10, 4, (byte) 3, (byte) 0);
        this.f15351a.l(aVar.f15239a);
        this.f15351a.flush();
    }

    public final synchronized void F(gp0 gp0Var) {
        try {
            if (this.f15355h) {
                throw new IOException("closed");
            }
            int i10 = 0;
            e(0, Integer.bitCount(gp0Var.f5025b) * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (((1 << i10) & gp0Var.f5025b) != 0) {
                    this.f15351a.j(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f15351a.l(((int[]) gp0Var.f5026d)[i10]);
                }
                i10++;
            }
            this.f15351a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void G(int i10, ArrayList arrayList, boolean z9) {
        if (this.f15355h) {
            throw new IOException("closed");
        }
        A(i10, arrayList, z9);
    }

    public final synchronized void H(int i10, long j10) {
        if (this.f15355h) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            e.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
            throw null;
        }
        e(i10, 4, (byte) 8, (byte) 0);
        this.f15351a.l((int) j10);
        this.f15351a.flush();
    }

    public final void I(int i10, long j10) {
        while (j10 > 0) {
            int iMin = (int) Math.min(this.f15354f, j10);
            long j11 = iMin;
            j10 -= j11;
            e(i10, iMin, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f15351a.h(this.f15353d, j11);
        }
    }

    public final synchronized void a(gp0 gp0Var) {
        try {
            if (this.f15355h) {
                throw new IOException("closed");
            }
            int i10 = this.f15354f;
            int i11 = gp0Var.f5025b;
            if ((i11 & 32) != 0) {
                i10 = ((int[]) gp0Var.f5026d)[5];
            }
            this.f15354f = i10;
            if (((i11 & 2) != 0 ? ((int[]) gp0Var.f5026d)[1] : -1) != -1) {
                c cVar = this.f15356q;
                int i12 = (i11 & 2) != 0 ? ((int[]) gp0Var.f5026d)[1] : -1;
                cVar.getClass();
                int iMin = Math.min(i12, 16384);
                int i13 = cVar.f15253d;
                if (i13 != iMin) {
                    if (iMin < i13) {
                        cVar.f15251b = Math.min(cVar.f15251b, iMin);
                    }
                    cVar.f15252c = true;
                    cVar.f15253d = iMin;
                    int i14 = cVar.f15257h;
                    if (iMin < i14) {
                        if (iMin == 0) {
                            Arrays.fill(cVar.f15254e, (Object) null);
                            cVar.f15255f = cVar.f15254e.length - 1;
                            cVar.f15256g = 0;
                            cVar.f15257h = 0;
                        } else {
                            cVar.a(i14 - iMin);
                        }
                    }
                }
            }
            e(0, 0, (byte) 4, (byte) 1);
            this.f15351a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z9, int i10, p7.e eVar, int i11) {
        if (this.f15355h) {
            throw new IOException("closed");
        }
        e(i10, i11, (byte) 0, z9 ? (byte) 1 : (byte) 0);
        if (i11 > 0) {
            this.f15351a.h(eVar, i11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f15355h = true;
        this.f15351a.close();
    }

    public final void e(int i10, int i11, byte b10, byte b11) {
        Level level = Level.FINE;
        Logger logger = f15350s;
        if (logger.isLoggable(level)) {
            logger.fine(e.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f15354f;
        if (i11 > i12) {
            e.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            throw null;
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            e.b("reserved bit set: %s", Integer.valueOf(i10));
            throw null;
        }
        p7.f fVar = this.f15351a;
        fVar.o((i11 >>> 16) & 255);
        fVar.o((i11 >>> 8) & 255);
        fVar.o(i11 & 255);
        fVar.o(b10 & 255);
        fVar.o(b11 & 255);
        fVar.l(i10 & Integer.MAX_VALUE);
    }

    public final synchronized void flush() {
        if (this.f15355h) {
            throw new IOException("closed");
        }
        this.f15351a.flush();
    }

    public final synchronized void u(int i10, a aVar, byte[] bArr) {
        try {
            if (this.f15355h) {
                throw new IOException("closed");
            }
            if (aVar.f15239a == -1) {
                e.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            e(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f15351a.l(i10);
            this.f15351a.l(aVar.f15239a);
            if (bArr.length > 0) {
                this.f15351a.q(bArr);
            }
            this.f15351a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }
}

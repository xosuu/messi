package l7;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class s implements p7.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.g f15316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15317b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f15318d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15319f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15320h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public short f15321q;

    public s(p7.g gVar) {
        this.f15316a = gVar;
    }

    @Override // p7.t
    public final p7.v b() {
        return this.f15316a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p7.t
    public final long x(p7.e eVar, long j10) throws IOException {
        int i10;
        int iK;
        do {
            int i11 = this.f15320h;
            p7.g gVar = this.f15316a;
            if (i11 != 0) {
                long jX = gVar.x(eVar, Math.min(j10, i11));
                if (jX == -1) {
                    return -1L;
                }
                this.f15320h = (int) (((long) this.f15320h) - jX);
                return jX;
            }
            gVar.i(this.f15321q);
            this.f15321q = (short) 0;
            if ((this.f15318d & 4) != 0) {
                return -1L;
            }
            i10 = this.f15319f;
            int iF = t.F(gVar);
            this.f15320h = iF;
            this.f15317b = iF;
            byte bC = (byte) (gVar.C() & 255);
            this.f15318d = (byte) (gVar.C() & 255);
            Logger logger = t.f15322h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.a(true, this.f15319f, this.f15317b, bC, this.f15318d));
            }
            iK = gVar.k() & Integer.MAX_VALUE;
            this.f15319f = iK;
            if (bC != 9) {
                e.c("%s != TYPE_CONTINUATION", Byte.valueOf(bC));
                throw null;
            }
        } while (iK == i10);
        e.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }
}

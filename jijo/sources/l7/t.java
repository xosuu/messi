package l7;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.gp0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f15322h = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.g f15323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f15324b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15325d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d6.c f15326f;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, l7.b[]] */
    public t(p7.g gVar, boolean z9) {
        this.f15323a = gVar;
        this.f15325d = z9;
        s sVar = new s(gVar);
        this.f15324b = sVar;
        d6.c cVar = new d6.c();
        cVar.f12474f = new ArrayList();
        cVar.f12476h = new b[8];
        cVar.f12471c = 7;
        cVar.f12472d = 0;
        cVar.f12473e = 0;
        cVar.f12469a = NotificationCompat.FLAG_BUBBLE;
        cVar.f12470b = NotificationCompat.FLAG_BUBBLE;
        Logger logger = p7.n.f16294a;
        cVar.f12475g = new p7.p(sVar);
        this.f15326f = cVar;
    }

    public static int F(p7.g gVar) {
        return (gVar.C() & 255) | ((gVar.C() & 255) << 16) | ((gVar.C() & 255) << 8);
    }

    public static int a(int i10, byte b10, short s9) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s9 <= i10) {
            return (short) (i10 - s9);
        }
        e.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s9), Integer.valueOf(i10));
        throw null;
    }

    public final void A(p pVar, int i10, int i11) throws IOException {
        a aVar;
        x[] xVarArr;
        if (i10 < 8) {
            e.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            throw null;
        }
        if (i11 != 0) {
            e.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int iK = this.f15323a.k();
        int iK2 = this.f15323a.k();
        int i12 = i10 - 8;
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i13];
            if (aVar.f15239a == iK2) {
                break;
            } else {
                i13++;
            }
        }
        if (aVar == null) {
            e.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iK2));
            throw null;
        }
        p7.h hVarG = p7.h.f16278h;
        if (i12 > 0) {
            hVarG = this.f15323a.g(i12);
        }
        pVar.getClass();
        hVarG.size();
        synchronized (((r) pVar.f15299f)) {
            xVarArr = (x[]) ((r) pVar.f15299f).f15304d.values().toArray(new x[((r) pVar.f15299f).f15304d.size()]);
            ((r) pVar.f15299f).f15308s = true;
        }
        for (x xVar : xVarArr) {
            if (xVar.f15341c > iK && xVar.f()) {
                xVar.j(a.REFUSED_STREAM);
                ((r) pVar.f15299f).A(xVar.f15341c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        throw new java.io.IOException(com.google.android.gms.internal.ads.fb1.g("Header index too large ", r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList D(int r2, short r3, byte r4, int r5) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.t.D(int, short, byte, int):java.util.ArrayList");
    }

    public final void E(p pVar, int i10, byte b10, int i11) throws IOException {
        if (i11 == 0) {
            e.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z9 = (b10 & 1) != 0;
        short sC = (b10 & 8) != 0 ? (short) (this.f15323a.C() & 255) : (short) 0;
        if ((b10 & 32) != 0) {
            p7.g gVar = this.f15323a;
            gVar.k();
            gVar.C();
            pVar.getClass();
            i10 -= 5;
        }
        ArrayList arrayListD = D(a(i10, b10, sC), sC, b10, i11);
        ((r) pVar.f15299f).getClass();
        if (i11 != 0 && (i11 & 1) == 0) {
            r rVar = (r) pVar.f15299f;
            rVar.getClass();
            try {
                rVar.f15310u.execute(new j(rVar, new Object[]{rVar.f15305f, Integer.valueOf(i11)}, i11, arrayListD, z9));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (((r) pVar.f15299f)) {
            try {
                x xVarE = ((r) pVar.f15299f).e(i11);
                if (xVarE == null) {
                    Object obj = pVar.f15299f;
                    if (!((r) obj).f15308s) {
                        if (i11 > ((r) obj).f15306h) {
                            if (i11 % 2 != ((r) obj).f15307q % 2) {
                                x xVar = new x(i11, (r) obj, false, z9, arrayListD);
                                Object obj2 = pVar.f15299f;
                                ((r) obj2).f15306h = i11;
                                ((r) obj2).f15304d.put(Integer.valueOf(i11), xVar);
                                r.G.execute(new p(pVar, "OkHttp %s stream %d", new Object[]{((r) pVar.f15299f).f15305f, Integer.valueOf(i11)}, xVar, 0));
                            }
                        }
                    }
                } else {
                    xVarE.i(arrayListD);
                    if (z9) {
                        xVarE.h();
                    }
                }
            } finally {
            }
        }
    }

    public final void G(p pVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 8) {
            e.c("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            throw null;
        }
        if (i11 != 0) {
            e.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int iK = this.f15323a.k();
        int iK2 = this.f15323a.k();
        boolean z9 = (b10 & 1) != 0;
        pVar.getClass();
        if (!z9) {
            try {
                Object obj = pVar.f15299f;
                ((r) obj).f15309t.execute(new o((r) obj, true, iK, iK2));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            synchronized (((r) pVar.f15299f)) {
                Object obj2 = pVar.f15299f;
                ((r) obj2).f15312w = false;
                ((r) obj2).notifyAll();
            }
        }
    }

    public final void H(p pVar, int i10, byte b10, int i11) throws IOException {
        if (i11 == 0) {
            e.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short sC = (b10 & 8) != 0 ? (short) (this.f15323a.C() & 255) : (short) 0;
        int iK = this.f15323a.k() & Integer.MAX_VALUE;
        ArrayList arrayListD = D(a(i10 - 4, b10, sC), sC, b10, i11);
        r rVar = (r) pVar.f15299f;
        synchronized (rVar) {
            try {
                if (rVar.F.contains(Integer.valueOf(iK))) {
                    rVar.F(iK, a.PROTOCOL_ERROR);
                    return;
                }
                rVar.F.add(Integer.valueOf(iK));
                try {
                    rVar.f15310u.execute(new h(rVar, "OkHttp %s Push Request[%s]", new Object[]{rVar.f15305f, Integer.valueOf(iK)}, iK, arrayListD, 2));
                } catch (RejectedExecutionException unused) {
                }
            } finally {
            }
        }
    }

    public final void I(p pVar, int i10, byte b10, int i11) throws IOException {
        long j10;
        x[] xVarArr = null;
        if (i11 != 0) {
            e.c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b10 & 1) != 0) {
            if (i10 == 0) {
                pVar.getClass();
                return;
            } else {
                e.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i10 % 6 != 0) {
            e.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            throw null;
        }
        gp0 gp0Var = new gp0(16);
        for (int i12 = 0; i12 < i10; i12 += 6) {
            int iT = this.f15323a.t() & 65535;
            int iK = this.f15323a.k();
            if (iT == 2) {
                if (iK != 0 && iK != 1) {
                    e.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
            } else if (iT == 3) {
                iT = 4;
            } else if (iT != 4) {
                if (iT == 5 && (iK < 16384 || iK > 16777215)) {
                    e.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iK));
                    throw null;
                }
            } else {
                if (iK < 0) {
                    e.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    throw null;
                }
                iT = 7;
            }
            gp0Var.l(iT, iK);
        }
        synchronized (((r) pVar.f15299f)) {
            try {
                int iJ = ((r) pVar.f15299f).A.j();
                gp0 gp0Var2 = ((r) pVar.f15299f).A;
                gp0Var2.getClass();
                for (int i13 = 0; i13 < 10; i13++) {
                    if (((1 << i13) & gp0Var.f5025b) != 0) {
                        gp0Var2.l(i13, ((int[]) gp0Var.f5026d)[i13]);
                    }
                }
                try {
                    Object obj = pVar.f15299f;
                    ((r) obj).f15309t.execute(new p(pVar, "OkHttp %s ACK Settings", new Object[]{((r) obj).f15305f}, gp0Var, 1));
                } catch (RejectedExecutionException unused) {
                }
                int iJ2 = ((r) pVar.f15299f).A.j();
                if (iJ2 == -1 || iJ2 == iJ) {
                    j10 = 0;
                } else {
                    j10 = iJ2 - iJ;
                    Object obj2 = pVar.f15299f;
                    if (!((r) obj2).B) {
                        r rVar = (r) obj2;
                        rVar.f15314y += j10;
                        if (j10 > 0) {
                            rVar.notifyAll();
                        }
                        ((r) pVar.f15299f).B = true;
                    }
                    if (!((r) pVar.f15299f).f15304d.isEmpty()) {
                        xVarArr = (x[]) ((r) pVar.f15299f).f15304d.values().toArray(new x[((r) pVar.f15299f).f15304d.size()]);
                    }
                }
                r.G.execute(new q(pVar, ((r) pVar.f15299f).f15305f));
            } finally {
            }
        }
        if (xVarArr == null || j10 == 0) {
            return;
        }
        for (x xVar : xVarArr) {
            synchronized (xVar) {
                xVar.f15340b += j10;
                if (j10 > 0) {
                    xVar.notifyAll();
                }
            }
        }
    }

    public final boolean c(boolean z9, p pVar) throws IOException {
        a aVar;
        try {
            this.f15323a.v(9L);
            int iF = F(this.f15323a);
            if (iF < 0 || iF > 16384) {
                e.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iF));
                throw null;
            }
            byte bC = (byte) (this.f15323a.C() & 255);
            if (z9 && bC != 4) {
                e.c("Expected a SETTINGS frame but was %s", Byte.valueOf(bC));
                throw null;
            }
            byte bC2 = (byte) (this.f15323a.C() & 255);
            int iK = this.f15323a.k();
            int i10 = iK & Integer.MAX_VALUE;
            Logger logger = f15322h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.a(true, i10, iF, bC, bC2));
            }
            switch (bC) {
                case 0:
                    u(pVar, iF, bC2, i10);
                    return true;
                case 1:
                    E(pVar, iF, bC2, i10);
                    return true;
                case 2:
                    if (iF != 5) {
                        e.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iF));
                        throw null;
                    }
                    if (i10 == 0) {
                        e.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    p7.g gVar = this.f15323a;
                    gVar.k();
                    gVar.C();
                    pVar.getClass();
                    return true;
                case 3:
                    if (iF != 4) {
                        e.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iF));
                        throw null;
                    }
                    if (i10 == 0) {
                        e.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int iK2 = this.f15323a.k();
                    a[] aVarArrValues = a.values();
                    int length = aVarArrValues.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            aVar = aVarArrValues[i11];
                            if (aVar.f15239a != iK2) {
                                i11++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        e.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iK2));
                        throw null;
                    }
                    r rVar = (r) pVar.f15299f;
                    rVar.getClass();
                    if (i10 == 0 || (iK & 1) != 0) {
                        x xVarA = rVar.A(i10);
                        if (xVarA != null) {
                            xVarA.j(aVar);
                        }
                    } else {
                        rVar.f15310u.execute(new h(rVar, "OkHttp %s Push Reset[%s]", new Object[]{rVar.f15305f, Integer.valueOf(i10)}, i10, aVar, 1));
                    }
                    return true;
                case 4:
                    I(pVar, iF, bC2, i10);
                    return true;
                case 5:
                    H(pVar, iF, bC2, i10);
                    return true;
                case 6:
                    G(pVar, iF, bC2, i10);
                    return true;
                case 7:
                    A(pVar, iF, i10);
                    return true;
                case 8:
                    if (iF != 4) {
                        e.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iF));
                        throw null;
                    }
                    long jK = ((long) this.f15323a.k()) & 2147483647L;
                    if (jK == 0) {
                        e.c("windowSizeIncrement was 0", Long.valueOf(jK));
                        throw null;
                    }
                    if (i10 == 0) {
                        synchronized (((r) pVar.f15299f)) {
                            Object obj = pVar.f15299f;
                            ((r) obj).f15314y += jK;
                            ((r) obj).notifyAll();
                            break;
                        }
                    } else {
                        x xVarE = ((r) pVar.f15299f).e(i10);
                        if (xVarE != null) {
                            synchronized (xVarE) {
                                xVarE.f15340b += jK;
                                if (jK > 0) {
                                    xVarE.notifyAll();
                                }
                            }
                        }
                        break;
                    }
                    return true;
                default:
                    this.f15323a.i(iF);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15323a.close();
    }

    public final void e(p pVar) throws IOException {
        if (this.f15325d) {
            if (c(true, pVar)) {
                return;
            }
            e.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        p7.h hVar = e.f15260a;
        p7.h hVarG = this.f15323a.g(hVar.f16279a.length);
        Level level = Level.FINE;
        Logger logger = f15322h;
        if (logger.isLoggable(level)) {
            Object[] objArr = {hVarG.i()};
            byte[] bArr = g7.b.f13888a;
            logger.fine(String.format(Locale.US, "<< CONNECTION %s", objArr));
        }
        if (hVar.equals(hVarG)) {
            return;
        }
        e.c("Expected a connection header but was %s", hVarG.o());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        if (r16 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012a, code lost:
    
        r3.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(l7.p r19, int r20, byte r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.t.u(l7.p, int, byte, int):void");
    }
}

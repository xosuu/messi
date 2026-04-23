package l7;

import com.google.android.gms.internal.ads.en1;
import f7.b0;
import f7.c0;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements j7.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f15267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f15268f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j7.g f15269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7.d f15270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f15271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f15272d;

    static {
        p7.h hVarG = p7.h.g("connection");
        p7.h hVarG2 = p7.h.g("host");
        p7.h hVarG3 = p7.h.g("keep-alive");
        p7.h hVarG4 = p7.h.g("proxy-connection");
        p7.h hVarG5 = p7.h.g("transfer-encoding");
        p7.h hVarG6 = p7.h.g("te");
        p7.h hVarG7 = p7.h.g("encoding");
        p7.h hVarG8 = p7.h.g("upgrade");
        f15267e = g7.b.m(hVarG, hVarG2, hVarG3, hVarG4, hVarG6, hVarG5, hVarG7, hVarG8, b.f15243f, b.f15244g, b.f15245h, b.f15246i);
        f15268f = g7.b.m(hVarG, hVarG2, hVarG3, hVarG4, hVarG6, hVarG5, hVarG7, hVarG8);
    }

    public g(j7.g gVar, i7.d dVar, r rVar) {
        this.f15269a = gVar;
        this.f15270b = dVar;
        this.f15271c = rVar;
    }

    @Override // j7.d
    public final p7.s a(f7.z zVar, long j10) {
        return this.f15272d.e();
    }

    @Override // j7.d
    public final void b() {
        this.f15272d.e().close();
    }

    @Override // j7.d
    public final void c() {
        this.f15271c.flush();
    }

    @Override // j7.d
    public final c0 d(b0 b0Var) {
        this.f15270b.f14200e.getClass();
        String strA = b0Var.a("Content-Type");
        long jA = j7.f.a(b0Var);
        f fVar = new f(this, this.f15272d.f15345g);
        Logger logger = p7.n.f16294a;
        return new c0(strA, jA, new p7.p(fVar));
    }

    @Override // j7.d
    public final void e(f7.z zVar) {
        int i10;
        x xVar;
        if (this.f15272d != null) {
            return;
        }
        boolean z9 = true;
        boolean z10 = zVar.f13399d != null;
        f7.p pVar = zVar.f13398c;
        ArrayList arrayList = new ArrayList(pVar.d() + 4);
        arrayList.add(new b(b.f15243f, zVar.f13397b));
        p7.h hVar = b.f15244g;
        f7.q qVar = zVar.f13396a;
        arrayList.add(new b(hVar, en1.D(qVar)));
        String strA = zVar.f13398c.a("Host");
        if (strA != null) {
            arrayList.add(new b(b.f15246i, strA));
        }
        arrayList.add(new b(b.f15245h, qVar.f13324a));
        int iD = pVar.d();
        for (int i11 = 0; i11 < iD; i11++) {
            p7.h hVarG = p7.h.g(pVar.b(i11).toLowerCase(Locale.US));
            if (!f15267e.contains(hVarG)) {
                arrayList.add(new b(hVarG, pVar.e(i11)));
            }
        }
        r rVar = this.f15271c;
        boolean z11 = !z10;
        synchronized (rVar.D) {
            synchronized (rVar) {
                try {
                    if (rVar.f15307q > 1073741823) {
                        rVar.D(a.REFUSED_STREAM);
                    }
                    if (rVar.f15308s) {
                        throw new ConnectionShutdownException();
                    }
                    i10 = rVar.f15307q;
                    rVar.f15307q = i10 + 2;
                    xVar = new x(i10, rVar, z11, false, arrayList);
                    if (z10 && rVar.f15314y != 0 && xVar.f15340b != 0) {
                        z9 = false;
                    }
                    if (xVar.g()) {
                        rVar.f15304d.put(Integer.valueOf(i10), xVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.D.G(i10, arrayList, z11);
        }
        if (z9) {
            rVar.D.flush();
        }
        this.f15272d = xVar;
        w wVar = xVar.f15347i;
        long j10 = this.f15269a.f14460j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar.g(j10, timeUnit);
        this.f15272d.f15348j.g(this.f15269a.f14461k, timeUnit);
    }

    @Override // j7.d
    public final f7.a0 f(boolean z9) throws ProtocolException {
        List list;
        x xVar = this.f15272d;
        synchronized (xVar) {
            if (!xVar.f()) {
                throw new IllegalStateException("servers cannot read response headers");
            }
            xVar.f15347i.i();
            while (xVar.f15343e == null && xVar.f15349k == null) {
                try {
                    try {
                        xVar.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    xVar.f15347i.n();
                    throw th;
                }
            }
            xVar.f15347i.n();
            list = xVar.f15343e;
            if (list == null) {
                throw new StreamResetException(xVar.f15349k);
            }
            xVar.f15343e = null;
        }
        f7.e eVar = new f7.e();
        int size = list.size();
        f0.d dVarD = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) list.get(i10);
            if (bVar != null) {
                String strO = bVar.f15248b.o();
                p7.h hVar = b.f15242e;
                p7.h hVar2 = bVar.f15247a;
                if (hVar2.equals(hVar)) {
                    dVarD = f0.d.d("HTTP/1.1 " + strO);
                } else if (!f15268f.contains(hVar2)) {
                    d5.e eVar2 = d5.e.f12374q;
                    String strO2 = hVar2.o();
                    eVar2.getClass();
                    eVar.a(strO2, strO);
                }
            } else if (dVarD != null && dVarD.f13014b == 100) {
                eVar = new f7.e();
                dVarD = null;
            }
        }
        if (dVarD == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        f7.a0 a0Var = new f7.a0();
        a0Var.f13207b = f7.x.f13386h;
        a0Var.f13208c = dVarD.f13014b;
        a0Var.f13209d = (String) dVarD.f13016d;
        ArrayList arrayList = eVar.f13250a;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        f7.e eVar3 = new f7.e();
        Collections.addAll(eVar3.f13250a, strArr);
        a0Var.f13211f = eVar3;
        if (z9) {
            d5.e.f12374q.getClass();
            if (a0Var.f13208c == 100) {
                return null;
            }
        }
        return a0Var;
    }
}

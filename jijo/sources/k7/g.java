package k7;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.en1;
import f7.a0;
import f7.b0;
import f7.c0;
import f7.q;
import f7.w;
import f7.x;
import f7.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.logging.Logger;
import p7.n;
import p7.p;
import p7.s;

/* JADX INFO: loaded from: classes.dex */
public final class g implements j7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f14744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7.d f14745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p7.g f14746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p7.f f14747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14748e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14749f = 262144;

    public g(w wVar, i7.d dVar, p7.g gVar, p7.f fVar) {
        this.f14744a = wVar;
        this.f14745b = dVar;
        this.f14746c = gVar;
        this.f14747d = fVar;
    }

    @Override // j7.d
    public final s a(z zVar, long j10) {
        if ("chunked".equalsIgnoreCase(zVar.f13398c.a("Transfer-Encoding"))) {
            if (this.f14748e == 1) {
                this.f14748e = 2;
                return new b(this);
            }
            throw new IllegalStateException("state: " + this.f14748e);
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f14748e == 1) {
            this.f14748e = 2;
            return new d(this, j10);
        }
        throw new IllegalStateException("state: " + this.f14748e);
    }

    @Override // j7.d
    public final void b() {
        this.f14747d.flush();
    }

    @Override // j7.d
    public final void c() {
        this.f14747d.flush();
    }

    @Override // j7.d
    public final c0 d(b0 b0Var) {
        i7.d dVar = this.f14745b;
        dVar.f14200e.getClass();
        String strA = b0Var.a("Content-Type");
        if (!j7.f.b(b0Var)) {
            e eVarG = g(0L);
            Logger logger = n.f16294a;
            return new c0(strA, 0L, new p(eVarG));
        }
        if ("chunked".equalsIgnoreCase(b0Var.a("Transfer-Encoding"))) {
            q qVar = b0Var.f13219a.f13396a;
            if (this.f14748e != 4) {
                throw new IllegalStateException("state: " + this.f14748e);
            }
            this.f14748e = 5;
            c cVar = new c(this, qVar);
            Logger logger2 = n.f16294a;
            return new c0(strA, -1L, new p(cVar));
        }
        long jA = j7.f.a(b0Var);
        if (jA != -1) {
            e eVarG2 = g(jA);
            Logger logger3 = n.f16294a;
            return new c0(strA, jA, new p(eVarG2));
        }
        if (this.f14748e != 4) {
            throw new IllegalStateException("state: " + this.f14748e);
        }
        this.f14748e = 5;
        dVar.e();
        f fVar = new f(this);
        Logger logger4 = n.f16294a;
        return new c0(strA, -1L, new p(fVar));
    }

    @Override // j7.d
    public final void e(z zVar) {
        Proxy.Type type = this.f14745b.a().f14182c.f13252b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(zVar.f13397b);
        sb.append(' ');
        q qVar = zVar.f13396a;
        if (qVar.f13324a.equals("https") || type != Proxy.Type.HTTP) {
            sb.append(en1.D(qVar));
        } else {
            sb.append(qVar);
        }
        sb.append(" HTTP/1.1");
        i(zVar.f13398c, sb.toString());
    }

    @Override // j7.d
    public final a0 f(boolean z9) {
        int i10 = this.f14748e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f14748e);
        }
        try {
            String strR = this.f14746c.r(this.f14749f);
            this.f14749f -= (long) strR.length();
            f0.d dVarD = f0.d.d(strR);
            a0 a0Var = new a0();
            a0Var.f13207b = (x) dVarD.f13015c;
            a0Var.f13208c = dVarD.f13014b;
            a0Var.f13209d = (String) dVarD.f13016d;
            a0Var.f13211f = h().c();
            if (z9 && dVarD.f13014b == 100) {
                return null;
            }
            if (dVarD.f13014b == 100) {
                this.f14748e = 3;
                return a0Var;
            }
            this.f14748e = 4;
            return a0Var;
        } catch (EOFException e10) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f14745b);
            iOException.initCause(e10);
            throw iOException;
        }
    }

    public final e g(long j10) {
        if (this.f14748e != 4) {
            throw new IllegalStateException("state: " + this.f14748e);
        }
        this.f14748e = 5;
        e eVar = new e(this);
        eVar.f14742h = j10;
        if (j10 == 0) {
            eVar.a(null, true);
        }
        return eVar;
    }

    public final f7.p h() {
        f7.e eVar = new f7.e();
        while (true) {
            String strR = this.f14746c.r(this.f14749f);
            this.f14749f -= (long) strR.length();
            if (strR.length() == 0) {
                return new f7.p(eVar);
            }
            d5.e.f12374q.getClass();
            int iIndexOf = strR.indexOf(":", 1);
            if (iIndexOf != -1) {
                eVar.a(strR.substring(0, iIndexOf), strR.substring(iIndexOf + 1));
            } else if (strR.startsWith(":")) {
                eVar.a(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, strR.substring(1));
            } else {
                eVar.a(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, strR);
            }
        }
    }

    public final void i(f7.p pVar, String str) {
        if (this.f14748e != 0) {
            throw new IllegalStateException("state: " + this.f14748e);
        }
        p7.f fVar = this.f14747d;
        fVar.w(str).w("\r\n");
        int iD = pVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            fVar.w(pVar.b(i10)).w(": ").w(pVar.e(i10)).w("\r\n");
        }
        fVar.w("\r\n");
        this.f14748e = 1;
    }
}

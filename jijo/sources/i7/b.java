package i7;

import com.google.android.gms.internal.ads.fb1;
import f7.a0;
import f7.b0;
import f7.e0;
import f7.i;
import f7.o;
import f7.q;
import f7.w;
import f7.x;
import f7.z;
import j7.f;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k7.e;
import k7.g;
import l7.l;
import l7.n;
import l7.r;
import l7.y;
import m7.h;
import p7.p;
import p7.v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f14181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f14182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f14183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f14184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f14185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f14186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f14187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f14188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p7.o f14189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14192m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f14193n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f14194o = Long.MAX_VALUE;

    public b(i iVar, e0 e0Var) {
        this.f14181b = iVar;
        this.f14182c = e0Var;
    }

    @Override // l7.n
    public final void a(r rVar) {
        synchronized (this.f14181b) {
            this.f14192m = rVar.u();
        }
    }

    @Override // l7.n
    public final void b(l7.x xVar) {
        xVar.c(l7.a.REFUSED_STREAM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        r10 = r9.f14182c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r10.f13251a.f13203i == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        if (r10.f13252b.type() != java.net.Proxy.Type.HTTP) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r9.f14183d == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        throw new okhttp3.internal.connection.RouteException(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r9.f14187h == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        r10 = r9.f14181b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        r9.f14192m = r9.f14187h.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r10, int r11, int r12, int r13, boolean r14, f7.n r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.b.c(int, int, int, int, boolean, f7.n):void");
    }

    public final void d(int i10, int i11, f7.n nVar) throws IOException {
        e0 e0Var = this.f14182c;
        Proxy proxy = e0Var.f13252b;
        InetSocketAddress inetSocketAddress = e0Var.f13253c;
        this.f14183d = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? e0Var.f13251a.f13197c.createSocket() : new Socket(proxy);
        nVar.getClass();
        this.f14183d.setSoTimeout(i11);
        try {
            h.f15802a.f(this.f14183d, inetSocketAddress, i10);
            try {
                this.f14188i = new p(p7.n.b(this.f14183d));
                this.f14189j = new p7.o(p7.n.a(this.f14183d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void e(int i10, int i11, int i12, f7.n nVar) throws IOException {
        n3.b bVar = new n3.b(3);
        e0 e0Var = this.f14182c;
        q qVar = e0Var.f13251a.f13195a;
        if (qVar == null) {
            throw new NullPointerException("url == null");
        }
        bVar.f15930a = qVar;
        bVar.e("Host", g7.b.k(qVar, true));
        bVar.e("Proxy-Connection", "Keep-Alive");
        bVar.e("User-Agent", "okhttp/3.10.0");
        z zVarB = bVar.b();
        d(i10, i11, nVar);
        String str = "CONNECT " + g7.b.k(zVarB.f13396a, true) + " HTTP/1.1";
        p pVar = this.f14188i;
        g gVar = new g(null, null, pVar, this.f14189j);
        v vVarB = pVar.f16299b.b();
        long j10 = i11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVarB.g(j10, timeUnit);
        this.f14189j.f16296b.b().g(i12, timeUnit);
        gVar.i(zVarB.f13398c, str);
        gVar.b();
        a0 a0VarF = gVar.f(false);
        a0VarF.f13206a = zVarB;
        b0 b0VarA = a0VarF.a();
        long jA = f.a(b0VarA);
        if (jA == -1) {
            jA = 0;
        }
        e eVarG = gVar.g(jA);
        g7.b.q(eVarG, Integer.MAX_VALUE, timeUnit);
        eVarG.close();
        int i13 = b0VarA.f13221d;
        if (i13 != 200) {
            if (i13 != 407) {
                throw new IOException(fb1.g("Unexpected response code for CONNECT: ", i13));
            }
            e0Var.f13251a.f13198d.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!this.f14188i.f16298a.n() || !this.f14189j.f16295a.n()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(a aVar, int i10, f7.n nVar) throws Throwable {
        SSLSocket sSLSocket;
        if (this.f14182c.f13251a.f13203i == null) {
            this.f14186g = x.f13384d;
            this.f14184e = this.f14183d;
            return;
        }
        nVar.getClass();
        f7.a aVar2 = this.f14182c.f13251a;
        SSLSocketFactory sSLSocketFactory = aVar2.f13203i;
        q qVar = aVar2.f13195a;
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(this.f14183d, qVar.f13327d, qVar.f13328e, true);
            } catch (AssertionError e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z9 = aVar.a(sSLSocket).f13299b;
            if (z9) {
                h.f15802a.e(sSLSocket, qVar.f13327d, aVar2.f13199e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if ("NONE".equals(session.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) {
                throw new IOException("a valid ssl session was not established");
            }
            o oVarA = o.a(session);
            boolean zVerify = aVar2.f13204j.verify(qVar.f13327d, session);
            List list = oVarA.f13320c;
            if (!zVerify) {
                X509Certificate x509Certificate = (X509Certificate) list.get(0);
                throw new SSLPeerUnverifiedException("Hostname " + qVar.f13327d + " not verified:\n    certificate: " + f7.f.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + o7.c.a(x509Certificate));
            }
            aVar2.f13205k.a(qVar.f13327d, list);
            String strH = z9 ? h.f15802a.h(sSLSocket) : null;
            this.f14184e = sSLSocket;
            this.f14188i = new p(p7.n.b(sSLSocket));
            this.f14189j = new p7.o(p7.n.a(this.f14184e));
            this.f14185f = oVarA;
            this.f14186g = strH != null ? x.a(strH) : x.f13384d;
            h.f15802a.a(sSLSocket);
            if (this.f14186g == x.f13386h) {
                this.f14184e.setSoTimeout(0);
                l lVar = new l();
                lVar.f15290e = n.f15293a;
                lVar.f15291f = true;
                Socket socket = this.f14184e;
                String str = this.f14182c.f13251a.f13195a.f13327d;
                p pVar = this.f14188i;
                p7.o oVar = this.f14189j;
                lVar.f15286a = socket;
                lVar.f15287b = str;
                lVar.f15288c = pVar;
                lVar.f15289d = oVar;
                lVar.f15290e = this;
                lVar.f15292g = i10;
                r rVar = new r(lVar);
                this.f14187h = rVar;
                y yVar = rVar.D;
                synchronized (yVar) {
                    try {
                        if (yVar.f15355h) {
                            throw new IOException("closed");
                        }
                        if (yVar.f15352b) {
                            Logger logger = y.f15350s;
                            if (logger.isLoggable(Level.FINE)) {
                                Object[] objArr = {l7.e.f15260a.i()};
                                byte[] bArr = g7.b.f13888a;
                                logger.fine(String.format(Locale.US, ">> CONNECTION %s", objArr));
                            }
                            yVar.f15351a.q((byte[]) l7.e.f15260a.f16279a.clone());
                            yVar.f15351a.flush();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                rVar.D.F(rVar.f15315z);
                if (rVar.f15315z.j() != 65535) {
                    rVar.D.H(0, r10 - 65535);
                }
                new Thread(rVar.E).start();
            }
        } catch (AssertionError e11) {
            e = e11;
            if (!g7.b.o(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th3) {
            th = th3;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                h.f15802a.a(sSLSocket2);
            }
            g7.b.e(sSLSocket2);
            throw th;
        }
    }

    public final boolean g(f7.a aVar, e0 e0Var) {
        if (this.f14193n.size() < this.f14192m && !this.f14190k) {
            d5.e eVar = d5.e.f12374q;
            e0 e0Var2 = this.f14182c;
            f7.a aVar2 = e0Var2.f13251a;
            eVar.getClass();
            if (!aVar2.a(aVar)) {
                return false;
            }
            q qVar = aVar.f13195a;
            if (qVar.f13327d.equals(e0Var2.f13251a.f13195a.f13327d)) {
                return true;
            }
            if (this.f14187h == null || e0Var == null) {
                return false;
            }
            Proxy.Type type = e0Var.f13252b.type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type != type2 || e0Var2.f13252b.type() != type2) {
                return false;
            }
            if (!e0Var2.f13253c.equals(e0Var.f13253c) || e0Var.f13251a.f13204j != o7.c.f16114a || !j(qVar)) {
                return false;
            }
            try {
                aVar.f13205k.a(qVar.f13327d, this.f14185f.f13320c);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public final boolean h(boolean z9) {
        boolean z10;
        if (this.f14184e.isClosed() || this.f14184e.isInputShutdown() || this.f14184e.isOutputShutdown()) {
            return false;
        }
        r rVar = this.f14187h;
        if (rVar != null) {
            synchronized (rVar) {
                z10 = rVar.f15308s;
            }
            return !z10;
        }
        if (z9) {
            try {
                int soTimeout = this.f14184e.getSoTimeout();
                try {
                    this.f14184e.setSoTimeout(1);
                    return !this.f14188i.n();
                } finally {
                    this.f14184e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public final j7.d i(w wVar, j7.g gVar, d dVar) throws SocketException {
        if (this.f14187h != null) {
            return new l7.g(gVar, dVar, this.f14187h);
        }
        Socket socket = this.f14184e;
        int i10 = gVar.f14460j;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f14188i.f16299b.b().g(i10, timeUnit);
        this.f14189j.f16296b.b().g(gVar.f14461k, timeUnit);
        return new g(wVar, dVar, this.f14188i, this.f14189j);
    }

    public final boolean j(q qVar) {
        int i10 = qVar.f13328e;
        q qVar2 = this.f14182c.f13251a.f13195a;
        if (i10 != qVar2.f13328e) {
            return false;
        }
        String str = qVar.f13327d;
        if (str.equals(qVar2.f13327d)) {
            return true;
        }
        o oVar = this.f14185f;
        return oVar != null && o7.c.c(str, (X509Certificate) oVar.f13320c.get(0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        e0 e0Var = this.f14182c;
        sb.append(e0Var.f13251a.f13195a.f13327d);
        sb.append(":");
        sb.append(e0Var.f13251a.f13195a.f13328e);
        sb.append(", proxy=");
        sb.append(e0Var.f13252b);
        sb.append(" hostAddress=");
        sb.append(e0Var.f13253c);
        sb.append(" cipherSuite=");
        o oVar = this.f14185f;
        sb.append(oVar != null ? oVar.f13319b : "none");
        sb.append(" protocol=");
        sb.append(this.f14186g);
        sb.append('}');
        return sb.toString();
    }
}

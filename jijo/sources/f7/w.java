package f7;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Cloneable {
    public static final List L = g7.b.m(x.f13386h, x.f13384d);
    public static final List M = g7.b.m(j.f13295e, j.f13297g);
    public final b A;
    public final b B;
    public final i C;
    public final m D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4.y f13369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f13370b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13371d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f13372f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f13373h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f13374q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f5.b f13375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ProxySelector f13376t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f13377u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SocketFactory f13378v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SSLSocketFactory f13379w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t3.i f13380x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HostnameVerifier f13381y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f13382z;

    static {
        d5.e.f12374q = new d5.e();
    }

    public w() {
        this(new v());
    }

    public w(v vVar) {
        boolean z9;
        this.f13369a = vVar.f13344a;
        this.f13370b = vVar.f13345b;
        this.f13371d = vVar.f13346c;
        List list = vVar.f13347d;
        this.f13372f = list;
        this.f13373h = g7.b.l(vVar.f13348e);
        this.f13374q = g7.b.l(vVar.f13349f);
        this.f13375s = vVar.f13350g;
        this.f13376t = vVar.f13351h;
        this.f13377u = vVar.f13352i;
        this.f13378v = vVar.f13353j;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z9 = z9 || ((j) it.next()).f13298a;
            }
        }
        SSLSocketFactory sSLSocketFactory = vVar.f13354k;
        if (sSLSocketFactory == null && z9) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            m7.h hVar = m7.h.f15802a;
                            SSLContext sSLContextG = hVar.g();
                            sSLContextG.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f13379w = sSLContextG.getSocketFactory();
                            this.f13380x = hVar.c(x509TrustManager);
                        } catch (GeneralSecurityException e10) {
                            throw g7.b.a("No System TLS", e10);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e11) {
                throw g7.b.a("No System TLS", e11);
            }
        }
        this.f13379w = sSLSocketFactory;
        this.f13380x = vVar.f13355l;
        this.f13381y = vVar.f13356m;
        t3.i iVar = this.f13380x;
        f fVar = vVar.f13357n;
        this.f13382z = g7.b.j(fVar.f13256b, iVar) ? fVar : new f(fVar.f13255a, iVar);
        this.A = vVar.f13358o;
        this.B = vVar.f13359p;
        this.C = vVar.f13360q;
        this.D = vVar.f13361r;
        this.E = vVar.f13362s;
        this.F = vVar.f13363t;
        this.G = vVar.f13364u;
        this.H = vVar.f13365v;
        this.I = vVar.f13366w;
        this.J = vVar.f13367x;
        this.K = vVar.f13368y;
        if (this.f13373h.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f13373h);
        }
        if (this.f13374q.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f13374q);
        }
    }
}

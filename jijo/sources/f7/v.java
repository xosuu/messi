package f7;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4.y f13344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f13345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f13347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f13349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f5.b f13350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProxySelector f13351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f13352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SocketFactory f13353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SSLSocketFactory f13354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t3.i f13355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HostnameVerifier f13356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f13357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f13358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f13359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f13360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f13361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f13362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f13363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f13364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f13368y;

    public v() {
        this.f13348e = new ArrayList();
        this.f13349f = new ArrayList();
        this.f13344a = new g4.y(1);
        this.f13346c = w.L;
        this.f13347d = w.M;
        this.f13350g = new f5.b(3, n.f13317a);
        this.f13351h = ProxySelector.getDefault();
        this.f13352i = l.f13315o;
        this.f13353j = SocketFactory.getDefault();
        this.f13356m = o7.c.f16114a;
        this.f13357n = f.f13254c;
        d5.e eVar = b.f13218n;
        this.f13358o = eVar;
        this.f13359p = eVar;
        this.f13360q = new i();
        this.f13361r = m.f13316p;
        this.f13362s = true;
        this.f13363t = true;
        this.f13364u = true;
        this.f13365v = 10000;
        this.f13366w = 10000;
        this.f13367x = 10000;
        this.f13368y = 0;
    }

    public final void a(SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory == null) {
            throw new NullPointerException("sslSocketFactory == null");
        }
        this.f13354k = sSLSocketFactory;
        m7.h hVar = m7.h.f15802a;
        X509TrustManager x509TrustManagerN = hVar.n(sSLSocketFactory);
        if (x509TrustManagerN != null) {
            this.f13355l = hVar.c(x509TrustManagerN);
            return;
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + hVar + ", sslSocketFactory is " + sSLSocketFactory.getClass());
    }

    public v(w wVar) {
        ArrayList arrayList = new ArrayList();
        this.f13348e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f13349f = arrayList2;
        this.f13344a = wVar.f13369a;
        this.f13345b = wVar.f13370b;
        this.f13346c = wVar.f13371d;
        this.f13347d = wVar.f13372f;
        arrayList.addAll(wVar.f13373h);
        arrayList2.addAll(wVar.f13374q);
        this.f13350g = wVar.f13375s;
        this.f13351h = wVar.f13376t;
        this.f13352i = wVar.f13377u;
        this.f13353j = wVar.f13378v;
        this.f13354k = wVar.f13379w;
        this.f13355l = wVar.f13380x;
        this.f13356m = wVar.f13381y;
        this.f13357n = wVar.f13382z;
        this.f13358o = wVar.A;
        this.f13359p = wVar.B;
        this.f13360q = wVar.C;
        this.f13361r = wVar.D;
        this.f13362s = wVar.E;
        this.f13363t = wVar.F;
        this.f13364u = wVar.G;
        this.f13365v = wVar.H;
        this.f13366w = wVar.I;
        this.f13367x = wVar.J;
        this.f13368y = wVar.K;
    }
}

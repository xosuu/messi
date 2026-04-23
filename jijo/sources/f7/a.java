package f7;

import com.google.android.gms.internal.ads.fb1;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f13195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f13196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SocketFactory f13197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f13198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f13199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f13200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f13201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Proxy f13202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SSLSocketFactory f13203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HostnameVerifier f13204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f13205k;

    public a(String str, int i10, m mVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        z5.b bVar2 = new z5.b(1);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            bVar2.f20714b = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            bVar2.f20714b = "https";
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strB = g7.b.b(q.h(str, false, 0, str.length()));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        bVar2.f20717e = strB;
        if (i10 <= 0 || i10 > 65535) {
            throw new IllegalArgumentException(fb1.g("unexpected port: ", i10));
        }
        bVar2.f20718f = i10;
        this.f13195a = bVar2.a();
        if (mVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f13196b = mVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f13197c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f13198d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f13199e = g7.b.l(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f13200f = g7.b.l(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f13201g = proxySelector;
        this.f13202h = proxy;
        this.f13203i = sSLSocketFactory;
        this.f13204j = hostnameVerifier;
        this.f13205k = fVar;
    }

    public final boolean a(a aVar) {
        return this.f13196b.equals(aVar.f13196b) && this.f13198d.equals(aVar.f13198d) && this.f13199e.equals(aVar.f13199e) && this.f13200f.equals(aVar.f13200f) && this.f13201g.equals(aVar.f13201g) && g7.b.j(this.f13202h, aVar.f13202h) && g7.b.j(this.f13203i, aVar.f13203i) && g7.b.j(this.f13204j, aVar.f13204j) && g7.b.j(this.f13205k, aVar.f13205k) && this.f13195a.f13328e == aVar.f13195a.f13328e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13195a.equals(aVar.f13195a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13201g.hashCode() + ((this.f13200f.hashCode() + ((this.f13199e.hashCode() + ((this.f13198d.hashCode() + ((this.f13196b.hashCode() + ((this.f13195a.f13331h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f13202h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f13203i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f13204j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f13205k;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        q qVar = this.f13195a;
        sb.append(qVar.f13327d);
        sb.append(":");
        sb.append(qVar.f13328e);
        Proxy proxy = this.f13202h;
        if (proxy != null) {
            sb.append(", proxy=");
            sb.append(proxy);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f13201g);
        }
        sb.append("}");
        return sb.toString();
    }
}

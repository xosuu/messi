package f7;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f13318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f13319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13321d;

    public o(f0 f0Var, g gVar, List list, List list2) {
        this.f13318a = f0Var;
        this.f13319b = gVar;
        this.f13320c = list;
        this.f13321d = list2;
    }

    public static o a(SSLSession sSLSession) {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        g gVarA = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        f0 f0VarA = f0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listM = peerCertificates != null ? g7.b.m(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new o(f0VarA, gVarA, listM, localCertificates != null ? g7.b.m(localCertificates) : Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f13318a.equals(oVar.f13318a) && this.f13319b.equals(oVar.f13319b) && this.f13320c.equals(oVar.f13320c) && this.f13321d.equals(oVar.f13321d);
    }

    public final int hashCode() {
        return this.f13321d.hashCode() + ((this.f13320c.hashCode() + ((this.f13319b.hashCode() + ((this.f13318a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}

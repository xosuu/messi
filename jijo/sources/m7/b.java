package m7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f15784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f15785b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f15785b = method;
        this.f15784a = x509TrustManager;
    }

    @Override // o7.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f15785b.invoke(this.f15784a, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw g7.b.a("unable to get issues and signature", e10);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15784a.equals(bVar.f15784a) && this.f15785b.equals(bVar.f15785b);
    }

    public final int hashCode() {
        return (this.f15785b.hashCode() * 31) + this.f15784a.hashCode();
    }
}

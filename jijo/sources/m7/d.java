package m7;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {
    public static d o() {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            Conscrypt.setUseEngineSocketByDefault(true);
            return new d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Provider p() {
        return new OpenSSLProvider();
    }

    @Override // m7.h
    public final void e(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) h.b(list).toArray(new String[0]));
        }
    }

    @Override // m7.h
    public final SSLContext g() {
        try {
            return SSLContext.getInstance("TLS", p());
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Override // m7.h
    public final String h(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // m7.h
    public final X509TrustManager n(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.n(sSLSocketFactory);
        }
        try {
            Object objM = h.m(Object.class, sSLSocketFactory, "sslParameters");
            if (objM != null) {
                return (X509TrustManager) h.m(X509TrustManager.class, objM, "x509TrustManager");
            }
            return null;
        } catch (Exception e10) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e10);
        }
    }
}

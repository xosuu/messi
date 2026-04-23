package m7;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f15792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f15793d;

    public e(Method method, Method method2) {
        this.f15792c = method;
        this.f15793d = method2;
    }

    @Override // m7.h
    public final void e(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayListB = h.b(list);
            this.f15792c.invoke(sSLParameters, arrayListB.toArray(new String[arrayListB.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw g7.b.a("unable to set ssl parameters", e10);
        }
    }

    @Override // m7.h
    public final String h(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f15793d.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw g7.b.a("unable to get selected protocols", e10);
        }
    }

    @Override // m7.h
    public final X509TrustManager n(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}

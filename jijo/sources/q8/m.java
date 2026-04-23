package q8;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class m implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16467a;

    static {
        NativeUtil.classesInit0(54);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final native void checkClientTrusted(X509Certificate[] x509CertificateArr, String str);

    @Override // javax.net.ssl.X509TrustManager
    public final native void checkServerTrusted(X509Certificate[] x509CertificateArr, String str);

    @Override // javax.net.ssl.X509TrustManager
    public final native X509Certificate[] getAcceptedIssuers();
}

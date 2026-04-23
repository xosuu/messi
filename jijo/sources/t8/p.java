package t8;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements HostnameVerifier {
    static {
        NativeUtil.classesInit0(149);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final native boolean verify(String str, SSLSession sSLSession);
}

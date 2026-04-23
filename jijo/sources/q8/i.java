package q8;

import android.os.Handler;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import team.dev.epro.apkcustom.activities.ResponseChecker;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ResponseChecker f16456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f16457b;

    static {
        NativeUtil.classesInit0(61);
    }

    public /* synthetic */ i(ResponseChecker responseChecker, Handler handler) {
        this.f16456a = responseChecker;
        this.f16457b = handler;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final native boolean verify(String str, SSLSession sSLSession);
}

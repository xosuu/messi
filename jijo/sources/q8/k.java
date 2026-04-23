package q8;

import javax.net.ssl.SSLSession;
import team.dev.epro.apkcustom.activities.ResponseChecker;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ResponseChecker f16463b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SSLSession f16464d;

    static {
        NativeUtil.classesInit0(64);
    }

    public /* synthetic */ k(ResponseChecker responseChecker, SSLSession sSLSession, int i10) {
        this.f16462a = i10;
        this.f16463b = responseChecker;
        this.f16464d = sSLSession;
    }

    @Override // java.lang.Runnable
    public final native void run();
}

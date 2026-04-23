package q8;

import android.os.Handler;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import team.dev.epro.apkcustom.activities.ResponseChecker;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements HandshakeCompletedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ResponseChecker f16452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f16453b;

    static {
        NativeUtil.classesInit0(5);
    }

    public /* synthetic */ g(ResponseChecker responseChecker, Handler handler) {
        this.f16452a = responseChecker;
        this.f16453b = handler;
    }

    @Override // javax.net.ssl.HandshakeCompletedListener
    public final native void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent);
}

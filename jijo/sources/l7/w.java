package l7;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class w extends p7.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f15338l;

    public w(int i10, Object obj) {
        this.f15337k = i10;
        this.f15338l = obj;
    }

    @Override // p7.c
    public final IOException l(IOException iOException) {
        switch (this.f15337k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }

    @Override // p7.c
    public final void m() {
        int i10 = this.f15337k;
        Object obj = this.f15338l;
        switch (i10) {
            case 0:
                x xVar = (x) obj;
                a aVar = a.CANCEL;
                if (xVar.d(aVar)) {
                    xVar.f15342d.F(xVar.f15341c, aVar);
                    return;
                }
                return;
            default:
                try {
                    ((Socket) obj).close();
                    return;
                } catch (AssertionError e10) {
                    Logger logger = p7.n.f16294a;
                    if (e10.getCause() == null || e10.getMessage() == null || !e10.getMessage().contains("getsockname failed")) {
                        throw e10;
                    }
                    p7.n.f16294a.log(Level.WARNING, "Failed to close timed out socket " + ((Socket) obj), (Throwable) e10);
                    return;
                } catch (Exception e11) {
                    p7.n.f16294a.log(Level.WARNING, "Failed to close timed out socket " + ((Socket) obj), (Throwable) e11);
                    return;
                }
        }
    }

    public final void n() {
        if (k()) {
            throw l(null);
        }
    }
}

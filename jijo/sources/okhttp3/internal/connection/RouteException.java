package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class RouteException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f16117b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IOException f16118a;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        f16117b = declaredMethod;
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.f16118a = iOException;
    }
}

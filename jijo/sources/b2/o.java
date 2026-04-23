package b2;

import java.lang.reflect.InvocationTargetException;
import k.q;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f1252a;

    static {
        p gVar;
        try {
            gVar = new q(15, (WebViewProviderFactoryBoundaryInterface) q7.b.f(WebViewProviderFactoryBoundaryInterface.class, p7.q.f()));
        } catch (ClassNotFoundException unused) {
            gVar = new g();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
        f1252a = gVar;
    }
}

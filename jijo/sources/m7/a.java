package m7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f15783c;

    public a(Object obj, Method method) {
        this.f15782b = obj;
        this.f15783c = method;
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    @Override // t3.i
    public final List g(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return (List) this.f15783c.invoke(this.f15782b, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
            sSLPeerUnverifiedException.initCause(e11);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return 0;
    }
}

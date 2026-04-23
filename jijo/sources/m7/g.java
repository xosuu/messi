package m7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f15797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f15798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f15799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f15800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f15801g;

    public g(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f15797c = method;
        this.f15798d = method2;
        this.f15799e = method3;
        this.f15800f = cls;
        this.f15801g = cls2;
    }

    @Override // m7.h
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f15799e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw g7.b.a("unable to remove alpn", e10);
        }
    }

    @Override // m7.h
    public final void e(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f15797c.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f15800f, this.f15801g}, new f(h.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw g7.b.a("unable to set alpn", e10);
        }
    }

    @Override // m7.h
    public final String h(SSLSocket sSLSocket) {
        try {
            f fVar = (f) Proxy.getInvocationHandler(this.f15798d.invoke(null, sSLSocket));
            boolean z9 = fVar.f15795b;
            if (!z9 && fVar.f15796c == null) {
                h.f15802a.k(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z9) {
                return null;
            }
            return fVar.f15796c;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw g7.b.a("unable to get selected protocol", e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw g7.b.a("unable to get selected protocol", e);
        }
    }
}

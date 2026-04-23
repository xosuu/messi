package m7;

import f7.w;
import f7.x;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f15802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f15803b;

    static {
        Class<?> cls;
        h hVarO;
        d6.a aVar;
        d6.a aVar2;
        g gVar = null;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            d6.a aVar3 = new d6.a((Class) null, "setUseSessionTickets", new Class[]{Boolean.TYPE});
            d6.a aVar4 = new d6.a((Class) null, "setHostname", new Class[]{String.class});
            if (Security.getProvider("GMSCore_OpenSSL") != null) {
                aVar = new d6.a(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                aVar2 = new d6.a((Class) null, "setAlpnProtocols", new Class[]{byte[].class});
                hVarO = new c(cls2, aVar3, aVar4, aVar, aVar2);
            } else {
                try {
                    Class.forName("android.net.Network");
                    aVar = new d6.a(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                    aVar2 = new d6.a((Class) null, "setAlpnProtocols", new Class[]{byte[].class});
                } catch (ClassNotFoundException unused2) {
                    aVar = null;
                    aVar2 = null;
                }
                hVarO = new c(cls2, aVar3, aVar4, aVar, aVar2);
            }
        } catch (ClassNotFoundException unused3) {
            hVarO = null;
        }
        if (hVarO == null && ((!"conscrypt".equals(System.getProperty("okhttp.platform")) && !"Conscrypt".equals(Security.getProviders()[0].getName())) || (hVarO = d.o()) == null)) {
            try {
                hVarO = new e(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
            } catch (NoSuchMethodException unused4) {
                hVarO = null;
            }
            if (hVarO == null) {
                try {
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    gVar = new g(cls3.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls3.getMethod("get", SSLSocket.class), cls3.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                }
                hVarO = gVar != null ? gVar : new h();
            }
        }
        f15802a = hVarO;
        f15803b = Logger.getLogger(w.class.getName());
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) list.get(i10);
            if (xVar != x.f13383b) {
                arrayList.add(xVar.f13389a);
            }
        }
        return arrayList;
    }

    public static Object m(Class cls, Object obj, String str) {
        Object objM;
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null && cls.isInstance(obj2)) {
                    return cls.cast(obj2);
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (str.equals("delegate") || (objM = m(Object.class, obj, "delegate")) == null) {
            return null;
        }
        return m(cls, objM, str);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public i c(X509TrustManager x509TrustManager) {
        return new o7.a(d(x509TrustManager));
    }

    public o7.d d(X509TrustManager x509TrustManager) {
        return new o7.b(x509TrustManager.getAcceptedIssuers());
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        socket.connect(inetSocketAddress, i10);
    }

    public SSLContext g() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public Object i() {
        if (f15803b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean j(String str) {
        return true;
    }

    public void k(int i10, String str, Throwable th) {
        f15803b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void l(Object obj, String str) {
        if (obj == null) {
            str = g1.a.y(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(5, str, (Throwable) obj);
    }

    public X509TrustManager n(SSLSocketFactory sSLSocketFactory) {
        try {
            Object objM = m(Class.forName("sun.security.ssl.SSLContextImpl"), sSLSocketFactory, "context");
            if (objM == null) {
                return null;
            }
            return (X509TrustManager) m(X509TrustManager.class, objM, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

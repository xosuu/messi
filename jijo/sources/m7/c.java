package m7;

import android.os.Build;
import android.util.Log;
import f7.x;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.h3;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f15786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d6.a f15787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d6.a f15788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d6.a f15789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d6.a f15790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h3 f15791h;

    public c(Class cls, d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4) {
        Method method;
        Method method2;
        Method method3;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            method = cls2.getMethod("get", new Class[0]);
            method3 = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", new Class[0]);
        } catch (Exception unused) {
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f15791h = new h3(method, method3, method2);
        this.f15786c = cls;
        this.f15787d = aVar;
        this.f15788e = aVar2;
        this.f15789f = aVar3;
        this.f15790g = aVar4;
    }

    public static boolean o(Class cls, Object obj, String str) {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }

    @Override // m7.h
    public final i c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // m7.h
    public final o7.d d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new o7.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // m7.h
    public final void e(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f15787d.e(sSLSocket, Boolean.TRUE);
            this.f15788e.e(sSLSocket, str);
        }
        d6.a aVar = this.f15790g;
        if (aVar == null || aVar.b(sSLSocket.getClass()) == null) {
            return;
        }
        Object[] objArr = new Object[1];
        p7.e eVar = new p7.e();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) list.get(i10);
            if (xVar != x.f13383b) {
                eVar.K(xVar.f13389a.length());
                String str2 = xVar.f13389a;
                eVar.O(0, str2.length(), str2);
            }
        }
        try {
            objArr[0] = eVar.p(eVar.f16276b);
            try {
                aVar.c(sSLSocket, objArr);
            } catch (InvocationTargetException e10) {
                Throwable targetException = e10.getTargetException();
                if (targetException instanceof RuntimeException) {
                    throw ((RuntimeException) targetException);
                }
                AssertionError assertionError = new AssertionError("Unexpected exception");
                assertionError.initCause(targetException);
                throw assertionError;
            }
        } catch (EOFException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // m7.h
    public final void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (!g7.b.o(e10)) {
                throw e10;
            }
            throw new IOException(e10);
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e11;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e11);
            throw iOException;
        } catch (SecurityException e12) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e12);
            throw iOException2;
        }
    }

    @Override // m7.h
    public final String h(SSLSocket sSLSocket) {
        d6.a aVar = this.f15789f;
        if (aVar == null || aVar.b(sSLSocket.getClass()) == null) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) aVar.c(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, g7.b.f13891d);
            }
            return null;
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // m7.h
    public final Object i() {
        h3 h3Var = this.f15791h;
        Method method = h3Var.f14864a;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            h3Var.f14865b.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // m7.h
    public final boolean j(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return o(cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw g7.b.a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw g7.b.a("unable to determine cleartext support", e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw g7.b.a("unable to determine cleartext support", e);
        }
    }

    @Override // m7.h
    public final void k(int i10, String str, Throwable th) {
        int iMin;
        int i11 = i10 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            int iIndexOf = str.indexOf(10, i12);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i12 = iMin;
                }
            }
            i12 = iMin + 1;
        }
    }

    @Override // m7.h
    public final void l(Object obj, String str) {
        h3 h3Var = this.f15791h;
        h3Var.getClass();
        if (obj != null) {
            try {
                h3Var.f14866c.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        k(5, str, null);
    }

    @Override // m7.h
    public final X509TrustManager n(SSLSocketFactory sSLSocketFactory) {
        Object objM = h.m(this.f15786c, sSLSocketFactory, "sslParameters");
        if (objM == null) {
            try {
                objM = h.m(Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), sSLSocketFactory, "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.n(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) h.m(X509TrustManager.class, objM, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) h.m(X509TrustManager.class, objM, "trustManager");
    }
}

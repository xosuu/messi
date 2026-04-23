package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a11 extends f21 implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n5.a f2562t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Class f2563u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f2564v;

    public a11(n5.a aVar, Class cls, Object obj) {
        aVar.getClass();
        this.f2562t = aVar;
        this.f2563u = cls;
        this.f2564v = obj;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final String d() {
        n5.a aVar = this.f2562t;
        Class cls = this.f2563u;
        Object obj = this.f2564v;
        String strD = super.d();
        String strI = aVar != null ? fb1.i("inputFuture=[", aVar.toString(), "], ") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (cls == null || obj == null) {
            if (strD != null) {
                return strI.concat(strD);
            }
            return null;
        }
        return strI + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final void e() {
        k(this.f2562t);
        this.f2562t = null;
        this.f2563u = null;
        this.f2564v = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        n5.a aVar = this.f2562t;
        Class cls = this.f2563u;
        Object obj = this.f2564v;
        if (((obj == null) || ((aVar == 0) | (cls == null))) || (this.f6805a instanceof b11)) {
            return;
        }
        this.f2562t = null;
        try {
            th = aVar instanceof z21 ? ((z21) aVar).b() : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(aVar.getClass()) + " threw " + String.valueOf(e10.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objS0 = th == null ? tc1.s0(aVar) : null;
        if (th == null) {
            f(objS0);
            return;
        }
        if (!cls.isInstance(th)) {
            l(aVar);
            return;
        }
        try {
            Object objS = s(obj, th);
            this.f2563u = null;
            this.f2564v = null;
            t(objS);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                g(th2);
            } finally {
                this.f2563u = null;
                this.f2564v = null;
            }
        }
    }

    public abstract Object s(Object obj, Throwable th);

    public abstract void t(Object obj);
}

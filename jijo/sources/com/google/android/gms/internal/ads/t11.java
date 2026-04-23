package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class t11 extends f21 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f9031v = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n5.a f9032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f9033u;

    public t11(n5.a aVar, Object obj) {
        aVar.getClass();
        this.f9032t = aVar;
        this.f9033u = obj;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final String d() {
        n5.a aVar = this.f9032t;
        Object obj = this.f9033u;
        String strD = super.d();
        String strI = aVar != null ? fb1.i("inputFuture=[", aVar.toString(), "], ") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (obj == null) {
            if (strD != null) {
                return strI.concat(strD);
            }
            return null;
        }
        return strI + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final void e() {
        k(this.f9032t);
        this.f9032t = null;
        this.f9033u = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n5.a aVar = this.f9032t;
        Object obj = this.f9033u;
        if (((this.f6805a instanceof b11) | (aVar == null)) || (obj == null)) {
            return;
        }
        this.f9032t = null;
        if (aVar.isCancelled()) {
            l(aVar);
            return;
        }
        try {
            try {
                Object objS = s(obj, tc1.s0(aVar));
                this.f9033u = null;
                t(objS);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    g(th);
                } finally {
                    this.f9033u = null;
                }
            }
        } catch (Error e10) {
            g(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            g(e11.getCause());
        } catch (Exception e12) {
            g(e12);
        }
    }

    public abstract Object s(Object obj, Object obj2);

    public abstract void t(Object obj);
}

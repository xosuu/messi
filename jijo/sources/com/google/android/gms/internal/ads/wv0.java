package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wv0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f10356g = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.b f10358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv0 f10359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f3 f10360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xq f10361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10362f = new Object();

    public wv0(Context context, android.support.v4.media.b bVar, cv0 cv0Var, f3 f3Var) {
        this.f10357a = context;
        this.f10358b = bVar;
        this.f10359c = cv0Var;
        this.f10360d = f3Var;
    }

    public final xq a() {
        xq xqVar;
        synchronized (this.f10362f) {
            xqVar = this.f10361e;
        }
        return xqVar;
    }

    public final qp0 b() {
        synchronized (this.f10362f) {
            try {
                xq xqVar = this.f10361e;
                if (xqVar == null) {
                    return null;
                }
                return (qp0) xqVar.f10631d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(qp0 qp0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                xq xqVar = new xq(d(qp0Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f10357a, "msa-r", qp0Var.l(), null, new Bundle(), 2), qp0Var, this.f10358b, this.f10359c, 2);
                if (!xqVar.I()) {
                    throw new zzfqe(4000, "init failed");
                }
                int iZ = xqVar.z();
                if (iZ != 0) {
                    throw new zzfqe(4001, "ci: " + iZ);
                }
                synchronized (this.f10362f) {
                    xq xqVar2 = this.f10361e;
                    if (xqVar2 != null) {
                        try {
                            xqVar2.H();
                        } catch (zzfqe e10) {
                            this.f10359c.b(e10.f11642a, -1L, e10);
                        }
                        this.f10361e = xqVar;
                    } else {
                        this.f10361e = xqVar;
                    }
                }
                this.f10359c.c(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e11) {
                throw new zzfqe(2004, e11);
            }
        } catch (zzfqe e12) {
            this.f10359c.b(e12.f11642a, System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.f10359c.b(4010, System.currentTimeMillis() - jCurrentTimeMillis, e13);
            return false;
        }
    }

    public final synchronized Class d(qp0 qp0Var) {
        try {
            String strI = ((nb) qp0Var.f8251b).I();
            HashMap map = f10356g;
            Class cls = (Class) map.get(strI);
            if (cls != null) {
                return cls;
            }
            try {
                f3 f3Var = this.f10360d;
                File file = (File) qp0Var.f8252d;
                f3Var.getClass();
                if (!f3.a(file)) {
                    throw new zzfqe(2026, "VM did not pass signature verification");
                }
                try {
                    File file2 = (File) qp0Var.f8253f;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(((File) qp0Var.f8252d).getAbsolutePath(), file2.getAbsolutePath(), null, this.f10357a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strI, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    throw new zzfqe(2008, e);
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    throw new zzfqe(2008, e);
                } catch (SecurityException e12) {
                    e = e12;
                    throw new zzfqe(2008, e);
                }
            } catch (GeneralSecurityException e13) {
                throw new zzfqe(2026, e13);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

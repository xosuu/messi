package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3610a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bc f3611b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3612c = false;

    public final Activity a() {
        synchronized (this.f3610a) {
            try {
                bc bcVar = this.f3611b;
                if (bcVar == null) {
                    return null;
                }
                return bcVar.f2963a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Application b() {
        synchronized (this.f3610a) {
            try {
                bc bcVar = this.f3611b;
                if (bcVar == null) {
                    return null;
                }
                return bcVar.f2964b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(cc ccVar) {
        synchronized (this.f3610a) {
            try {
                if (this.f3611b == null) {
                    this.f3611b = new bc();
                }
                this.f3611b.a(ccVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Context context) {
        synchronized (this.f3610a) {
            try {
                if (!this.f3612c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        zzm.zzj("Can not cast Context to Application");
                        return;
                    }
                    if (this.f3611b == null) {
                        this.f3611b = new bc();
                    }
                    bc bcVar = this.f3611b;
                    if (!bcVar.f2971u) {
                        application.registerActivityLifecycleCallbacks(bcVar);
                        if (context instanceof Activity) {
                            bcVar.c((Activity) context);
                        }
                        bcVar.f2964b = application;
                        bcVar.f2972v = ((Long) zzba.zzc().a(eg.J0)).longValue();
                        bcVar.f2971u = true;
                    }
                    this.f3612c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(b10 b10Var) {
        synchronized (this.f3610a) {
            try {
                bc bcVar = this.f3611b;
                if (bcVar == null) {
                    return;
                }
                bcVar.b(b10Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

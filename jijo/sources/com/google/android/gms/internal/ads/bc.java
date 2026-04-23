package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bc implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f2963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f2964b;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s9 f2970t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2972v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2965d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2966f = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2967h = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f2968q = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f2969s = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2971u = false;

    public final void a(cc ccVar) {
        synchronized (this.f2965d) {
            this.f2968q.add(ccVar);
        }
    }

    public final void b(b10 b10Var) {
        synchronized (this.f2965d) {
            this.f2968q.remove(b10Var);
        }
    }

    public final void c(Activity activity) {
        synchronized (this.f2965d) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.f2963a = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f2965d) {
            try {
                Activity activity2 = this.f2963a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f2963a = null;
                }
                Iterator it = this.f2969s.iterator();
                while (it.hasNext()) {
                    fb1.t(it.next());
                    try {
                        throw null;
                    } catch (Exception e10) {
                        zzu.zzo().i("AppActivityTracker.ActivityListener.onActivityDestroyed", e10);
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity);
        synchronized (this.f2965d) {
            Iterator it = this.f2969s.iterator();
            while (it.hasNext()) {
                fb1.t(it.next());
                try {
                    throw null;
                } catch (Exception e10) {
                    zzu.zzo().i("AppActivityTracker.ActivityListener.onActivityPaused", e10);
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                }
            }
        }
        this.f2967h = true;
        s9 s9Var = this.f2970t;
        if (s9Var != null) {
            zzt.zza.removeCallbacks(s9Var);
        }
        ew0 ew0Var = zzt.zza;
        s9 s9Var2 = new s9(5, this);
        this.f2970t = s9Var2;
        ew0Var.postDelayed(s9Var2, this.f2972v);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity);
        this.f2967h = false;
        boolean z9 = !this.f2966f;
        this.f2966f = true;
        s9 s9Var = this.f2970t;
        if (s9Var != null) {
            zzt.zza.removeCallbacks(s9Var);
        }
        synchronized (this.f2965d) {
            Iterator it = this.f2969s.iterator();
            while (it.hasNext()) {
                fb1.t(it.next());
                try {
                    throw null;
                } catch (Exception e10) {
                    zzu.zzo().i("AppActivityTracker.ActivityListener.onActivityResumed", e10);
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                }
            }
            if (z9) {
                Iterator it2 = this.f2968q.iterator();
                while (it2.hasNext()) {
                    try {
                        ((cc) it2.next()).zza(true);
                    } catch (Exception e11) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                    }
                }
            } else {
                zzm.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

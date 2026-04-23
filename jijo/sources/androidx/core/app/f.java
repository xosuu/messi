package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f463b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f464d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f465f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f466h = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f467q = false;

    public f(Activity activity) {
        this.f463b = activity;
        this.f464d = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f463b == activity) {
            this.f463b = null;
            this.f466h = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f466h || this.f467q || this.f465f) {
            return;
        }
        Object obj = this.f462a;
        try {
            Object obj2 = g.f475c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f464d) {
                g.f479g.postAtFrontOfQueue(new l.j(g.f474b.get(activity), obj2, 4));
                this.f467q = true;
                this.f462a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f463b == activity) {
            this.f465f = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

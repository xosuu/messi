package u3;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f17557h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f17558a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f17559b = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17560d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17561f = false;

    public final void a(m mVar) {
        synchronized (f17557h) {
            this.f17560d.add(mVar);
        }
    }

    public final void b(boolean z9) {
        synchronized (f17557h) {
            try {
                Iterator it = this.f17560d.iterator();
                while (it.hasNext()) {
                    e4.e eVar = ((m) it.next()).f17590a.f17579y;
                    eVar.sendMessage(eVar.obtainMessage(1, Boolean.valueOf(z9)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f17559b;
        boolean zCompareAndSet = this.f17558a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f17559b;
        boolean zCompareAndSet = this.f17558a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f17558a.compareAndSet(false, true)) {
            this.f17559b.set(true);
            b(true);
        }
    }
}

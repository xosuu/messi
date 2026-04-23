package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class ju0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6089b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public iu0 f6090d;

    public void a(boolean z9) {
    }

    public boolean b() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f6089b) {
            this.f6089b = true;
            if (this.f6088a) {
                a(true);
                iu0 iu0Var = this.f6090d;
                if (iu0Var != null) {
                    iu0Var.b(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z9 = runningAppProcessInfo.importance == 100 || b();
        if (this.f6089b != z9) {
            this.f6089b = z9;
            if (this.f6088a) {
                a(z9);
                iu0 iu0Var = this.f6090d;
                if (iu0Var != null) {
                    iu0Var.b(z9);
                }
            }
        }
    }
}

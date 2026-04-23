package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ea implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f3884b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f3885d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3886f;

    public ea(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, int i10) {
        this.f3883a = i10;
        if (i10 != 1) {
            this.f3886f = false;
            this.f3885d = new WeakReference(activityLifecycleCallbacks);
            this.f3884b = application;
        } else {
            this.f3886f = false;
            this.f3885d = new WeakReference(activityLifecycleCallbacks);
            this.f3884b = application;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        WeakReference weakReference = this.f3885d;
        int i10 = this.f3883a;
        Application application = this.f3884b;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception e10) {
                    zzm.zzh("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakReference weakReference = this.f3885d;
        int i10 = this.f3883a;
        Application application = this.f3884b;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception e10) {
                    zzm.zzh("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        WeakReference weakReference = this.f3885d;
        int i10 = this.f3883a;
        Application application = this.f3884b;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception e10) {
                    zzm.zzh("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        WeakReference weakReference = this.f3885d;
        int i10 = this.f3883a;
        Application application = this.f3884b;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception e10) {
                    zzm.zzh("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        WeakReference weakReference = this.f3885d;
        int i10 = this.f3883a;
        Application application = this.f3884b;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception e10) {
                    zzm.zzh("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        WeakReference weakReference = this.f3885d;
        int i10 = this.f3883a;
        Application application = this.f3884b;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception e10) {
                    zzm.zzh("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        WeakReference weakReference = this.f3885d;
        int i10 = this.f3883a;
        Application application = this.f3884b;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f3886f) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f3886f = true;
                    }
                } catch (Exception e10) {
                    zzm.zzh("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class xb implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long A = ((Long) zzba.zzc().a(eg.f3969d1)).longValue();
    public static final /* synthetic */ int B = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f10519b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PowerManager f10520d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final KeyguardManager f10521f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.g0 f10522h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f10523q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WeakReference f10524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ea f10525t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final zzbx f10526u = new zzbx(A);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10527v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10528w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashSet f10529x = new HashSet();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DisplayMetrics f10530y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f10531z;

    public xb(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f10518a = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f10520d = (PowerManager) applicationContext.getSystemService("power");
        this.f10521f = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f10519b = application;
            this.f10525t = new ea(application, this, 1);
        }
        this.f10530y = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f10531z = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f10524s;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.f10524s = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f10 = rect.left;
        float f11 = this.f10530y.density;
        return new Rect((int) (f10 / f11), (int) (rect.top / f11), (int) (rect.right / f11), (int) (rect.bottom / f11));
    }

    public final void b(Activity activity, int i10) {
        Window window;
        WeakReference weakReference = this.f10524s;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f10528w = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r30) {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xb.c(int):void");
    }

    public final void d() {
        zzt.zza.post(new s9(4, this));
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f10523q = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f10522h == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f10522h = new f.g0(6, this);
            zzu.zzv().zzc(this.f10518a, this.f10522h, intentFilter);
        }
        Application application = this.f10519b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f10525t);
            } catch (Exception e10) {
                zzm.zzh("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f10523q;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f10523q = null;
            }
        } catch (Exception e10) {
            zzm.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e10);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e11) {
            zzm.zzh("Error while unregistering listeners from the ViewTreeObserver.", e11);
        }
        if (this.f10522h != null) {
            try {
                zzu.zzv().zzd(this.f10518a, this.f10522h);
            } catch (IllegalStateException e12) {
                zzm.zzh("Failed trying to unregister the receiver", e12);
            } catch (Exception e13) {
                zzu.zzo().i("ActiveViewUnit.stopScreenStatusMonitoring", e13);
            }
            this.f10522h = null;
        }
        Application application = this.f10519b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f10525t);
            } catch (Exception e14) {
                zzm.zzh("Error registering activity lifecycle callbacks.", e14);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c(3);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c(2);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10528w = -1;
        e(view);
        c(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10528w = -1;
        c(3);
        d();
        f(view);
    }
}

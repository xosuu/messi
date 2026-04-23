package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class na implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Handler f7223y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f7225b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PowerManager f7226d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final KeyguardManager f7227f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.g0 f7228h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fa f7229q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WeakReference f7230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WeakReference f7231t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ea f7232u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f7233v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7234w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f7235x = -3;

    public na(Context context, fa faVar) {
        Context applicationContext = context.getApplicationContext();
        this.f7224a = applicationContext;
        this.f7229q = faVar;
        this.f7226d = (PowerManager) applicationContext.getSystemService("power");
        this.f7227f = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f7225b = application;
            this.f7232u = new ea(application, this, 0);
        }
        a(null);
    }

    public final void a(View view) {
        long j10;
        WeakReference weakReference = this.f7231t;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            e(view2);
        }
        this.f7231t = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j10 = -2;
        } else {
            j10 = -3;
        }
        this.f7235x = j10;
    }

    public final void b(Activity activity, int i10) {
        Window window;
        if (this.f7231t == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        WeakReference weakReference = this.f7231t;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f7234w = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.f7231t
            if (r0 != 0) goto L6
            goto Lc2
        L6:
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L11
        L10:
            r0 = r1
        L11:
            r2 = -1
            r3 = -3
            if (r0 != 0) goto L1b
            r9.f7235x = r3
            r9.f7233v = r2
            return
        L1b:
            int r5 = r0.getVisibility()
            r6 = 0
            if (r5 == 0) goto L24
            r5 = 1
            goto L25
        L24:
            r5 = 0
        L25:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L2d
            r5 = r5 | 2
        L2d:
            android.os.PowerManager r7 = r9.f7226d
            if (r7 == 0) goto L39
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L39
            r5 = r5 | 4
        L39:
            com.google.android.gms.internal.ads.fa r7 = r9.f7229q
            boolean r7 = r7.f4434a
            if (r7 != 0) goto L88
            android.app.KeyguardManager r7 = r9.f7227f
            if (r7 == 0) goto L86
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L86
            char[] r7 = com.google.android.gms.internal.ads.la.f6543a
            android.view.View r7 = r0.getRootView()
            if (r7 != 0) goto L52
            r7 = r0
        L52:
            android.content.Context r7 = r7.getContext()
        L56:
            boolean r8 = r7 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L6e
            r8 = 10
            if (r6 >= r8) goto L6e
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L65
            android.app.Activity r7 = (android.app.Activity) r7
            goto L6f
        L65:
            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
            android.content.Context r7 = r7.getBaseContext()
            int r6 = r6 + 1
            goto L56
        L6e:
            r7 = r1
        L6f:
            if (r7 != 0) goto L72
            goto L86
        L72:
            android.view.Window r6 = r7.getWindow()
            if (r6 != 0) goto L79
            goto L7d
        L79:
            android.view.WindowManager$LayoutParams r1 = r6.getAttributes()
        L7d:
            if (r1 == 0) goto L86
            int r1 = r1.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r6
            if (r1 != 0) goto L88
        L86:
            r5 = r5 | 8
        L88:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r1 = r0.getGlobalVisibleRect(r1)
            if (r1 != 0) goto L95
            r5 = r5 | 16
        L95:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r1 = r0.getLocalVisibleRect(r1)
            if (r1 != 0) goto La2
            r5 = r5 | 32
        La2:
            int r0 = r0.getWindowVisibility()
            int r1 = r9.f7234w
            if (r1 == r2) goto Lab
            r0 = r1
        Lab:
            if (r0 == 0) goto Laf
            r5 = r5 | 64
        Laf:
            byte r0 = r9.f7233v
            if (r0 == r5) goto Lc2
            byte r0 = (byte) r5
            r9.f7233v = r0
            if (r5 != 0) goto Lbd
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lc0
        Lbd:
            long r0 = (long) r5
            long r0 = r3 - r0
        Lc0:
            r9.f7235x = r0
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.na.c():void");
    }

    public final void d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f7230s = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f7228h == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            f.g0 g0Var = new f.g0(5, this);
            this.f7228h = g0Var;
            this.f7224a.registerReceiver(g0Var, intentFilter);
        }
        Application application = this.f7225b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f7232u);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(View view) {
        try {
            WeakReference weakReference = this.f7230s;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f7230s = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        f.g0 g0Var = this.f7228h;
        if (g0Var != null) {
            try {
                this.f7224a.unregisterReceiver(g0Var);
            } catch (Exception unused3) {
            }
            this.f7228h = null;
        }
        Application application = this.f7225b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f7232u);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c();
        f7223y.post(new s9(2, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f7234w = -1;
        d(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7234w = -1;
        c();
        f7223y.post(new s9(2, this));
        e(view);
    }
}

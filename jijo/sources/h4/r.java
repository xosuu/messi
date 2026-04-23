package h4;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile r f13999i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3.b f14001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f14002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m2.f f14003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile e f14007h;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(android.content.Context r11, java.lang.String r12, android.os.Bundle r13) {
        /*
            r10 = this;
            r10.<init>()
            java.lang.String r0 = "com.google.firebase.analytics.FirebaseAnalytics"
            if (r12 == 0) goto L10
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Lb
            goto L10
        Lb:
            java.lang.String r1 = "FA-Ads"
            r10.f14000a = r1
            goto L14
        L10:
            java.lang.String r1 = "FA"
            r10.f14000a = r1
        L14:
            y3.b r1 = y3.b.f20451a
            r10.f14001b = r1
            h4.m r9 = new h4.m
            r9.<init>()
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            r3 = 1
            r4 = 1
            r5 = 60
            r2 = r1
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r2 = 1
            r1.allowCoreThreadTimeOut(r2)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.unconfigurableExecutorService(r1)
            r10.f14002c = r1
            m2.f r1 = new m2.f
            r3 = 28
            r1.<init>(r3, r10)
            r10.f14003d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r1 = g4.a0.F(r11)     // Catch: java.lang.IllegalStateException -> L6a
            android.content.res.Resources r3 = r11.getResources()     // Catch: java.lang.IllegalStateException -> L6a
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.IllegalStateException -> L6a
            if (r4 != 0) goto L55
            goto L59
        L55:
            java.lang.String r1 = g4.a0.F(r11)     // Catch: java.lang.IllegalStateException -> L6a
        L59:
            java.lang.String r4 = "string"
            java.lang.String r5 = "google_app_id"
            int r1 = r3.getIdentifier(r5, r4, r1)     // Catch: java.lang.IllegalStateException -> L6a
            r4 = 0
            if (r1 != 0) goto L65
            goto L6d
        L65:
            java.lang.String r1 = r3.getString(r1)     // Catch: java.lang.IllegalStateException -> L6a android.content.res.Resources.NotFoundException -> L6c
            goto L6e
        L6a:
            goto L79
        L6c:
        L6d:
            r1 = r4
        L6e:
            if (r1 == 0) goto L79
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L74
            goto L79
        L74:
            r10.f14006g = r4
            r10.f14005f = r2
            return
        L79:
            if (r12 == 0) goto L84
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7f
            goto L84
        L7f:
            java.lang.String r0 = "am"
            r10.f14006g = r0
            goto L88
        L84:
            java.lang.String r0 = "fa"
            r10.f14006g = r0
        L88:
            h4.h r0 = new h4.h
            r0.<init>(r10, r12, r11, r13)
            r10.b(r0)
            android.content.Context r11 = r11.getApplicationContext()
            android.app.Application r11 = (android.app.Application) r11
            if (r11 != 0) goto L99
            return
        L99:
            h4.q r12 = new h4.q
            r12.<init>(r10)
            r11.registerActivityLifecycleCallbacks(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.r.<init>(android.content.Context, java.lang.String, android.os.Bundle):void");
    }

    public final void a(Exception exc, boolean z9, boolean z10) {
        this.f14005f |= z9;
        if (!z9 && z10) {
            b(new l(this, exc));
        }
    }

    public final void b(o oVar) {
        this.f14002c.execute(oVar);
    }
}

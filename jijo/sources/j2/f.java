package j2;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import c2.n;
import f.g0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f14291j = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f14292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f14293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g0 f14294i;

    static {
        n.l("NetworkStateTracker");
    }

    public f(Context context, o2.a aVar) {
        super(context, aVar);
        this.f14292g = (ConnectivityManager) this.f14285b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f14293h = new e(0, this);
        } else {
            this.f14294i = new g0(2, this);
        }
    }

    @Override // j2.d
    public final Object a() {
        return f();
    }

    @Override // j2.d
    public final void d() {
        if (!(Build.VERSION.SDK_INT >= 24)) {
            n.i().g(new Throwable[0]);
            this.f14285b.registerReceiver(this.f14294i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            n.i().g(new Throwable[0]);
            this.f14292g.registerDefaultNetworkCallback(this.f14293h);
        } catch (IllegalArgumentException | SecurityException e10) {
            n.i().h(e10);
        }
    }

    @Override // j2.d
    public final void e() {
        if (!(Build.VERSION.SDK_INT >= 24)) {
            n.i().g(new Throwable[0]);
            this.f14285b.unregisterReceiver(this.f14294i);
            return;
        }
        try {
            n.i().g(new Throwable[0]);
            this.f14292g.unregisterNetworkCallback(this.f14293h);
        } catch (IllegalArgumentException | SecurityException e10) {
            n.i().h(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h2.a f() {
        /*
            r8 = this;
            android.net.ConnectivityManager r0 = r8.f14292g
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 >= r6) goto L1b
        L19:
            r5 = 0
            goto L3c
        L1b:
            android.net.Network r5 = com.google.android.gms.internal.ads.yl1.d(r0)     // Catch: java.lang.SecurityException -> L2f
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)     // Catch: java.lang.SecurityException -> L2f
            if (r5 == 0) goto L19
            r6 = 16
            boolean r5 = r5.hasCapability(r6)     // Catch: java.lang.SecurityException -> L2f
            if (r5 == 0) goto L19
            r5 = 1
            goto L3c
        L2f:
            r5 = move-exception
            c2.n r6 = c2.n.i()
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]
            r7[r2] = r5
            r6.h(r7)
            goto L19
        L3c:
            boolean r0 = j0.a.a(r0)
            if (r1 == 0) goto L49
            boolean r1 = r1.isRoaming()
            if (r1 != 0) goto L49
            r2 = 1
        L49:
            h2.a r1 = new h2.a
            r1.<init>()
            r1.f13937a = r4
            r1.f13938b = r5
            r1.f13939c = r0
            r1.f13940d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.f.f():h2.a");
    }
}

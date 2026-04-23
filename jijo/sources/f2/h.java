package f2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import d2.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import m2.s;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d2.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f13076w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2.a f13078b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f13079d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d2.b f13080f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f13081h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f13082q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f13083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f13084t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Intent f13085u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g f13086v;

    static {
        n.l("SystemAlarmDispatcher");
    }

    public h(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f13077a = applicationContext;
        this.f13082q = new b(applicationContext);
        this.f13079d = new s();
        k kVarS0 = k.s0(context);
        this.f13081h = kVarS0;
        d2.b bVar = kVarS0.f12335h;
        this.f13080f = bVar;
        this.f13078b = kVarS0.f12333f;
        bVar.b(this);
        this.f13084t = new ArrayList();
        this.f13085u = null;
        this.f13083s = new Handler(Looper.getMainLooper());
    }

    @Override // d2.a
    public final void a(String str, boolean z9) {
        int i10 = b.f13055f;
        Intent intent = new Intent(this.f13077a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z9);
        f(new b.d(this, intent, 0, 7));
    }

    public final void b(int i10, Intent intent) {
        n nVarI = n.i();
        String.format("Adding command %s (%s)", intent, Integer.valueOf(i10));
        nVarI.g(new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            n.i().n(new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f13084t) {
            try {
                boolean z9 = !this.f13084t.isEmpty();
                this.f13084t.add(intent);
                if (!z9) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f13083s.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean d() {
        c();
        synchronized (this.f13084t) {
            try {
                Iterator it = this.f13084t.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        n.i().g(new Throwable[0]);
        this.f13080f.f(this);
        ScheduledExecutorService scheduledExecutorService = this.f13079d.f15734a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f13086v = null;
    }

    public final void f(Runnable runnable) {
        this.f13083s.post(runnable);
    }

    public final void g() {
        c();
        PowerManager.WakeLock wakeLockA = m2.k.a(this.f13077a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            ((ur0) this.f13081h.f12333f).s(new f(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}

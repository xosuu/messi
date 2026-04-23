package v3;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f17724h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static c0 f17725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static HandlerThread f17726j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17727a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f17728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e4.e f17729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x3.b f17730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Executor f17733g;

    public c0(Context context, Looper looper) {
        b0 b0Var = new b0(this);
        this.f17728b = context.getApplicationContext();
        e4.e eVar = new e4.e(looper, b0Var);
        Looper.getMainLooper();
        this.f17729c = eVar;
        this.f17730d = x3.b.a();
        this.f17731e = 5000L;
        this.f17732f = 300000L;
        this.f17733g = null;
    }

    public static c0 a(Context context) {
        synchronized (f17724h) {
            try {
                if (f17725i == null) {
                    f17725i = new c0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f17725i;
    }

    public static HandlerThread b() {
        synchronized (f17724h) {
            try {
                HandlerThread handlerThread = f17726j;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f17726j = handlerThread2;
                handlerThread2.start();
                return f17726j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, String str2, w wVar, boolean z9) {
        z zVar = new z(str, str2, z9);
        synchronized (this.f17727a) {
            try {
                a0 a0Var = (a0) this.f17727a.get(zVar);
                if (a0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(zVar.toString()));
                }
                if (!a0Var.f17715a.containsKey(wVar)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(zVar.toString()));
                }
                a0Var.f17715a.remove(wVar);
                if (a0Var.f17715a.isEmpty()) {
                    this.f17729c.sendMessageDelayed(this.f17729c.obtainMessage(0, zVar), this.f17731e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(z zVar, w wVar, String str, Executor executor) {
        boolean z9;
        synchronized (this.f17727a) {
            try {
                a0 a0Var = (a0) this.f17727a.get(zVar);
                if (executor == null) {
                    executor = this.f17733g;
                }
                if (a0Var == null) {
                    a0Var = new a0(this, zVar);
                    a0Var.f17715a.put(wVar, wVar);
                    a0Var.a(str, executor);
                    this.f17727a.put(zVar, a0Var);
                } else {
                    this.f17729c.removeMessages(0, zVar);
                    if (a0Var.f17715a.containsKey(wVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(zVar.toString()));
                    }
                    a0Var.f17715a.put(wVar, wVar);
                    int i10 = a0Var.f17716b;
                    if (i10 == 1) {
                        wVar.onServiceConnected(a0Var.f17720f, a0Var.f17718d);
                    } else if (i10 == 2) {
                        a0Var.a(str, executor);
                    }
                }
                z9 = a0Var.f17717c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }
}

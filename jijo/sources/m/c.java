package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.e;
import b4.f;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15369c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f15370d = Executors.newFixedThreadPool(4, new b(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Handler f15371e;

    public static Handler q0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public final void r0(Runnable runnable) {
        this.f15370d.execute(runnable);
    }

    public final boolean s0() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void t0(e eVar) {
        if (this.f15371e == null) {
            synchronized (this.f15369c) {
                try {
                    if (this.f15371e == null) {
                        this.f15371e = q0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f15371e.post(eVar);
    }
}

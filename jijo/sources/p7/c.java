package p7;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c extends v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f16266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f16267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static c f16268j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f16270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16271g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f16266h = millis;
        f16267i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static c h() throws InterruptedException {
        c cVar = f16268j.f16270f;
        if (cVar == null) {
            long jNanoTime = System.nanoTime();
            c.class.wait(f16266h);
            if (f16268j.f16270f != null || System.nanoTime() - jNanoTime < f16267i) {
                return null;
            }
            return f16268j;
        }
        long jNanoTime2 = cVar.f16271g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j10 = jNanoTime2 / 1000000;
            c.class.wait(j10, (int) (jNanoTime2 - (1000000 * j10)));
            return null;
        }
        f16268j.f16270f = cVar.f16270f;
        cVar.f16270f = null;
        return cVar;
    }

    public final void i() {
        c cVar;
        if (this.f16269e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long j10 = this.f16309c;
        boolean z9 = this.f16307a;
        if (j10 != 0 || z9) {
            this.f16269e = true;
            synchronized (c.class) {
                try {
                    if (f16268j == null) {
                        f16268j = new c();
                        new b4.e(2).start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j10 != 0 && z9) {
                        this.f16271g = Math.min(j10, c() - jNanoTime) + jNanoTime;
                    } else if (j10 != 0) {
                        this.f16271g = j10 + jNanoTime;
                    } else {
                        if (!z9) {
                            throw new AssertionError();
                        }
                        this.f16271g = c();
                    }
                    long j11 = this.f16271g - jNanoTime;
                    c cVar2 = f16268j;
                    while (true) {
                        cVar = cVar2.f16270f;
                        if (cVar == null || j11 < cVar.f16271g - jNanoTime) {
                            break;
                        } else {
                            cVar2 = cVar;
                        }
                    }
                    this.f16270f = cVar;
                    cVar2.f16270f = this;
                    if (cVar2 == f16268j) {
                        c.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void j(boolean z9) throws IOException {
        if (k() && z9) {
            throw l(null);
        }
    }

    public final boolean k() {
        if (!this.f16269e) {
            return false;
        }
        this.f16269e = false;
        synchronized (c.class) {
            c cVar = f16268j;
            while (cVar != null) {
                c cVar2 = cVar.f16270f;
                if (cVar2 == this) {
                    cVar.f16270f = this.f16270f;
                    this.f16270f = null;
                    return false;
                }
                cVar = cVar2;
            }
            return true;
        }
    }

    public IOException l(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void m() {
    }
}

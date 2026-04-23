package k4;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import v3.d0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14682a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f14683b = new d0(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f14685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f14687f;

    public final Exception a() {
        Exception exc;
        synchronized (this.f14682a) {
            exc = this.f14687f;
        }
        return exc;
    }

    public final Object b() {
        Object obj;
        synchronized (this.f14682a) {
            try {
                z3.a.n("Task is not yet complete", this.f14684c);
                if (this.f14685d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f14687f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f14686e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean c() {
        boolean z9;
        synchronized (this.f14682a) {
            z9 = this.f14684c;
        }
        return z9;
    }

    public final boolean d() {
        boolean z9;
        synchronized (this.f14682a) {
            try {
                z9 = false;
                if (this.f14684c && !this.f14685d && this.f14687f == null) {
                    z9 = true;
                }
            } finally {
            }
        }
        return z9;
    }

    public final void e(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (this.f14682a) {
            h();
            this.f14684c = true;
            this.f14687f = exc;
        }
        this.f14683b.h(this);
    }

    public final void f(Object obj) {
        synchronized (this.f14682a) {
            h();
            this.f14684c = true;
            this.f14686e = obj;
        }
        this.f14683b.h(this);
    }

    public final void g() {
        synchronized (this.f14682a) {
            try {
                if (this.f14684c) {
                    return;
                }
                this.f14684c = true;
                this.f14685d = true;
                this.f14683b.h(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        if (this.f14684c) {
            int i10 = DuplicateTaskCompletionException.f11693a;
            if (!c()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excA = a();
        }
    }

    public final void i() {
        synchronized (this.f14682a) {
            try {
                if (this.f14684c) {
                    this.f14683b.h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

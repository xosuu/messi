package p7;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f16306d = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16309c;

    public v a() {
        this.f16307a = false;
        return this;
    }

    public v b() {
        this.f16309c = 0L;
        return this;
    }

    public long c() {
        if (this.f16307a) {
            return this.f16308b;
        }
        throw new IllegalStateException("No deadline");
    }

    public v d(long j10) {
        this.f16307a = true;
        this.f16308b = j10;
        return this;
    }

    public boolean e() {
        return this.f16307a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f16307a && this.f16308b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public v g(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.g("timeout < 0: ", j10));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f16309c = timeUnit.toNanos(j10);
        return this;
    }
}

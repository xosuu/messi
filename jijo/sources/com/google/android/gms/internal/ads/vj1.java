package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj1 f9869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tj1 f9870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f9873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9876h;

    public vj1(aj1 aj1Var, vh1 vh1Var, Looper looper) {
        this.f9870b = aj1Var;
        this.f9869a = vh1Var;
        this.f9873e = looper;
    }

    public final Looper a() {
        return this.f9873e;
    }

    public final void b() {
        tc1.W(!this.f9874f);
        this.f9874f = true;
        aj1 aj1Var = (aj1) this.f9870b;
        synchronized (aj1Var) {
            if (!aj1Var.J && aj1Var.f2713v.getThread().isAlive()) {
                aj1Var.f2711t.a(14, this).a();
                return;
            }
            fg0.f("Ignoring messages sent after release.");
            c(false);
        }
    }

    public final synchronized void c(boolean z9) {
        this.f9875g = z9 | this.f9875g;
        this.f9876h = true;
        notifyAll();
    }

    public final synchronized void d(long j10) {
        try {
            tc1.W(this.f9874f);
            tc1.W(this.f9873e.getThread() != Thread.currentThread());
            long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
            while (!this.f9876h) {
                if (j10 <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j10);
                j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

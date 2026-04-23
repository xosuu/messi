package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b10 implements cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f2863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3.a f2864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledFuture f2865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2866d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2867e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f2868f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2869g = false;

    public b10(ScheduledExecutorService scheduledExecutorService, y3.a aVar) {
        this.f2863a = scheduledExecutorService;
        this.f2864b = aVar;
        zzu.zzb().c(this);
    }

    public final synchronized void a() {
        try {
            if (this.f2869g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f2865c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f2867e = -1L;
            } else {
                this.f2865c.cancel(true);
                long j10 = this.f2866d;
                ((y3.b) this.f2864b).getClass();
                this.f2867e = j10 - SystemClock.elapsedRealtime();
            }
            this.f2869g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(int i10, up0 up0Var) {
        this.f2868f = up0Var;
        ((y3.b) this.f2864b).getClass();
        long j10 = i10;
        this.f2866d = SystemClock.elapsedRealtime() + j10;
        this.f2865c = this.f2863a.schedule(up0Var, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.cc
    public final void zza(boolean z9) {
        ScheduledFuture scheduledFuture;
        if (!z9) {
            a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f2869g) {
                    if (this.f2867e > 0 && (scheduledFuture = this.f2865c) != null && scheduledFuture.isCancelled()) {
                        this.f2865c = this.f2863a.schedule(this.f2868f, this.f2867e, TimeUnit.MILLISECONDS);
                    }
                    this.f2869g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

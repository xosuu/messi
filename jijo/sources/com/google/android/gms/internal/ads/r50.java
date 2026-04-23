package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r50 extends oe1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f8410b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y3.a f8411d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8412f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8413h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8414q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ScheduledFuture f8417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ScheduledFuture f8418v;

    public r50(ScheduledExecutorService scheduledExecutorService, y3.a aVar) {
        super(Collections.emptySet());
        this.f8412f = -1L;
        this.f8413h = -1L;
        this.f8414q = -1L;
        this.f8415s = -1L;
        this.f8416t = false;
        this.f8410b = scheduledExecutorService;
        this.f8411d = aVar;
    }

    public final synchronized void J0(int i10) {
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.f8416t) {
                long j10 = this.f8414q;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f8414q = millis;
                return;
            }
            ((y3.b) this.f8411d).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = this.f8412f;
            if (jElapsedRealtime > j11 || j11 - jElapsedRealtime > millis) {
                L0(millis);
            }
        }
    }

    public final synchronized void K0(int i10) {
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.f8416t) {
                long j10 = this.f8415s;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f8415s = millis;
                return;
            }
            ((y3.b) this.f8411d).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = this.f8413h;
            if (jElapsedRealtime > j11 || j11 - jElapsedRealtime > millis) {
                M0(millis);
            }
        }
    }

    public final synchronized void L0(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f8417u;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f8417u.cancel(false);
            }
            ((y3.b) this.f8411d).getClass();
            this.f8412f = SystemClock.elapsedRealtime() + j10;
            this.f8417u = this.f8410b.schedule(new q50(this), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void M0(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f8418v;
            int i10 = 0;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f8418v.cancel(false);
            }
            ((y3.b) this.f8411d).getClass();
            this.f8413h = SystemClock.elapsedRealtime() + j10;
            this.f8418v = this.f8410b.schedule(new q50(this, i10), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.f8416t = false;
        L0(0L);
    }
}

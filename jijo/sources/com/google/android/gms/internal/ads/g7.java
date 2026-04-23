package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class g7 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue f4837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f7 f4838b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s7 f4839d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f4840f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i10 f4841h;

    public g7(PriorityBlockingQueue priorityBlockingQueue, f7 f7Var, s7 s7Var, i10 i10Var) {
        this.f4837a = priorityBlockingQueue;
        this.f4838b = f7Var;
        this.f4839d = s7Var;
        this.f4841h = i10Var;
    }

    public final void a() {
        i10 i10Var = this.f4841h;
        i7 i7Var = (i7) this.f4837a.take();
        SystemClock.elapsedRealtime();
        i7Var.h(3);
        try {
            try {
                i7Var.zzm("network-queue-take");
                i7Var.zzw();
                TrafficStats.setThreadStatsTag(i7Var.zzc());
                h7 h7VarZza = this.f4838b.zza(i7Var);
                i7Var.zzm("network-http-complete");
                if (h7VarZza.f5229e && i7Var.zzv()) {
                    i7Var.e("not-modified");
                    i7Var.f();
                } else {
                    l7 l7VarA = i7Var.a(h7VarZza);
                    i7Var.zzm("network-parse-complete");
                    if (((z6) l7VarA.f6525d) != null) {
                        this.f4839d.c(i7Var.zzj(), (z6) l7VarA.f6525d);
                        i7Var.zzm("network-cache-written");
                    }
                    i7Var.zzq();
                    i10Var.d(i7Var, l7VarA, null);
                    i7Var.g(l7VarA);
                }
            } catch (zzapq e10) {
                SystemClock.elapsedRealtime();
                i10Var.b(i7Var, e10);
                i7Var.f();
            } catch (Exception e11) {
                o7.b("Unhandled exception %s", e11.toString());
                zzapq zzapqVar = new zzapq(e11);
                SystemClock.elapsedRealtime();
                i10Var.b(i7Var, zzapqVar);
                i7Var.f();
            }
            i7Var.h(4);
        } catch (Throwable th) {
            i7Var.h(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f4840f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                o7.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

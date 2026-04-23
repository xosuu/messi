package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class a7 extends Thread {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f2612s = o7.f7522a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue f2613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f2614b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s7 f2615d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f2616f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xq f2617h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i10 f2618q;

    public a7(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, s7 s7Var, i10 i10Var) {
        this.f2613a = priorityBlockingQueue;
        this.f2614b = priorityBlockingQueue2;
        this.f2615d = s7Var;
        this.f2618q = i10Var;
        this.f2617h = new xq(this, priorityBlockingQueue2, i10Var);
    }

    public final void a() {
        i7 i7Var = (i7) this.f2613a.take();
        i7Var.zzm("cache-queue-take");
        i7Var.h(1);
        try {
            i7Var.zzw();
            z6 z6VarA = this.f2615d.a(i7Var.zzj());
            if (z6VarA == null) {
                i7Var.zzm("cache-miss");
                if (!this.f2617h.s(i7Var)) {
                    this.f2614b.put(i7Var);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (z6VarA.f11161e < jCurrentTimeMillis) {
                    i7Var.zzm("cache-hit-expired");
                    i7Var.zze(z6VarA);
                    if (!this.f2617h.s(i7Var)) {
                        this.f2614b.put(i7Var);
                    }
                } else {
                    i7Var.zzm("cache-hit");
                    byte[] bArr = z6VarA.f11157a;
                    Map map = z6VarA.f11163g;
                    l7 l7VarA = i7Var.a(new h7(200, bArr, map, h7.a(map), false));
                    i7Var.zzm("cache-hit-parsed");
                    if (!l7VarA.b()) {
                        i7Var.zzm("cache-parsing-failed");
                        s7 s7Var = this.f2615d;
                        String strZzj = i7Var.zzj();
                        synchronized (s7Var) {
                            try {
                                z6 z6VarA2 = s7Var.a(strZzj);
                                if (z6VarA2 != null) {
                                    z6VarA2.f11162f = 0L;
                                    z6VarA2.f11161e = 0L;
                                    s7Var.c(strZzj, z6VarA2);
                                }
                            } finally {
                            }
                        }
                        i7Var.zze(null);
                        if (!this.f2617h.s(i7Var)) {
                            this.f2614b.put(i7Var);
                        }
                    } else if (z6VarA.f11162f < jCurrentTimeMillis) {
                        i7Var.zzm("cache-hit-refresh-needed");
                        i7Var.zze(z6VarA);
                        l7VarA.f6523a = true;
                        if (this.f2617h.s(i7Var)) {
                            this.f2618q.d(i7Var, l7VarA, null);
                        } else {
                            this.f2618q.d(i7Var, l7VarA, new vm(this, i7Var, 4));
                        }
                    } else {
                        this.f2618q.d(i7Var, l7VarA, null);
                    }
                }
            }
            i7Var.h(2);
        } catch (Throwable th) {
            i7Var.h(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f2612s) {
            o7.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f2615d.b();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f2616f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                o7.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

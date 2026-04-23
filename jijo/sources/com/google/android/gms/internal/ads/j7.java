package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f5814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f5815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f5816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s7 f5817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f7 f5818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g7[] f5819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a7 f5820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f5821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f5822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i10 f5823k;

    public j7(s7 s7Var, rk0 rk0Var) {
        i10 i10Var = new i10(new Handler(Looper.getMainLooper()));
        this.f5813a = new AtomicInteger();
        this.f5814b = new HashSet();
        this.f5815c = new PriorityBlockingQueue();
        this.f5816d = new PriorityBlockingQueue();
        this.f5821i = new ArrayList();
        this.f5822j = new ArrayList();
        this.f5817e = s7Var;
        this.f5818f = rk0Var;
        this.f5819g = new g7[4];
        this.f5823k = i10Var;
    }

    public final void a(i7 i7Var) {
        i7Var.zzf(this);
        synchronized (this.f5814b) {
            this.f5814b.add(i7Var);
        }
        i7Var.zzg(this.f5813a.incrementAndGet());
        i7Var.zzm("add-to-queue");
        b();
        this.f5815c.add(i7Var);
    }

    public final void b() {
        synchronized (this.f5822j) {
            try {
                Iterator it = this.f5822j.iterator();
                if (it.hasNext()) {
                    fb1.t(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        a7 a7Var = this.f5820h;
        if (a7Var != null) {
            a7Var.f2616f = true;
            a7Var.interrupt();
        }
        g7[] g7VarArr = this.f5819g;
        for (int i10 = 0; i10 < 4; i10++) {
            g7 g7Var = g7VarArr[i10];
            if (g7Var != null) {
                g7Var.f4840f = true;
                g7Var.interrupt();
            }
        }
        a7 a7Var2 = new a7(this.f5815c, this.f5816d, this.f5817e, this.f5823k);
        this.f5820h = a7Var2;
        a7Var2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            g7 g7Var2 = new g7(this.f5816d, this.f5818f, this.f5817e, this.f5823k);
            this.f5819g[i11] = g7Var2;
            g7Var2.start();
        }
    }
}

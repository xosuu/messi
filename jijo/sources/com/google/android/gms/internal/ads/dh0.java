package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class dh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3659a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3660b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3661c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3662d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3663e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3664f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3665g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f3666h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f3667i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f3668j = new Object();

    public final int a() {
        int i10;
        synchronized (this.f3665g) {
            i10 = this.f3660b;
        }
        return i10;
    }

    public final synchronized long b() {
        long j10;
        synchronized (this.f3668j) {
            j10 = this.f3663e;
        }
        return j10;
    }

    public final synchronized long c() {
        long j10;
        synchronized (this.f3667i) {
            j10 = this.f3662d;
        }
        return j10;
    }

    public final synchronized long d() {
        long j10;
        synchronized (this.f3664f) {
            j10 = this.f3659a;
        }
        return j10;
    }

    public final synchronized void e(long j10) {
        synchronized (this.f3664f) {
            this.f3659a = j10;
        }
    }

    public final void f(int i10) {
        synchronized (this.f3665g) {
            this.f3660b = i10;
        }
    }
}

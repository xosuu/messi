package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class er0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3.a f4281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4282b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f4284d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f4283c = 0;

    public er0(y3.a aVar) {
        this.f4281a = aVar;
    }

    public final boolean a() {
        boolean z9;
        synchronized (this.f4282b) {
            b();
            z9 = this.f4284d == 3;
        }
        return z9;
    }

    public final void b() {
        ((y3.b) this.f4281a).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f4282b) {
            try {
                if (this.f4284d == 3) {
                    if (this.f4283c + ((Long) zzba.zzc().a(eg.f4099p5)).longValue() <= jCurrentTimeMillis) {
                        this.f4284d = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i10, int i11) {
        b();
        Object obj = this.f4282b;
        ((y3.b) this.f4281a).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f4284d != i10) {
                    return;
                }
                this.f4284d = i11;
                if (this.f4284d == 3) {
                    this.f4283c = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

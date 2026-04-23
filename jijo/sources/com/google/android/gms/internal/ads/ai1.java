package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ai1 implements dj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq1 f2689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f2695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2696h;

    public ai1() {
        iq1 iq1Var = new iq1();
        h("bufferForPlaybackMs", 2500, 0, "0");
        h("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        h("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        h("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        h("maxBufferMs", 50000, 50000, "minBufferMs");
        h("backBufferDurationMs", 0, 0, "0");
        this.f2689a = iq1Var;
        long jU = yn0.u(50000L);
        this.f2690b = jU;
        this.f2691c = jU;
        this.f2692d = yn0.u(2500L);
        this.f2693e = yn0.u(5000L);
        this.f2694f = yn0.u(0L);
        this.f2695g = new HashMap();
        this.f2696h = -1L;
    }

    public static void h(String str, int i10, int i11, String str2) {
        tc1.Q(fb1.x(str, " cannot be less than ", str2), i10 >= i11);
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final boolean a(cj1 cj1Var) {
        int i10;
        boolean z9 = cj1Var.f3306d;
        long jRound = cj1Var.f3304b;
        float f10 = cj1Var.f3305c;
        int i11 = yn0.f10944a;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / ((double) f10));
        }
        long jMin = z9 ? this.f2693e : this.f2692d;
        long j10 = cj1Var.f3307e;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || jRound >= jMin) {
            return true;
        }
        iq1 iq1Var = this.f2689a;
        synchronized (iq1Var) {
            i10 = iq1Var.f5676b * 65536;
        }
        return i10 >= g();
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final void b(vk1 vk1Var) {
        if (this.f2695g.remove(vk1Var) != null) {
            boolean zIsEmpty = this.f2695g.isEmpty();
            iq1 iq1Var = this.f2689a;
            if (!zIsEmpty) {
                iq1Var.f(g());
            } else {
                synchronized (iq1Var) {
                    iq1Var.f(0);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final boolean c(cj1 cj1Var) {
        int i10;
        zh1 zh1Var = (zh1) this.f2695g.get(cj1Var.f3303a);
        zh1Var.getClass();
        iq1 iq1Var = this.f2689a;
        synchronized (iq1Var) {
            i10 = iq1Var.f5676b * 65536;
        }
        int iG = g();
        long j10 = this.f2691c;
        long jMin = this.f2690b;
        float f10 = cj1Var.f3305c;
        if (f10 > 1.0f) {
            jMin = Math.min(yn0.t(jMin, f10), j10);
        }
        long jMax = Math.max(jMin, 500000L);
        long j11 = cj1Var.f3304b;
        if (j11 < jMax) {
            boolean z9 = i10 < iG;
            zh1Var.f11243a = z9;
            if (!z9 && j11 < 500000) {
                fg0.f("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || i10 >= iG) {
            zh1Var.f11243a = false;
        }
        return zh1Var.f11243a;
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final void d(vk1 vk1Var) {
        if (this.f2695g.remove(vk1Var) != null) {
            boolean zIsEmpty = this.f2695g.isEmpty();
            iq1 iq1Var = this.f2689a;
            if (zIsEmpty) {
                synchronized (iq1Var) {
                    iq1Var.f(0);
                }
            } else {
                iq1Var.f(g());
            }
        }
        if (this.f2695g.isEmpty()) {
            this.f2696h = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final void e(vk1 vk1Var, vh1[] vh1VarArr, cq1[] cq1VarArr) {
        zh1 zh1Var = (zh1) this.f2695g.get(vk1Var);
        zh1Var.getClass();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = vh1VarArr.length;
            if (i10 >= 2) {
                break;
            }
            if (cq1VarArr[i10] != null) {
                i11 += vh1VarArr[i10].f9849b != 1 ? 131072000 : 13107200;
            }
            i10++;
        }
        zh1Var.f11244b = Math.max(13107200, i11);
        boolean zIsEmpty = this.f2695g.isEmpty();
        iq1 iq1Var = this.f2689a;
        if (!zIsEmpty) {
            iq1Var.f(g());
        } else {
            synchronized (iq1Var) {
                iq1Var.f(0);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final void f(vk1 vk1Var) {
        long id = Thread.currentThread().getId();
        long j10 = this.f2696h;
        boolean z9 = true;
        if (j10 != -1 && j10 != id) {
            z9 = false;
        }
        if (!z9) {
            throw new IllegalStateException("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        }
        this.f2696h = id;
        HashMap map = this.f2695g;
        if (!map.containsKey(vk1Var)) {
            map.put(vk1Var, new zh1());
        }
        zh1 zh1Var = (zh1) map.get(vk1Var);
        zh1Var.getClass();
        zh1Var.f11244b = 13107200;
        zh1Var.f11243a = false;
    }

    public final int g() {
        Iterator it = this.f2695g.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((zh1) it.next()).f11244b;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final long zzb() {
        return this.f2694f;
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final iq1 zzj() {
        return this.f2689a;
    }
}

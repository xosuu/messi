package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i30 implements r60, e50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3.a f5466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k30 f5467b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final or0 f5468d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5469f;

    public i30(y3.a aVar, k30 k30Var, or0 or0Var, String str) {
        this.f5466a = aVar;
        this.f5467b = k30Var;
        this.f5468d = or0Var;
        this.f5469f = str;
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void zza() {
        ((y3.b) this.f5466a).getClass();
        this.f5467b.f6165c.put(this.f5469f, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void zzs() {
        String str = this.f5468d.f7646f;
        ((y3.b) this.f5466a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        k30 k30Var = this.f5467b;
        ConcurrentHashMap concurrentHashMap = k30Var.f6165c;
        String str2 = this.f5469f;
        Long l9 = (Long) concurrentHashMap.get(str2);
        if (l9 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        k30Var.f6166d.put(str, Long.valueOf(jElapsedRealtime - l9.longValue()));
    }
}

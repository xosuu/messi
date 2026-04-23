package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5087b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5088d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5089f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5090h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f5091q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f5092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f5093t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5094u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5095v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lw f5096w;

    public gw(lw lwVar, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z9, int i10, int i11) {
        this.f5086a = str;
        this.f5087b = str2;
        this.f5088d = j10;
        this.f5089f = j11;
        this.f5090h = j12;
        this.f5091q = j13;
        this.f5092s = j14;
        this.f5093t = z9;
        this.f5094u = i10;
        this.f5095v = i11;
        this.f5096w = lwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f5086a);
        map.put("cachedSrc", this.f5087b);
        map.put("bufferedDuration", Long.toString(this.f5088d));
        map.put("totalDuration", Long.toString(this.f5089f));
        if (((Boolean) zzba.zzc().a(eg.G1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f5090h));
            map.put("qoeCachedBytes", Long.toString(this.f5091q));
            map.put("totalBytes", Long.toString(this.f5092s));
            ((y3.b) zzu.zzB()).getClass();
            map.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        map.put("cacheReady", true != this.f5093t ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f5094u));
        map.put("playerPreparedCount", Integer.toString(this.f5095v));
        lw.j(this.f5096w, map);
    }
}

package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5421b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5422d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5423f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5424h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f5425q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f5426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5428u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ lw f5429v;

    public hw(lw lwVar, String str, String str2, int i10, int i11, long j10, long j11, boolean z9, int i12, int i13) {
        this.f5420a = str;
        this.f5421b = str2;
        this.f5422d = i10;
        this.f5423f = i11;
        this.f5424h = j10;
        this.f5425q = j11;
        this.f5426s = z9;
        this.f5427t = i12;
        this.f5428u = i13;
        this.f5429v = lwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f5420a);
        map.put("cachedSrc", this.f5421b);
        map.put("bytesLoaded", Integer.toString(this.f5422d));
        map.put("totalBytes", Integer.toString(this.f5423f));
        map.put("bufferedDuration", Long.toString(this.f5424h));
        map.put("totalDuration", Long.toString(this.f5425q));
        map.put("cacheReady", true != this.f5426s ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f5427t));
        map.put("playerPreparedCount", Integer.toString(this.f5428u));
        lw.j(this.f5429v, map);
    }
}

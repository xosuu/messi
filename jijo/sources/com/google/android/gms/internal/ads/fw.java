package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4675b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4676d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4677f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lw f4678h;

    public fw(lw lwVar, String str, String str2, int i10, int i11) {
        this.f4674a = str;
        this.f4675b = str2;
        this.f4676d = i10;
        this.f4677f = i11;
        this.f4678h = lwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f4674a);
        map.put("cachedSrc", this.f4675b);
        map.put("bytesLoaded", Integer.toString(this.f4676d));
        map.put("totalBytes", Integer.toString(this.f4677f));
        map.put("cacheReady", "0");
        lw.j(this.f4678h, map);
    }
}

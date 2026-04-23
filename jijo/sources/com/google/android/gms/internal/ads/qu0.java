package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class qu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8277a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8279c = System.nanoTime();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8280d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bv0 f8278b = new bv0(null);

    public qu0(String str) {
        this.f8277a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView a() {
        return (WebView) this.f8278b.get();
    }

    public void b() {
        this.f8278b.clear();
    }

    public final void c(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        uu0.c(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        en1.g0(a(), "setLastActivity", jSONObject);
    }

    public void d(yt0 yt0Var, l.b4 b4Var) {
        e(yt0Var, b4Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.ads.yt0 r10, l.b4 r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qu0.e(com.google.android.gms.internal.ads.yt0, l.b4, org.json.JSONObject):void");
    }

    public void f() {
    }
}

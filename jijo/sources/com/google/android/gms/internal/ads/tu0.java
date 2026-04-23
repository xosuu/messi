package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tu0 extends qu0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f9285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f9286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f9287g;

    public tu0(Map map, String str) {
        super(str);
        this.f9286f = null;
        this.f9287g = map;
    }

    @Override // com.google.android.gms.internal.ads.qu0
    public final void b() {
        super.b();
        new Handler().postDelayed(new vh0(this), Math.max(4000 - (this.f9286f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f9286f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f9285e = null;
    }

    @Override // com.google.android.gms.internal.ads.qu0
    public final void d(yt0 yt0Var, l.b4 b4Var) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap((Map) b4Var.f14812f);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            fb1.t(mapUnmodifiableMap.get((String) it.next()));
            throw null;
        }
        e(yt0Var, b4Var, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.qu0
    public final void f() {
        WebView webView = new WebView(mu0.f7055b.f7056a);
        this.f9285e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f9285e.getSettings().setAllowContentAccess(false);
        this.f9285e.getSettings().setAllowFileAccess(false);
        this.f9285e.setWebViewClient(new i3.a(1, this));
        this.f8278b = new bv0(this.f9285e);
        en1.L0(this.f9285e, null);
        Map map = this.f9287g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            fb1.t(map.get((String) it.next()));
            throw null;
        }
        this.f9286f = Long.valueOf(System.nanoTime());
    }
}

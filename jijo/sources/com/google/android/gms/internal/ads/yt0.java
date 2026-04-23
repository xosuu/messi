package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l.b4 f11030a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qu0 f11033d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11036g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu0 f11031b = new lu0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11034e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11035f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bv0 f11032c = new bv0(null);

    public yt0(androidx.emoji2.text.r rVar, l.b4 b4Var, String str) {
        this.f11030a = b4Var;
        this.f11036g = str;
        xt0 xt0Var = (xt0) b4Var.f14815s;
        if (xt0Var == xt0.f10647b || xt0Var == xt0.f10648d) {
            WebView webView = (WebView) b4Var.f14810b;
            su0 su0Var = new su0(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            su0Var.f8278b = new bv0(webView);
            this.f11033d = su0Var;
        } else {
            this.f11033d = new tu0(Collections.unmodifiableMap((Map) b4Var.f14812f), str);
        }
        this.f11033d.f();
        hu0.f5402c.f5403a.add(this);
        qu0 qu0Var = this.f11033d;
        WebView webViewA = qu0Var.a();
        JSONObject jSONObject = new JSONObject();
        uu0.c(jSONObject, "impressionOwner", (du0) rVar.f632b);
        uu0.c(jSONObject, "mediaEventsOwner", (du0) rVar.f633d);
        uu0.c(jSONObject, "creativeType", (zt0) rVar.f634f);
        uu0.c(jSONObject, "impressionType", (bu0) rVar.f635h);
        uu0.c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(rVar.f631a));
        en1.g0(webViewA, "init", jSONObject, qu0Var.f8277a);
    }

    public final void a() {
        if (this.f11035f) {
            return;
        }
        this.f11032c.clear();
        if (!this.f11035f) {
            this.f11031b.f6704a.clear();
        }
        this.f11035f = true;
        qu0 qu0Var = this.f11033d;
        en1.g0(qu0Var.a(), "finishSession", qu0Var.f8277a);
        hu0 hu0Var = hu0.f5402c;
        ArrayList arrayList = hu0Var.f5403a;
        ArrayList arrayList2 = hu0Var.f5404b;
        boolean z9 = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z9 && arrayList2.size() <= 0) {
            nu0 nu0VarA = nu0.a();
            nu0VarA.getClass();
            wu0 wu0Var = wu0.f10344g;
            wu0Var.getClass();
            Handler handler = wu0.f10346i;
            if (handler != null) {
                handler.removeCallbacks(wu0.f10348k);
                wu0.f10346i = null;
            }
            wu0Var.f10349a.clear();
            wu0.f10345h.post(new yd0(14, wu0Var));
            gu0 gu0Var = gu0.f5069f;
            gu0Var.f6088a = false;
            gu0Var.f6090d = null;
            eu0 eu0Var = nu0VarA.f7391b;
            eu0Var.f4299a.getContentResolver().unregisterContentObserver(eu0Var);
        }
        this.f11033d.b();
        this.f11033d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f11035f || ((View) this.f11032c.get()) == view) {
            return;
        }
        this.f11032c = new bv0(view);
        qu0 qu0Var = this.f11033d;
        qu0Var.getClass();
        qu0Var.f8279c = System.nanoTime();
        qu0Var.f8280d = 1;
        Collection<yt0> collectionUnmodifiableCollection = Collections.unmodifiableCollection(hu0.f5402c.f5403a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (yt0 yt0Var : collectionUnmodifiableCollection) {
            if (yt0Var != this && ((View) yt0Var.f11032c.get()) == view) {
                yt0Var.f11032c.clear();
            }
        }
    }

    public final void c() {
        if (this.f11034e) {
            return;
        }
        this.f11034e = true;
        ArrayList arrayList = hu0.f5402c.f5404b;
        boolean z9 = arrayList.size() > 0;
        arrayList.add(this);
        if (!z9) {
            nu0 nu0VarA = nu0.a();
            nu0VarA.getClass();
            gu0 gu0Var = gu0.f5069f;
            gu0Var.f6090d = nu0VarA;
            gu0Var.f6088a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z10 = runningAppProcessInfo.importance == 100 || gu0Var.b();
            gu0Var.f6089b = z10;
            gu0Var.a(z10);
            wu0.f10344g.getClass();
            wu0.b();
            eu0 eu0Var = nu0VarA.f7391b;
            eu0Var.f4301c = eu0Var.a();
            eu0Var.b();
            eu0Var.f4299a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, eu0Var);
        }
        float f10 = nu0.a().f7390a;
        qu0 qu0Var = this.f11033d;
        en1.g0(qu0Var.a(), "setDeviceVolume", Float.valueOf(f10), qu0Var.f8277a);
        qu0 qu0Var2 = this.f11033d;
        Date date = fu0.f4664e.f4665a;
        qu0Var2.c(date != null ? (Date) date.clone() : null);
        this.f11033d.d(this, this.f11030a);
    }
}

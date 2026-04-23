package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class cu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg f3450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f3451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3452c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lu0 f3453d = new lu0();

    public cu0(kg kgVar, WebView webView) {
        if (!tp1.f9254v.f1584b) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.f3450a = kgVar;
        this.f3451b = webView;
        if (!b7.u.t("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        int i10 = a2.c.f10a;
        b2.b bVar = b2.n.f1250c;
        if (!bVar.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        b2.p pVar = b2.o.f1252a;
        pVar.createWebView(webView).removeWebMessageListener("omidJsSessionService");
        aa aaVar = new aa(28, this);
        HashSet hashSet = new HashSet(Arrays.asList("*"));
        if (!bVar.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        pVar.createWebView(webView).addWebMessageListener("omidJsSessionService", (String[]) hashSet.toArray(new String[0]), new q7.a(new m2.f(18, aaVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(cu0 cu0Var, String str) {
        zt0 zt0Var = zt0.f11320b;
        bu0 bu0Var = bu0.f3114b;
        du0 du0Var = du0.f3749d;
        androidx.emoji2.text.r rVarC = androidx.emoji2.text.r.c(zt0Var, bu0Var, du0Var, du0Var, false);
        kg kgVar = cu0Var.f3450a;
        WebView webView = cu0Var.f3451b;
        yt0 yt0Var = new yt0(rVarC, new l.b4(kgVar, webView, null, null, xt0.f10647b), str);
        cu0Var.f3452c.put(str, yt0Var);
        yt0Var.b(webView);
        for (ku0 ku0Var : cu0Var.f3453d.f6704a) {
            View view = (View) ku0Var.f6389a.get();
            if (!yt0Var.f11035f) {
                yt0Var.f11031b.a(view, ku0Var.f6391c);
            }
        }
        yt0Var.c();
    }
}

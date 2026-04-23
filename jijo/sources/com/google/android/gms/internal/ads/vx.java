package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vx extends ix {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        String string = webResourceRequest.getUrl().toString();
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (!(webView instanceof fx)) {
            zzm.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        fx fxVar = (fx) webView;
        dt dtVar = this.J;
        if (dtVar != null) {
            ((ct) dtVar).a(string, requestHeaders, 1);
        }
        int i10 = bw0.f3121a;
        if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
            if (requestHeaders == null) {
                requestHeaders = Collections.emptyMap();
            }
            return e0(string, requestHeaders);
        }
        if (fxVar.g() != null) {
            ix ixVarG = fxVar.g();
            synchronized (ixVarG.f5712f) {
                ixVarG.f5720x = false;
                ixVarG.C = true;
                nu.f7387e.execute(new s9(15, ixVarG));
            }
        }
        if (fxVar.e().b()) {
            str = (String) zzba.zzc().a(eg.H);
        } else if (fxVar.Q()) {
            str = (String) zzba.zzc().a(eg.G);
        } else {
            str = (String) zzba.zzc().a(eg.F);
        }
        zzu.zzp();
        return zzt.zzx(fxVar.getContext(), fxVar.zzn().afmaVersion, str);
    }
}

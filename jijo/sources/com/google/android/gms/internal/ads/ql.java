package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class ql extends gl {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8210d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebViewClient f8211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H5AdsRequestHandler f8212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f8213c;

    public ql(Context context, WebView webView) {
        context.getClass();
        webView.getClass();
        en1.F0("JavaScript must be enabled on the WebView.", webView.getSettings().getJavaScriptEnabled());
        this.f8213c = webView;
        this.f8212b = new H5AdsRequestHandler(context, new rk0(4, webView));
    }

    @Override // com.google.android.gms.internal.ads.gl
    public final WebViewClient a() {
        return this.f8211a;
    }

    @Override // com.google.android.gms.internal.ads.gl, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (!this.f8213c.equals(webView)) {
            zzm.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        } else {
            if (this.f8212b.handleH5AdsRequest(str)) {
                return;
            }
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.gl, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object obj = this.f8213c;
        if (!obj.equals(obj)) {
            zzm.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
            return false;
        }
        if (this.f8212b.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.gl, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f8213c.equals(webView)) {
            if (this.f8212b.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        zzm.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }
}

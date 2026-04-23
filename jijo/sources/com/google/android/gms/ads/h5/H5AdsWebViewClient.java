package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.ql;

/* JADX INFO: loaded from: classes.dex */
public final class H5AdsWebViewClient extends gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql f1937a;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.f1937a = new ql(context, webView);
    }

    @Override // com.google.android.gms.internal.ads.gl
    public final WebViewClient a() {
        return this.f1937a;
    }

    public void clearAdObjects() {
        this.f1937a.f8212b.clearAdObjects();
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.f1937a.f8211a;
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        ql qlVar = this.f1937a;
        qlVar.getClass();
        en1.F0("Delegate cannot be itself.", webViewClient != qlVar);
        qlVar.f8211a = webViewClient;
    }
}

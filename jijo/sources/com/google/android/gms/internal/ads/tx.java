package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;

/* JADX INFO: loaded from: classes.dex */
public final class tx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ux f9299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sx f9300b;

    public tx(ux uxVar, sx sxVar) {
        this.f9300b = sxVar;
        this.f9299a = uxVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.ux] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        ?? r02 = this.f9299a;
        y9 y9VarW = r02.w();
        if (y9VarW == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        v9 v9Var = y9VarW.f10801b;
        if (v9Var == null) {
            zze.zza("Signals object is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (r02.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return v9Var.zzf(r02.getContext(), str, (View) r02, r02.zzi());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.ux] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r02 = this.f9299a;
        y9 y9VarW = r02.w();
        if (y9VarW == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        v9 v9Var = y9VarW.f10801b;
        if (v9Var == null) {
            zze.zza("Signals object is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (r02.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return v9Var.zzh(r02.getContext(), (View) r02, r02.zzi());
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzm.zzj("URL is empty, ignoring message");
        } else {
            zzt.zza.post(new vm(this, 18, str));
        }
    }
}

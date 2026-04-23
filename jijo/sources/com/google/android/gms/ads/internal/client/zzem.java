package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f2037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2038c;

    public zzem(String str, Bundle bundle, String str2) {
        this.f2036a = str;
        this.f2037b = bundle;
        this.f2038c = str2;
    }

    public final Bundle zza() {
        return this.f2037b;
    }

    public final String zzb() {
        return this.f2036a;
    }

    public final String zzc() {
        String str = this.f2038c;
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            } catch (JSONException unused) {
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }
}

package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdError f1864d;

    public AdError(int i10, String str, String str2, AdError adError) {
        this.f1861a = i10;
        this.f1862b = str;
        this.f1863c = str2;
        this.f1864d = adError;
    }

    public AdError getCause() {
        return this.f1864d;
    }

    public int getCode() {
        return this.f1861a;
    }

    public String getDomain() {
        return this.f1863c;
    }

    public String getMessage() {
        return this.f1862b;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        AdError adError = this.f1864d;
        if (adError == null) {
            zzeVar = null;
        } else {
            String str = adError.f1863c;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.f1861a, adError.f1862b, str, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.f1861a, this.f1862b, this.f1863c, zzeVar, null);
    }

    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f1861a);
        jSONObject.put("Message", this.f1862b);
        jSONObject.put("Domain", this.f1863c);
        AdError adError = this.f1864d;
        if (adError == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", adError.zzb());
        }
        return jSONObject;
    }

    public AdError(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }
}

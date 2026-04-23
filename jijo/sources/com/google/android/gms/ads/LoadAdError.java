package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class LoadAdError extends AdError {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ResponseInfo f1887e;

    public LoadAdError(int i10, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i10, str, str2, adError);
        this.f1887e = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return this.f1887e;
    }

    @Override // com.google.android.gms.ads.AdError
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObjectZzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            jSONObjectZzb.put("Response Info", "null");
        } else {
            jSONObjectZzb.put("Response Info", responseInfo.zzd());
        }
        return jSONObjectZzb;
    }
}

package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AdapterResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzu f1884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdError f1885b;

    public AdapterResponseInfo(zzu zzuVar) {
        this.f1884a = zzuVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
        this.f1885b = zzeVar == null ? null : zzeVar.zza();
    }

    public static AdapterResponseInfo zza(zzu zzuVar) {
        if (zzuVar != null) {
            return new AdapterResponseInfo(zzuVar);
        }
        return null;
    }

    public AdError getAdError() {
        return this.f1885b;
    }

    public String getAdSourceId() {
        return this.f1884a.zzf;
    }

    public String getAdSourceInstanceId() {
        return this.f1884a.zzh;
    }

    public String getAdSourceInstanceName() {
        return this.f1884a.zzg;
    }

    public String getAdSourceName() {
        return this.f1884a.zze;
    }

    public String getAdapterClassName() {
        return this.f1884a.zza;
    }

    public Bundle getCredentials() {
        return this.f1884a.zzd;
    }

    public long getLatencyMillis() {
        return this.f1884a.zzb;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zzu zzuVar = this.f1884a;
        jSONObject.put("Adapter", zzuVar.zza);
        jSONObject.put("Latency", zzuVar.zzb);
        String adSourceName = getAdSourceName();
        if (adSourceName == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", adSourceName);
        }
        String adSourceId = getAdSourceId();
        if (adSourceId == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", adSourceId);
        }
        String adSourceInstanceName = getAdSourceInstanceName();
        if (adSourceInstanceName == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", adSourceInstanceName);
        }
        String adSourceInstanceId = getAdSourceInstanceId();
        if (adSourceInstanceId == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", adSourceInstanceId);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : zzuVar.zzd.keySet()) {
            jSONObject2.put(str, zzuVar.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.f1885b;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.zzb());
        }
        return jSONObject;
    }
}

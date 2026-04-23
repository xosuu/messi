package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzdn f1901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1902b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdapterResponseInfo f1903c;

    public ResponseInfo(zzdn zzdnVar) {
        this.f1901a = zzdnVar;
        if (zzdnVar != null) {
            try {
                List listZzj = zzdnVar.zzj();
                if (listZzj != null) {
                    Iterator it = listZzj.iterator();
                    while (it.hasNext()) {
                        AdapterResponseInfo adapterResponseInfoZza = AdapterResponseInfo.zza((zzu) it.next());
                        if (adapterResponseInfoZza != null) {
                            this.f1902b.add(adapterResponseInfoZza);
                        }
                    }
                }
            } catch (RemoteException e10) {
                zzm.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e10);
            }
        }
        zzdn zzdnVar2 = this.f1901a;
        if (zzdnVar2 == null) {
            return;
        }
        try {
            zzu zzuVarZzf = zzdnVar2.zzf();
            if (zzuVarZzf != null) {
                this.f1903c = AdapterResponseInfo.zza(zzuVarZzf);
            }
        } catch (RemoteException e11) {
            zzm.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e11);
        }
    }

    public static ResponseInfo zza(zzdn zzdnVar) {
        if (zzdnVar != null) {
            return new ResponseInfo(zzdnVar);
        }
        return null;
    }

    public static ResponseInfo zzb(zzdn zzdnVar) {
        return new ResponseInfo(zzdnVar);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.f1902b;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.f1903c;
    }

    public String getMediationAdapterClassName() {
        try {
            zzdn zzdnVar = this.f1901a;
            if (zzdnVar != null) {
                return zzdnVar.zzg();
            }
            return null;
        } catch (RemoteException e10) {
            zzm.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e10);
            return null;
        }
    }

    public Bundle getResponseExtras() {
        try {
            zzdn zzdnVar = this.f1901a;
            if (zzdnVar != null) {
                return zzdnVar.zze();
            }
        } catch (RemoteException e10) {
            zzm.zzh("Could not forward getResponseExtras to ResponseInfo.", e10);
        }
        return new Bundle();
    }

    public String getResponseId() {
        try {
            zzdn zzdnVar = this.f1901a;
            if (zzdnVar != null) {
                return zzdnVar.zzi();
            }
            return null;
        } catch (RemoteException e10) {
            zzm.zzh("Could not forward getResponseId to ResponseInfo.", e10);
            return null;
        }
    }

    public String toString() {
        try {
            return zzd().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final zzdn zzc() {
        return this.f1901a;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f1902b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((AdapterResponseInfo) it.next()).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.f1903c;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzay.zzb().zzi(responseExtras));
        }
        return jSONObject;
    }
}

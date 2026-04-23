package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f8852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zze f8853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s9 f8854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qg f8855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p.g f8856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8858g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JSONArray f8860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f8861j;

    public sg(ScheduledExecutorService scheduledExecutorService, zze zzeVar) {
        this.f8852a = scheduledExecutorService;
        this.f8853b = zzeVar;
    }

    public final JSONObject a(String str, String str2) throws JSONException {
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        if (((Boolean) qh.f8178a.k()).booleanValue()) {
            jLongValue = ((Long) zzba.zzc().a(eg.X8)).longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject.put("sdk_ttl_ms", jLongValue);
        e(jSONObject);
        return jSONObject;
    }

    public final JSONObject b(String str, String str2) throws JSONException {
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) qh.f8178a.k()).booleanValue()) {
            jLongValue = ((Long) zzba.zzc().a(eg.X8)).longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject.put("sdk_ttl_ms", jLongValue);
        e(jSONObject);
        return jSONObject;
    }

    public final void c(String str) {
        try {
            p.g gVar = this.f8856e;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f8859h).toString());
            e(jSONObject);
            gVar.a(jSONObject.toString());
            rg rgVar = new rg(this, str);
            if (((Boolean) qh.f8178a.k()).booleanValue()) {
                this.f8853b.zzg(this.f8856e, rgVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.f8861j, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), rgVar);
        } catch (JSONException e10) {
            zzm.zzh("Error creating JSON: ", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.eg.T8)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sg.d():void");
    }

    public final void e(JSONObject jSONObject) {
        try {
            if (this.f8860i == null) {
                this.f8860i = new JSONArray((String) zzba.zzc().a(eg.W8));
            }
            jSONObject.put("eids", this.f8860i);
        } catch (JSONException e10) {
            zzm.zzh("Error fetching the PACT active eids JSON: ", e10);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fe0 implements n40, u50, h50 {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le0 f4492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4493b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4494d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h40 f4497q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zze f4498s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JSONObject f4502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public JSONObject f4503x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4504y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4505z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f4499t = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f4500u = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f4501v = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4495f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ee0 f4496h = ee0.f3913a;

    public fe0(le0 le0Var, or0 or0Var, String str) {
        this.f4492a = le0Var;
        this.f4494d = str;
        this.f4493b = or0Var.f7646f;
    }

    public static JSONObject c(zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : c(zzeVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void J(zzbvb zzbvbVar) {
        if (((Boolean) zzba.zzc().a(eg.y8)).booleanValue()) {
            return;
        }
        le0 le0Var = this.f4492a;
        if (le0Var.f()) {
            le0Var.b(this.f4493b, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.h50
    public final void U(r20 r20Var) {
        le0 le0Var = this.f4492a;
        if (le0Var.f()) {
            this.f4497q = r20Var.f8362f;
            this.f4496h = ee0.f3914b;
            if (((Boolean) zzba.zzc().a(eg.y8)).booleanValue()) {
                le0Var.b(this.f4493b, this);
            }
        }
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectD;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f4496h);
        jSONObject.put("format", fr0.a(this.f4495f));
        if (((Boolean) zzba.zzc().a(eg.y8)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f4504y);
            if (this.f4504y) {
                jSONObject.put("shown", this.f4505z);
            }
        }
        h40 h40Var = this.f4497q;
        if (h40Var != null) {
            jSONObjectD = d(h40Var);
        } else {
            zze zzeVar = this.f4498s;
            JSONObject jSONObjectD2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                h40 h40Var2 = (h40) iBinder;
                jSONObjectD2 = d(h40Var2);
                if (h40Var2.f5209h.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.f4498s));
                    jSONObjectD2.put("errors", jSONArray);
                }
            }
            jSONObjectD = jSONObjectD2;
        }
        jSONObject.put("responseInfo", jSONObjectD);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void b(kr0 kr0Var) {
        if (this.f4492a.f()) {
            if (!((List) kr0Var.f6383b.f10630b).isEmpty()) {
                this.f4495f = ((fr0) ((List) kr0Var.f6383b.f10630b).get(0)).f4602b;
            }
            if (!TextUtils.isEmpty(((hr0) kr0Var.f6383b.f10631d).f5381l)) {
                this.f4499t = ((hr0) kr0Var.f6383b.f10631d).f5381l;
            }
            if (!TextUtils.isEmpty(((hr0) kr0Var.f6383b.f10631d).f5382m)) {
                this.f4500u = ((hr0) kr0Var.f6383b.f10631d).f5382m;
            }
            if (((hr0) kr0Var.f6383b.f10631d).f5385p.length() > 0) {
                this.f4503x = ((hr0) kr0Var.f6383b.f10631d).f5385p;
            }
            if (((Boolean) zzba.zzc().a(eg.f4151u8)).booleanValue()) {
                if (this.f4492a.f6600w >= ((Long) zzba.zzc().a(eg.f4160v8)).longValue()) {
                    this.A = true;
                    return;
                }
                if (!TextUtils.isEmpty(((hr0) kr0Var.f6383b.f10631d).f5383n)) {
                    this.f4501v = ((hr0) kr0Var.f6383b.f10631d).f5383n;
                }
                if (((hr0) kr0Var.f6383b.f10631d).f5384o.length() > 0) {
                    this.f4502w = ((hr0) kr0Var.f6383b.f10631d).f5384o;
                }
                le0 le0Var = this.f4492a;
                JSONObject jSONObject = this.f4502w;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f4501v)) {
                    length += this.f4501v.length();
                }
                long j10 = length;
                synchronized (le0Var) {
                    le0Var.f6600w += j10;
                }
            }
        }
    }

    public final JSONObject d(h40 h40Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", h40Var.f5205a);
        jSONObject.put("responseSecsSinceEpoch", h40Var.f5210q);
        jSONObject.put("responseId", h40Var.f5206b);
        if (((Boolean) zzba.zzc().a(eg.f4122r8)).booleanValue()) {
            String str = h40Var.f5211s;
            if (!TextUtils.isEmpty(str)) {
                zzm.zze("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f4499t)) {
            jSONObject.put("adRequestUrl", this.f4499t);
        }
        if (!TextUtils.isEmpty(this.f4500u)) {
            jSONObject.put("postBody", this.f4500u);
        }
        if (!TextUtils.isEmpty(this.f4501v)) {
            jSONObject.put("adResponseBody", this.f4501v);
        }
        Object obj = this.f4502w;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f4503x;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) zzba.zzc().a(eg.f4151u8)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.A);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzuVar : h40Var.f5209h) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) zzba.zzc().a(eg.f4132s8)).booleanValue()) {
                jSONObject2.put("credentials", zzay.zzb().zzi(zzuVar.zzd));
            }
            zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : c(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final void t(zze zzeVar) {
        le0 le0Var = this.f4492a;
        if (le0Var.f()) {
            this.f4496h = ee0.f3915d;
            this.f4498s = zzeVar;
            if (((Boolean) zzba.zzc().a(eg.y8)).booleanValue()) {
                le0Var.b(this.f4493b, this);
            }
        }
    }
}

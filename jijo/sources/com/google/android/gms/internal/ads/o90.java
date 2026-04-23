package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbs;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o90 extends p90 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f7538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f7544h;

    public o90(fr0 fr0Var, JSONObject jSONObject) {
        super(fr0Var);
        this.f7538b = zzbs.zzh(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f7539c = zzbs.zzl(false, jSONObject, "allow_pub_owned_ad_view");
        this.f7540d = zzbs.zzl(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f7541e = zzbs.zzl(false, jSONObject, "enable_omid");
        this.f7543g = zzbs.zzb(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, jSONObject, "watermark_overlay_png_base64");
        this.f7542f = jSONObject.optJSONObject("overlay") != null;
        this.f7544h = ((Boolean) zzba.zzc().a(eg.F4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final aa a() {
        JSONObject jSONObject = this.f7544h;
        return jSONObject != null ? new aa(26, jSONObject) : this.f7838a.V;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final String b() {
        return this.f7543g;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final boolean c() {
        return this.f7541e;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final boolean d() {
        return this.f7539c;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final boolean e() {
        return this.f7540d;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final boolean f() {
        return this.f7542f;
    }
}

package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbs;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ir0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f5681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f5682d;

    public ir0(JsonReader jsonReader) {
        JSONObject jSONObjectZzi = zzbs.zzi(jsonReader);
        this.f5682d = jSONObjectZzi;
        this.f5679a = jSONObjectZzi.optString("ad_html", null);
        this.f5680b = jSONObjectZzi.optString("ad_base_url", null);
        this.f5681c = jSONObjectZzi.optJSONObject("ad_json");
    }
}

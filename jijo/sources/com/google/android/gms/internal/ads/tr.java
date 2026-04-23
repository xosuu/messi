package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f9266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f9268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f9269k;

    public tr(JSONObject jSONObject) {
        this.f9264f = jSONObject.optString("url");
        this.f9260b = jSONObject.optString("base_uri");
        this.f9261c = jSONObject.optString("post_parameters");
        String strOptString = jSONObject.optString("drt_include");
        this.f9262d = strOptString != null && (strOptString.equals("1") || strOptString.equals("true"));
        String strOptString2 = jSONObject.optString("cookies_include", "true");
        this.f9263e = strOptString2 != null && (strOptString2.equals("1") || strOptString2.equals("true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString3 = jSONObject.optString("errors");
        this.f9259a = strOptString3 == null ? null : Arrays.asList(strOptString3.split(","));
        this.f9265g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f9266h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f9267i = jSONObject.optString("pool_key");
        String strOptString4 = jSONObject.optString("start_time");
        Long lValueOf = -1L;
        if (!TextUtils.isEmpty(strOptString4)) {
            try {
                lValueOf = Long.valueOf(strOptString4);
            } catch (NumberFormatException unused) {
            }
        }
        this.f9268j = lValueOf.longValue();
        String strOptString5 = jSONObject.optString("end_time");
        Long lValueOf2 = -1L;
        if (!TextUtils.isEmpty(strOptString5)) {
            try {
                lValueOf2 = Long.valueOf(strOptString5);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f9269k = lValueOf2.longValue();
    }
}

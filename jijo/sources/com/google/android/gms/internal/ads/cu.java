package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONObject f3446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3447h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3449j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3440a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3441b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3442c = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f3448i = new ArrayList();

    public cu(long j10, String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f3443d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f3447h = false;
        this.f3449j = false;
        this.f3444e = str;
        this.f3445f = j10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f3446g = new JSONObject(str);
            if (((Boolean) zzba.zzc().a(eg.Ma)).booleanValue() && a()) {
                return;
            }
            if (this.f3446g.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                this.f3447h = false;
                zzm.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.f3447h = true;
            this.f3443d = this.f3446g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.f3446g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f3441b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f3442c.put(strOptString2, new nn(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f3446g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray3.length(); i11++) {
                    this.f3440a.add(jSONArrayOptJSONArray3.optString(i11));
                }
            }
            if (((Boolean) zzba.zzc().a(eg.f4040j6)).booleanValue() && (jSONObjectOptJSONObject2 = this.f3446g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                    this.f3448i.add(jSONArrayOptJSONArray.get(i12).toString());
                }
            }
            if (!((Boolean) zzba.zzc().a(eg.E5)).booleanValue() || (jSONObjectOptJSONObject = this.f3446g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f3449j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e10) {
            zzm.zzk("Exception occurred while processing app setting json", e10);
            zzu.zzo().i("AppSettings.parseAppSettingsJson", e10);
        }
    }

    public final boolean a() {
        if (!TextUtils.isEmpty(this.f3444e) && this.f3446g != null) {
            xf xfVar = eg.Pa;
            long jLongValue = ((Long) zzba.zzc().a(xfVar)).longValue();
            if (((Boolean) zzba.zzc().a(eg.Oa)).booleanValue() && !TextUtils.isEmpty(this.f3444e)) {
                jLongValue = this.f3446g.optLong("cache_ttl_sec", ((Long) zzba.zzc().a(xfVar)).longValue());
            }
            ((y3.b) zzu.zzB()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jLongValue >= 0) {
                long j10 = this.f3445f;
                if (j10 > jCurrentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j10) > jLongValue) {
                    this.f3440a.clear();
                    this.f3441b.clear();
                    this.f3442c.clear();
                    this.f3443d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    this.f3444e = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    this.f3446g = null;
                    this.f3447h = false;
                    this.f3448i.clear();
                    this.f3449j = false;
                    return true;
                }
            }
        }
        return false;
    }
}

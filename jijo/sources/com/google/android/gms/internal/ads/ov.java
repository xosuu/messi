package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f7679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f7683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f7684n;

    public ov(String str) {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f7671a = a(jSONObject, "aggressive_media_codec_release", eg.C);
        this.f7672b = b(jSONObject, "byte_buffer_precache_limit", eg.f4022i);
        this.f7673c = b(jSONObject, "exo_cache_buffer_size", eg.f4103q);
        this.f7674d = b(jSONObject, "exo_connect_timeout_millis", eg.f3978e);
        xf xfVar = eg.f3967d;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f7675e = b(jSONObject, "exo_read_timeout_millis", eg.f3989f);
        this.f7676f = b(jSONObject, "load_check_interval_bytes", eg.f4000g);
        this.f7677g = b(jSONObject, "player_precache_limit", eg.f4011h);
        this.f7678h = b(jSONObject, "socket_receive_buffer_size", eg.f4033j);
        this.f7679i = a(jSONObject, "use_cache_data_source", eg.P3);
        b(jSONObject, "min_retry_count", eg.f4044k);
        this.f7680j = a(jSONObject, "treat_load_exception_as_non_fatal", eg.f4064m);
        this.f7681k = a(jSONObject, "enable_multiple_video_playback", eg.H1);
        this.f7682l = a(jSONObject, "use_range_http_data_source", eg.J1);
        xf xfVar2 = eg.K1;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
                jLongValue = ((Long) zzba.zzc().a(xfVar2)).longValue();
            }
        } else {
            jLongValue = ((Long) zzba.zzc().a(xfVar2)).longValue();
        }
        this.f7683m = jLongValue;
        xf xfVar3 = eg.L1;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
                jLongValue2 = ((Long) zzba.zzc().a(xfVar3)).longValue();
            }
        } else {
            jLongValue2 = ((Long) zzba.zzc().a(xfVar3)).longValue();
        }
        this.f7684n = jLongValue2;
    }

    public static final boolean a(JSONObject jSONObject, String str, xf xfVar) {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(xfVar)).booleanValue();
        if (jSONObject == null) {
            return zBooleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return zBooleanValue;
        }
    }

    public static final int b(JSONObject jSONObject, String str, xf xfVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzba.zzc().a(xfVar)).intValue();
    }
}

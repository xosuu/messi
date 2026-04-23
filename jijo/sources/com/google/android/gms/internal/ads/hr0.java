package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbs;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ou f5379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f5380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f5382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f5383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final JSONObject f5384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JSONObject f5385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f5386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5387r;

    public hr0(JsonReader jsonReader) throws IOException {
        String str;
        List listEmptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        int iNextInt = 0;
        String strNextString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        ou ouVar = null;
        int iNextInt2 = 0;
        int iNextInt3 = -1;
        boolean zNextBoolean = false;
        long jNextLong = 0;
        int iMax = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listEmptyList = zzbs.zzd(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                str = str2;
                if (((Boolean) zzba.zzc().a(eg.f4168w7)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    ou ouVar2 = new ou();
                    jsonReader.beginObject();
                    String strNextString8 = str;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("code")) {
                            jsonReader.nextInt();
                        } else if (strNextName2.equals("description")) {
                            strNextString8 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    ouVar2.f7670a = strNextString8;
                    ouVar = ouVar2;
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString3 = jsonReader.nextString();
                } else {
                    if (((Boolean) zzba.zzc().a(eg.z9)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString7 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) zzba.zzc().a(eg.f3996f6)).booleanValue()) {
                            try {
                                Bundle bundleZza = zzbs.zza(zzbs.zzi(jsonReader));
                                if (bundleZza != null) {
                                    bundle = bundleZza;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((Boolean) zzba.zzc().a(eg.f4141t8)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(strNextName)) {
                        if (((Boolean) zzba.zzc().a(eg.f4141t8)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        xf xfVar = eg.f4151u8;
                        if (((Boolean) zzba.zzc().a(xfVar)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                            strNextString6 = jsonReader.nextString();
                        } else if (((Boolean) zzba.zzc().a(xfVar)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = zzbs.zzi(jsonReader);
                        } else if (Objects.equals(strNextName, "max_parallel_renderers")) {
                            iMax = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) zzba.zzc().a(eg.B8)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = zzbs.zzi(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                }
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        jsonReader.endObject();
        this.f5370a = listEmptyList;
        this.f5372c = iNextInt;
        if (((Boolean) rh.f8597d.k()).booleanValue()) {
            this.f5373d = -1;
        } else {
            xg xgVar = ah.f2681a;
            if (((Long) xgVar.k()).longValue() > -1) {
                this.f5373d = ((Long) xgVar.k()).intValue();
            } else {
                this.f5373d = iNextInt3;
            }
        }
        this.f5371b = strNextString;
        this.f5374e = strNextString2;
        this.f5375f = iNextInt2;
        this.f5376g = jNextLong;
        this.f5379j = ouVar;
        this.f5377h = zNextBoolean;
        this.f5378i = strNextString3;
        this.f5380k = bundle;
        this.f5381l = strNextString4;
        this.f5382m = strNextString5;
        this.f5383n = strNextString6;
        this.f5384o = jSONObject;
        this.f5385p = jSONObject2;
        this.f5386q = strNextString7;
        xg xgVar2 = ph.f7878a;
        this.f5387r = ((Long) xgVar2.k()).longValue() > 0 ? ((Long) xgVar2.k()).intValue() : iMax;
    }
}

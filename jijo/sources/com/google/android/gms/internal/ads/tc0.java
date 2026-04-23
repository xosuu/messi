package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9110a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f9111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f9112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JSONObject f9114e;

    public tc0(mu muVar) {
        this.f9112c = muVar;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f9113d = true;
            cu cuVarZzh = zzu.zzo().d().zzh();
            if (cuVarZzh != null && (jSONObject = cuVarZzh.f3446g) != null) {
                this.f9111b = ((Boolean) zzba.zzc().a(eg.F3)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f9114e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.f9110a.containsKey(strOptString2)) {
                                    map = (Map) this.f9110a.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f9110a.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

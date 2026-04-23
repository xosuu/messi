package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11257a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11258b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f11259c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f11260d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f11261e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f11262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONObject f11263g;

    public zk0(mu muVar) {
        this.f11262f = muVar;
    }

    public static final Bundle k(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            }
        }
        return bundle;
    }

    public final synchronized HashMap a(String str, String str2) {
        HashMap map;
        try {
            b01 b01VarB = b(str, str2);
            b01 b01VarE = e(str2);
            map = new HashMap();
            for (Map.Entry entry : (yz0) b01VarB.entrySet()) {
                String str3 = (String) entry.getKey();
                if (b01VarE.containsKey(str3)) {
                    cl0 cl0Var = (cl0) b01VarE.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new cl0(str3, cl0Var.f3332b, cl0Var.f3333c, cl0Var.f3334d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            m01 m01VarF = b01VarE.entrySet().f();
            while (m01VarF.hasNext()) {
                Map.Entry entry2 = (Map.Entry) m01VarF.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((cl0) entry2.getValue()).f3334d) {
                    map.put(str4, (cl0) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized b01 b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(zzu.zzo().d().zzh().f3444e) && (map = (Map) this.f11259c.get(str)) != null) {
                List<al0> list = (List) map.get(str2);
                if (list == null) {
                    String strU = en1.U(this.f11263g, str2, str);
                    if (((Boolean) zzba.zzc().a(eg.W9)).booleanValue()) {
                        strU = strU.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strU);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (al0 al0Var : list) {
                        String str3 = al0Var.f2724a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(al0Var.f2725b);
                    }
                    return dz0.a(map2);
                }
            }
            return b01.f2859s;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized b01 c() {
        if (TextUtils.isEmpty(zzu.zzo().d().zzh().f3444e)) {
            return b01.f2859s;
        }
        return dz0.a(this.f11258b);
    }

    public final synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !this.f11257a.containsKey(str)) {
            this.f11257a.put(str, new al0(str, new Bundle()));
        }
    }

    public final synchronized b01 e(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(zzu.zzo().d().zzh().f3444e)) {
                boolean zMatches = Pattern.matches((String) zzba.zzc().a(eg.P2), str);
                boolean zMatches2 = Pattern.matches((String) zzba.zzc().a(eg.Q2), str);
                if (zMatches) {
                    map = new HashMap(this.f11261e);
                } else if (zMatches2) {
                    map = new HashMap(this.f11260d);
                }
                return dz0.a(map);
            }
            return b01.f2859s;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList f(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleK = k(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        String str = (String) arrayList2.get(i11);
                        d(str);
                        if (((al0) this.f11257a.get(str)) != null) {
                            arrayList.add(new al0(str, bundleK));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized void g() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) rh.f8595b.k()).booleanValue()) {
                if (((Boolean) zzba.zzc().a(eg.C1)).booleanValue() && (jSONObject = zzu.zzo().d().zzh().f3446g) != null) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                            String strOptString = jSONObject2.optString("adapter_class_name");
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(strOptString)) {
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i11);
                                    boolean zOptBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                    boolean zOptBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                    boolean zOptBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                    String strOptString2 = jSONObject3.optString("platform");
                                    cl0 cl0Var = new cl0(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                    if (strOptString2.equals("ADMOB")) {
                                        this.f11260d.put(strOptString, cl0Var);
                                    } else if (strOptString2.equals("AD_MANAGER")) {
                                        this.f11261e.put(strOptString, cl0Var);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        zze.zzb("Malformed config loading JSON.", e10);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.f11259c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.f11259c.put(str, map);
            List arrayList2 = (List) map.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.addAll(arrayList);
            map.put(str2, arrayList2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = zzu.zzo().d().zzh().f3446g;
            if (jSONObject != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f11263g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i10);
                            String lowerCase = ((Boolean) zzba.zzc().a(eg.W9)).booleanValue() ? jSONObject2.optString("ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            String strOptString = jSONObject2.optString("format", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                    arrayList.addAll(f(jSONArrayOptJSONArray.getJSONObject(i11)));
                                }
                            }
                            h(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e10) {
                    zze.zzb("Malformed config loading JSON.", e10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        JSONObject jSONObject;
        if (!((Boolean) rh.f8599f.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.B1)).booleanValue() && (jSONObject = zzu.zzo().d().zzh().f3446g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        Bundle bundleK = k(jSONObject2.optJSONObject("data"));
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject2.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f11258b.put(strOptString, new cl0(strOptString, zOptBoolean2, zOptBoolean, true, bundleK));
                        }
                    }
                } catch (JSONException e10) {
                    zze.zzb("Malformed config loading JSON.", e10);
                }
            }
        }
    }
}

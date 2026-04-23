package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.ex0;
import com.google.android.gms.internal.ads.jw0;
import com.google.android.gms.internal.ads.ks0;
import com.google.android.gms.internal.ads.kw0;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzad {
    public static Bundle zza(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }

    public static Bundle zzb(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzf("JSON parsing error", e10);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i11 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i11 != 0) {
                List listP = ks0.o(new ex0('/')).p(strOptString2);
                if (listP.size() > 2 || listP.isEmpty()) {
                    obj = null;
                } else {
                    if (listP.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listP.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listP.get(0), 0);
                        str2 = (String) listP.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i12 = i11 - 1;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static void zzc(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.B5)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            jw0 jw0VarF = jw0.f(context);
            kw0 kw0VarG = kw0.g(context);
            jw0VarF.g();
            synchronized (jw0.class) {
                jw0VarF.d(true);
            }
            kw0VarG.h();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.J2)).booleanValue()) {
                kw0VarG.f5103f.b("paidv2_publisher_option");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.K2)).booleanValue()) {
                kw0VarG.f5103f.b("paidv2_user_option");
            }
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzu.zzo().i("clearStorageOnIdlessMode", e10);
        }
    }
}

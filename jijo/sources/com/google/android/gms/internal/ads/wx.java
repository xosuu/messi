package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class wx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f10368a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f10369b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(fr0 fr0Var) {
        if (((Boolean) zzba.zzc().a(eg.C4)).booleanValue() && fr0Var.T) {
            aa aaVar = fr0Var.V;
            aaVar.getClass();
            if (((JSONObject) aaVar.f2626b).optBoolean((String) zzba.zzc().a(eg.D4), true) && fr0Var.f4602b != 4) {
                int i10 = aaVar.q() == 1 ? 3 : 1;
                String str = fr0Var.f4623l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", g1.a.e(i10));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e10) {
                    zzm.zzk("Unable to build OMID ENV JSON", e10);
                }
            }
        }
        return null;
    }

    public static String b(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f10368a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!f10369b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}

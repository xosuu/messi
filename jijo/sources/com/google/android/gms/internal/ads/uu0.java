package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class uu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WindowManager f9616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f9617b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static float f9618c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / f9618c);
            jSONObject.put("y", i11 / f9618c);
            jSONObject.put("width", i12 / f9618c);
            jSONObject.put("height", i13 / f9618c);
        } catch (JSONException unused) {
            tp1.E();
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }

    public static void c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException unused) {
            tp1.E();
        }
    }

    public static void d(JSONObject jSONObject) {
        float f10;
        float f11;
        if (f9616a != null) {
            Point point = new Point(0, 0);
            f9616a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f9618c;
            f10 = f12 / f13;
            f11 = point.y / f13;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uu0.e(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}

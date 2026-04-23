package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.zzu;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w00 implements dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ub f10018b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PowerManager f10019d;

    public w00(Context context, ub ubVar) {
        this.f10017a = context;
        this.f10018b = ubVar;
        this.f10019d = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.dn
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject a(x00 x00Var) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        vb vbVar = x00Var.f10396e;
        if (vbVar == null) {
            jSONObject = new JSONObject();
        } else {
            ub ubVar = this.f10018b;
            if (ubVar.f9445b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", ubVar.f9447d).put("activeViewJSON", ubVar.f9445b).put("timestamp", x00Var.f10394c).put("adFormat", ubVar.f9444a).put("hashCode", ubVar.f9446c).put("isMraid", false).put("isStopped", false).put("isPaused", x00Var.f10393b).put("isNative", ubVar.f9448e).put("isScreenOn", this.f10019d.isInteractive()).put("appMuted", zzu.zzr().zze()).put("appVolume", zzu.zzr().zza());
            Context context = this.f10017a;
            jSONObjectPut.put("deviceVolume", zzac.zzb(context.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", vbVar.f9819b).put("isAttachedToWindow", vbVar.f9818a);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect2 = vbVar.f9820c;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect3 = vbVar.f9821d;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect4 = vbVar.f9822e;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("globalVisibleBoxVisible", vbVar.f9823f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect5 = vbVar.f9824g;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("localVisibleBoxVisible", vbVar.f9825h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect6 = vbVar.f9826i;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", x00Var.f10392a);
            if (((Boolean) zzba.zzc().a(eg.f4002g1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = vbVar.f9828k;
                if (list != null) {
                    for (Rect rect7 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect7.top).put("bottom", rect7.bottom).put("left", rect7.left).put("right", rect7.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(x00Var.f10395d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}

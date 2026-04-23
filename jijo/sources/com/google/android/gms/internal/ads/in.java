package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzu;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class in implements gx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5648c;

    public /* synthetic */ in(Object obj, int i10, Object obj2) {
        this.f5646a = i10;
        this.f5647b = obj;
        this.f5648c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.gx0
    public final Object apply(Object obj) {
        int i10 = this.f5646a;
        Object obj2 = this.f5648c;
        Object obj3 = this.f5647b;
        switch (i10) {
            case 0:
                zm zmVar = (zm) obj;
                zmVar.z((String) obj3, (wk) obj2);
                return zmVar;
            case 1:
                xa0 xa0Var = (xa0) obj3;
                JSONObject jSONObject = (JSONObject) obj2;
                List list = (List) obj;
                xa0Var.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String strOptString = jSONObject.optString("text");
                Integer numD = xa0.d(jSONObject, "bg_color");
                Integer numD2 = xa0.d(jSONObject, "text_color");
                int iOptInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
                return new ci(strOptString, list, numD, numD2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, xa0Var.f10508h.f11480h);
            default:
                l2.l lVar = (l2.l) obj3;
                zzbvb zzbvbVar = (zzbvb) obj2;
                ug0 ug0Var = (ug0) obj;
                lVar.getClass();
                ug0Var.f9474c.put("Content-Type", ug0Var.f9476e);
                String strZzc = zzu.zzp().zzc((Context) lVar.f15168t, zzbvbVar.f11575b.afmaVersion);
                Map map = ug0Var.f9474c;
                map.put("User-Agent", strZzc);
                Bundle bundle = new Bundle();
                for (Map.Entry entry : map.entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
                return new zzbug(ug0Var.f9472a, ug0Var.f9473b, bundle, ug0Var.f9475d, ug0Var.f9477f, zzbvbVar.f11577f, zzbvbVar.f11581t);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.zzu;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ot implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7669c;

    public /* synthetic */ ot(Object obj, String str, int i10) {
        this.f7667a = i10;
        this.f7669c = obj;
        this.f7668b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f7667a) {
            case 0:
                synchronized (((pt) this.f7669c)) {
                    try {
                        for (nt ntVar : ((pt) this.f7669c).f7965b) {
                            String str2 = (String) this.f7668b;
                            pt ptVar = ntVar.f7381a;
                            Map map = ntVar.f7382b;
                            ptVar.getClass();
                            if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                                p80 p80Var = ptVar.f7967d;
                                ((y3.b) ((y3.a) p80Var.f7834b)).getClass();
                                ((gt) p80Var.f7835d).a(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 1:
                id0 id0Var = (id0) this.f7669c;
                id0Var.f5577j.set(zzad.zzb(id0Var.f5569b, (String) this.f7668b));
                return;
            default:
                if (str != null && ((List) this.f7669c).contains(str)) {
                    try {
                        Object obj = sharedPreferences.getAll().get(str);
                        Object obj2 = this.f7668b;
                        if (obj == null) {
                            ((JSONObject) obj2).remove(str);
                        } else {
                            ((JSONObject) obj2).put(str, obj);
                        }
                        return;
                    } catch (JSONException e10) {
                        zzu.zzo().h("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e10);
                        return;
                    }
                }
                return;
        }
    }

    public ot() {
        this.f7667a = 2;
        this.f7668b = new JSONObject();
    }
}

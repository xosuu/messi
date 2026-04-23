package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class wu0 implements ou0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wu0 f10344g = new wu0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f10345h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Handler f10346i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k9 f10347j = new k9(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k9 f10348k = new k9(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10354f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10349a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10350b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bj0 f10352d = new bj0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cj0 f10351c = new cj0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ok0 f10353e = new ok0(new xq(22));

    public static void b() {
        if (f10346i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10346i = handler;
            handler.post(f10347j);
            f10346i.postDelayed(f10348k, 200L);
        }
    }

    public final void a(View view, pu0 pu0Var, JSONObject jSONObject, boolean z9) {
        Object obj;
        boolean z10;
        if (tp1.B(view) == null) {
            bj0 bj0Var = this.f10352d;
            int i10 = ((HashSet) bj0Var.f3031h).contains(view) ? 1 : bj0Var.f3027a ? 2 : 3;
            if (i10 == 3) {
                return;
            }
            JSONObject jSONObjectZza = pu0Var.zza(view);
            uu0.b(jSONObject, jSONObjectZza);
            HashMap map = (HashMap) bj0Var.f3028b;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z11 = false;
            if (obj != null) {
                try {
                    jSONObjectZza.put("adSessionId", obj);
                } catch (JSONException unused) {
                    tp1.E();
                }
                Map map2 = (Map) bj0Var.f3035u;
                if (map2.containsKey(view)) {
                    map2.put(view, Boolean.TRUE);
                } else {
                    z11 = true;
                }
                try {
                    jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(z11));
                } catch (JSONException unused2) {
                    tp1.E();
                }
                bj0Var.f3027a = true;
                return;
            }
            HashMap map3 = (HashMap) bj0Var.f3029d;
            vu0 vu0Var = (vu0) map3.get(view);
            if (vu0Var != null) {
                map3.remove(view);
            }
            if (vu0Var != null) {
                ku0 ku0Var = vu0Var.f9974a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = vu0Var.f9975b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    jSONArray.put((String) arrayList.get(i11));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", ku0Var.f6390b);
                    jSONObjectZza.put("friendlyObstructionPurpose", ku0Var.f6391c);
                    jSONObjectZza.put("friendlyObstructionReason", ku0Var.f6392d);
                } catch (JSONException unused3) {
                    tp1.E();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            c(view, pu0Var, jSONObjectZza, i10, z9 || z10);
        }
    }

    public final void c(View view, pu0 pu0Var, JSONObject jSONObject, int i10, boolean z9) {
        pu0Var.l(view, jSONObject, this, i10 == 1, z9);
    }
}

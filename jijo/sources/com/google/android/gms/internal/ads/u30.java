package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u30 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9357d;

    public /* synthetic */ u30(kr0 kr0Var, fr0 fr0Var, JSONObject jSONObject) {
        this.f9354a = 1;
        this.f9355b = kr0Var;
        this.f9356c = fr0Var;
        this.f9357d = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws zzeir {
        zzbvb zzbvbVar;
        Bundle bundle;
        switch (this.f9354a) {
            case 0:
                g4.c cVar = (g4.c) this.f9355b;
                n5.a aVar = (n5.a) this.f9356c;
                Bundle bundle2 = (Bundle) this.f9357d;
                cVar.getClass();
                Bundle bundle3 = (Bundle) aVar.get();
                String str = (String) ((n5.a) ((eh1) cVar.f13702g).zzb()).get();
                boolean z9 = ((Boolean) zzba.zzc().a(eg.f4149u6)).booleanValue() && ((zzg) cVar.f13705j).zzS();
                String str2 = (String) cVar.f13703h;
                PackageInfo packageInfo = (PackageInfo) cVar.f13701f;
                List list = (List) cVar.f13700e;
                String str3 = (String) cVar.f13699d;
                ApplicationInfo applicationInfo = (ApplicationInfo) cVar.f13698c;
                VersionInfoParcel versionInfoParcel = (VersionInfoParcel) cVar.f13697b;
                or0 or0Var = (or0) cVar.f13706k;
                or0Var.getClass();
                return new zzbvb(bundle3, versionInfoParcel, applicationInfo, str3, list, packageInfo, str, str2, null, null, z9, or0Var.f7646f.matches((String) zzba.zzc().a(eg.P2)), bundle2);
            case 1:
                n90 n90Var = new n90();
                JSONObject jSONObject = (JSONObject) this.f9357d;
                int iOptInt = jSONObject.optInt("template_id", -1);
                synchronized (n90Var) {
                    n90Var.f7198a = iOptInt;
                }
                n90Var.g(jSONObject.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null;
                kr0 kr0Var = (kr0) this.f9355b;
                n90Var.p(strOptString);
                or0 or0Var2 = (or0) kr0Var.f6382a.f6060b;
                if (!or0Var2.f7647g.contains(Integer.toString(n90Var.B()))) {
                    throw new zzeir(1, fb1.g("Invalid template ID: ", n90Var.B()));
                }
                if (n90Var.B() == 3) {
                    if (n90Var.a() == null) {
                        throw new zzeir(1, "No custom template id for custom template ad response.");
                    }
                    if (!or0Var2.f7648h.contains(n90Var.a())) {
                        throw new zzeir(1, "Unexpected custom template id in the response.");
                    }
                }
                fr0 fr0Var = (fr0) this.f9356c;
                n90Var.r(jSONObject.optDouble("rating", -1.0d));
                String strOptString2 = jSONObject.optString("headline", null);
                if (fr0Var.M) {
                    zzu.zzp();
                    strOptString2 = fb1.x(zzt.zzy(), " : ", strOptString2);
                }
                n90Var.s("headline", strOptString2);
                n90Var.s("body", jSONObject.optString("body", null));
                n90Var.s("call_to_action", jSONObject.optString("call_to_action", null));
                n90Var.s("store", jSONObject.optString("store", null));
                n90Var.s("price", jSONObject.optString("price", null));
                n90Var.s("advertiser", jSONObject.optString("advertiser", null));
                return n90Var;
            case 2:
                tr trVar = (tr) ((n5.a) this.f9356c).get();
                if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue() && (bundle = (zzbvbVar = (zzbvb) this.f9355b).f11586y) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", trVar.f9268j);
                    zzbvbVar.f11586y.putLong("get-ad-dictionary-sdkcore-end", trVar.f9269k);
                }
                return new wg0((JSONObject) ((n5.a) this.f9357d).get(), trVar);
            case 3:
                xi0 xi0Var = (xi0) this.f9355b;
                kr0 kr0Var2 = (kr0) this.f9356c;
                fr0 fr0Var2 = (fr0) this.f9357d;
                xi0Var.getClass();
                ep epVar = new ep(kr0Var2, fr0Var2, (String) null);
                p80 p80Var = new p80(((or0) kr0Var2.f6382a.f6060b).a(), 16, new l0.a(xi0Var, kr0Var2, fr0Var2, 17, 0));
                fz fzVar = (fz) xi0Var.f10562b;
                zy zyVar = fzVar.f4692d;
                a30 a30Var = new a30(epVar);
                x20 x20Var = new x20(epVar);
                int i10 = oh1.f7580c;
                List listEmptyList = Collections.emptyList();
                ArrayList arrayList = new ArrayList(2);
                fz fzVar2 = fzVar.f4694e;
                arrayList.add(fzVar2.Y);
                arrayList.add(fzVar2.Z);
                nh1 nh1VarO = g1.a.o(new oh1(listEmptyList, arrayList), 3);
                ArrayList arrayList2 = new ArrayList(4);
                ArrayList arrayList3 = new ArrayList(4);
                arrayList2.add(fzVar2.f4719q0);
                arrayList3.add(fzVar2.f4721r0);
                arrayList2.add(fzVar2.f4723s0);
                arrayList2.add(fzVar2.f4725t0);
                arrayList3.add(fzVar2.D0);
                arrayList3.add(fzVar2.E0);
                arrayList3.add(fzVar2.F0);
                arrayList2.add(fzVar2.f4727u0);
                nh1 nh1VarO2 = g1.a.o(new oh1(arrayList2, arrayList3), 5);
                i40 i40Var = new i40(x20Var, new y20(epVar), fzVar2.S, new z20(epVar), fzVar2.f4714o);
                nh1 nh1VarB = ih1.b(tp1.f9241i);
                ArrayList arrayList4 = new ArrayList(1);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(fzVar2.H0);
                arrayList4.add(fzVar2.I0);
                g50 g50Var = new g50(new oh1(arrayList4, arrayList5));
                List listEmptyList2 = Collections.emptyList();
                ArrayList arrayList6 = new ArrayList(1);
                arrayList6.add(fzVar2.f4713n0);
                f20 f20Var = (f20) ih1.b(new f10(new l30(a30Var, x20Var, nh1VarO, nh1VarO2, fzVar2.G0, i40Var, nh1VarB, g50Var, g1.a.o(new oh1(listEmptyList2, arrayList6), 15)), new h20(p80Var), new g20(p80Var), zyVar.f11342d, 3)).zzb();
                tp1.b0(f20Var);
                return f20Var;
            default:
                return Boolean.valueOf(((g4.f0) this.f9355b).a((JSONObject) this.f9357d, (String) this.f9356c));
        }
    }

    public /* synthetic */ u30(ts0 ts0Var, zzbvb zzbvbVar, ts0 ts0Var2) {
        this.f9354a = 2;
        this.f9356c = ts0Var;
        this.f9355b = zzbvbVar;
        this.f9357d = ts0Var2;
    }

    public /* synthetic */ u30(Object obj, Object obj2, Object obj3, int i10) {
        this.f9354a = i10;
        this.f9355b = obj;
        this.f9356c = obj2;
        this.f9357d = obj3;
    }
}

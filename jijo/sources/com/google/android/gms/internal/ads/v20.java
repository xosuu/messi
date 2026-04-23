package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v20 implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9740d;

    public /* synthetic */ v20(Object obj, Object obj2, Object obj3, int i10) {
        this.f9737a = i10;
        this.f9738b = obj;
        this.f9739c = obj2;
        this.f9740d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final n5.a zza(Object obj) {
        int i10 = this.f9737a;
        int i11 = 3;
        int i12 = 1;
        Object obj2 = this.f9740d;
        Object obj3 = this.f9739c;
        Object obj4 = this.f9738b;
        switch (i10) {
            case 0:
                w20 w20Var = (w20) obj4;
                k21 k21Var = (k21) obj3;
                n5.a aVar = (n5.a) obj2;
                r20 r20Var = (r20) obj;
                w20Var.getClass();
                if (r20Var != null) {
                    k21Var.mo4a(r20Var);
                }
                return tc1.r0(aVar, ((Long) yh.f10883a.k()).longValue(), TimeUnit.MILLISECONDS, w20Var.f10035b);
            case 1:
                String str = (String) obj3;
                JSONObject jSONObject = (JSONObject) obj2;
                fx fxVar = (fx) obj;
                tk tkVar = ((tb0) obj4).f9103h;
                tkVar.getClass();
                qu quVar = new qu();
                zzu.zzp();
                String string = UUID.randomUUID().toString();
                tkVar.c(string, new dl(quVar, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", string);
                    jSONObject2.put("args", jSONObject);
                    fxVar.T(jSONObject2, str);
                    break;
                } catch (Exception e10) {
                    quVar.c(e10);
                }
                return quVar;
            case 2:
                xi0 xi0Var = (xi0) obj4;
                kr0 kr0Var = (kr0) obj3;
                fr0 fr0Var = (fr0) obj2;
                Context context = (Context) xi0Var.f10563c;
                zzq zzqVarN = en1.N(context, fr0Var.f4640u);
                nx nxVarA = ((kc0) xi0Var.f10564d).a(zzqVarN, fr0Var, (hr0) kr0Var.f6383b.f10631d);
                nxVarA.D(fr0Var.W);
                View viewA = (((Boolean) zzba.zzc().a(eg.Z6)).booleanValue() && fr0Var.f4613g0) ? i20.a(context, nxVarA, fr0Var) : new mc0(context, nxVarA, (zzau) ((gx0) xi0Var.f10567g).apply(fr0Var));
                ep epVar = new ep(kr0Var, fr0Var, (String) null);
                xq xqVar = new xq(viewA, nxVarA, new sx(nxVarA), zzqVarN.zzi ? new gr0(-3, 0, true) : new gr0(zzqVarN.zze, zzqVarN.zzb, false));
                fz fzVar = (fz) xi0Var.f10562b;
                ez ezVar = new ez(fzVar.f4692d, fzVar.f4694e, epVar, xqVar);
                nh1 nh1Var = ezVar.K;
                ((jc0) nh1Var.zzb()).a(nxVarA, false, null);
                v40 v40VarH0 = ezVar.h0();
                ki0 ki0Var = new ki0(nxVarA, i12);
                mu muVar = nu.f7388f;
                v40VarH0.H0(ki0Var, muVar);
                ir0 ir0Var = fr0Var.f4636s;
                String strB = ir0Var.f5679a;
                if (((Boolean) zzba.zzc().a(eg.C4)).booleanValue() && ((yh0) ezVar.f4339w.zzb()).c()) {
                    strB = wx.b(strB, wx.a(fr0Var));
                }
                qu quVarB = jc0.b(nxVarA, ir0Var.f5680b, strB);
                boolean z9 = fr0Var.M;
                Executor executor = xi0Var.f10566f;
                if (z9) {
                    quVarB.a(new mx(nxVarA, 6), executor);
                }
                quVarB.a(new vh0(xi0Var, i11, nxVarA), executor);
                return tc1.o0(quVarB, new qr(i11, ezVar), muVar);
            case 3:
                return tc1.d0(i20.a(((ni0) obj4).f7268b, (View) obj3, (fr0) obj2));
            case 4:
                return tc1.d0(i20.a(((ui0) obj4).f9494b, (View) obj3, (fr0) obj2));
            default:
                hj0 hj0Var = (hj0) obj4;
                kr0 kr0Var2 = (kr0) obj3;
                fr0 fr0Var2 = (fr0) obj2;
                JSONArray jSONArray = (JSONArray) obj;
                hj0Var.getClass();
                if (jSONArray.length() == 0) {
                    return tc1.Z(new zzdwl(3));
                }
                if (((or0) kr0Var2.f6382a.f6060b).f7651k <= 1) {
                    return tc1.o0(hj0Var.c(kr0Var2, fr0Var2, jSONArray.getJSONObject(0)), new b3(9), hj0Var.f5311b);
                }
                int length = jSONArray.length();
                jp0 jp0Var = kr0Var2.f6382a;
                hj0Var.f5313d.c(Math.min(length, ((or0) jp0Var.f6060b).f7651k));
                or0 or0Var = (or0) jp0Var.f6060b;
                ArrayList arrayList = new ArrayList(or0Var.f7651k);
                for (int i13 = 0; i13 < or0Var.f7651k; i13++) {
                    if (i13 < length) {
                        arrayList.add(hj0Var.c(kr0Var2, fr0Var2, jSONArray.getJSONObject(i13)));
                    } else {
                        arrayList.add(tc1.Z(new zzdwl(3)));
                    }
                }
                return tc1.d0(arrayList);
        }
    }
}

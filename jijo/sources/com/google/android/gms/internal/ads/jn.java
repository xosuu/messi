package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import org.jasypt.digest.StandardStringDigester;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jn implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6003c;

    public /* synthetic */ jn(xa0 xa0Var, String str) {
        this.f6001a = 5;
        this.f6003c = xa0Var;
        this.f6002b = str;
    }

    private final m21 a(Object obj) {
        es0 es0Var;
        eq0 eq0Var = (eq0) this.f6002b;
        x30 x30Var = (x30) this.f6003c;
        jq0 jq0Var = (jq0) obj;
        ep epVar = eq0Var.f4278a;
        fs0 fs0Var = jq0Var.f6066b;
        zzbvb zzbvbVar = jq0Var.f6065a;
        synchronized (epVar) {
            try {
                as0 as0Var = (as0) ((ConcurrentHashMap) epVar.f4269b).get(fs0Var);
                es0Var = null;
                if (as0Var != null) {
                    os0 os0Var = as0Var.f2784d;
                    os0Var.getClass();
                    ((y3.b) zzu.zzB()).getClass();
                    os0Var.f7663c = System.currentTimeMillis();
                    os0Var.f7664d++;
                    as0Var.a();
                    LinkedList linkedList = as0Var.f2781a;
                    if (!linkedList.isEmpty() && (es0Var = (es0) linkedList.remove()) != null) {
                        os0Var.f7665e++;
                        os0Var.f7662b.f7379a = true;
                    }
                    if (es0Var == null) {
                        ((r) epVar.f4271f).f8338d++;
                    }
                    ns0 ns0Var = as0Var.f2784d.f7662b;
                    ns0 ns0VarClone = ns0Var.clone();
                    ns0Var.f7379a = false;
                    ns0Var.f7380b = 0;
                    if (es0Var != null) {
                        oe oeVarA = ve.A();
                        me meVarC = ne.C();
                        meVarC.d();
                        ne.D((ne) meVarC.f9462b);
                        re reVarA = se.A();
                        boolean z9 = ns0VarClone.f7379a;
                        reVarA.d();
                        se.C((se) reVarA.f9462b, z9);
                        int i10 = ns0VarClone.f7380b;
                        reVarA.d();
                        se.D((se) reVarA.f9462b, i10);
                        meVarC.d();
                        ne.A((ne) meVarC.f9462b, (se) reVarA.b());
                        oeVarA.d();
                        ve.B((ve) oeVarA.f9462b, (ne) meVarC.b());
                        es0Var.f4285a.zzb().f4372f.S((ve) oeVarA.b());
                    }
                    epVar.x();
                } else {
                    ((r) epVar.f4271f).f8337c++;
                    epVar.x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (es0Var != null && zzbvbVar != null) {
            f30 f30VarZzb = x30Var.zzb();
            ws0 ws0Var = ws0.J;
            tl0 tl0Var = f30VarZzb.f4374h;
            tl0Var.getClass();
            ts0 ts0VarD = f30VarZzb.f4369c.b(tl0Var.p(zzbvbVar, new aa(14, tl0Var), new i10(20, tl0Var), new f00(5)), ws0Var).d();
            tc1.u0(ts0VarD, new aa(7, f30VarZzb), f30VarZzb.f4376j);
            tc1.u0(ts0VarD, eq0Var.f4280d, eq0Var.f4279b);
        }
        return tc1.d0(new dq0(fs0Var, zzbvbVar, es0Var));
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final n5.a zza(Object obj) throws JSONException, zzbnd {
        int i10;
        boolean z9;
        List list;
        vy vyVar;
        String string;
        switch (this.f6001a) {
            case 0:
                zm zmVar = (zm) obj;
                zmVar.S((String) this.f6002b, (wk) this.f6003c);
                return tc1.d0(zmVar);
            case 1:
                jn jnVar = (jn) this.f6002b;
                jnVar.getClass();
                qu quVar = new qu();
                zzu.zzp();
                String string2 = UUID.randomUUID().toString();
                vk.f9891o.c(string2, new dl(quVar, 1));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", string2);
                jSONObject.put("args", (JSONObject) this.f6003c);
                ((zm) obj).T(jSONObject, (String) jnVar.f6002b);
                return quVar;
            case 2:
                return tc1.q0((n5.a) this.f6003c, new jn(this, 1, obj), nu.f7388f);
            case 3:
                n00 n00Var = (n00) this.f6002b;
                Uri.Builder builder = (Uri.Builder) this.f6003c;
                n00Var.getClass();
                ((q11) n00Var.f7091e).a(new l00(n00Var, (Throwable) obj, 0));
                builder.appendQueryParameter((String) zzba.zzc().a(eg.p9), "9");
                return tc1.d0(builder.toString());
            case 4:
                f30 f30Var = (f30) this.f6002b;
                zzfhb zzfhbVar = (zzfhb) this.f6003c;
                zzbvb zzbvbVar = (zzbvb) obj;
                f30Var.getClass();
                zzbvbVar.f11582u = zzfhbVar;
                tl0 tl0Var = f30Var.f4374h;
                tl0Var.getClass();
                xe0 xe0Var = new xe0(zzbvbVar, 2);
                rf0 rf0Var = (rf0) tl0Var.f9186b;
                Objects.requireNonNull(rf0Var);
                return tl0Var.p(zzbvbVar, new rk0(16, rf0Var), new jp0(18, tl0Var), xe0Var);
            case 5:
                xa0 xa0Var = (xa0) this.f6003c;
                String str = (String) this.f6002b;
                xa0Var.getClass();
                zzu.zzz();
                Context context = xa0Var.f10501a;
                b4.c cVar = new b4.c(0, 0, 0, 3);
                y9 y9Var = xa0Var.f10503c;
                nx nxVarA = lx.a(context, xa0Var.f10504d, xa0Var.f10505e, null, cVar, y9Var, xa0Var.f10506f, null, xa0Var.f10516p, null, null, xa0Var.f10517q, "native-omid", false, false);
                ed edVar = new ed(nxVarA);
                nxVarA.g().f5715s = new i10(17, edVar);
                if (((Boolean) zzba.zzc().a(eg.E4)).booleanValue()) {
                    nxVarA.f7407a.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
                } else {
                    nxVarA.f7407a.loadData(str, "text/html", StandardStringDigester.MESSAGE_CHARSET);
                }
                return edVar;
            case 6:
                fb0 fb0Var = (fb0) this.f6002b;
                JSONObject jSONObject2 = (JSONObject) this.f6003c;
                fx fxVar = (fx) obj;
                fb0Var.getClass();
                ed edVar2 = new ed(fxVar);
                if (fb0Var.f4440a.f7642b != null) {
                    i10 = 0;
                    fxVar.t0(new b4.c(5, 0, 0, 3));
                } else {
                    i10 = 0;
                    fxVar.t0(new b4.c(4, 0, 0, 3));
                }
                fxVar.g().f5715s = new bb0(fb0Var, fxVar, edVar2, i10);
                fxVar.T(jSONObject2, "google.afma.nativeAds.renderVideo");
                return edVar2;
            case 7:
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                String str2 = (String) this.f6002b;
                String str3 = (String) this.f6003c;
                try {
                    jSONObject5.put("headers", new JSONObject());
                    jSONObject5.put("body", str2);
                    jSONObject4.put("base_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    jSONObject4.put("signals", new JSONObject(str3));
                    jSONObject3.put("request", jSONObject4);
                    jSONObject3.put("response", jSONObject5);
                    jSONObject3.put("flags", new JSONObject());
                    return tc1.d0(jSONObject3);
                } catch (JSONException e10) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getCause())));
                }
            case 8:
                return ((xf0) ((qh1) this.f6002b).zzb()).a((zzbvb) this.f6003c);
            case 9:
                return tc1.d0(new kr0(new jp0(27, (or0) ((l2.l) this.f6002b).f15164f), xq.b(new InputStreamReader((InputStream) obj), (zzbvb) this.f6003c)));
            case 10:
                vy vyVar2 = (vy) this.f6002b;
                Bundle bundle = (Bundle) obj;
                zy zyVar = vyVar2.f9995b;
                Context context2 = zyVar.f11338b.f5433b;
                tp1.b0(context2);
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                gp0 gp0Var = vyVar2.f9994a;
                tp1.b0(gp0Var.v());
                co0 co0Var = new co0();
                nh1 nh1Var = zyVar.f11344e;
                eo0 eo0Var = new eo0(co0Var, 0L, (ScheduledExecutorService) nh1Var.zzb());
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) nh1Var.zzb();
                hy hyVar = zyVar.f11338b;
                tp1.b0(hyVar.f5433b);
                eo0 eo0Var2 = new eo0(new ul0(scheduledExecutorService), ((Long) zzba.zzc().a(eg.K3)).longValue(), (ScheduledExecutorService) nh1Var.zzb());
                zt ztVar = new zt();
                Context context3 = hyVar.f5433b;
                tp1.b0(context3);
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) nh1Var.zzb();
                int iZza = gp0Var.zza();
                switch (gp0Var.f5024a) {
                    case 0:
                        z9 = ((zzbuc) gp0Var.f5026d).f11562u;
                        break;
                    default:
                        z9 = ((zzbvb) gp0Var.f5026d).f11585x;
                        break;
                }
                eo0 eo0Var3 = new eo0(new ep0(ztVar, context3, scheduledExecutorService2, muVar, iZza, z9, ((zzbvb) gp0Var.f5026d).f11584w), 0L, (ScheduledExecutorService) nh1Var.zzb());
                eo0 eo0Var4 = new eo0(new kn0(muVar, 5, 0), 0L, (ScheduledExecutorService) nh1Var.zzb());
                co0 co0Var2 = new co0(2);
                tp1.b0(hyVar.f5433b);
                kn0 kn0Var = new kn0(muVar);
                to0[] to0VarArr = new to0[5];
                tp1.b0(muVar);
                gp0 gp0Var2 = vyVar2.f9994a;
                switch (gp0Var2.f5024a) {
                    case 0:
                        list = ((zzbuc) gp0Var2.f5026d).f11560s;
                        break;
                    default:
                        list = ((zzbvb) gp0Var2.f5026d).f11578h;
                        break;
                }
                tp1.b0(list);
                to0VarArr[0] = new am0(muVar, list);
                tp1.b0(muVar);
                gp0 gp0Var3 = vyVar2.f9994a;
                switch (gp0Var3.f5024a) {
                    case 0:
                        vyVar = vyVar2;
                        string = ((zzbuc) gp0Var3.f5026d).f11557f;
                        break;
                    default:
                        vyVar = vyVar2;
                        string = ((zzbvb) gp0Var3.f5026d).f11574a.getString("ms");
                        if (string == null) {
                            string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        break;
                }
                switch (gp0Var3.f5024a) {
                    case 0:
                        PackageInfo packageInfo = ((zzbuc) gp0Var3.f5026d).f11556d;
                        break;
                    default:
                        PackageInfo packageInfo2 = ((zzbvb) gp0Var3.f5026d).f11579q;
                        break;
                }
                gp0Var3.zza();
                to0VarArr[1] = new am0(muVar, string);
                gp0Var.zza();
                tp1.b0(hyVar.f5433b);
                nh1 nh1Var2 = zyVar.N;
                gu guVar = (gu) nh1Var2.zzb();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) nh1Var.zzb();
                tp1.b0(gp0Var.v());
                to0VarArr[2] = new hm0(guVar, scheduledExecutorService3, muVar);
                to0VarArr[3] = (to0) zyVar.f11369q0.zzb();
                tp1.b0(gp0Var.v());
                to0VarArr[4] = new hm0((gu) nh1Var2.zzb(), (ScheduledExecutorService) nh1Var.zzb(), muVar, 0);
                return new uo0(context2, muVar, fz0.l(eo0Var, eo0Var2, eo0Var3, eo0Var4, co0Var2, kn0Var, to0VarArr), (ft0) vyVar.f9996c.zzb(), (ed0) zyVar.f11377y.zzb()).a(zzay.zzb().zzi(bundle), ((zzbvb) this.f6003c).f11586y);
            case 11:
                return ((uo0) this.f6002b).a(zzay.zzb().zzi((Bundle) obj), ((zzbvb) this.f6003c).f11586y);
            case 12:
                hj0 hj0Var = (hj0) this.f6002b;
                tb0 tb0Var = (tb0) this.f6003c;
                JSONObject jSONObject6 = (JSONObject) obj;
                hj0Var.getClass();
                hj0Var.f5313d.b(tc1.d0(tb0Var));
                if (jSONObject6.optBoolean("success")) {
                    return tc1.d0(jSONObject6.getJSONObject("json").getJSONArray("ads"));
                }
                throw new zzbnd("process json failed");
            case 13:
                hj0 hj0Var2 = (hj0) this.f6002b;
                fr0 fr0Var = (fr0) this.f6003c;
                tb0 tb0Var2 = (tb0) obj;
                hj0Var2.getClass();
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("isNonagon", true);
                if (((Boolean) zzba.zzc().a(eg.N7)).booleanValue() && z3.a.L()) {
                    jSONObject7.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("response", fr0Var.f4636s.f5681c);
                jSONObject8.put("sdk_params", jSONObject7);
                return tc1.q0(tb0Var2.a(jSONObject8, "google.afma.nativeAds.preProcessJson"), new jn(hj0Var2, 12, tb0Var2), hj0Var2.f5311b);
            case 14:
                kr0 kr0Var = (kr0) obj;
                ((es0) this.f6002b).f4286b = kr0Var;
                Iterator it = ((List) kr0Var.f6383b.f10630b).iterator();
                boolean z10 = false;
                while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((fr0) it.next()).f4600a.iterator();
                        while (it2.hasNext()) {
                            if (((String) it2.next()).contains("FirstPartyRenderer")) {
                                z10 = true;
                            }
                        }
                    } else if (z10) {
                        return ((f30) this.f6003c).a(tc1.d0(kr0Var));
                    }
                }
                return tc1.d0(null);
            case 15:
                return a(obj);
            default:
                ps0 ps0Var = (ps0) this.f6002b;
                Exception exc = (Exception) obj;
                synchronized (ps0Var) {
                    ps0Var.f7963d = true;
                    throw exc;
                }
        }
    }

    public /* synthetic */ jn(Object obj, int i10, Object obj2) {
        this.f6001a = i10;
        this.f6002b = obj;
        this.f6003c = obj2;
    }

    public /* synthetic */ jn(Object obj, Object obj2, int i10) {
        this.f6001a = i10;
        this.f6002b = obj;
        this.f6003c = obj2;
    }

    public jn(n5.a aVar) {
        this.f6001a = 2;
        this.f6003c = aVar;
        this.f6002b = "google.afma.activeView.handleUpdate";
    }
}

package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9912b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9913d;

    public /* synthetic */ vm(Context context, String str) {
        this.f9911a = 9;
        this.f9912b = context;
        this.f9913d = str;
    }

    private final void a() {
        m20 m20Var = (m20) this.f9912b;
        e10 e10Var = (e10) this.f9913d;
        m20Var.getClass();
        int i10 = yn0.f10944a;
        x.e eVar = ((ri1) m20Var.f6810d).f8608a.f9507k;
        eVar.j(25, new oi1(1, e10Var));
        eVar.i();
    }

    private final void b() {
        m20 m20Var = (m20) this.f9912b;
        Exception exc = (Exception) this.f9913d;
        m20Var.getClass();
        int i10 = yn0.f10944a;
        ((ri1) m20Var.f6810d).f8608a.f9512p.B(exc);
    }

    private final void c() {
        m20 m20Var = (m20) this.f9912b;
        String str = (String) this.f9913d;
        m20Var.getClass();
        int i10 = yn0.f10944a;
        ((ri1) m20Var.f6810d).f8608a.f9512p.Z(str);
    }

    private final void d() {
        fc fcVar = (fc) this.f9913d;
        View view = (View) this.f9912b;
        fcVar.getClass();
        try {
            ac acVar = new ac(fcVar.f4453q, fcVar.f4454s, fcVar.f4455t, fcVar.f4456u, fcVar.f4457v, fcVar.f4458w, fcVar.f4459x, fcVar.A);
            Application applicationB = zzu.zzb().b();
            if (applicationB != null && !TextUtils.isEmpty(fcVar.f4460y)) {
                String str = (String) view.getTag(applicationB.getResources().getIdentifier((String) zzba.zzc().a(eg.O), "id", applicationB.getPackageName()));
                if (str != null && str.equals(fcVar.f4460y)) {
                    return;
                }
            }
            o0.s sVarB = fcVar.b(view, acVar);
            acVar.c();
            if (sVarB.f16064a == 0 && sVarB.f16065b == 0) {
                return;
            }
            int i10 = sVarB.f16065b;
            if (i10 != 0) {
                if (i10 == 0) {
                }
                fcVar.f4451f.c(acVar);
            } else if (acVar.f2646k == 0) {
                return;
            }
            xg xgVar = fcVar.f4451f;
            synchronized (xgVar.f10550f) {
                try {
                    if (((List) xgVar.f10549d).contains(acVar)) {
                        return;
                    }
                    fcVar.f4451f.c(acVar);
                } finally {
                }
            }
        } catch (Exception e10) {
            zzm.zzh("Exception in fetchContentOnUIThread", e10);
            zzu.zzo().i("ContentFetchTask.fetchContent", e10);
        }
    }

    private final void e() {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f4138t4)).booleanValue();
        v3.d0 d0Var = (v3.d0) this.f9912b;
        Context context = (Context) this.f9913d;
        if (zBooleanValue) {
            try {
                d0Var.f17736d = (tb) zzq.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new qz(23, (g1.a) null));
                ((rb) ((tb) d0Var.f17736d)).v1(new a4.b(context));
                d0Var.f17735b = true;
            } catch (RemoteException | zzp | NullPointerException unused) {
                zzm.zze("Cannot dynamite load clearcut");
            }
        }
    }

    private final void f() {
        ym ymVar = (ym) this.f9912b;
        wm wmVar = (wm) this.f9913d;
        ymVar.getClass();
        ((y3.b) zzu.zzB()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            lm lmVar = new lm(ymVar.f10930b, ymVar.f10932d);
            zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            lmVar.f6659a.g().f5716t = new rk0(5, new pm(ymVar, arrayList, jCurrentTimeMillis, wmVar, lmVar));
            zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            lmVar.S("/jsLoaded", new qm(ymVar, jCurrentTimeMillis, wmVar, lmVar));
            zzby zzbyVar = new zzby();
            rm rmVar = new rm(ymVar, lmVar, zzbyVar);
            zzbyVar.zzb(rmVar);
            zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            lmVar.S("/requestReload", rmVar);
            String str = ymVar.f10931c;
            zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            int i10 = 0;
            if (str.endsWith(".js")) {
                zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zze.zza("loadJavascript on adWebView from path: ".concat(str));
                lm.L(new jm(lmVar, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str), 3));
                zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zze.zza("loadHtml on adWebView from html");
                lm.L(new jm(lmVar, str, 2));
                zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zze.zza("loadHtmlWrapper on adWebView from path: ".concat(str));
                lm.L(new jm(lmVar, str, i10));
                zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            zzt.zza.postDelayed(new nm(ymVar, wmVar, lmVar, arrayList, jCurrentTimeMillis, 1), ((Integer) zzba.zzc().a(eg.f3955c)).intValue());
        } catch (Throwable th) {
            zzm.zzh("Error creating webview.", th);
            if (((Boolean) zzba.zzc().a(eg.S6)).booleanValue()) {
                wmVar.m("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th);
            } else if (((Boolean) zzba.zzc().a(eg.U6)).booleanValue()) {
                zzu.zzo().h("SdkJavascriptFactory.loadJavascriptEngine", th);
                wmVar.l();
            } else {
                zzu.zzo().i("SdkJavascriptFactory.loadJavascriptEngine", th);
                wmVar.l();
            }
        }
    }

    private final void g() {
        Context context = (Context) this.f9912b;
        eg.a(context);
        if (((Boolean) zzba.zzc().a(eg.f4075n0)).booleanValue()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzba.zzc().a(eg.f3956c0)).booleanValue());
        if (((Boolean) zzba.zzc().a(eg.f4034j0)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        String str = (String) this.f9913d;
        z3.a.l(context);
        if (h4.r.f13999i == null) {
            synchronized (h4.r.class) {
                try {
                    if (h4.r.f13999i == null) {
                        h4.r.f13999i = new h4.r(context, str, bundle);
                    }
                } finally {
                }
            }
        }
        m2.f fVar = h4.r.f13999i.f14003d;
        try {
            fy fyVar = (fy) zzq.zzb(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new pe(13));
            a4.b bVar = new a4.b(context);
            ln lnVar = new ln(fVar);
            dy dyVar = (dy) fyVar;
            Parcel parcelM = dyVar.m();
            qb.e(parcelM, bVar);
            qb.e(parcelM, lnVar);
            dyVar.a0(parcelM, 2);
        } catch (RemoteException | zzp | NullPointerException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    private final void h() {
        ct ctVar = (ct) this.f9912b;
        Bitmap bitmap = (Bitmap) this.f9913d;
        ctVar.getClass();
        cc1 cc1Var = ec1.f3903b;
        dc1 dc1Var = new dc1();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, dc1Var);
        synchronized (ctVar.f3418h) {
            ef1 ef1Var = ctVar.f3411a;
            cg1 cg1VarA = eg1.A();
            ec1 ec1VarA = dc1Var.a();
            cg1VarA.d();
            eg1.C((eg1) cg1VarA.f9462b, ec1VarA);
            cg1VarA.d();
            eg1.B((eg1) cg1VarA.f9462b);
            cg1VarA.d();
            eg1.D((eg1) cg1VarA.f9462b);
            eg1 eg1Var = (eg1) cg1VarA.b();
            ef1Var.d();
            qg1.K((qg1) ef1Var.f9462b, eg1Var);
        }
    }

    private final void i() {
        jp0 jp0Var = new jp0(8, (nx) this.f9912b);
        yh0 yh0Var = (yh0) this.f9913d;
        synchronized (yh0Var) {
            cu0 cu0Var = yh0Var.f10888e;
            if (cu0Var != null && yh0Var.f10887d != null) {
                ((k70) zzu.zzA()).getClass();
                k70.m(new vh0(cu0Var, 2, jp0Var));
                yh0Var.f10888e = null;
                yh0Var.f10887d.y(null);
            }
        }
    }

    private final void j() {
        final be0 be0Var = (be0) ((aa) this.f9912b).f2626b;
        String str = (String) this.f9913d;
        int i10 = 5;
        bt0 bt0VarD = tc1.d(be0Var.f3002f, 5);
        bt0VarD.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final bt0 bt0VarD2 = tc1.d(be0Var.f3002f, i10);
                bt0VarD2.zzi();
                bt0VarD2.v(next);
                final Object obj = new Object();
                final qu quVar = new qu();
                n5.a aVarR0 = tc1.r0(quVar, ((Long) zzba.zzc().a(eg.E1)).longValue(), TimeUnit.SECONDS, be0Var.f3007k);
                be0Var.f3008l.b(next);
                be0Var.f3011o.z(next);
                ((y3.b) zzu.zzB()).getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                aVarR0.a(new Runnable() { // from class: com.google.android.gms.internal.ads.zd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        be0 be0Var2 = be0Var;
                        Object obj2 = obj;
                        qu quVar2 = quVar;
                        String str2 = next;
                        long j10 = jElapsedRealtime;
                        bt0 bt0Var = bt0VarD2;
                        be0Var2.getClass();
                        synchronized (obj2) {
                            try {
                                if (!quVar2.f8276a.isDone()) {
                                    ((y3.b) zzu.zzB()).getClass();
                                    be0Var2.d(str2, (int) (SystemClock.elapsedRealtime() - j10), "Timeout.", false);
                                    be0Var2.f3008l.a(str2, "timeout");
                                    be0Var2.f3011o.a(str2, "timeout");
                                    gt0 gt0Var = be0Var2.f3012p;
                                    bt0Var.i("Timeout");
                                    bt0Var.x(false);
                                    gt0Var.b(bt0Var.zzm());
                                    quVar2.b(Boolean.FALSE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, be0Var.f3005i);
                arrayList.add(aVarR0);
                ae0 ae0Var = new ae0(jElapsedRealtime, quVar, be0Var, bt0VarD2, obj, next);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String strOptString = jSONObject2.optString("format", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                                }
                            }
                            arrayList2.add(new zzblf(bundle, strOptString));
                        }
                    } catch (JSONException unused) {
                    }
                }
                be0Var.d(next, 0, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false);
                try {
                    try {
                        be0Var.f3006j.execute(new kw(be0Var, next, ae0Var, be0Var.f3004h.b(new JSONObject(), next), arrayList2));
                    } catch (RemoteException e10) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                    }
                } catch (zzffn unused2) {
                    ae0Var.a("Failed to create Adapter.");
                }
                i10 = 5;
            }
            bz0 bz0VarK = bz0.k(arrayList);
            xa xaVar = new xa(be0Var, 3, bt0VarD);
            Executor executor = be0Var.f3005i;
            c21 c21Var = new c21(bz0VarK, false, false);
            c21Var.B = new b21(c21Var, xaVar, executor);
            c21Var.w();
        } catch (JSONException e11) {
            zze.zzb("Malformed CLD response", e11);
            be0Var.f3011o.zza("MalformedJson");
            jd0 jd0Var = be0Var.f3008l;
            synchronized (jd0Var) {
                if (((Boolean) zzba.zzc().a(eg.P1)).booleanValue()) {
                    HashMap mapE = jd0Var.e();
                    mapE.put("action", "aaia");
                    mapE.put("aair", "MalformedJson");
                    jd0Var.f5910b.add(mapE);
                }
                be0Var.f3001e.c(e11);
                zzu.zzo().i("AdapterInitializer.updateAdapterStatus", e11);
                gt0 gt0Var = be0Var.f3012p;
                bt0VarD.e(e11);
                bt0VarD.x(false);
                gt0Var.b(bt0VarD.zzm());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x070f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.ga0, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vm.run():void");
    }

    public /* synthetic */ vm(ym ymVar, wm wmVar) {
        this.f9911a = 8;
        this.f9912b = ymVar;
        this.f9913d = wmVar;
    }

    public /* synthetic */ vm(Object obj, int i10, Object obj2) {
        this.f9911a = i10;
        this.f9912b = obj;
        this.f9913d = obj2;
    }

    public /* synthetic */ vm(Object obj, Object obj2, int i10) {
        this.f9911a = i10;
        this.f9912b = obj2;
        this.f9913d = obj;
    }
}

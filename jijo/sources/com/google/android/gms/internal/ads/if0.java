package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class if0 implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5586b;

    public /* synthetic */ if0(int i10, Object obj) {
        this.f5585a = i10;
        this.f5586b = obj;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final n5.a zza(Object obj) throws zzdwl {
        hg1 hg1Var;
        s11 s11VarO0;
        es0 es0Var;
        bq0 bq0Var;
        int i10 = 27;
        int i11 = 11;
        int i12 = 10;
        int i13 = 0;
        int i14 = 3;
        int i15 = 8;
        int i16 = 4;
        int i17 = 2;
        switch (this.f5585a) {
            case 0:
                return ((hn) this.f5586b).a((JSONObject) obj);
            case 1:
                sl slVar = (sl) obj;
                qu quVar = new qu();
                tl tlVar = new tl(quVar);
                zzbki zzbkiVar = (zzbki) this.f5586b;
                Parcel parcelM = slVar.m();
                qb.c(parcelM, zzbkiVar);
                qb.e(parcelM, tlVar);
                slVar.u1(parcelM, 2);
                return quVar;
            case 2:
                ct ctVar = (ct) this.f5586b;
                Map map = (Map) obj;
                ctVar.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (jSONArrayOptJSONArray != null) {
                                synchronized (ctVar.f3418h) {
                                    try {
                                        int length = jSONArrayOptJSONArray.length();
                                        synchronized (ctVar.f3418h) {
                                            hg1Var = (hg1) ctVar.f3412b.get(str);
                                            break;
                                        }
                                        if (hg1Var == null) {
                                            y3.c.j("Cannot find the corresponding resource object for " + str);
                                        } else {
                                            for (int i18 = 0; i18 < length; i18++) {
                                                String string = jSONArrayOptJSONArray.getJSONObject(i18).getString("threat_type");
                                                hg1Var.d();
                                                ig1.G((ig1) hg1Var.f9462b, string);
                                            }
                                            ctVar.f3416f |= length > 0;
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        if (((Boolean) th.f9158a.k()).booleanValue()) {
                            zzm.zzf("Failed to get SafeBrowsing metadata", e10);
                        }
                        return tc1.Z(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (ctVar.f3416f) {
                    synchronized (ctVar.f3418h) {
                        ef1 ef1Var = ctVar.f3411a;
                        ef1Var.d();
                        qg1.O((qg1) ef1Var.f9462b, 10);
                        break;
                    }
                }
                boolean z9 = ctVar.f3416f;
                if (!(z9 && ctVar.f3417g.f11599s) && (!(ctVar.f3421k && ctVar.f3417g.f11598q) && (z9 || !ctVar.f3417g.f11596f))) {
                    return tc1.d0(null);
                }
                synchronized (ctVar.f3418h) {
                    try {
                        for (hg1 hg1Var2 : ctVar.f3412b.values()) {
                            ef1 ef1Var2 = ctVar.f3411a;
                            ig1 ig1Var = (ig1) hg1Var2.b();
                            ef1Var2.d();
                            qg1.H((qg1) ef1Var2.f9462b, ig1Var);
                        }
                        ef1 ef1Var3 = ctVar.f3411a;
                        ArrayList arrayList = ctVar.f3413c;
                        ef1Var3.d();
                        qg1.M((qg1) ef1Var3.f9462b, arrayList);
                        ef1 ef1Var4 = ctVar.f3411a;
                        ArrayList arrayList2 = ctVar.f3414d;
                        ef1Var4.d();
                        qg1.N((qg1) ef1Var4.f9462b, arrayList2);
                        if (((Boolean) th.f9158a.k()).booleanValue()) {
                            StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + ((qg1) ctVar.f3411a.f9462b).C() + "\n  clickUrl: " + ((qg1) ctVar.f3411a.f9462b).B() + "\n  resources: \n");
                            for (ig1 ig1Var2 : Collections.unmodifiableList(((qg1) ctVar.f3411a.f9462b).D())) {
                                sb.append("    [");
                                sb.append(ig1Var2.A());
                                sb.append("] ");
                                sb.append(ig1Var2.C());
                            }
                            y3.c.j(sb.toString());
                        }
                        n5.a aVarZzb = new com.google.android.gms.ads.internal.util.zzbo(ctVar.f3415e).zzb(1, ctVar.f3417g.f11594b, null, ((qg1) ctVar.f3411a.b()).d());
                        if (((Boolean) th.f9158a.k()).booleanValue()) {
                            aVarZzb.a(new k9(1), nu.f7383a);
                        }
                        s11VarO0 = tc1.o0(aVarZzb, new b3(3), nu.f7388f);
                    } finally {
                    }
                    break;
                }
                return s11VarO0;
            case 3:
                String str2 = (String) zzba.zzc().a(eg.p9);
                Uri.Builder builder = (Uri.Builder) this.f5586b;
                builder.appendQueryParameter(str2, "12");
                return tc1.d0(builder.toString());
            case 4:
                ((k21) this.f5586b).E((Throwable) obj);
                return tc1.d0(null);
            case 5:
                ep epVar = (ep) this.f5586b;
                zzbvb zzbvbVar = (zzbvb) obj;
                epVar.getClass();
                tl0 tl0VarB = ((xs0) epVar.f4271f).b(tc1.o0(tc1.d0(null), new dg0(zzbvbVar), (p21) epVar.f4269b), ws0.f10332q);
                ep epVar2 = (ep) epVar.f4270d;
                Objects.requireNonNull(epVar2);
                return tc1.o0(tl0VarB.l(new if0(i11, epVar2)).d(), new dg0(zzbvbVar, i13), (p21) epVar.f4269b);
            case 6:
                tl0 tl0Var = (tl0) this.f5586b;
                tl0Var.getClass();
                return tc1.q0(h21.r(tc1.d0((JSONObject) obj)), zzu.zzf().a((Context) tl0Var.f9187d, (VersionInfoParcel) tl0Var.f9190q, (gt0) tl0Var.f9189h).a("AFMA_getAdDictionary", en.f4244b, new k70(16)), (p21) tl0Var.f9185a);
            case 7:
                return ((vf0) this.f5586b).a((zzbvb) obj);
            case 8:
                fb0 fb0Var = (fb0) this.f5586b;
                fb0Var.getClass();
                nx nxVarA = fb0Var.f4442c.a(zzq.zzc(), null, null);
                ed edVar = new ed(nxVarA);
                fb0Var.a(nxVarA);
                nxVarA.g().f5716t = new kx(edVar);
                nxVarA.f7407a.loadUrl((String) zzba.zzc().a(eg.f4127s3));
                return edVar;
            case 9:
                yf0 yf0Var = (yf0) obj;
                return tc1.d0(new kr0(new jp0(i10, ((hf0) this.f5586b).f5273c), xq.b(new InputStreamReader(yf0Var.f10868a), yf0Var.f10869b)));
            case 10:
                return tc1.d0(new kr0(new jp0(i10, (or0) ((jt) this.f5586b).f6075d), xq.b(new StringReader(((JSONObject) obj).toString()), null)));
            case 11:
                ep epVar3 = (ep) this.f5586b;
                zzbuc zzbucVar = (zzbuc) obj;
                epVar3.getClass();
                String str3 = zzbucVar.f11555b;
                zzu.zzp();
                return tc1.q0(tc1.V(h21.r(zzt.zzC(str3) ? tc1.Z(new zzdyp(1, "Ads signal service force local")) : tc1.V(tc1.k0(new m20(epVar3, 25, zzbucVar), (p21) epVar3.f4269b), ExecutionException.class, new f00(9), (p21) epVar3.f4270d)), zzdyp.class, new f00(i12), (p21) epVar3.f4270d), new f00(i11), (p21) epVar3.f4270d);
            case 12:
                xq xqVar = (xq) this.f5586b;
                zzbug zzbugVar = (zzbug) obj;
                xqVar.getClass();
                String str4 = zzbugVar.f11570q;
                zzu.zzp();
                return tc1.V(zzt.zzC(str4) ? tc1.Z(new zzdyp(1, "Ads service proxy force local")) : tc1.V(tc1.k0(new p80(xqVar, 26, zzbugVar), (p21) xqVar.f10630b), ExecutionException.class, new f00(i15), (p21) xqVar.f10631d), zzdyp.class, new ye0(xqVar, zzbugVar, Binder.getCallingUid(), i17), (p21) xqVar.f10631d);
            case 13:
                return ((wy) this.f5586b).a().a(new JSONObject(), new Bundle());
            case 14:
                eo0 eo0Var = (eo0) this.f5586b;
                Throwable th = (Throwable) obj;
                eo0Var.getClass();
                if (((Boolean) zzba.zzc().a(eg.W1)).booleanValue()) {
                    zzu.zzo().i("OptionalSignalTimeout:" + eo0Var.f4262a.zza(), th);
                }
                return tc1.d0(null);
            case 15:
                cp0 cp0Var = (cp0) this.f5586b;
                Throwable th2 = (Throwable) obj;
                cp0Var.getClass();
                ((q11) cp0Var.f3354c).a(new yd0(i15, th2));
                boolean z10 = th2 instanceof SecurityException;
                String str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                return tc1.d0(z10 ? new vm0(str5, i17) : th2 instanceof IllegalStateException ? new vm0(str5, i14) : th2 instanceof IllegalArgumentException ? new vm0(str5, i16) : th2 instanceof TimeoutException ? new vm0(str5, 5) : new vm0(str5, i13));
            case 16:
                return tc1.d0(new dm0((String) ((am0) this.f5586b).f2735c, i16));
            case 17:
                tl0 tl0Var2 = (tl0) this.f5586b;
                ls0 ls0Var = (ls0) obj;
                tl0Var2.getClass();
                if (ls0Var == null || (es0Var = ls0Var.f6697a) == null || (bq0Var = ls0Var.f6698b) == null) {
                    throw new zzdwl(1, "Empty prefetch");
                }
                oe oeVarA = ve.A();
                me meVarC = ne.C();
                meVarC.d();
                ne.D((ne) meVarC.f9462b);
                se seVarB = se.B();
                meVarC.d();
                ne.A((ne) meVarC.f9462b, seVarB);
                oeVarA.d();
                ve.B((ve) oeVarA.f9462b, (ne) meVarC.b());
                es0Var.f4285a.zzb().f4372f.T((ve) oeVarA.b());
                return tl0Var2.o(es0Var, bq0Var.f3072b);
            default:
                return tc1.d0(((rs0) this.f5586b).zza(obj));
        }
    }

    public if0(zzbki zzbkiVar) {
        this.f5585a = 1;
        this.f5586b = zzbkiVar;
    }
}

package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rk0 implements f7, v3.b, qx0, OnH5AdsEventListener, ay, su, MediationBannerAdCallback, MediationInterstitialAdCallback, MediationRewardedAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback, k21, rs0, s60, jd, zf0, zzg, x11, fq0, pu0, db1, qe0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static rk0 f8629d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8631b;

    public /* synthetic */ rk0(int i10, Object obj) {
        this.f8630a = i10;
        this.f8631b = obj;
    }

    public static void b(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
        if (jSONObjectOptJSONObject == null) {
            zze.zza("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
            map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        }
        if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
            return;
        }
        map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        switch (this.f8630a) {
            case 9:
                ct.f3410l.remove((n5.a) this.f8631b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        int i10 = this.f8630a;
        Object obj2 = this.f8631b;
        switch (i10) {
            case 9:
                ct.f3410l.remove((n5.a) obj2);
                break;
            default:
                ((bt0) obj2).zzi();
                break;
        }
    }

    public final void c(ec1 ec1Var) {
        if (!ec1Var.i()) {
            if (!(ec1Var instanceof fe1)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(ec1Var.getClass())));
            }
            fe1 fe1Var = (fe1) ec1Var;
            c(fe1Var.f4508f);
            c(fe1Var.f4509h);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(fe1.f4506t, ec1Var.f());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f8631b;
        int iS = fe1.s(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((ec1) arrayDeque.peek()).f() >= iS) {
            arrayDeque.push(ec1Var);
            return;
        }
        int iS2 = fe1.s(iBinarySearch);
        ec1 fe1Var2 = (ec1) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((ec1) arrayDeque.peek()).f() < iS2) {
            fe1Var2 = new fe1((ec1) arrayDeque.pop(), fe1Var2);
        }
        fe1 fe1Var3 = new fe1(fe1Var2, ec1Var);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(fe1.f4506t, fe1Var3.f4507d);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ec1) arrayDeque.peek()).f() >= fe1.s(iBinarySearch2 + 1)) {
                break;
            } else {
                fe1Var3 = new fe1((ec1) arrayDeque.pop(), fe1Var3);
            }
        }
        arrayDeque.push(fe1Var3);
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void k(rf rfVar) {
        nd ndVar = (nd) ((sf) rfVar.f9462b).J().o();
        hf hfVar = (hf) ((sf) rfVar.f9462b).J().B().o();
        String str = ((hr0) ((kr0) this.f8631b).f6383b.f10631d).f5371b;
        hfVar.d();
        Cif.A((Cif) hfVar.f9462b, str);
        ndVar.d();
        od.A((od) ndVar.f9462b, (Cif) hfVar.b());
        rfVar.d();
        sf.E((sf) rfVar.f9462b, (od) ndVar.b());
    }

    @Override // com.google.android.gms.internal.ads.pu0
    public final void l(View view, JSONObject jSONObject, ou0 ou0Var, boolean z9, boolean z10) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z9) {
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    ((wu0) ou0Var).a(viewGroup.getChildAt(i11), this, jSONObject, z10);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i13));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    i10 = i13 + 1;
                    if (i14 < size2) {
                        ((wu0) ou0Var).a((View) arrayList3.get(i14), this, jSONObject, z10);
                        i14++;
                    }
                }
                i13 = i10;
            }
        }
    }

    @Override // v3.b
    public final void m(int i10) {
        synchronized (((bd) this.f8631b).f2988c) {
            Object obj = this.f8631b;
            ((bd) obj).f2991f = null;
            ((bd) obj).f2988c.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.zf0
    public final n5.a n(zzbvb zzbvbVar) {
        n5.a aVarZ;
        rf0 rf0Var = (rf0) this.f8631b;
        synchronized (rf0Var.f7567b) {
            try {
                int i10 = rf0Var.f8587t;
                if (i10 != 1 && i10 != 2) {
                    aVarZ = tc1.Z(new zzdyp(2));
                } else if (rf0Var.f7568d) {
                    aVarZ = rf0Var.f7566a;
                } else {
                    rf0Var.f8587t = 2;
                    rf0Var.f7568d = true;
                    rf0Var.f7570h = zzbvbVar;
                    rf0Var.f7571q.checkAvailabilityAndConnect();
                    rf0Var.f7566a.a(new qf0(rf0Var, 0), nu.f7388f);
                    aVarZ = rf0Var.f7566a;
                }
            } finally {
            }
        }
        return aVarZ;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        try {
            ((wn) this.f8631b).zzf();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public final void onAdFailedToShow(AdError adError) {
        try {
            zzm.zzj("Mediated ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
            ((wn) this.f8631b).E(adError.zza());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        try {
            ((wn) this.f8631b).zzn();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        try {
            ((wn) this.f8631b).zzp();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
    public final void onH5AdsEvent(String str) {
        int i10 = ql.f8210d;
        ((WebView) this.f8631b).evaluateJavascript(str, null);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        try {
            ((wn) this.f8631b).t0(new zs(rewardItem));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoComplete() {
        try {
            ((wn) this.f8631b).zzv();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        try {
            ((wn) this.f8631b).b();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        try {
            ((wn) this.f8631b).zzx();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        try {
            ((wn) this.f8631b).J();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }

    @Override // v3.b
    public final void r(Bundle bundle) {
        bd bdVar;
        cd cdVar;
        synchronized (((bd) this.f8631b).f2988c) {
            try {
                bdVar = (bd) this.f8631b;
                cdVar = bdVar.f2989d;
            } catch (DeadObjectException e10) {
                zzm.zzh("Unable to obtain a cache service instance.", e10);
                bd.c((bd) this.f8631b);
            }
            if (cdVar != null) {
                bdVar.f2991f = cdVar.q();
                ((bd) this.f8631b).f2988c.notifyAll();
            } else {
                ((bd) this.f8631b).f2988c.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        try {
            ((wn) this.f8631b).zze();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        try {
            ((wn) this.f8631b).zzm();
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.android.gms.internal.ads.gt] */
    @Override // com.google.android.gms.internal.ads.rs0
    public final Object zza(Object obj) {
        switch (this.f8630a) {
            case 10:
                kr0 kr0Var = (kr0) obj;
                yz yzVar = ((f30) this.f8631b).f4370d;
                yzVar.getClass();
                for (jr0 jr0Var : (List) kr0Var.f6383b.f10632f) {
                    if (yzVar.f11073a.containsKey(jr0Var.f6068a)) {
                        b00 b00Var = (b00) yzVar.f11073a.get(jr0Var.f6068a);
                        JSONObject jSONObject = jr0Var.f6069b;
                        h00 h00Var = (h00) b00Var;
                        switch (h00Var.f5121a) {
                            case 0:
                                if (jSONObject == null) {
                                    continue;
                                } else if (((Boolean) zzba.zzc().a(eg.f4112q8)).booleanValue()) {
                                    le0 le0Var = (le0) h00Var.f5122b;
                                    synchronized (le0Var) {
                                        le0Var.f6593p = jSONObject;
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                ((gt) ((p80) h00Var.f5122b).f7835d).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
                                break;
                        }
                    } else if (yzVar.f11074b.containsKey(jr0Var.f6068a)) {
                        a00 a00Var = (a00) yzVar.f11074b.get(jr0Var.f6068a);
                        JSONObject jSONObject2 = jr0Var.f6069b;
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String strOptString = jSONObject2.optString(next);
                            if (strOptString != null) {
                                map.put(next, strOptString);
                            }
                        }
                        a00Var.a(map);
                    }
                }
                return kr0Var;
            default:
                lh0.u((SQLiteDatabase) obj, (zzr) this.f8631b);
                return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        int i10 = this.f8630a;
        Object obj = this.f8631b;
        switch (i10) {
            case 17:
                n5.a aVarP = ((t.a) obj).p();
                String str = "persistFlags";
                if (!((Boolean) zzba.zzc().a(eg.T6)).booleanValue()) {
                    b4.f.Z(aVarP, "persistFlags");
                } else {
                    tc1.u0(aVarP, new pu(str), nu.f7388f);
                }
                break;
            default:
                ((a80) obj).d0().onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        Object obj = this.f8631b;
        ((a80) obj).h0().zza();
        ((r70) ((kz) ((a80) obj)).C.zzb()).zza();
    }

    public /* synthetic */ rk0(int i10, Object obj, int i11) {
        this.f8630a = i10;
        this.f8631b = obj;
    }

    public /* synthetic */ rk0(nb1 nb1Var) {
        this.f8630a = 26;
        this.f8631b = nb1Var;
    }

    public rk0() {
        this.f8630a = 1;
        this.f8631b = new p7();
    }

    public rk0(int i10) {
        this.f8630a = i10;
        if (i10 != 24) {
            this.f8631b = new AtomicBoolean(false);
        } else {
            this.f8631b = new int[2];
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(String str) {
        try {
            zzm.zzj("Mediated ad failed to show: " + str);
            ((wn) this.f8631b).l(str);
        } catch (RemoteException unused) {
        }
    }

    public /* synthetic */ rk0(Object obj) {
        this.f8630a = 27;
        this.f8631b = new ArrayDeque();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final void mo8zza(View view) {
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        int i10 = this.f8630a;
        Object obj2 = this.f8631b;
        switch (i10) {
            case 11:
                ((h50) obj).U((r20) obj2);
                break;
            case 12:
                ((p60) obj).S((ve) obj2);
                break;
            case 13:
                ((wb) obj).Z((vb) obj2);
                break;
            case sf.zzm /* 21 */:
                yr yrVar = (yr) ((as) obj2);
                ((qs) obj).Z(new zs(yrVar.f11020a, yrVar.f11021b));
                break;
            case 22:
                ts0 ts0Var = (ts0) obj2;
                ((ys0) obj).k((ws0) ts0Var.f9282a, ts0Var.f9283b);
                break;
            default:
                int i11 = ui1.V;
                ((dk1) obj).c(((sj1) obj2).f8896n);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x03c3, code lost:
    
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a9 A[LOOP:0: B:3:0x000a->B:187:0x03a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03c3 A[EDGE_INSN: B:227:0x03c3->B:188:0x03c3 BREAK  A[LOOP:0: B:3:0x000a->B:187:0x03a9], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.f7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.h7 zza(com.google.android.gms.internal.ads.i7 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rk0.zza(com.google.android.gms.internal.ads.i7):com.google.android.gms.internal.ads.h7");
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final Object mo3zza() {
        return ((SharedPreferences) this.f8631b).getString("flag_configuration", "{}");
    }

    @Override // com.google.android.gms.internal.ads.db1
    public final Object zza(String str) {
        return ((nb1) this.f8631b).c(str, null);
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final n5.a mo3zza() {
        String lowerCase;
        Bundle bundle;
        ko0 ko0Var = (ko0) this.f8631b;
        if (((Boolean) zzba.zzc().a(eg.W9)).booleanValue()) {
            lowerCase = ko0Var.f6347e.f7646f.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = ko0Var.f6347e.f7646f;
        }
        if (((Boolean) zzba.zzc().a(eg.f4135t1)).booleanValue()) {
            ce0 ce0Var = ko0Var.f6350h;
            synchronized (ce0Var) {
                bundle = new Bundle(ce0Var.f3256a);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        ArrayList arrayList = new ArrayList();
        if (!((Boolean) zzba.zzc().a(eg.C1)).booleanValue()) {
            for (Map.Entry entry : (yz0) ko0Var.f6345c.b(ko0Var.f6351i, lowerCase).entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                Bundle bundle3 = ko0Var.f6347e.f7644d.zzm;
                arrayList.add(ko0Var.a(str, list, bundle3 != null ? bundle3.getBundle(str) : null, true, true));
            }
            ko0Var.b(arrayList, ko0Var.f6345c.c());
        } else {
            ko0Var.b(arrayList, ko0Var.f6345c.a(ko0Var.f6351i, lowerCase));
        }
        bz0 bz0VarK = bz0.k(arrayList);
        xa xaVar = new xa(arrayList, 7, bundle2);
        p21 p21Var = ko0Var.f6343a;
        c21 c21Var = new c21(bz0VarK, true, false);
        c21Var.B = new b21(c21Var, xaVar, p21Var);
        c21Var.w();
        return c21Var;
    }

    @Override // com.google.android.gms.internal.ads.pu0
    public final JSONObject zza(View view) {
        if (view == null) {
            return uu0.a(0, 0, 0, 0);
        }
        Object obj = this.f8631b;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen((int[]) obj);
        int[] iArr = (int[]) obj;
        return uu0.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.ay, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: zza */
    public final void mo1zza() {
        int i10 = this.f8630a;
        Object obj = this.f8631b;
        switch (i10) {
            case 5:
                ((y3.b) zzu.zzB()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                pm pmVar = (pm) obj;
                long j10 = pmVar.f7915c;
                Long lValueOf = Long.valueOf(jCurrentTimeMillis - j10);
                ArrayList arrayList = pmVar.f7914b;
                arrayList.add(lValueOf);
                zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                zzt.zza.postDelayed(new nm(pmVar.f7913a, pmVar.f7916d, pmVar.f7917e, arrayList, j10, 0), (long) ((Integer) zzba.zzc().a(eg.f3944b)).intValue());
                break;
            default:
                zze.zza("Rejecting reference for JS Engine.");
                if (((Boolean) zzba.zzc().a(eg.S6)).booleanValue()) {
                    ((tm) obj).m("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                } else {
                    ((tm) obj).l();
                }
                break;
        }
    }
}

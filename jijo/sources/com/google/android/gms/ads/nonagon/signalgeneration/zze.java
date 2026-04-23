package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.hd0;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.nu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import y3.b;

/* JADX INFO: loaded from: classes.dex */
public final class zze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2396a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2397b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hd0 f2399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f2400e;

    public zze(Context context, hd0 hd0Var, mu muVar) {
        this.f2398c = context;
        this.f2399d = hd0Var;
        this.f2400e = muVar;
    }

    public final synchronized void a(final boolean z9, zzg zzgVar) {
        try {
            HashMap map = this.f2396a;
            Boolean boolValueOf = Boolean.valueOf(z9);
            zzg zzgVar2 = (zzg) map.get(boolValueOf);
            if (zzgVar2 == null || zzgVar2.zze() || zzgVar2.zzb() == null || zzgVar.zzb() != null) {
                this.f2396a.put(boolValueOf, zzgVar);
            }
            int iIntValue = (zzgVar.zzb() != null ? (Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.Y8) : (Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.Z8)).intValue();
            final boolean z10 = zzgVar.zzb() == null;
            nu.f7386d.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.d(z9, z10);
                }
            }, iIntValue, TimeUnit.SECONDS);
            List list = (List) this.f2397b.get(boolValueOf);
            this.f2397b.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c(zzgVar, (Pair) it.next(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(final boolean z9) {
        HashMap map = this.f2397b;
        Boolean boolValueOf = Boolean.valueOf(z9);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f2400e.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d(z9, false);
            }
        });
    }

    public final void c(zzg zzgVar, Pair pair, boolean z9) {
        zzgVar.zzd();
        QueryInfo queryInfoZzb = zzgVar.zzb();
        if (queryInfoZzb != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(queryInfoZzb);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzgVar.zzc());
        }
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        pairArr[4] = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue()));
        pairArr[5] = new Pair("sgpc_h", Boolean.toString(z9));
        pairArr[6] = new Pair("sgpc_rs", Boolean.toString(zzgVar.zzb() != null));
        zzq.zzd(this.f2399d, null, "sgpcr", pairArr);
    }

    public final synchronized void d(boolean z9, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z9);
            HashMap map = this.f2396a;
            Boolean boolValueOf = Boolean.valueOf(z9);
            zzg zzgVar = (zzg) map.get(boolValueOf);
            int iZza = (!z10 || zzgVar == null) ? 0 : zzgVar.zza() + 1;
            zzg zzgVar2 = (zzg) this.f2396a.get(boolValueOf);
            final zzf zzfVar = new zzf(this, z9, iZza, zzgVar2 == null ? null : Boolean.valueOf(zzgVar2.zzf()), this.f2399d);
            final AdRequest adRequestBuild = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.ga)).booleanValue()) {
                this.f2400e.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zze zzeVar = this.zza;
                        QueryInfo.generate(zzeVar.f2398c, AdFormat.BANNER, adRequestBuild, zzfVar);
                        return Boolean.TRUE;
                    }
                });
            } else {
                QueryInfo.generate(this.f2398c, AdFormat.BANNER, adRequestBuild, zzfVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        b(true);
        b(false);
    }

    public final synchronized void zzg(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(System.currentTimeMillis()));
        nu.f7387e.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
            @Override // java.lang.Runnable
            public final void run() {
                zze zzeVar = this.zza;
                Object obj2 = obj;
                Pair pair2 = pair;
                zzeVar.getClass();
                boolean zAcceptThirdPartyCookies = false;
                if (obj2 instanceof WebView) {
                    CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzu.zzq().zza(zzeVar.f2398c);
                    if (cookieManagerZza != null) {
                        zAcceptThirdPartyCookies = cookieManagerZza.acceptThirdPartyCookies((WebView) obj2);
                    }
                }
                HashMap map = zzeVar.f2396a;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                zzg zzgVar = (zzg) map.get(boolValueOf);
                if (zzgVar != null && !zzgVar.zze()) {
                    zzeVar.c(zzgVar, pair2, true);
                    return;
                }
                HashMap map2 = zzeVar.f2397b;
                List arrayList = (List) map2.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(boolValueOf, arrayList);
                }
                arrayList.add(pair2);
            }
        });
    }
}

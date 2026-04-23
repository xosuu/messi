package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.hd0;
import y3.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zze f2401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd0 f2402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f2406f;

    public zzf(zze zzeVar, boolean z9, int i10, Boolean bool, hd0 hd0Var) {
        this.f2401a = zzeVar;
        this.f2403c = z9;
        this.f2404d = i10;
        this.f2406f = bool;
        this.f2402b = hd0Var;
        ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        this.f2405e = System.currentTimeMillis();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("sgf_reason", str);
        pairArr[1] = new Pair("se", "query_g");
        pairArr[2] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[3] = new Pair("rtype", Integer.toString(6));
        pairArr[4] = new Pair("scar", "true");
        ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        pairArr[5] = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f2405e));
        pairArr[6] = new Pair("sgpc_rn", Integer.toString(this.f2404d));
        pairArr[7] = new Pair("sgpc_lsu", String.valueOf(this.f2406f));
        boolean z9 = this.f2403c;
        pairArr[8] = new Pair("tpc", true != z9 ? "0" : "1");
        zzq.zzd(this.f2402b, null, "sgpcf", pairArr);
        ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        this.f2401a.a(z9, new zzg(null, str, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.X8)).longValue() + System.currentTimeMillis(), this.f2404d));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        pairArr[4] = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f2405e));
        pairArr[5] = new Pair("sgpc_rn", Integer.toString(this.f2404d));
        pairArr[6] = new Pair("sgpc_lsu", String.valueOf(this.f2406f));
        boolean z9 = this.f2403c;
        pairArr[7] = new Pair("tpc", true != z9 ? "0" : "1");
        zzq.zzd(this.f2402b, null, "sgpcs", pairArr);
        ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        this.f2401a.a(z9, new zzg(queryInfo, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.X8)).longValue() + System.currentTimeMillis(), this.f2404d));
    }
}

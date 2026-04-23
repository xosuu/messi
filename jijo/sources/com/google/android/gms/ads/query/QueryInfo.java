package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.jh;
import com.google.android.gms.internal.ads.xq;

/* JADX INFO: loaded from: classes.dex */
public class QueryInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzem f2436a;

    public QueryInfo(zzem zzemVar) {
        this.f2436a = zzemVar;
    }

    public static void a(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        eg.a(context);
        if (((Boolean) jh.f5948j.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdRequest adRequest2 = adRequest;
                        zzdx zzdxVarZza = adRequest2 == null ? null : adRequest2.zza();
                        new xq(context, adFormat, zzdxVarZza, str, 0).j(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new xq(context, adFormat, adRequest == null ? null : adRequest.zza(), str, 0).j(queryInfoGenerationCallback);
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        a(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.f2436a.zzb();
    }

    public Bundle getQueryBundle() {
        return this.f2436a.zza();
    }

    public String getRequestId() {
        return this.f2436a.zzc();
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        if (str == null) {
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        a(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}

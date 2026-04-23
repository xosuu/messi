package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class rg extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg f8589b;

    public rg(sg sgVar, String str) {
        this.f8588a = str;
        this.f8589b = sgVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        zzm.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            sg sgVar = this.f8589b;
            sgVar.f8856e.a(sgVar.a(this.f8588a, str).toString());
        } catch (JSONException e10) {
            zzm.zzh("Error creating PACT Error Response JSON: ", e10);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            sg sgVar = this.f8589b;
            sgVar.f8856e.a(sgVar.b(this.f8588a, query).toString());
        } catch (JSONException e10) {
            zzm.zzh("Error creating PACT Signal Response JSON: ", e10);
        }
    }
}

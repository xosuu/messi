package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class an implements im, zm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm f2739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f2740b = new HashSet();

    public an(zm zmVar) {
        this.f2739a = zmVar;
    }

    @Override // com.google.android.gms.internal.ads.hm
    public final /* synthetic */ void E(JSONObject jSONObject, String str) {
        b4.f.e0(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void S(String str, wk wkVar) {
        this.f2739a.S(str, wkVar);
        this.f2740b.add(new AbstractMap.SimpleEntry(str, wkVar));
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void T(JSONObject jSONObject, String str) {
        a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void a(String str, String str2) {
        zza(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.hm
    public final void j(String str, Map map) {
        try {
            E(zzay.zzb().zzj(map), str);
        } catch (JSONException unused) {
            zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void z(String str, wk wkVar) {
        this.f2739a.z(str, wkVar);
        this.f2740b.remove(new AbstractMap.SimpleEntry(str, wkVar));
    }

    @Override // com.google.android.gms.internal.ads.im, com.google.android.gms.internal.ads.mm
    public final void zza(String str) {
        this.f2739a.zza(str);
    }
}

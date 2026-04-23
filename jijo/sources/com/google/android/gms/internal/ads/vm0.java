package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vm0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9916c;

    public /* synthetic */ vm0(String str, int i10) {
        this.f9914a = 1;
        this.f9915b = str;
        this.f9916c = i10;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f9914a;
        int i11 = this.f9916c;
        String str = this.f9915b;
        switch (i10) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (!TextUtils.isEmpty(str) && i11 != -1) {
                    Bundle bundleU = tp1.u(bundle, "pii");
                    bundle.putBundle("pii", bundleU);
                    bundleU.putString("pvid", str);
                    bundleU.putInt("pvid_s", i11);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                if (((Boolean) zzba.zzc().a(eg.z9)).booleanValue()) {
                    if (!TextUtils.isEmpty(str)) {
                        bundle2.putString("topics", str);
                    }
                    if (i11 != -1) {
                        bundle2.putInt("atps", i11);
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                if (!TextUtils.isEmpty(str) && i11 != -1) {
                    try {
                        JSONObject jSONObjectZzg = zzbs.zzg(jSONObject, "pii");
                        jSONObjectZzg.put("pvid", str);
                        jSONObjectZzg.put("pvid_s", i11);
                    } catch (JSONException e10) {
                        zze.zzb("Failed putting gms core app set ID info.", e10);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vm0(String str, int i10, int i11) {
        this.f9914a = i11;
        this.f9915b = str;
        this.f9916c = i10;
    }
}

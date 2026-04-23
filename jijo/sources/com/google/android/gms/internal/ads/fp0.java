package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fp0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvertisingIdClient.Info f4593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f4595c;

    public fp0(AdvertisingIdClient.Info info, String str, x1 x1Var) {
        this.f4593a = info;
        this.f4594b = str;
        this.f4595c = x1Var;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        x1 x1Var = this.f4595c;
        try {
            JSONObject jSONObjectZzg = zzbs.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f4593a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.f4594b;
                if (str != null) {
                    jSONObjectZzg.put("pdid", str);
                    jSONObjectZzg.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzg.put("rdid", info.getId());
            jSONObjectZzg.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectZzg.put("idtype", "adid");
            if (x1Var.q()) {
                jSONObjectZzg.put("paidv1_id_android_3p", (String) x1Var.f10400d);
                jSONObjectZzg.put("paidv1_creation_time_android_3p", x1Var.n());
            }
        } catch (JSONException e10) {
            zze.zzb("Failed putting Ad ID.", e10);
        }
    }
}

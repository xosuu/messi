package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dm0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3701b;

    public /* synthetic */ dm0(String str, int i10) {
        this.f3700a = i10;
        this.f3701b = str;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        int i10 = this.f3700a;
        String str = this.f3701b;
        switch (i10) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (str != null) {
                    bundle.putString("arek", str);
                }
                break;
            case 1:
                ((Bundle) obj).putString("ms", str);
                break;
            case 2:
                tp1.i0("omid_v", (Bundle) obj, str);
                break;
            case 3:
                Bundle bundle2 = (Bundle) obj;
                if (!TextUtils.isEmpty(str)) {
                    bundle2.putString("query_info", str);
                    break;
                }
                break;
            case 4:
                try {
                    ((JSONObject) obj).put("ms", str);
                } catch (JSONException e10) {
                    zze.zzb("Failed putting Ad ID.", e10);
                    return;
                }
                break;
            case 5:
                try {
                    JSONObject jSONObjectZzg = zzbs.zzg((JSONObject) obj, "pii");
                    if (!TextUtils.isEmpty(str)) {
                        jSONObjectZzg.put("attok", str);
                    }
                } catch (JSONException e11) {
                    zze.zzb("Failed putting attestation token.", e11);
                    return;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        zzbs.zzg(jSONObject, "pii").put("adsid", str);
                    }
                } catch (JSONException e12) {
                    zzm.zzk("Failed putting trustless token.", e12);
                }
                break;
        }
    }
}

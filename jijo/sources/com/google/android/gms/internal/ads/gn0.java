package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gn0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5000b;

    public /* synthetic */ gn0(int i10, Object obj) {
        this.f4999a = i10;
        this.f5000b = obj;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        boolean z9;
        switch (this.f4999a) {
            case 0:
                ((Bundle) obj).putString("key_schema", ((cq0) ((ul0) this.f5000b).f9531b).f3386a);
                return;
            case 1:
                Bundle bundle = (Bundle) obj;
                if (((er0) this.f5000b) != null) {
                    if (((Boolean) zzba.zzc().a(eg.Wa)).booleanValue()) {
                        return;
                    }
                    er0 er0Var = (er0) this.f5000b;
                    synchronized (er0Var.f4282b) {
                        er0Var.b();
                        z9 = er0Var.f4284d == 2;
                        break;
                    }
                    bundle.putBoolean("render_in_browser", z9);
                    bundle.putBoolean("disable_ml", ((er0) this.f5000b).a());
                    return;
                }
                return;
            case 2:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.f5000b);
                    return;
                } catch (JSONException unused) {
                    zze.zza("Unable to get cache_state");
                    return;
                }
            case 3:
                ip0 ip0Var = (ip0) this.f5000b;
                JSONObject jSONObject = (JSONObject) obj;
                ip0Var.getClass();
                try {
                    jSONObject.put("gms_sdk_env", ip0Var.f5670a);
                    return;
                } catch (JSONException unused2) {
                    zze.zza("Failed putting version constants.");
                    return;
                }
            case 4:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.f5000b));
                    return;
                } catch (JSONException unused3) {
                    zze.zza("Failed putting experiment ids.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", zzay.zzb().zzj((Map) this.f5000b));
                    return;
                } catch (JSONException e10) {
                    zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
                    return;
                }
        }
    }
}

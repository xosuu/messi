package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class mm0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f7007b;

    public /* synthetic */ mm0(int i10, Bundle bundle) {
        this.f7006a = i10;
        this.f7007b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        int i10 = this.f7006a;
        Bundle bundle = this.f7007b;
        switch (i10) {
            case 0:
                Bundle bundle2 = (Bundle) obj;
                if (!bundle.isEmpty()) {
                    bundle2.putBundle("installed_adapter_data", bundle);
                }
                break;
            case 1:
                ((Bundle) obj).putBundle("content_info", bundle);
                break;
            case 2:
                Bundle bundle3 = (Bundle) obj;
                Bundle bundleU = tp1.u(bundle3, "device");
                bundleU.putBundle("android_mem_info", bundle);
                bundle3.putBundle("device", bundleU);
                break;
            case 3:
                Bundle bundle4 = (Bundle) obj;
                if (bundle != null) {
                    bundle4.putAll(bundle);
                }
                break;
            case 4:
                ((Bundle) obj).putBundle("shared_pref", bundle);
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                if (bundle != null) {
                    try {
                        zzbs.zzg(zzbs.zzg(jSONObject, "device"), "play_store").put("parental_controls", zzay.zzb().zzi(bundle));
                    } catch (JSONException unused) {
                        zze.zza("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }
}

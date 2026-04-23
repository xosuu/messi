package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class io0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5662c;

    public /* synthetic */ io0(int i10, String str, String str2) {
        this.f5660a = i10;
        this.f5661b = str;
        this.f5662c = str2;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f5660a;
        String str = this.f5662c;
        String str2 = this.f5661b;
        switch (i10) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (!((Boolean) zzba.zzc().a(eg.f4061l6)).booleanValue()) {
                    bundle.putString("request_id", str2);
                } else {
                    bundle.putString("request_id", str);
                }
                break;
            default:
                try {
                    JSONObject jSONObjectZzg = zzbs.zzg((JSONObject) obj, "pii");
                    jSONObjectZzg.put("doritos", str2);
                    jSONObjectZzg.put("doritos_v2", str);
                } catch (JSONException unused) {
                    zze.zza("Failed putting doritos string.");
                }
                break;
        }
    }
}

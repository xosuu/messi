package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg0 implements gx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3646a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbvb f3647b;

    public /* synthetic */ dg0(zzbvb zzbvbVar) {
        this.f3647b = zzbvbVar;
    }

    @Override // com.google.android.gms.internal.ads.gx0
    public final Object apply(Object obj) {
        int i10 = this.f3646a;
        zzbvb zzbvbVar = this.f3647b;
        switch (i10) {
            case 0:
                String string = zzbvbVar.f11574a.getString("ms");
                if (string == null) {
                    string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                ApplicationInfo applicationInfo = zzbvbVar.f11576d;
                String str = zzbvbVar.f11581t;
                String str2 = zzbvbVar.f11577f;
                List list = zzbvbVar.f11578h;
                return new zzbuc(applicationInfo, str2, zzbvbVar.f11579q, string, -1, str, list, zzbvbVar.f11584w, zzbvbVar.f11585x);
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbvbVar.f11574a;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectZzi = zzay.zzb().zzi(bundle);
                    try {
                        zzay.zzb().zzl(jSONObject, jSONObjectZzi);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectZzi;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
        }
    }

    public /* synthetic */ dg0(zzbvb zzbvbVar, int i10) {
        this.f3647b = zzbvbVar;
    }
}

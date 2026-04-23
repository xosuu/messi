package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.xf;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CsiParamDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2432c;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel) {
        this.f2430a = context;
        this.f2431b = context.getPackageName();
        this.f2432c = versionInfoParcel.afmaVersion;
    }

    public void set(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzu.zzp();
        map.put("device", zzt.zzr());
        map.put("app", this.f2431b);
        zzu.zzp();
        Context context = this.f2430a;
        map.put("is_lite_sdk", true != zzt.zzE(context) ? "0" : "1");
        xf xfVar = eg.f3933a;
        ArrayList arrayListB = zzba.zza().b();
        if (((Boolean) zzba.zzc().a(eg.f4040j6)).booleanValue()) {
            arrayListB.addAll(zzu.zzo().d().zzh().f3448i);
        }
        map.put("e", TextUtils.join(",", arrayListB));
        map.put("sdkVersion", this.f2432c);
        if (((Boolean) zzba.zzc().a(eg.ua)).booleanValue()) {
            zzu.zzp();
            map.put("is_bstar", true != zzt.zzB(context) ? "0" : "1");
        }
        if (((Boolean) zzba.zzc().a(eg.A8)).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.Z1)).booleanValue()) {
                String str = zzu.zzo().f5060g;
                if (str == null) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                map.put("plugin", str);
            }
        }
    }
}

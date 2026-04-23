package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.kd;
import com.google.android.gms.internal.ads.mu0;
import com.google.android.gms.internal.ads.np;
import com.google.android.gms.internal.ads.qh0;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.vx;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(sf.zzm)
public class zzu extends zzab {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzu.zzp();
        if (zzt.zzF()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzu.zzo().h("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final WebResourceResponse zzb(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final ix zzc(fx fxVar, kd kdVar, boolean z9, qh0 qh0Var) {
        return new vx(fxVar, kdVar, z9, new np(fxVar, fxVar.zzE(), new mu0(fxVar.getContext())), qh0Var);
    }
}

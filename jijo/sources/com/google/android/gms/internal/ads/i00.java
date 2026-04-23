package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i00 implements a00 {
    @Override // com.google.android.gms.internal.ads.a00
    public final void a(HashMap map) {
        if (!((Boolean) zzba.zzc().a(eg.z9)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzu.zzo().d().zzJ(Boolean.parseBoolean(str));
    }
}

package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import com.google.android.gms.internal.ads.fh;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CsiUrlBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2435a = (String) fh.f4525a.k();

    public String generateUrl(Map<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f2435a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.ct;
import com.google.android.gms.internal.ads.dt;
import com.google.android.gms.internal.ads.zzbue;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt f2218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzbue f2219d = new zzbue(Collections.emptyList(), false);

    public zzb(Context context, dt dtVar, zzbue zzbueVar) {
        this.f2216a = context;
        this.f2218c = dtVar;
    }

    public final void zza() {
        this.f2217b = true;
    }

    public final void zzb(String str) {
        List<String> list;
        zzbue zzbueVar = this.f2219d;
        dt dtVar = this.f2218c;
        if ((dtVar == null || !((ct) dtVar).f3417g.f11598q) && !zzbueVar.f11563a) {
            return;
        }
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (dtVar != null) {
            ((ct) dtVar).a(str, null, 3);
            return;
        }
        if (!zzbueVar.f11563a || (list = zzbueVar.f11564b) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzL(this.f2216a, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, strReplace);
            }
        }
    }

    public final boolean zzc() {
        dt dtVar = this.f2218c;
        return ((dtVar == null || !((ct) dtVar).f3417g.f11598q) && !this.f2219d.f11563a) || this.f2217b;
    }
}

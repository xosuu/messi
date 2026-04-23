package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class bm0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final or0 f3059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3060b;

    public bm0(or0 or0Var, long j10) {
        if (or0Var == null) {
            throw new NullPointerException("the targeting must not be null");
        }
        this.f3059a = or0Var;
        this.f3060b = j10;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        or0 or0Var = this.f3059a;
        zzl zzlVar = or0Var.f7644d;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", or0Var.f7646f);
        int i10 = or0Var.f7655o.f1331b;
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i11 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f3060b);
        tp1.p0(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb != -1);
        Bundle bundle2 = zzlVar.zzc;
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i12 = zzlVar.zzd;
        if (i12 != -1) {
            bundle.putInt("cust_gender", i12);
        }
        List list = zzlVar.zze;
        if (list != null) {
            bundle.putStringArrayList("kw", new ArrayList<>(list));
        }
        int i13 = zzlVar.zzg;
        if (i13 != -1) {
            bundle.putInt("tag_for_child_directed_treatment", i13);
        }
        if (zzlVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzlVar.zzy);
        if (zzlVar.zza >= 2 && zzlVar.zzh) {
            bundle.putInt("d_imp_hdr", 1);
        }
        String str = zzlVar.zzi;
        tp1.p0(bundle, "ppid", str, zzlVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzlVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = location.getLongitude() * 1.0E7d;
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        tp1.i0("url", bundle, zzlVar.zzl);
        List list2 = zzlVar.zzv;
        if (list2 != null) {
            bundle.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
        }
        Bundle bundle4 = zzlVar.zzn;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        List list3 = zzlVar.zzo;
        if (list3 != null) {
            bundle.putStringArrayList("category_exclusions", new ArrayList<>(list3));
        }
        tp1.i0("request_agent", bundle, zzlVar.zzp);
        tp1.i0("request_pkg", bundle, zzlVar.zzq);
        tp1.r0(bundle, "is_designed_for_families", zzlVar.zzr, zzlVar.zza >= 7);
        if (zzlVar.zza >= 8) {
            int i14 = zzlVar.zzt;
            if (i14 != -1) {
                bundle.putInt("tag_for_under_age_of_consent", i14);
            }
            tp1.i0("max_ad_content_rating", bundle, zzlVar.zzu);
        }
    }
}

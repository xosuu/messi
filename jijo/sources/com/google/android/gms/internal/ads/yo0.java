package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yo0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f10966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f10968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f10969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f10971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f10972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10975q;

    public yo0(boolean z9, boolean z10, String str, boolean z11, boolean z12, boolean z13, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z14, String str6, long j10, boolean z15, String str7, int i10) {
        this.f10959a = z9;
        this.f10960b = z10;
        this.f10961c = str;
        this.f10962d = z11;
        this.f10963e = z12;
        this.f10964f = z13;
        this.f10965g = str2;
        this.f10966h = arrayList;
        this.f10967i = str3;
        this.f10968j = str4;
        this.f10969k = str5;
        this.f10970l = z14;
        this.f10971m = str6;
        this.f10972n = j10;
        this.f10973o = z15;
        this.f10974p = str7;
        this.f10975q = i10;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f10959a);
        bundle.putBoolean("coh", this.f10960b);
        bundle.putString("gl", this.f10961c);
        bundle.putBoolean("simulator", this.f10962d);
        bundle.putBoolean("is_latchsky", this.f10963e);
        bundle.putInt("build_api_level", this.f10975q);
        if (!((Boolean) zzba.zzc().a(eg.da)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f10964f);
        }
        bundle.putString("hl", this.f10965g);
        ArrayList<String> arrayList = this.f10966h;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("mv", this.f10967i);
        bundle.putString("submodel", this.f10971m);
        Bundle bundleU = tp1.u(bundle, "device");
        bundle.putBundle("device", bundleU);
        bundleU.putString("build", this.f10969k);
        bundleU.putLong("remaining_data_partition_space", this.f10972n);
        Bundle bundleU2 = tp1.u(bundleU, "browser");
        bundleU.putBundle("browser", bundleU2);
        bundleU2.putBoolean("is_browser_custom_tabs_capable", this.f10970l);
        String str = this.f10968j;
        if (!TextUtils.isEmpty(str)) {
            Bundle bundleU3 = tp1.u(bundleU, "play_store");
            bundleU.putBundle("play_store", bundleU3);
            bundleU3.putString("package_version", str);
        }
        if (((Boolean) zzba.zzc().a(eg.va)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f10973o);
        }
        String str2 = this.f10974p;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("v_unity", str2);
        }
        if (((Boolean) zzba.zzc().a(eg.oa)).booleanValue()) {
            tp1.r0(bundle, "gotmt_l", true, ((Boolean) zzba.zzc().a(eg.la)).booleanValue());
            tp1.r0(bundle, "gotmt_i", true, ((Boolean) zzba.zzc().a(eg.ka)).booleanValue());
        }
    }
}

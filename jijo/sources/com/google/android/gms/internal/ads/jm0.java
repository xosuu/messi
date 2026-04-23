package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jm0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzq f5992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f5996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6000i;

    public jm0(zzq zzqVar, String str, boolean z9, String str2, float f10, int i10, int i11, String str3, boolean z10) {
        this.f5992a = zzqVar;
        this.f5993b = str;
        this.f5994c = z9;
        this.f5995d = str2;
        this.f5996e = f10;
        this.f5997f = i10;
        this.f5998g = i11;
        this.f5999h = str3;
        this.f6000i = z10;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzq zzqVar = this.f5992a;
        tp1.p0(bundle, "smart_w", "full", zzqVar.zze == -1);
        tp1.p0(bundle, "smart_h", "auto", zzqVar.zzb == -2);
        tp1.r0(bundle, "ene", true, zzqVar.zzj);
        tp1.p0(bundle, "rafmt", "102", zzqVar.zzm);
        tp1.p0(bundle, "rafmt", "103", zzqVar.zzn);
        tp1.p0(bundle, "rafmt", "105", zzqVar.zzo);
        tp1.r0(bundle, "inline_adaptive_slot", true, this.f6000i);
        tp1.r0(bundle, "interscroller_slot", true, zzqVar.zzo);
        tp1.i0("format", bundle, this.f5993b);
        tp1.p0(bundle, "fluid", "height", this.f5994c);
        tp1.p0(bundle, "sz", this.f5995d, !TextUtils.isEmpty(r1));
        bundle.putFloat("u_sd", this.f5996e);
        bundle.putInt("sw", this.f5997f);
        bundle.putInt("sh", this.f5998g);
        tp1.p0(bundle, "sc", this.f5999h, !TextUtils.isEmpty(r1));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", zzqVar.zzb);
            bundle2.putInt("width", zzqVar.zze);
            bundle2.putBoolean("is_fluid_height", zzqVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzq zzqVar2 : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar2.zzi);
                bundle3.putInt("height", zzqVar2.zzb);
                bundle3.putInt("width", zzqVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}

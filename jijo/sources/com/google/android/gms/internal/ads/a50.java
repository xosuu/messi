package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a50 implements s60, b60, fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ as f2589b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2590d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2591f;

    public /* synthetic */ a50(as asVar, String str, String str2, int i10) {
        this.f2588a = i10;
        this.f2589b = asVar;
        this.f2590d = str;
        this.f2591f = str2;
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        int i10 = this.f2588a;
        String str = this.f2591f;
        String str2 = this.f2590d;
        as asVar = this.f2589b;
        switch (i10) {
            case 0:
                ((k40) obj).n(asVar, str2, str);
                break;
            case 1:
                ((wq0) obj).n(asVar, str2, str);
                break;
            case 2:
                vs vsVar = (vs) obj;
                yr yrVar = (yr) asVar;
                zs zsVar = new zs(yrVar.f11020a, yrVar.f11021b);
                Parcel parcelM = vsVar.m();
                qb.e(parcelM, zsVar);
                parcelM.writeString(str2);
                parcelM.writeString(str);
                vsVar.a0(parcelM, 2);
                break;
            default:
                bs bsVar = (bs) obj;
                Parcel parcelM2 = bsVar.m();
                qb.e(parcelM2, asVar);
                parcelM2.writeString(str2);
                parcelM2.writeString(str);
                bsVar.a0(parcelM2, 2);
                break;
        }
    }
}

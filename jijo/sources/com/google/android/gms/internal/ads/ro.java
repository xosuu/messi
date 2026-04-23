package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class ro extends ob implements so {
    public ro(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.so
    public final void D(yn ynVar) {
        Parcel parcelM = m();
        qb.e(parcelM, ynVar);
        a0(parcelM, 4);
    }

    @Override // com.google.android.gms.internal.ads.so
    public final void a(String str) {
        Parcel parcelM = m();
        parcelM.writeString("Adapter returned null.");
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.internal.ads.so
    public final void j(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.so
    public final void zzf(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 3);
    }
}

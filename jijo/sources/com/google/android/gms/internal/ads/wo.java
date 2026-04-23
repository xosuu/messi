package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class wo extends ob implements xo {
    public wo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final void a(String str) {
        Parcel parcelM = m();
        parcelM.writeString("Adapter returned null.");
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final void i1(eo eoVar) {
        Parcel parcelM = m();
        qb.e(parcelM, eoVar);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final void zzf(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 3);
    }
}

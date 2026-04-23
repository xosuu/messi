package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class xi extends ob implements zi {
    public xi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final void zzb(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final void zzc(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final void zzd() {
        a0(m(), 2);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class kl extends ob implements ml {
    public kl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.ml
    public final void zze() {
        a0(m(), 2);
    }

    @Override // com.google.android.gms.internal.ads.ml
    public final void zzf(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 1);
    }
}

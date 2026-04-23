package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class ss extends ob implements us {
    public ss(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.us
    public final void zze(int i10) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.internal.ads.us
    public final void zzf(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.us
    public final void zzg() {
        a0(m(), 1);
    }
}

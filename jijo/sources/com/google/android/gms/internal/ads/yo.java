package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class yo extends ob implements zo {
    public yo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zo
    public final void a(String str) {
        Parcel parcelM = m();
        parcelM.writeString("Adapter returned null.");
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.zo
    public final void zzf(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 4);
    }

    @Override // com.google.android.gms.internal.ads.zo
    public final void zzg() {
        a0(m(), 2);
    }
}

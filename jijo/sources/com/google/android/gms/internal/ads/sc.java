package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class sc extends ob implements uc {
    @Override // com.google.android.gms.internal.ads.uc
    public final void Z0(rc rcVar) {
        Parcel parcelM = m();
        qb.e(parcelM, rcVar);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.uc
    public final void q0(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.uc
    public final void zzb(int i10) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        a0(parcelM, 2);
    }
}

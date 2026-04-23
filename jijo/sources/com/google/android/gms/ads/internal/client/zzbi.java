package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public final class zzbi extends ob implements zzbk {
    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        a0(m(), 1);
    }
}

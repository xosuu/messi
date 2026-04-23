package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class cp extends ob implements dp {
    @Override // com.google.android.gms.internal.ads.dp
    public final void H(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final void a(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final void zzf(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 2);
    }
}

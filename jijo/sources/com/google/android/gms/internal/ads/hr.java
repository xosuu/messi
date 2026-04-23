package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class hr extends ob implements ir {
    @Override // com.google.android.gms.internal.ads.ir
    public final void G(String str, pr prVar) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        qb.e(parcelM, prVar);
        a0(parcelM, 7);
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final void O(zzbvb zzbvbVar, pr prVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzbvbVar);
        qb.e(parcelM, prVar);
        a0(parcelM, 4);
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final void W0(zzbvb zzbvbVar, pr prVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzbvbVar);
        qb.e(parcelM, prVar);
        a0(parcelM, 6);
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final void v0(zzbvb zzbvbVar, pr prVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzbvbVar);
        qb.e(parcelM, prVar);
        a0(parcelM, 5);
    }
}

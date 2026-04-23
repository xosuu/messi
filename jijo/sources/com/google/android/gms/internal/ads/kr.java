package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class kr extends ob implements lr {
    @Override // com.google.android.gms.internal.ads.lr
    public final void i0(zzbug zzbugVar, nr nrVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzbugVar);
        qb.e(parcelM, nrVar);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void z(zzbuc zzbucVar, nr nrVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzbucVar);
        qb.e(parcelM, nrVar);
        a0(parcelM, 1);
    }
}

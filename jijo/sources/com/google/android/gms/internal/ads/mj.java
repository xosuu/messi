package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class mj extends ob implements oj {
    @Override // com.google.android.gms.internal.ads.oj
    public final void l0(gj gjVar, String str) {
        Parcel parcelM = m();
        qb.e(parcelM, gjVar);
        parcelM.writeString(str);
        a0(parcelM, 1);
    }
}

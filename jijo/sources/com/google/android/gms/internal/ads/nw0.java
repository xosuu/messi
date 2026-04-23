package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class nw0 extends ob implements pw0 {
    @Override // com.google.android.gms.internal.ads.pw0
    public final void R(Bundle bundle, vw0 vw0Var) {
        Parcel parcelM = m();
        qb.c(parcelM, bundle);
        qb.e(parcelM, vw0Var);
        u1(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void f1(Bundle bundle, vw0 vw0Var) {
        Parcel parcelM = m();
        qb.c(parcelM, bundle);
        qb.e(parcelM, vw0Var);
        u1(parcelM, 2);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void z0(String str, Bundle bundle, vw0 vw0Var) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        qb.c(parcelM, bundle);
        qb.e(parcelM, vw0Var);
        u1(parcelM, 1);
    }
}

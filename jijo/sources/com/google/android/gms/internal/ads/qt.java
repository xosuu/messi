package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class qt extends ob implements rt {
    @Override // com.google.android.gms.internal.ads.rt
    public final void t1(String str, Bundle bundle, String str2) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        qb.c(parcelM, bundle);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.rt
    public final void zzb(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 2);
    }
}

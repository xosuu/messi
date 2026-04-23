package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class il extends ob implements jl {
    @Override // com.google.android.gms.internal.ads.jl
    public final void zzb(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 1);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class bk extends ob implements dk {
    @Override // com.google.android.gms.internal.ads.dk
    public final void zze() {
        a0(m(), 2);
    }

    @Override // com.google.android.gms.internal.ads.dk
    public final void zzf(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 1);
    }
}

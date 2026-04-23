package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class cm extends ob implements dm {
    @Override // com.google.android.gms.internal.ads.dm
    public final void zze(int i10) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.internal.ads.dm
    public final void zzf() {
        a0(m(), 1);
    }
}

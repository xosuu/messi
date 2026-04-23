package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class vl extends ob implements wl {
    @Override // com.google.android.gms.internal.ads.wl
    public final void a(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.wl
    public final void zzf() {
        a0(m(), 2);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class js extends ob implements ks {
    public js(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.ks
    public final int zze() {
        Parcel parcelT = t(m(), 2);
        int i10 = parcelT.readInt();
        parcelT.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.ks
    public final String zzf() {
        Parcel parcelT = t(m(), 1);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }
}

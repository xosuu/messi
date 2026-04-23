package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;

/* JADX INFO: loaded from: classes.dex */
public final class zzcu extends ob implements zzcw {
    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zze() {
        Parcel parcelT = t(m(), 1);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zzf() {
        Parcel parcelT = t(m(), 2);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }
}

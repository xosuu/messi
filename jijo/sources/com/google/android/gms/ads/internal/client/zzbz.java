package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;

/* JADX INFO: loaded from: classes.dex */
public final class zzbz extends ob implements zzcb {
    public zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzc(String str, String str2) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        a0(parcelM, 1);
    }
}

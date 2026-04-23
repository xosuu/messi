package com.google.android.gms.ads.internal.client;

import a4.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public final class zzcp extends ob implements IInterface {
    public zzcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder zze(a aVar, int i10) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 1);
        IBinder strongBinder = parcelT.readStrongBinder();
        parcelT.recycle();
        return strongBinder;
    }
}

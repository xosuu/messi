package com.google.android.gms.ads.internal.client;

import a4.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public final class zzbr extends ob implements IInterface {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder zze(a aVar, String str, rn rnVar, int i10) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        parcelM.writeString(str);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 1);
        IBinder strongBinder = parcelT.readStrongBinder();
        parcelT.recycle();
        return strongBinder;
    }
}

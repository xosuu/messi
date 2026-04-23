package com.google.android.gms.ads.internal.client;

import a4.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public final class zzbv extends ob implements IInterface {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(a aVar, zzq zzqVar, String str, rn rnVar, int i10, int i11) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzqVar);
        parcelM.writeString(str);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        parcelM.writeInt(i11);
        Parcel parcelT = t(parcelM, 2);
        IBinder strongBinder = parcelT.readStrongBinder();
        parcelT.recycle();
        return strongBinder;
    }
}

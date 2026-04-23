package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class rs extends ob {
    public final IBinder zze(a4.a aVar, String str, rn rnVar, int i10) {
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

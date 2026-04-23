package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class bq extends ob implements dq {
    public final aq v1(a4.b bVar, rn rnVar) {
        aq ypVar;
        Parcel parcelM = m();
        qb.e(parcelM, bVar);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 1);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            ypVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            ypVar = iInterfaceQueryLocalInterface instanceof aq ? (aq) iInterfaceQueryLocalInterface : new yp(strongBinder);
        }
        parcelT.recycle();
        return ypVar;
    }
}

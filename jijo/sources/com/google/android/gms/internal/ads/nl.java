package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class nl extends ob implements pl {
    public final ml v1(a4.b bVar, rn rnVar, hl hlVar) {
        ml klVar;
        Parcel parcelM = m();
        qb.e(parcelM, bVar);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        qb.e(parcelM, hlVar);
        Parcel parcelT = t(parcelM, 1);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            klVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            klVar = iInterfaceQueryLocalInterface instanceof ml ? (ml) iInterfaceQueryLocalInterface : new kl(strongBinder);
        }
        parcelT.recycle();
        return klVar;
    }
}

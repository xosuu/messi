package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class vt extends ob implements xt {
    public final ut v1(a4.b bVar, rn rnVar) {
        ut stVar;
        Parcel parcelM = m();
        qb.e(parcelM, bVar);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 2);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            stVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            stVar = iInterfaceQueryLocalInterface instanceof ut ? (ut) iInterfaceQueryLocalInterface : new st(strongBinder);
        }
        parcelT.recycle();
        return stVar;
    }
}

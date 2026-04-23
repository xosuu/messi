package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzck extends pb implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcl asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface : new zzcj(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            qb.d(parcel2, liteSdkVersion);
        } else {
            if (i10 != 2) {
                return false;
            }
            rn adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            qb.e(parcel2, adapterCreator);
        }
        return true;
    }
}

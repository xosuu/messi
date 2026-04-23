package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class yi extends pb implements zi {
    public yi() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zi zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof zi ? (zi) iInterfaceQueryLocalInterface : new xi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            a4.a aVarT = a4.b.t(parcel.readStrongBinder());
            qb.b(parcel);
            zzc(aVarT);
        } else if (i10 == 2) {
            zzd();
        } else {
            if (i10 != 3) {
                return false;
            }
            a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
            qb.b(parcel);
            zzb(aVarT2);
        }
        parcel2.writeNoException();
        return true;
    }
}

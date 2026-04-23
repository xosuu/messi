package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class wj extends pb implements xj {
    public wj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        gk ekVar;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            ekVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            ekVar = iInterfaceQueryLocalInterface instanceof gk ? (gk) iInterfaceQueryLocalInterface : new ek(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        }
        qb.b(parcel);
        L0(ekVar);
        parcel2.writeNoException();
        return true;
    }
}

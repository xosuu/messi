package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ii extends pb implements ji {
    public static ji u1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof ji ? (ji) iInterfaceQueryLocalInterface : new hi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((ci) this).f3286a);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        ArrayList arrayList = ((ci) this).f3288d;
        parcel2.writeNoException();
        parcel2.writeList(arrayList);
        return true;
    }
}

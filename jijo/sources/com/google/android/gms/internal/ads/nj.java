package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class nj extends pb implements oj {
    public nj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        gj fjVar;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            fjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            fjVar = iInterfaceQueryLocalInterface instanceof gj ? (gj) iInterfaceQueryLocalInterface : new fj(strongBinder);
        }
        String string = parcel.readString();
        qb.b(parcel);
        l0(fjVar, string);
        parcel2.writeNoException();
        return true;
    }
}

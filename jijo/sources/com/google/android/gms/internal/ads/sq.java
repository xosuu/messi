package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class sq extends pb implements tq {
    public sq() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static tq u1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof tq ? (tq) iInterfaceQueryLocalInterface : new rq(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            qb.b(parcel);
            h0(arrayListCreateTypedArrayList);
        } else {
            if (i10 != 2) {
                return false;
            }
            String string = parcel.readString();
            qb.b(parcel);
            a(string);
        }
        parcel2.writeNoException();
        return true;
    }
}

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzdv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        int iT = 0;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            if (((char) i10) != 2) {
                z.F(parcel, i10);
            } else {
                iT = z.t(parcel, i10);
            }
        }
        z.i(parcel, iH);
        return new zzdu(iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdu[i10];
    }
}

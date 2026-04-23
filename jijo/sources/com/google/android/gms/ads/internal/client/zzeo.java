package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzeo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        String strE = null;
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iT = z.t(parcel, i10);
            } else if (c10 == 2) {
                iT2 = z.t(parcel, i10);
            } else if (c10 != 3) {
                z.F(parcel, i10);
            } else {
                strE = z.e(parcel, i10);
            }
        }
        z.i(parcel, iH);
        return new zzen(iT, iT2, strE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzen[i10];
    }
}

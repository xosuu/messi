package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzfi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        String strE = null;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            if (((char) i10) != 15) {
                z.F(parcel, i10);
            } else {
                strE = z.e(parcel, i10);
            }
        }
        z.i(parcel, iH);
        return new zzfh(strE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfh[i10];
    }
}

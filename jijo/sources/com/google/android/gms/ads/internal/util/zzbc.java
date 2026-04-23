package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        int iT = 0;
        String strE = null;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strE = z.e(parcel, i10);
            } else if (c10 != 2) {
                z.F(parcel, i10);
            } else {
                iT = z.t(parcel, i10);
            }
        }
        z.i(parcel, iH);
        return new zzbb(strE, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbb[i10];
    }
}

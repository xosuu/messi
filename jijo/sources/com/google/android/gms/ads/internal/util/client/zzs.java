package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        String strE = null;
        int iT = 0;
        int iT2 = 0;
        boolean zR = false;
        boolean zR2 = false;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strE = z.e(parcel, i10);
            } else if (c10 == 3) {
                iT = z.t(parcel, i10);
            } else if (c10 == 4) {
                iT2 = z.t(parcel, i10);
            } else if (c10 == 5) {
                zR = z.r(parcel, i10);
            } else if (c10 != 6) {
                z.F(parcel, i10);
            } else {
                zR2 = z.r(parcel, i10);
            }
        }
        z.i(parcel, iH);
        return new VersionInfoParcel(strE, iT, iT2, zR, zR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new VersionInfoParcel[i10];
    }
}

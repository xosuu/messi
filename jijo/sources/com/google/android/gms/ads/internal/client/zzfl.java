package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzfl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        boolean zR = false;
        boolean zR2 = false;
        boolean zR3 = false;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                zR = z.r(parcel, i10);
            } else if (c10 == 3) {
                zR2 = z.r(parcel, i10);
            } else if (c10 != 4) {
                z.F(parcel, i10);
            } else {
                zR3 = z.r(parcel, i10);
            }
        }
        z.i(parcel, iH);
        return new zzfk(zR, zR2, zR3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfk[i10];
    }
}

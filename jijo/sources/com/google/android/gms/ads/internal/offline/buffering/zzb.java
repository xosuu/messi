package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        String strE = null;
        String strE2 = null;
        String strE3 = null;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strE = z.e(parcel, i10);
            } else if (c10 == 2) {
                strE2 = z.e(parcel, i10);
            } else if (c10 != 3) {
                z.F(parcel, i10);
            } else {
                strE3 = z.e(parcel, i10);
            }
        }
        z.i(parcel, iH);
        return new zza(strE, strE2, strE3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zza[i10];
    }
}

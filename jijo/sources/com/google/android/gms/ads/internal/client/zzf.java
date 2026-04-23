package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        String strE = null;
        String strE2 = null;
        zze zzeVar = null;
        IBinder iBinderS = null;
        int iT = 0;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iT = z.t(parcel, i10);
            } else if (c10 == 2) {
                strE = z.e(parcel, i10);
            } else if (c10 == 3) {
                strE2 = z.e(parcel, i10);
            } else if (c10 == 4) {
                zzeVar = (zze) z.d(parcel, i10, zze.CREATOR);
            } else if (c10 != 5) {
                z.F(parcel, i10);
            } else {
                iBinderS = z.s(parcel, i10);
            }
        }
        z.i(parcel, iH);
        return new zze(iT, strE, strE2, zzeVar, iBinderS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zze[i10];
    }
}

package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        IBinder iBinderS = null;
        IBinder iBinderS2 = null;
        boolean zR = false;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                zR = z.r(parcel, i10);
            } else if (c10 == 2) {
                iBinderS = z.s(parcel, i10);
            } else if (c10 != 3) {
                z.F(parcel, i10);
            } else {
                iBinderS2 = z.s(parcel, i10);
            }
        }
        z.i(parcel, iH);
        return new PublisherAdViewOptions(zR, iBinderS, iBinderS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublisherAdViewOptions[i10];
    }
}

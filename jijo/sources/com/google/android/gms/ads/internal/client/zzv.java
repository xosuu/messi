package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        String strE = null;
        zze zzeVar = null;
        Bundle bundleB = null;
        String strE2 = null;
        String strE3 = null;
        String strE4 = null;
        String strE5 = null;
        long jV = 0;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strE = z.e(parcel, i10);
                    break;
                case 2:
                    jV = z.v(parcel, i10);
                    break;
                case 3:
                    zzeVar = (zze) z.d(parcel, i10, zze.CREATOR);
                    break;
                case 4:
                    bundleB = z.b(parcel, i10);
                    break;
                case 5:
                    strE2 = z.e(parcel, i10);
                    break;
                case 6:
                    strE3 = z.e(parcel, i10);
                    break;
                case 7:
                    strE4 = z.e(parcel, i10);
                    break;
                case '\b':
                    strE5 = z.e(parcel, i10);
                    break;
                default:
                    z.F(parcel, i10);
                    break;
            }
        }
        z.i(parcel, iH);
        return new zzu(strE, jV, zzeVar, bundleB, strE2, strE3, strE4, strE5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}

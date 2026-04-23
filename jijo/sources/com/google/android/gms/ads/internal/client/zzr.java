package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        String strE = null;
        zzq[] zzqVarArr = null;
        int iT = 0;
        int iT2 = 0;
        boolean zR = false;
        int iT3 = 0;
        int iT4 = 0;
        boolean zR2 = false;
        boolean zR3 = false;
        boolean zR4 = false;
        boolean zR5 = false;
        boolean zR6 = false;
        boolean zR7 = false;
        boolean zR8 = false;
        boolean zR9 = false;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strE = z.e(parcel, i10);
                    break;
                case 3:
                    iT = z.t(parcel, i10);
                    break;
                case 4:
                    iT2 = z.t(parcel, i10);
                    break;
                case 5:
                    zR = z.r(parcel, i10);
                    break;
                case 6:
                    iT3 = z.t(parcel, i10);
                    break;
                case 7:
                    iT4 = z.t(parcel, i10);
                    break;
                case '\b':
                    zzqVarArr = (zzq[]) z.h(parcel, i10, zzq.CREATOR);
                    break;
                case '\t':
                    zR2 = z.r(parcel, i10);
                    break;
                case '\n':
                    zR3 = z.r(parcel, i10);
                    break;
                case 11:
                    zR4 = z.r(parcel, i10);
                    break;
                case '\f':
                    zR5 = z.r(parcel, i10);
                    break;
                case '\r':
                    zR6 = z.r(parcel, i10);
                    break;
                case 14:
                    zR7 = z.r(parcel, i10);
                    break;
                case 15:
                    zR8 = z.r(parcel, i10);
                    break;
                case 16:
                    zR9 = z.r(parcel, i10);
                    break;
                default:
                    z.F(parcel, i10);
                    break;
            }
        }
        z.i(parcel, iH);
        return new zzq(strE, iT, iT2, zR, iT3, iT4, zzqVarArr, zR2, zR3, zR4, zR5, zR6, zR7, zR8, zR9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}

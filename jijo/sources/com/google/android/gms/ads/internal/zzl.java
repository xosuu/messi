package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        String strE = null;
        boolean zR = false;
        boolean zR2 = false;
        boolean zR3 = false;
        float f10 = 0.0f;
        int iT = 0;
        boolean zR4 = false;
        boolean zR5 = false;
        boolean zR6 = false;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    zR = z.r(parcel, i10);
                    break;
                case 3:
                    zR2 = z.r(parcel, i10);
                    break;
                case 4:
                    strE = z.e(parcel, i10);
                    break;
                case 5:
                    zR3 = z.r(parcel, i10);
                    break;
                case 6:
                    z.L(parcel, i10, 4);
                    f10 = parcel.readFloat();
                    break;
                case 7:
                    iT = z.t(parcel, i10);
                    break;
                case '\b':
                    zR4 = z.r(parcel, i10);
                    break;
                case '\t':
                    zR5 = z.r(parcel, i10);
                    break;
                case '\n':
                    zR6 = z.r(parcel, i10);
                    break;
                default:
                    z.F(parcel, i10);
                    break;
            }
        }
        z.i(parcel, iH);
        return new zzk(zR, zR2, strE, zR3, f10, iT, zR4, zR5, zR6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}

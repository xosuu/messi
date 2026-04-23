package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
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
        String strE4 = null;
        String strE5 = null;
        String strE6 = null;
        String strE7 = null;
        Intent intent = null;
        IBinder iBinderS = null;
        boolean zR = false;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strE = z.e(parcel, i10);
                    break;
                case 3:
                    strE2 = z.e(parcel, i10);
                    break;
                case 4:
                    strE3 = z.e(parcel, i10);
                    break;
                case 5:
                    strE4 = z.e(parcel, i10);
                    break;
                case 6:
                    strE5 = z.e(parcel, i10);
                    break;
                case 7:
                    strE6 = z.e(parcel, i10);
                    break;
                case '\b':
                    strE7 = z.e(parcel, i10);
                    break;
                case '\t':
                    intent = (Intent) z.d(parcel, i10, Intent.CREATOR);
                    break;
                case '\n':
                    iBinderS = z.s(parcel, i10);
                    break;
                case 11:
                    zR = z.r(parcel, i10);
                    break;
                default:
                    z.F(parcel, i10);
                    break;
            }
        }
        z.i(parcel, iH);
        return new zzc(strE, strE2, strE3, strE4, strE5, strE6, strE7, intent, iBinderS, zR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzc[i10];
    }
}

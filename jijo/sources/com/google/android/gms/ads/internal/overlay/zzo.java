package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.sf;
import g4.z;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        zzc zzcVar = null;
        IBinder iBinderS = null;
        IBinder iBinderS2 = null;
        IBinder iBinderS3 = null;
        IBinder iBinderS4 = null;
        String strE = null;
        String strE2 = null;
        IBinder iBinderS5 = null;
        String strE3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String strE4 = null;
        com.google.android.gms.ads.internal.zzk zzkVar = null;
        IBinder iBinderS6 = null;
        String strE5 = null;
        String strE6 = null;
        String strE7 = null;
        IBinder iBinderS7 = null;
        IBinder iBinderS8 = null;
        IBinder iBinderS9 = null;
        boolean zR = false;
        int iT = 0;
        int iT2 = 0;
        boolean zR2 = false;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    zzcVar = (zzc) z.d(parcel, i10, zzc.CREATOR);
                    break;
                case 3:
                    iBinderS = z.s(parcel, i10);
                    break;
                case 4:
                    iBinderS2 = z.s(parcel, i10);
                    break;
                case 5:
                    iBinderS3 = z.s(parcel, i10);
                    break;
                case 6:
                    iBinderS4 = z.s(parcel, i10);
                    break;
                case 7:
                    strE = z.e(parcel, i10);
                    break;
                case '\b':
                    zR = z.r(parcel, i10);
                    break;
                case '\t':
                    strE2 = z.e(parcel, i10);
                    break;
                case '\n':
                    iBinderS5 = z.s(parcel, i10);
                    break;
                case 11:
                    iT = z.t(parcel, i10);
                    break;
                case '\f':
                    iT2 = z.t(parcel, i10);
                    break;
                case '\r':
                    strE3 = z.e(parcel, i10);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) z.d(parcel, i10, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case sf.zzm /* 21 */:
                case 22:
                case 23:
                default:
                    z.F(parcel, i10);
                    break;
                case 16:
                    strE4 = z.e(parcel, i10);
                    break;
                case 17:
                    zzkVar = (com.google.android.gms.ads.internal.zzk) z.d(parcel, i10, com.google.android.gms.ads.internal.zzk.CREATOR);
                    break;
                case 18:
                    iBinderS6 = z.s(parcel, i10);
                    break;
                case 19:
                    strE5 = z.e(parcel, i10);
                    break;
                case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    strE6 = z.e(parcel, i10);
                    break;
                case 25:
                    strE7 = z.e(parcel, i10);
                    break;
                case 26:
                    iBinderS7 = z.s(parcel, i10);
                    break;
                case 27:
                    iBinderS8 = z.s(parcel, i10);
                    break;
                case 28:
                    iBinderS9 = z.s(parcel, i10);
                    break;
                case 29:
                    zR2 = z.r(parcel, i10);
                    break;
            }
        }
        z.i(parcel, iH);
        return new AdOverlayInfoParcel(zzcVar, iBinderS, iBinderS2, iBinderS3, iBinderS4, strE, zR, strE2, iBinderS5, iT, iT2, strE3, versionInfoParcel, strE4, zzkVar, iBinderS6, strE5, strE6, strE7, iBinderS7, iBinderS8, iBinderS9, zR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}

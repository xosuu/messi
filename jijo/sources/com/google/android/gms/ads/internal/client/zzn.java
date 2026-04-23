package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.sf;
import g4.z;
import java.util.ArrayList;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = z.H(parcel);
        long jV = 0;
        long jV2 = 0;
        Bundle bundleB = null;
        ArrayList arrayListG = null;
        String strE = null;
        zzfh zzfhVar = null;
        Location location = null;
        String strE2 = null;
        Bundle bundleB2 = null;
        Bundle bundleB3 = null;
        ArrayList arrayListG2 = null;
        String strE3 = null;
        String strE4 = null;
        zzc zzcVar = null;
        String strE5 = null;
        ArrayList arrayListG3 = null;
        String strE6 = null;
        int iT = 0;
        int iT2 = 0;
        boolean zR = false;
        int iT3 = 0;
        boolean zR2 = false;
        boolean zR3 = false;
        int iT4 = 0;
        int iT5 = 0;
        int iT6 = 0;
        while (parcel.dataPosition() < iH) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iT = z.t(parcel, i10);
                    break;
                case 2:
                    jV = z.v(parcel, i10);
                    break;
                case 3:
                    bundleB = z.b(parcel, i10);
                    break;
                case 4:
                    iT2 = z.t(parcel, i10);
                    break;
                case 5:
                    arrayListG = z.g(parcel, i10);
                    break;
                case 6:
                    zR = z.r(parcel, i10);
                    break;
                case 7:
                    iT3 = z.t(parcel, i10);
                    break;
                case '\b':
                    zR2 = z.r(parcel, i10);
                    break;
                case '\t':
                    strE = z.e(parcel, i10);
                    break;
                case '\n':
                    zzfhVar = (zzfh) z.d(parcel, i10, zzfh.CREATOR);
                    break;
                case 11:
                    location = (Location) z.d(parcel, i10, Location.CREATOR);
                    break;
                case '\f':
                    strE2 = z.e(parcel, i10);
                    break;
                case '\r':
                    bundleB2 = z.b(parcel, i10);
                    break;
                case 14:
                    bundleB3 = z.b(parcel, i10);
                    break;
                case 15:
                    arrayListG2 = z.g(parcel, i10);
                    break;
                case 16:
                    strE3 = z.e(parcel, i10);
                    break;
                case 17:
                    strE4 = z.e(parcel, i10);
                    break;
                case 18:
                    zR3 = z.r(parcel, i10);
                    break;
                case 19:
                    zzcVar = (zzc) z.d(parcel, i10, zzc.CREATOR);
                    break;
                case 20:
                    iT4 = z.t(parcel, i10);
                    break;
                case sf.zzm /* 21 */:
                    strE5 = z.e(parcel, i10);
                    break;
                case 22:
                    arrayListG3 = z.g(parcel, i10);
                    break;
                case 23:
                    iT5 = z.t(parcel, i10);
                    break;
                case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    strE6 = z.e(parcel, i10);
                    break;
                case 25:
                    iT6 = z.t(parcel, i10);
                    break;
                case 26:
                    jV2 = z.v(parcel, i10);
                    break;
                default:
                    z.F(parcel, i10);
                    break;
            }
        }
        z.i(parcel, iH);
        return new zzl(iT, jV, bundleB, iT2, arrayListG, zR, iT3, zR2, strE, zzfhVar, location, strE2, bundleB2, bundleB3, arrayListG2, strE3, strE4, zR3, zzcVar, iT4, strE5, arrayListG3, iT5, strE6, iT6, jV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}

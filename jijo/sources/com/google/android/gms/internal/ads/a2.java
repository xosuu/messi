package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzfk;
import java.util.ArrayList;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2565a;

    public /* synthetic */ a2(int i10) {
        this.f2565a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zR = false;
        int iT = 0;
        int iT2 = 0;
        String strE = null;
        switch (this.f2565a) {
            case 0:
                return new zzafg(parcel);
            case 1:
                return new zzafj(parcel);
            case 2:
                return new zzafl(parcel);
            case 3:
                return new zzafn(parcel);
            case 4:
                return new zzafp(parcel);
            case 5:
                return new zzafr(parcel);
            case 6:
                return new zzaft(parcel);
            case 7:
                return new zzafv(parcel);
            case 8:
                return new zzafx(parcel);
            case 9:
                return new zzafz(parcel);
            case 10:
                return new zzagg(parcel);
            case 11:
                return new zzagi(parcel);
            case 12:
                return new zzagk(parcel);
            case 13:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new zzagm(string, string2, bz0.l(strArrCreateStringArray));
            case 14:
                return new zzago(parcel);
            case 15:
                return new zzagr(parcel);
            case 16:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, zzagu.class.getClassLoader());
                return new zzagv(arrayList);
            case 17:
                return new zzagu(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 18:
                return new zzagy(parcel);
            case 19:
                return new zzaha(parcel);
            case 20:
                int iH = g4.z.H(parcel);
                long jV = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                boolean zR2 = false;
                boolean zR3 = false;
                boolean zR4 = false;
                while (parcel.dataPosition() < iH) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) g4.z.d(parcel, i10, ParcelFileDescriptor.CREATOR);
                    } else if (c10 == 3) {
                        zR2 = g4.z.r(parcel, i10);
                    } else if (c10 == 4) {
                        zR3 = g4.z.r(parcel, i10);
                    } else if (c10 == 5) {
                        jV = g4.z.v(parcel, i10);
                    } else if (c10 != 6) {
                        g4.z.F(parcel, i10);
                    } else {
                        zR4 = g4.z.r(parcel, i10);
                    }
                }
                g4.z.i(parcel, iH);
                return new zzbae(parcelFileDescriptor, zR2, zR3, jV, zR4);
            case sf.zzm /* 21 */:
                int iH2 = g4.z.H(parcel);
                long jV2 = 0;
                long jV3 = 0;
                String strE2 = null;
                String strE3 = null;
                String strE4 = null;
                String strE5 = null;
                Bundle bundleB = null;
                String strE6 = null;
                boolean zR5 = false;
                int iT3 = 0;
                while (parcel.dataPosition() < iH2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strE2 = g4.z.e(parcel, i11);
                            break;
                        case 3:
                            jV2 = g4.z.v(parcel, i11);
                            break;
                        case 4:
                            strE3 = g4.z.e(parcel, i11);
                            break;
                        case 5:
                            strE4 = g4.z.e(parcel, i11);
                            break;
                        case 6:
                            strE5 = g4.z.e(parcel, i11);
                            break;
                        case 7:
                            bundleB = g4.z.b(parcel, i11);
                            break;
                        case '\b':
                            zR5 = g4.z.r(parcel, i11);
                            break;
                        case '\t':
                            jV3 = g4.z.v(parcel, i11);
                            break;
                        case '\n':
                            strE6 = g4.z.e(parcel, i11);
                            break;
                        case 11:
                            iT3 = g4.z.t(parcel, i11);
                            break;
                        default:
                            g4.z.F(parcel, i11);
                            break;
                    }
                }
                g4.z.i(parcel, iH2);
                return new zzbah(strE2, jV2, strE3, strE4, strE5, bundleB, zR5, jV3, strE6, iT3);
            case 22:
                int iH3 = g4.z.H(parcel);
                zzfk zzfkVar = null;
                int iT4 = 0;
                boolean zR6 = false;
                int iT5 = 0;
                boolean zR7 = false;
                int iT6 = 0;
                boolean zR8 = false;
                int iT7 = 0;
                int iT8 = 0;
                boolean zR9 = false;
                int iT9 = 0;
                while (parcel.dataPosition() < iH3) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iT4 = g4.z.t(parcel, i12);
                            break;
                        case 2:
                            zR6 = g4.z.r(parcel, i12);
                            break;
                        case 3:
                            iT5 = g4.z.t(parcel, i12);
                            break;
                        case 4:
                            zR7 = g4.z.r(parcel, i12);
                            break;
                        case 5:
                            iT6 = g4.z.t(parcel, i12);
                            break;
                        case 6:
                            zzfkVar = (zzfk) g4.z.d(parcel, i12, zzfk.CREATOR);
                            break;
                        case 7:
                            zR8 = g4.z.r(parcel, i12);
                            break;
                        case '\b':
                            iT7 = g4.z.t(parcel, i12);
                            break;
                        case '\t':
                            iT8 = g4.z.t(parcel, i12);
                            break;
                        case '\n':
                            zR9 = g4.z.r(parcel, i12);
                            break;
                        case 11:
                            iT9 = g4.z.t(parcel, i12);
                            break;
                        default:
                            g4.z.F(parcel, i12);
                            break;
                    }
                }
                g4.z.i(parcel, iH3);
                return new zzbes(iT4, zR6, iT5, zR7, iT6, zzfkVar, zR8, iT7, iT8, zR9, iT9);
            case 23:
                return new zzbk(parcel);
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                int iH4 = g4.z.H(parcel);
                String[] strArrF = null;
                String[] strArrF2 = null;
                while (parcel.dataPosition() < iH4) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        strE = g4.z.e(parcel, i13);
                    } else if (c11 == 2) {
                        strArrF = g4.z.f(parcel, i13);
                    } else if (c11 != 3) {
                        g4.z.F(parcel, i13);
                    } else {
                        strArrF2 = g4.z.f(parcel, i13);
                    }
                }
                g4.z.i(parcel, iH4);
                return new zzbki(strE, strArrF, strArrF2);
            case 25:
                int iH5 = g4.z.H(parcel);
                long jV4 = 0;
                String strE7 = null;
                byte[] bArrC = null;
                String[] strArrF3 = null;
                String[] strArrF4 = null;
                boolean zR10 = false;
                int iT10 = 0;
                boolean zR11 = false;
                while (parcel.dataPosition() < iH5) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            zR10 = g4.z.r(parcel, i14);
                            break;
                        case 2:
                            strE7 = g4.z.e(parcel, i14);
                            break;
                        case 3:
                            iT10 = g4.z.t(parcel, i14);
                            break;
                        case 4:
                            bArrC = g4.z.c(parcel, i14);
                            break;
                        case 5:
                            strArrF3 = g4.z.f(parcel, i14);
                            break;
                        case 6:
                            strArrF4 = g4.z.f(parcel, i14);
                            break;
                        case 7:
                            zR11 = g4.z.r(parcel, i14);
                            break;
                        case '\b':
                            jV4 = g4.z.v(parcel, i14);
                            break;
                        default:
                            g4.z.F(parcel, i14);
                            break;
                    }
                }
                g4.z.i(parcel, iH5);
                return new zzbkk(zR10, strE7, iT10, bArrC, strArrF3, strArrF4, zR11, jV4);
            case 26:
                int iH6 = g4.z.H(parcel);
                String strE8 = null;
                int iT11 = 0;
                while (parcel.dataPosition() < iH6) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        strE = g4.z.e(parcel, i15);
                    } else if (c12 == 2) {
                        zR = g4.z.r(parcel, i15);
                    } else if (c12 == 3) {
                        iT11 = g4.z.t(parcel, i15);
                    } else if (c12 != 4) {
                        g4.z.F(parcel, i15);
                    } else {
                        strE8 = g4.z.e(parcel, i15);
                    }
                }
                g4.z.i(parcel, iH6);
                return new zzbkv(strE, iT11, strE8, zR);
            case 27:
                int iH7 = g4.z.H(parcel);
                Bundle bundleB2 = null;
                while (parcel.dataPosition() < iH7) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 1) {
                        strE = g4.z.e(parcel, i16);
                    } else if (c13 != 2) {
                        g4.z.F(parcel, i16);
                    } else {
                        bundleB2 = g4.z.b(parcel, i16);
                    }
                }
                g4.z.i(parcel, iH7);
                return new zzblf(bundleB2, strE);
            case 28:
                int iH8 = g4.z.H(parcel);
                int iT12 = 0;
                int iT13 = 0;
                while (parcel.dataPosition() < iH8) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 1) {
                        iT12 = g4.z.t(parcel, i17);
                    } else if (c14 == 2) {
                        strE = g4.z.e(parcel, i17);
                    } else if (c14 == 3) {
                        iT13 = g4.z.t(parcel, i17);
                    } else if (c14 != 1000) {
                        g4.z.F(parcel, i17);
                    } else {
                        iT2 = g4.z.t(parcel, i17);
                    }
                }
                g4.z.i(parcel, iH8);
                return new zzblh(strE, iT2, iT12, iT13);
            default:
                int iH9 = g4.z.H(parcel);
                int iT14 = 0;
                int iT15 = 0;
                while (parcel.dataPosition() < iH9) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        iT = g4.z.t(parcel, i18);
                    } else if (c15 == 2) {
                        iT14 = g4.z.t(parcel, i18);
                    } else if (c15 != 3) {
                        g4.z.F(parcel, i18);
                    } else {
                        iT15 = g4.z.t(parcel, i18);
                    }
                }
                g4.z.i(parcel, iH9);
                return new zzbra(iT, iT14, iT15);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f2565a) {
            case 0:
                return new zzafg[i10];
            case 1:
                return new zzafj[i10];
            case 2:
                return new zzafl[i10];
            case 3:
                return new zzafn[i10];
            case 4:
                return new zzafp[i10];
            case 5:
                return new zzafr[i10];
            case 6:
                return new zzaft[i10];
            case 7:
                return new zzafv[i10];
            case 8:
                return new zzafx[i10];
            case 9:
                return new zzafz[i10];
            case 10:
                return new zzagg[i10];
            case 11:
                return new zzagi[i10];
            case 12:
                return new zzagk[i10];
            case 13:
                return new zzagm[i10];
            case 14:
                return new zzago[i10];
            case 15:
                return new zzagr[i10];
            case 16:
                return new zzagv[i10];
            case 17:
                return new zzagu[i10];
            case 18:
                return new zzagy[i10];
            case 19:
                return new zzaha[i10];
            case 20:
                return new zzbae[i10];
            case sf.zzm /* 21 */:
                return new zzbah[i10];
            case 22:
                return new zzbes[i10];
            case 23:
                return new zzbk[i10];
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return new zzbki[i10];
            case 25:
                return new zzbkk[i10];
            case 26:
                return new zzbkv[i10];
            case 27:
                return new zzblf[i10];
            case 28:
                return new zzblh[i10];
            default:
                return new zzbra[i10];
        }
    }
}

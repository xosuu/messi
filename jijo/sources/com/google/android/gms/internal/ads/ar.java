package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class ar implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2777a;

    public /* synthetic */ ar(int i10) {
        this.f2777a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2777a) {
            case 0:
                int iH = g4.z.H(parcel);
                IBinder iBinderS = null;
                IBinder iBinderS2 = null;
                while (parcel.dataPosition() < iH) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iBinderS2 = g4.z.s(parcel, i10);
                    } else if (c10 != 2) {
                        g4.z.F(parcel, i10);
                    } else {
                        iBinderS = g4.z.s(parcel, i10);
                    }
                }
                g4.z.i(parcel, iH);
                return new zzbtl(iBinderS2, iBinderS);
            case 1:
                int iH2 = g4.z.H(parcel);
                long jV = 0;
                long jV2 = 0;
                int iT = 0;
                Bundle bundleB = null;
                zzl zzlVar = null;
                zzq zzqVar = null;
                String strE = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String strE2 = null;
                String strE3 = null;
                String strE4 = null;
                VersionInfoParcel versionInfoParcel = null;
                Bundle bundleB2 = null;
                int iT2 = 0;
                ArrayList arrayListG = null;
                Bundle bundleB3 = null;
                boolean zR = false;
                int iT3 = 0;
                int iT4 = 0;
                float f10 = 0.0f;
                String strE5 = null;
                String strE6 = null;
                ArrayList arrayListG2 = null;
                String strE7 = null;
                zzbes zzbesVar = null;
                ArrayList arrayListG3 = null;
                String strE8 = null;
                float f11 = 0.0f;
                boolean zR2 = false;
                int iT5 = 0;
                int iT6 = 0;
                boolean zR3 = false;
                String strE9 = null;
                String strE10 = null;
                boolean zR4 = false;
                int iT7 = 0;
                Bundle bundleB4 = null;
                String strE11 = null;
                zzdu zzduVar = null;
                boolean zR5 = false;
                Bundle bundleB5 = null;
                String strE12 = null;
                String strE13 = null;
                String strE14 = null;
                boolean zR6 = false;
                ArrayList arrayList = null;
                String strE15 = null;
                ArrayList arrayListG4 = null;
                int iT8 = 0;
                boolean zR7 = false;
                boolean zR8 = false;
                boolean zR9 = false;
                ArrayList arrayListG5 = null;
                String strE16 = null;
                zzblh zzblhVar = null;
                String strE17 = null;
                Bundle bundleB6 = null;
                while (parcel.dataPosition() < iH2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iT = g4.z.t(parcel, i11);
                            break;
                        case 2:
                            bundleB = g4.z.b(parcel, i11);
                            break;
                        case 3:
                            zzlVar = (zzl) g4.z.d(parcel, i11, zzl.CREATOR);
                            break;
                        case 4:
                            zzqVar = (zzq) g4.z.d(parcel, i11, zzq.CREATOR);
                            break;
                        case 5:
                            strE = g4.z.e(parcel, i11);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) g4.z.d(parcel, i11, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) g4.z.d(parcel, i11, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            strE2 = g4.z.e(parcel, i11);
                            break;
                        case '\t':
                            strE3 = g4.z.e(parcel, i11);
                            break;
                        case '\n':
                            strE4 = g4.z.e(parcel, i11);
                            break;
                        case 11:
                            versionInfoParcel = (VersionInfoParcel) g4.z.d(parcel, i11, VersionInfoParcel.CREATOR);
                            break;
                        case '\f':
                            bundleB2 = g4.z.b(parcel, i11);
                            break;
                        case '\r':
                            iT2 = g4.z.t(parcel, i11);
                            break;
                        case 14:
                            arrayListG = g4.z.g(parcel, i11);
                            break;
                        case 15:
                            bundleB3 = g4.z.b(parcel, i11);
                            break;
                        case 16:
                            zR = g4.z.r(parcel, i11);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                        case NotificationCompat.FLAG_NO_CLEAR /* 32 */:
                        case '&':
                        case '>':
                        default:
                            g4.z.F(parcel, i11);
                            break;
                        case 18:
                            iT3 = g4.z.t(parcel, i11);
                            break;
                        case 19:
                            iT4 = g4.z.t(parcel, i11);
                            break;
                        case 20:
                            g4.z.L(parcel, i11, 4);
                            f10 = parcel.readFloat();
                            break;
                        case sf.zzm /* 21 */:
                            strE5 = g4.z.e(parcel, i11);
                            break;
                        case 25:
                            jV = g4.z.v(parcel, i11);
                            break;
                        case 26:
                            strE6 = g4.z.e(parcel, i11);
                            break;
                        case 27:
                            arrayListG2 = g4.z.g(parcel, i11);
                            break;
                        case 28:
                            strE7 = g4.z.e(parcel, i11);
                            break;
                        case 29:
                            zzbesVar = (zzbes) g4.z.d(parcel, i11, zzbes.CREATOR);
                            break;
                        case 30:
                            arrayListG3 = g4.z.g(parcel, i11);
                            break;
                        case 31:
                            jV2 = g4.z.v(parcel, i11);
                            break;
                        case '!':
                            strE8 = g4.z.e(parcel, i11);
                            break;
                        case '\"':
                            g4.z.L(parcel, i11, 4);
                            f11 = parcel.readFloat();
                            break;
                        case '#':
                            iT5 = g4.z.t(parcel, i11);
                            break;
                        case '$':
                            iT6 = g4.z.t(parcel, i11);
                            break;
                        case '%':
                            zR3 = g4.z.r(parcel, i11);
                            break;
                        case '\'':
                            strE9 = g4.z.e(parcel, i11);
                            break;
                        case '(':
                            zR2 = g4.z.r(parcel, i11);
                            break;
                        case ')':
                            strE10 = g4.z.e(parcel, i11);
                            break;
                        case '*':
                            zR4 = g4.z.r(parcel, i11);
                            break;
                        case '+':
                            iT7 = g4.z.t(parcel, i11);
                            break;
                        case ',':
                            bundleB4 = g4.z.b(parcel, i11);
                            break;
                        case '-':
                            strE11 = g4.z.e(parcel, i11);
                            break;
                        case '.':
                            zzduVar = (zzdu) g4.z.d(parcel, i11, zzdu.CREATOR);
                            break;
                        case '/':
                            zR5 = g4.z.r(parcel, i11);
                            break;
                        case '0':
                            bundleB5 = g4.z.b(parcel, i11);
                            break;
                        case '1':
                            strE12 = g4.z.e(parcel, i11);
                            break;
                        case '2':
                            strE13 = g4.z.e(parcel, i11);
                            break;
                        case '3':
                            strE14 = g4.z.e(parcel, i11);
                            break;
                        case '4':
                            zR6 = g4.z.r(parcel, i11);
                            break;
                        case '5':
                            int iW = g4.z.w(parcel, i11);
                            int iDataPosition = parcel.dataPosition();
                            if (iW == 0) {
                                arrayList = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                int i12 = parcel.readInt();
                                for (int i13 = 0; i13 < i12; i13++) {
                                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(iDataPosition + iW);
                                arrayList = arrayList2;
                            }
                            break;
                        case '6':
                            strE15 = g4.z.e(parcel, i11);
                            break;
                        case '7':
                            arrayListG4 = g4.z.g(parcel, i11);
                            break;
                        case '8':
                            iT8 = g4.z.t(parcel, i11);
                            break;
                        case '9':
                            zR7 = g4.z.r(parcel, i11);
                            break;
                        case ':':
                            zR8 = g4.z.r(parcel, i11);
                            break;
                        case ';':
                            zR9 = g4.z.r(parcel, i11);
                            break;
                        case '<':
                            arrayListG5 = g4.z.g(parcel, i11);
                            break;
                        case '=':
                            strE16 = g4.z.e(parcel, i11);
                            break;
                        case '?':
                            zzblhVar = (zzblh) g4.z.d(parcel, i11, zzblh.CREATOR);
                            break;
                        case NotificationCompat.FLAG_FOREGROUND_SERVICE /* 64 */:
                            strE17 = g4.z.e(parcel, i11);
                            break;
                        case 'A':
                            bundleB6 = g4.z.b(parcel, i11);
                            break;
                    }
                }
                g4.z.i(parcel, iH2);
                return new zzbtz(iT, bundleB, zzlVar, zzqVar, strE, applicationInfo, packageInfo, strE2, strE3, strE4, versionInfoParcel, bundleB2, iT2, arrayListG, bundleB3, zR, iT3, iT4, f10, strE5, jV, strE6, arrayListG2, strE7, zzbesVar, arrayListG3, jV2, strE8, f11, zR2, iT5, iT6, zR3, strE9, strE10, zR4, iT7, bundleB4, strE11, zzduVar, zR5, bundleB5, strE12, strE13, strE14, zR6, arrayList, strE15, arrayListG4, iT8, zR7, zR8, zR9, arrayListG5, strE16, zzblhVar, strE17, bundleB6);
            case 2:
                int iH3 = g4.z.H(parcel);
                ApplicationInfo applicationInfo2 = null;
                String strE18 = null;
                PackageInfo packageInfo2 = null;
                String strE19 = null;
                int iT9 = 0;
                String strE20 = null;
                ArrayList arrayListG6 = null;
                boolean zR10 = false;
                boolean zR11 = false;
                while (parcel.dataPosition() < iH3) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            applicationInfo2 = (ApplicationInfo) g4.z.d(parcel, i14, ApplicationInfo.CREATOR);
                            break;
                        case 2:
                            strE18 = g4.z.e(parcel, i14);
                            break;
                        case 3:
                            packageInfo2 = (PackageInfo) g4.z.d(parcel, i14, PackageInfo.CREATOR);
                            break;
                        case 4:
                            strE19 = g4.z.e(parcel, i14);
                            break;
                        case 5:
                            iT9 = g4.z.t(parcel, i14);
                            break;
                        case 6:
                            strE20 = g4.z.e(parcel, i14);
                            break;
                        case 7:
                            arrayListG6 = g4.z.g(parcel, i14);
                            break;
                        case '\b':
                            zR10 = g4.z.r(parcel, i14);
                            break;
                        case '\t':
                            zR11 = g4.z.r(parcel, i14);
                            break;
                        default:
                            g4.z.F(parcel, i14);
                            break;
                    }
                }
                g4.z.i(parcel, iH3);
                return new zzbuc(applicationInfo2, strE18, packageInfo2, strE19, iT9, strE20, arrayListG6, zR10, zR11);
            case 3:
                int iH4 = g4.z.H(parcel);
                boolean zR12 = false;
                ArrayList arrayListG7 = null;
                while (parcel.dataPosition() < iH4) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 2) {
                        zR12 = g4.z.r(parcel, i15);
                    } else if (c11 != 3) {
                        g4.z.F(parcel, i15);
                    } else {
                        arrayListG7 = g4.z.g(parcel, i15);
                    }
                }
                g4.z.i(parcel, iH4);
                return new zzbue(arrayListG7, zR12);
            case 4:
                int iH5 = g4.z.H(parcel);
                String strE21 = null;
                int iT10 = 0;
                Bundle bundleB7 = null;
                byte[] bArrC = null;
                boolean zR13 = false;
                String strE22 = null;
                String strE23 = null;
                while (parcel.dataPosition() < iH5) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strE21 = g4.z.e(parcel, i16);
                            break;
                        case 2:
                            iT10 = g4.z.t(parcel, i16);
                            break;
                        case 3:
                            bundleB7 = g4.z.b(parcel, i16);
                            break;
                        case 4:
                            bArrC = g4.z.c(parcel, i16);
                            break;
                        case 5:
                            zR13 = g4.z.r(parcel, i16);
                            break;
                        case 6:
                            strE22 = g4.z.e(parcel, i16);
                            break;
                        case 7:
                            strE23 = g4.z.e(parcel, i16);
                            break;
                        default:
                            g4.z.F(parcel, i16);
                            break;
                    }
                }
                g4.z.i(parcel, iH5);
                return new zzbug(strE21, iT10, bundleB7, bArrC, zR13, strE22, strE23);
            case 5:
                int iH6 = g4.z.H(parcel);
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iH6) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        g4.z.F(parcel, i17);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) g4.z.d(parcel, i17, ParcelFileDescriptor.CREATOR);
                    }
                }
                g4.z.i(parcel, iH6);
                return new zzbuz(parcelFileDescriptor);
            case 6:
                int iH7 = g4.z.H(parcel);
                Bundle bundleB8 = null;
                VersionInfoParcel versionInfoParcel2 = null;
                ApplicationInfo applicationInfo3 = null;
                String strE24 = null;
                ArrayList arrayListG8 = null;
                PackageInfo packageInfo3 = null;
                String strE25 = null;
                String strE26 = null;
                zzfhb zzfhbVar = null;
                String strE27 = null;
                boolean zR14 = false;
                boolean zR15 = false;
                Bundle bundleB9 = null;
                while (parcel.dataPosition() < iH7) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            bundleB8 = g4.z.b(parcel, i18);
                            break;
                        case 2:
                            versionInfoParcel2 = (VersionInfoParcel) g4.z.d(parcel, i18, VersionInfoParcel.CREATOR);
                            break;
                        case 3:
                            applicationInfo3 = (ApplicationInfo) g4.z.d(parcel, i18, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            strE24 = g4.z.e(parcel, i18);
                            break;
                        case 5:
                            arrayListG8 = g4.z.g(parcel, i18);
                            break;
                        case 6:
                            packageInfo3 = (PackageInfo) g4.z.d(parcel, i18, PackageInfo.CREATOR);
                            break;
                        case 7:
                            strE25 = g4.z.e(parcel, i18);
                            break;
                        case '\b':
                        default:
                            g4.z.F(parcel, i18);
                            break;
                        case '\t':
                            strE26 = g4.z.e(parcel, i18);
                            break;
                        case '\n':
                            zzfhbVar = (zzfhb) g4.z.d(parcel, i18, zzfhb.CREATOR);
                            break;
                        case 11:
                            strE27 = g4.z.e(parcel, i18);
                            break;
                        case '\f':
                            zR14 = g4.z.r(parcel, i18);
                            break;
                        case '\r':
                            zR15 = g4.z.r(parcel, i18);
                            break;
                        case 14:
                            bundleB9 = g4.z.b(parcel, i18);
                            break;
                    }
                }
                g4.z.i(parcel, iH7);
                return new zzbvb(bundleB8, versionInfoParcel2, applicationInfo3, strE24, arrayListG8, packageInfo3, strE25, strE26, zzfhbVar, strE27, zR14, zR15, bundleB9);
            case 7:
                int iH8 = g4.z.H(parcel);
                String strE28 = null;
                zzl zzlVar2 = null;
                while (parcel.dataPosition() < iH8) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 2) {
                        zzlVar2 = (zzl) g4.z.d(parcel, i19, zzl.CREATOR);
                    } else if (c12 != 3) {
                        g4.z.F(parcel, i19);
                    } else {
                        strE28 = g4.z.e(parcel, i19);
                    }
                }
                g4.z.i(parcel, iH8);
                return new zzbvu(zzlVar2, strE28);
            case 8:
                int iH9 = g4.z.H(parcel);
                int iT11 = 0;
                String strE29 = null;
                while (parcel.dataPosition() < iH9) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 2) {
                        strE29 = g4.z.e(parcel, i20);
                    } else if (c13 != 3) {
                        g4.z.F(parcel, i20);
                    } else {
                        iT11 = g4.z.t(parcel, i20);
                    }
                }
                g4.z.i(parcel, iH9);
                return new zzbvz(strE29, iT11);
            case 9:
                int iH10 = g4.z.H(parcel);
                String strE30 = null;
                String strE31 = null;
                while (parcel.dataPosition() < iH10) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 1) {
                        strE31 = g4.z.e(parcel, i21);
                    } else if (c14 != 2) {
                        g4.z.F(parcel, i21);
                    } else {
                        strE30 = g4.z.e(parcel, i21);
                    }
                }
                g4.z.i(parcel, iH10);
                return new zzbwu(strE31, strE30);
            case 10:
                int iH11 = g4.z.H(parcel);
                String strE32 = null;
                String strE33 = null;
                boolean zR16 = false;
                boolean zR17 = false;
                ArrayList arrayListG9 = null;
                boolean zR18 = false;
                boolean zR19 = false;
                ArrayList arrayListG10 = null;
                while (parcel.dataPosition() < iH11) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            strE32 = g4.z.e(parcel, i22);
                            break;
                        case 3:
                            strE33 = g4.z.e(parcel, i22);
                            break;
                        case 4:
                            zR16 = g4.z.r(parcel, i22);
                            break;
                        case 5:
                            zR17 = g4.z.r(parcel, i22);
                            break;
                        case 6:
                            arrayListG9 = g4.z.g(parcel, i22);
                            break;
                        case 7:
                            zR18 = g4.z.r(parcel, i22);
                            break;
                        case '\b':
                            zR19 = g4.z.r(parcel, i22);
                            break;
                        case '\t':
                            arrayListG10 = g4.z.g(parcel, i22);
                            break;
                        default:
                            g4.z.F(parcel, i22);
                            break;
                    }
                }
                g4.z.i(parcel, iH11);
                return new zzbxi(strE32, strE33, zR16, zR17, arrayListG9, zR18, zR19, arrayListG10);
            case 11:
                int iH12 = g4.z.H(parcel);
                String strE34 = null;
                String strE35 = null;
                zzq zzqVar2 = null;
                zzl zzlVar3 = null;
                while (parcel.dataPosition() < iH12) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 1) {
                        strE35 = g4.z.e(parcel, i23);
                    } else if (c15 == 2) {
                        strE34 = g4.z.e(parcel, i23);
                    } else if (c15 == 3) {
                        zzqVar2 = (zzq) g4.z.d(parcel, i23, zzq.CREATOR);
                    } else if (c15 != 4) {
                        g4.z.F(parcel, i23);
                    } else {
                        zzlVar3 = (zzl) g4.z.d(parcel, i23, zzl.CREATOR);
                    }
                }
                g4.z.i(parcel, iH12);
                return new zzbyq(strE35, strE34, zzqVar2, zzlVar3);
            case 12:
                return new zzex(parcel);
            case 13:
                return new zzfa(parcel);
            case 14:
                return new zzfd(parcel);
            case 15:
                int iH13 = g4.z.H(parcel);
                int iT12 = 0;
                int iT13 = 0;
                int iT14 = 0;
                int iT15 = 0;
                String strE36 = null;
                int iT16 = 0;
                int iT17 = 0;
                while (parcel.dataPosition() < iH13) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            iT12 = g4.z.t(parcel, i24);
                            break;
                        case 2:
                            iT13 = g4.z.t(parcel, i24);
                            break;
                        case 3:
                            iT14 = g4.z.t(parcel, i24);
                            break;
                        case 4:
                            iT15 = g4.z.t(parcel, i24);
                            break;
                        case 5:
                            strE36 = g4.z.e(parcel, i24);
                            break;
                        case 6:
                            iT16 = g4.z.t(parcel, i24);
                            break;
                        case 7:
                            iT17 = g4.z.t(parcel, i24);
                            break;
                        default:
                            g4.z.F(parcel, i24);
                            break;
                    }
                }
                g4.z.i(parcel, iH13);
                return new zzfhb(iT12, iT13, iT14, iT15, strE36, iT16, iT17);
            case 16:
                int iH14 = g4.z.H(parcel);
                int iT18 = 0;
                byte[] bArrC2 = null;
                while (parcel.dataPosition() < iH14) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 1) {
                        iT18 = g4.z.t(parcel, i25);
                    } else if (c16 != 2) {
                        g4.z.F(parcel, i25);
                    } else {
                        bArrC2 = g4.z.c(parcel, i25);
                    }
                }
                g4.z.i(parcel, iH14);
                return new zzfpm(bArrC2, iT18);
            case 17:
                int iH15 = g4.z.H(parcel);
                String strE37 = null;
                int iT19 = 0;
                String strE38 = null;
                while (parcel.dataPosition() < iH15) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 1) {
                        iT19 = g4.z.t(parcel, i26);
                    } else if (c17 == 2) {
                        strE38 = g4.z.e(parcel, i26);
                    } else if (c17 != 3) {
                        g4.z.F(parcel, i26);
                    } else {
                        strE37 = g4.z.e(parcel, i26);
                    }
                }
                g4.z.i(parcel, iH15);
                return new zzfpp(iT19, strE38, strE37);
            case 18:
                int iH16 = g4.z.H(parcel);
                int iT20 = 0;
                byte[] bArrC3 = null;
                while (parcel.dataPosition() < iH16) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 1) {
                        iT20 = g4.z.t(parcel, i27);
                    } else if (c18 != 2) {
                        g4.z.F(parcel, i27);
                    } else {
                        bArrC3 = g4.z.c(parcel, i27);
                    }
                }
                g4.z.i(parcel, iH16);
                return new zzfpr(bArrC3, iT20);
            case 19:
                int iH17 = g4.z.H(parcel);
                int iT21 = 0;
                int iT22 = 0;
                int iT23 = 0;
                String strE39 = null;
                String strE40 = null;
                while (parcel.dataPosition() < iH17) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 1) {
                        iT21 = g4.z.t(parcel, i28);
                    } else if (c19 == 2) {
                        iT22 = g4.z.t(parcel, i28);
                    } else if (c19 == 3) {
                        strE39 = g4.z.e(parcel, i28);
                    } else if (c19 == 4) {
                        strE40 = g4.z.e(parcel, i28);
                    } else if (c19 != 5) {
                        g4.z.F(parcel, i28);
                    } else {
                        iT23 = g4.z.t(parcel, i28);
                    }
                }
                g4.z.i(parcel, iH17);
                return new zzfpy(iT21, iT22, iT23, strE39, strE40);
            case 20:
                int iH18 = g4.z.H(parcel);
                int iT24 = 0;
                int iT25 = 0;
                byte[] bArrC4 = null;
                while (parcel.dataPosition() < iH18) {
                    int i29 = parcel.readInt();
                    char c20 = (char) i29;
                    if (c20 == 1) {
                        iT25 = g4.z.t(parcel, i29);
                    } else if (c20 == 2) {
                        bArrC4 = g4.z.c(parcel, i29);
                    } else if (c20 != 3) {
                        g4.z.F(parcel, i29);
                    } else {
                        iT24 = g4.z.t(parcel, i29);
                    }
                }
                g4.z.i(parcel, iH18);
                return new zzfqa(iT25, bArrC4, iT24);
            case sf.zzm /* 21 */:
                return new zzy(parcel);
            default:
                return new zzx(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f2777a) {
            case 0:
                return new zzbtl[i10];
            case 1:
                return new zzbtz[i10];
            case 2:
                return new zzbuc[i10];
            case 3:
                return new zzbue[i10];
            case 4:
                return new zzbug[i10];
            case 5:
                return new zzbuz[i10];
            case 6:
                return new zzbvb[i10];
            case 7:
                return new zzbvu[i10];
            case 8:
                return new zzbvz[i10];
            case 9:
                return new zzbwu[i10];
            case 10:
                return new zzbxi[i10];
            case 11:
                return new zzbyq[i10];
            case 12:
                return new zzex[i10];
            case 13:
                return new zzfa[i10];
            case 14:
                return new zzfd[i10];
            case 15:
                return new zzfhb[i10];
            case 16:
                return new zzfpm[i10];
            case 17:
                return new zzfpp[i10];
            case 18:
                return new zzfpr[i10];
            case 19:
                return new zzfpy[i10];
            case 20:
                return new zzfqa[i10];
            case sf.zzm /* 21 */:
                return new zzy[i10];
            default:
                return new zzx[i10];
        }
    }
}

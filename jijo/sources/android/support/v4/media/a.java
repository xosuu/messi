package android.support.v4.media;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.format.Time;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.versionedparcelable.ParcelImpl;
import b7.u;
import com.codetroopers.betterpickers.calendardatepicker.MonthAdapter$CalendarDay;
import com.google.android.gms.appset.zza;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.measurement.zzcl;
import g4.d0;
import g4.z;
import java.util.ArrayList;
import java.util.Calendar;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92a;

    public /* synthetic */ a(int i10) {
        this.f92a = i10;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        int i11 = getServiceRequest.f2492a;
        d0.v(parcel, 1, 4);
        parcel.writeInt(i11);
        d0.v(parcel, 2, 4);
        parcel.writeInt(getServiceRequest.f2493b);
        d0.v(parcel, 3, 4);
        parcel.writeInt(getServiceRequest.f2494d);
        d0.o(parcel, 4, getServiceRequest.f2495f);
        d0.m(parcel, 5, getServiceRequest.f2496h);
        d0.r(parcel, 6, getServiceRequest.f2497q, i10);
        d0.k(parcel, 7, getServiceRequest.f2498s);
        d0.n(parcel, 8, getServiceRequest.f2499t, i10);
        d0.r(parcel, 10, getServiceRequest.f2500u, i10);
        d0.r(parcel, 11, getServiceRequest.f2501v, i10);
        d0.v(parcel, 12, 4);
        parcel.writeInt(getServiceRequest.f2502w ? 1 : 0);
        d0.v(parcel, 13, 4);
        parcel.writeInt(getServiceRequest.f2503x);
        boolean z9 = getServiceRequest.f2504y;
        d0.v(parcel, 14, 4);
        parcel.writeInt(z9 ? 1 : 0);
        d0.o(parcel, 15, getServiceRequest.f2505z);
        d0.u(parcel, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri uri;
        int iT = 0;
        Bundle bundle = null;
        String strE = null;
        PendingIntent pendingIntent = null;
        Bundle bundleB = null;
        Account account = null;
        String strE2 = null;
        String strE3 = null;
        String strE4 = null;
        String strE5 = null;
        switch (this.f92a) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a(0);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f78a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f79b;

                    {
                        this.f78a = parcel.readInt();
                        this.f79b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f78a + ", mDescription=" + this.f79b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeInt(this.f78a);
                        this.f79b.writeToParcel(parcel2, i10);
                    }
                };
            case 1:
                int i10 = Build.VERSION.SDK_INT;
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                b bVar = new b(0);
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                bVar.f93a = mediaDescription.getMediaId();
                bVar.f94b = mediaDescription.getTitle();
                bVar.f95c = mediaDescription.getSubtitle();
                bVar.f96d = mediaDescription.getDescription();
                bVar.f97e = mediaDescription.getIconBitmap();
                bVar.f98f = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(u.class.getClassLoader());
                    uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    uri = null;
                }
                if (uri == null) {
                    bundle = extras;
                } else if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                bVar.f100h = bundle;
                if (uri != null) {
                    bVar.f99g = uri;
                } else if (i10 >= 23) {
                    bVar.f99g = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat((String) bVar.f93a, (CharSequence) bVar.f94b, (CharSequence) bVar.f95c, (CharSequence) bVar.f96d, (Bitmap) bVar.f97e, (Uri) bVar.f98f, (Bundle) bVar.f100h, (Uri) bVar.f99g);
                mediaDescriptionCompat.f88u = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new android.support.v4.media.a(4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f101a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final long f102b;

                    {
                        this.f101a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f102b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.f101a + ", Id=" + this.f102b + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i11) {
                        this.f101a.writeToParcel(parcel2, i11);
                        parcel2.writeLong(this.f102b);
                    }
                };
            case 5:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f103a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 6:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new android.support.v4.media.a(6);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Object f104a;

                    {
                        this.f104a = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Object obj2 = this.f104a;
                        if (obj2 == null) {
                            return mediaSessionCompat$Token.f104a == null;
                        }
                        Object obj3 = mediaSessionCompat$Token.f104a;
                        if (obj3 == null) {
                            return false;
                        }
                        return obj2.equals(obj3);
                    }

                    public final int hashCode() {
                        Object obj = this.f104a;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i11) {
                        parcel2.writeParcelable((Parcelable) this.f104a, i11);
                    }
                };
            case 7:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f105a = parcel.readInt();
                parcelableVolumeInfo.f107d = parcel.readInt();
                parcelableVolumeInfo.f108f = parcel.readInt();
                parcelableVolumeInfo.f109h = parcel.readInt();
                parcelableVolumeInfo.f106b = parcel.readInt();
                return parcelableVolumeInfo;
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                return new android.support.v4.os.ResultReceiver(parcel);
            case 10:
                return new ActivityResult(parcel);
            case 11:
                return new IntentSenderRequest(parcel);
            case 12:
                return new ParcelImpl(parcel);
            case 13:
                MonthAdapter$CalendarDay monthAdapter$CalendarDay = new MonthAdapter$CalendarDay();
                monthAdapter$CalendarDay.f1613b = parcel.readLong();
                Calendar calendar = Calendar.getInstance();
                monthAdapter$CalendarDay.f1612a = calendar;
                calendar.setTimeInMillis(monthAdapter$CalendarDay.f1613b);
                monthAdapter$CalendarDay.f1615f = parcel.readLong();
                Time time = new Time();
                monthAdapter$CalendarDay.f1614d = time;
                time.set(monthAdapter$CalendarDay.f1615f);
                monthAdapter$CalendarDay.f1616h = parcel.readInt();
                monthAdapter$CalendarDay.f1617q = parcel.readInt();
                monthAdapter$CalendarDay.f1618s = parcel.readInt();
                return monthAdapter$CalendarDay;
            case 14:
                int iH = z.H(parcel);
                String strE6 = null;
                while (parcel.dataPosition() < iH) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        strE5 = z.e(parcel, i11);
                    } else if (c10 != 2) {
                        z.F(parcel, i11);
                    } else {
                        strE6 = z.e(parcel, i11);
                    }
                }
                z.i(parcel, iH);
                return new zza(strE5, strE6);
            case 15:
                int iH2 = z.H(parcel);
                while (parcel.dataPosition() < iH2) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        strE4 = z.e(parcel, i12);
                    } else if (c11 != 2) {
                        z.F(parcel, i12);
                    } else {
                        iT = z.t(parcel, i12);
                    }
                }
                z.i(parcel, iH2);
                return new zzc(strE4, iT);
            case 16:
                int iH3 = z.H(parcel);
                long jV = 0;
                String strE7 = null;
                String strE8 = null;
                String strE9 = null;
                String strE10 = null;
                Uri uri2 = null;
                String strE11 = null;
                String strE12 = null;
                ArrayList arrayList = null;
                String strE13 = null;
                String strE14 = null;
                int iT2 = 0;
                while (parcel.dataPosition() < iH3) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iT2 = z.t(parcel, i13);
                            break;
                        case 2:
                            strE7 = z.e(parcel, i13);
                            break;
                        case 3:
                            strE8 = z.e(parcel, i13);
                            break;
                        case 4:
                            strE9 = z.e(parcel, i13);
                            break;
                        case 5:
                            strE10 = z.e(parcel, i13);
                            break;
                        case 6:
                            uri2 = (Uri) z.d(parcel, i13, Uri.CREATOR);
                            break;
                        case 7:
                            strE11 = z.e(parcel, i13);
                            break;
                        case '\b':
                            jV = z.v(parcel, i13);
                            break;
                        case '\t':
                            strE12 = z.e(parcel, i13);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator = Scope.CREATOR;
                            int iW = z.w(parcel, i13);
                            int iDataPosition = parcel.dataPosition();
                            if (iW != 0) {
                                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                                parcel.setDataPosition(iDataPosition + iW);
                                arrayList = arrayListCreateTypedArrayList;
                            } else {
                                arrayList = null;
                            }
                            break;
                        case 11:
                            strE13 = z.e(parcel, i13);
                            break;
                        case '\f':
                            strE14 = z.e(parcel, i13);
                            break;
                        default:
                            z.F(parcel, i13);
                            break;
                    }
                }
                z.i(parcel, iH3);
                return new GoogleSignInAccount(iT2, strE7, strE8, strE9, strE10, uri2, strE11, jV, strE12, arrayList, strE13, strE14);
            case 17:
                int iH4 = z.H(parcel);
                while (parcel.dataPosition() < iH4) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        iT = z.t(parcel, i14);
                    } else if (c12 != 2) {
                        z.F(parcel, i14);
                    } else {
                        strE3 = z.e(parcel, i14);
                    }
                }
                z.i(parcel, iH4);
                return new Scope(iT, strE3);
            case 18:
                int iH5 = z.H(parcel);
                PendingIntent pendingIntent2 = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < iH5) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        iT = z.t(parcel, i15);
                    } else if (c13 == 2) {
                        strE2 = z.e(parcel, i15);
                    } else if (c13 == 3) {
                        pendingIntent2 = (PendingIntent) z.d(parcel, i15, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        z.F(parcel, i15);
                    } else {
                        connectionResult = (ConnectionResult) z.d(parcel, i15, ConnectionResult.CREATOR);
                    }
                }
                z.i(parcel, iH5);
                return new Status(iT, strE2, pendingIntent2, connectionResult);
            case 19:
                int iH6 = z.H(parcel);
                while (true) {
                    ArrayList arrayListCreateTypedArrayList2 = null;
                    while (parcel.dataPosition() < iH6) {
                        int i16 = parcel.readInt();
                        char c14 = (char) i16;
                        if (c14 == 1) {
                            iT = z.t(parcel, i16);
                        } else if (c14 != 2) {
                            z.F(parcel, i16);
                        } else {
                            Parcelable.Creator<MethodInvocation> creator2 = MethodInvocation.CREATOR;
                            int iW2 = z.w(parcel, i16);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iW2 == 0) {
                            }
                            arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(iDataPosition2 + iW2);
                        }
                        break;
                    }
                    z.i(parcel, iH6);
                    return new TelemetryData(iT, arrayListCreateTypedArrayList2);
                }
                break;
            case 20:
                int iH7 = z.H(parcel);
                long jV2 = 0;
                long jV3 = 0;
                String strE15 = null;
                String strE16 = null;
                int iT3 = 0;
                int iT4 = 0;
                int iT5 = 0;
                int iT6 = 0;
                int iT7 = -1;
                while (parcel.dataPosition() < iH7) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iT3 = z.t(parcel, i17);
                            break;
                        case 2:
                            iT4 = z.t(parcel, i17);
                            break;
                        case 3:
                            iT5 = z.t(parcel, i17);
                            break;
                        case 4:
                            jV2 = z.v(parcel, i17);
                            break;
                        case 5:
                            jV3 = z.v(parcel, i17);
                            break;
                        case 6:
                            strE15 = z.e(parcel, i17);
                            break;
                        case 7:
                            strE16 = z.e(parcel, i17);
                            break;
                        case '\b':
                            iT6 = z.t(parcel, i17);
                            break;
                        case '\t':
                            iT7 = z.t(parcel, i17);
                            break;
                        default:
                            z.F(parcel, i17);
                            break;
                    }
                }
                z.i(parcel, iH7);
                return new MethodInvocation(iT3, iT4, iT5, jV2, jV3, strE15, strE16, iT6, iT7);
            case sf.zzm /* 21 */:
                int iH8 = z.H(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int iT8 = 0;
                while (parcel.dataPosition() < iH8) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        iT = z.t(parcel, i18);
                    } else if (c15 == 2) {
                        account = (Account) z.d(parcel, i18, Account.CREATOR);
                    } else if (c15 == 3) {
                        iT8 = z.t(parcel, i18);
                    } else if (c15 != 4) {
                        z.F(parcel, i18);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) z.d(parcel, i18, GoogleSignInAccount.CREATOR);
                    }
                }
                z.i(parcel, iH8);
                return new zat(iT, account, iT8, googleSignInAccount);
            case 22:
                int iH9 = z.H(parcel);
                IBinder iBinderS = null;
                ConnectionResult connectionResult2 = null;
                int iT9 = 0;
                boolean zR = false;
                boolean zR2 = false;
                while (parcel.dataPosition() < iH9) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        iT9 = z.t(parcel, i19);
                    } else if (c16 == 2) {
                        iBinderS = z.s(parcel, i19);
                    } else if (c16 == 3) {
                        connectionResult2 = (ConnectionResult) z.d(parcel, i19, ConnectionResult.CREATOR);
                    } else if (c16 == 4) {
                        zR = z.r(parcel, i19);
                    } else if (c16 != 5) {
                        z.F(parcel, i19);
                    } else {
                        zR2 = z.r(parcel, i19);
                    }
                }
                z.i(parcel, iH9);
                return new zav(iT9, iBinderS, connectionResult2, zR, zR2);
            case 23:
                int iH10 = z.H(parcel);
                int iT10 = 0;
                boolean zR3 = false;
                boolean zR4 = false;
                int iT11 = 0;
                int iT12 = 0;
                while (parcel.dataPosition() < iH10) {
                    int i20 = parcel.readInt();
                    char c17 = (char) i20;
                    if (c17 == 1) {
                        iT10 = z.t(parcel, i20);
                    } else if (c17 == 2) {
                        zR3 = z.r(parcel, i20);
                    } else if (c17 == 3) {
                        zR4 = z.r(parcel, i20);
                    } else if (c17 == 4) {
                        iT11 = z.t(parcel, i20);
                    } else if (c17 != 5) {
                        z.F(parcel, i20);
                    } else {
                        iT12 = z.t(parcel, i20);
                    }
                }
                z.i(parcel, iH10);
                return new RootTelemetryConfiguration(iT10, zR3, zR4, iT11, iT12);
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                int iH11 = z.H(parcel);
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                while (parcel.dataPosition() < iH11) {
                    int i21 = parcel.readInt();
                    char c18 = (char) i21;
                    if (c18 == 1) {
                        bundleB = z.b(parcel, i21);
                    } else if (c18 == 2) {
                        featureArr = (Feature[]) z.h(parcel, i21, Feature.CREATOR);
                    } else if (c18 == 3) {
                        iT = z.t(parcel, i21);
                    } else if (c18 != 4) {
                        z.F(parcel, i21);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) z.d(parcel, i21, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                z.i(parcel, iH11);
                zzk zzkVar = new zzk();
                zzkVar.f2531a = bundleB;
                zzkVar.f2532b = featureArr;
                zzkVar.f2533d = iT;
                zzkVar.f2534f = connectionTelemetryConfiguration;
                return zzkVar;
            case 25:
                int iH12 = z.H(parcel);
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean zR5 = false;
                boolean zR6 = false;
                int iT13 = 0;
                while (parcel.dataPosition() < iH12) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) z.d(parcel, i22, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            zR5 = z.r(parcel, i22);
                            break;
                        case 3:
                            zR6 = z.r(parcel, i22);
                            break;
                        case 4:
                            int iW3 = z.w(parcel, i22);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iW3 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iW3);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case 5:
                            iT13 = z.t(parcel, i22);
                            break;
                        case 6:
                            int iW4 = z.w(parcel, i22);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iW4 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition4 + iW4);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            z.F(parcel, i22);
                            break;
                    }
                }
                z.i(parcel, iH12);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zR5, zR6, iArr, iT13, iArr2);
            case 26:
                int iH13 = z.H(parcel);
                Scope[] scopeArr = GetServiceRequest.A;
                Bundle bundle2 = new Bundle();
                Feature[] featureArr2 = GetServiceRequest.B;
                Feature[] featureArr3 = featureArr2;
                String strE17 = null;
                IBinder iBinderS2 = null;
                Account account2 = null;
                String strE18 = null;
                int iT14 = 0;
                int iT15 = 0;
                int iT16 = 0;
                boolean zR7 = false;
                int iT17 = 0;
                boolean zR8 = false;
                while (parcel.dataPosition() < iH13) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            iT14 = z.t(parcel, i23);
                            break;
                        case 2:
                            iT15 = z.t(parcel, i23);
                            break;
                        case 3:
                            iT16 = z.t(parcel, i23);
                            break;
                        case 4:
                            strE17 = z.e(parcel, i23);
                            break;
                        case 5:
                            iBinderS2 = z.s(parcel, i23);
                            break;
                        case 6:
                            scopeArr = (Scope[]) z.h(parcel, i23, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = z.b(parcel, i23);
                            break;
                        case '\b':
                            account2 = (Account) z.d(parcel, i23, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            z.F(parcel, i23);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) z.h(parcel, i23, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) z.h(parcel, i23, Feature.CREATOR);
                            break;
                        case '\f':
                            zR7 = z.r(parcel, i23);
                            break;
                        case '\r':
                            iT17 = z.t(parcel, i23);
                            break;
                        case 14:
                            zR8 = z.r(parcel, i23);
                            break;
                        case 15:
                            strE18 = z.e(parcel, i23);
                            break;
                    }
                }
                z.i(parcel, iH13);
                return new GetServiceRequest(iT14, iT15, iT16, strE17, iBinderS2, scopeArr, bundle2, account2, featureArr2, featureArr3, zR7, iT17, zR8, strE18);
            case 27:
                int iH14 = z.H(parcel);
                String strE19 = null;
                int iT18 = 0;
                while (parcel.dataPosition() < iH14) {
                    int i24 = parcel.readInt();
                    char c19 = (char) i24;
                    if (c19 == 1) {
                        iT = z.t(parcel, i24);
                    } else if (c19 == 2) {
                        iT18 = z.t(parcel, i24);
                    } else if (c19 == 3) {
                        pendingIntent = (PendingIntent) z.d(parcel, i24, PendingIntent.CREATOR);
                    } else if (c19 != 4) {
                        z.F(parcel, i24);
                    } else {
                        strE19 = z.e(parcel, i24);
                    }
                }
                z.i(parcel, iH14);
                return new ConnectionResult(iT, iT18, pendingIntent, strE19);
            case 28:
                int iH15 = z.H(parcel);
                long jV4 = -1;
                while (parcel.dataPosition() < iH15) {
                    int i25 = parcel.readInt();
                    char c20 = (char) i25;
                    if (c20 == 1) {
                        strE = z.e(parcel, i25);
                    } else if (c20 == 2) {
                        iT = z.t(parcel, i25);
                    } else if (c20 != 3) {
                        z.F(parcel, i25);
                    } else {
                        jV4 = z.v(parcel, i25);
                    }
                }
                z.i(parcel, iH15);
                return new Feature(iT, strE, jV4);
            default:
                int iH16 = z.H(parcel);
                long jV5 = 0;
                long jV6 = 0;
                String strE20 = null;
                String strE21 = null;
                String strE22 = null;
                Bundle bundleB2 = null;
                String strE23 = null;
                boolean zR9 = false;
                while (parcel.dataPosition() < iH16) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            jV5 = z.v(parcel, i26);
                            break;
                        case 2:
                            jV6 = z.v(parcel, i26);
                            break;
                        case 3:
                            zR9 = z.r(parcel, i26);
                            break;
                        case 4:
                            strE20 = z.e(parcel, i26);
                            break;
                        case 5:
                            strE21 = z.e(parcel, i26);
                            break;
                        case 6:
                            strE22 = z.e(parcel, i26);
                            break;
                        case 7:
                            bundleB2 = z.b(parcel, i26);
                            break;
                        case '\b':
                            strE23 = z.e(parcel, i26);
                            break;
                        default:
                            z.F(parcel, i26);
                            break;
                    }
                }
                z.i(parcel, iH16);
                return new zzcl(jV5, jV6, zR9, strE20, strE21, strE22, bundleB2, strE23);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f92a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i10];
            case 1:
                return new MediaDescriptionCompat[i10];
            case 2:
                return new MediaMetadataCompat[i10];
            case 3:
                return new RatingCompat[i10];
            case 4:
                return new MediaSessionCompat$QueueItem[i10];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i10];
            case 6:
                return new MediaSessionCompat$Token[i10];
            case 7:
                return new ParcelableVolumeInfo[i10];
            case 8:
                return new PlaybackStateCompat[i10];
            case 9:
                return new android.support.v4.os.ResultReceiver[i10];
            case 10:
                return new ActivityResult[i10];
            case 11:
                return new IntentSenderRequest[i10];
            case 12:
                return new ParcelImpl[i10];
            case 13:
                return new MonthAdapter$CalendarDay[i10];
            case 14:
                return new zza[i10];
            case 15:
                return new zzc[i10];
            case 16:
                return new GoogleSignInAccount[i10];
            case 17:
                return new Scope[i10];
            case 18:
                return new Status[i10];
            case 19:
                return new TelemetryData[i10];
            case 20:
                return new MethodInvocation[i10];
            case sf.zzm /* 21 */:
                return new zat[i10];
            case 22:
                return new zav[i10];
            case 23:
                return new RootTelemetryConfiguration[i10];
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return new zzk[i10];
            case 25:
                return new ConnectionTelemetryConfiguration[i10];
            case 26:
                return new GetServiceRequest[i10];
            case 27:
                return new ConnectionResult[i10];
            case 28:
                return new Feature[i10];
            default:
                return new zzcl[i10];
        }
    }
}

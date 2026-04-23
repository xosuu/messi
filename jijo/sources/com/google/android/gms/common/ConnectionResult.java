package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import b7.u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.sf;
import f.f;
import g4.d0;
import java.util.Arrays;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2470b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f2471d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2472f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConnectionResult f2468h = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new a(27);

    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f2469a = i10;
        this.f2470b = i11;
        this.f2471d = pendingIntent;
        this.f2472f = str;
    }

    public static String b(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case sf.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return fb1.h("UNKNOWN_ERROR_CODE(", i10, ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f2470b == connectionResult.f2470b && u.i(this.f2471d, connectionResult.f2471d) && u.i(this.f2472f, connectionResult.f2472f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2470b), this.f2471d, this.f2472f});
    }

    public final String toString() {
        f fVar = new f(this);
        fVar.g(b(this.f2470b), "statusCode");
        fVar.g(this.f2471d, "resolution");
        fVar.g(this.f2472f, "message");
        return fVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f2469a);
        d0.v(parcel, 2, 4);
        parcel.writeInt(this.f2470b);
        d0.n(parcel, 3, this.f2471d, i10);
        d0.o(parcel, 4, this.f2472f);
        d0.u(parcel, iT);
    }

    public ConnectionResult(int i10) {
        this(1, i10, null, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}

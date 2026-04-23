package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import b7.u;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import f.f;
import g4.d0;
import java.util.Arrays;
import p7.q;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new a(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2482b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f2483d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectionResult f2484f;

    public Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f2481a = i10;
        this.f2482b = str;
        this.f2483d = pendingIntent;
        this.f2484f = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2481a == status.f2481a && u.i(this.f2482b, status.f2482b) && u.i(this.f2483d, status.f2483d) && u.i(this.f2484f, status.f2484f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2481a), this.f2482b, this.f2483d, this.f2484f});
    }

    public final String toString() {
        f fVar = new f(this);
        String strK = this.f2482b;
        if (strK == null) {
            strK = q.k(this.f2481a);
        }
        fVar.g(strK, "statusCode");
        fVar.g(this.f2483d, "resolution");
        return fVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f2481a);
        d0.o(parcel, 2, this.f2482b);
        d0.n(parcel, 3, this.f2483d, i10);
        d0.n(parcel, 4, this.f2484f, i10);
        d0.u(parcel, iT);
    }
}

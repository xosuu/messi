package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import g4.d0;
import j4.b;

/* JADX INFO: loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectionResult f11691b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zav f11692d;

    public zak(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f11690a = i10;
        this.f11691b = connectionResult;
        this.f11692d = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11690a);
        d0.n(parcel, 2, this.f11691b, i10);
        d0.n(parcel, 3, this.f11692d, i10);
        d0.u(parcel, iT);
    }
}

package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2452b;

    public zza(String str, String str2) {
        this.f2451a = str;
        this.f2452b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.o(parcel, 1, this.f2451a);
        d0.o(parcel, 2, this.f2452b);
        d0.u(parcel, iT);
    }
}

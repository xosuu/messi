package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbwu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwu> CREATOR = new ar(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11592b;

    public zzbwu(String str, String str2) {
        this.f11591a = str;
        this.f11592b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.o(parcel, 1, this.f11591a);
        g4.d0.o(parcel, 2, this.f11592b);
        g4.d0.u(parcel, iT);
    }

    public zzbwu(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }
}

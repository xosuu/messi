package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzblf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblf> CREATOR = new a2(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f11505b;

    public zzblf(Bundle bundle, String str) {
        this.f11504a = str;
        this.f11505b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.o(parcel, 1, this.f11504a);
        g4.d0.k(parcel, 2, this.f11505b);
        g4.d0.u(parcel, iT);
    }
}

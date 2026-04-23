package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbki extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbki> CREATOR = new a2(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f11490b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f11491d;

    public zzbki(String str, String[] strArr, String[] strArr2) {
        this.f11489a = str;
        this.f11490b = strArr;
        this.f11491d = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.o(parcel, 1, this.f11489a);
        g4.d0.p(parcel, 2, this.f11490b);
        g4.d0.p(parcel, 3, this.f11491d);
        g4.d0.u(parcel, iT);
    }
}

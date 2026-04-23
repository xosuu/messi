package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfpm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpm> CREATOR = new ar(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11627b;

    public zzfpm(byte[] bArr, int i10) {
        this.f11626a = i10;
        this.f11627b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11626a);
        g4.d0.l(parcel, 2, this.f11627b);
        g4.d0.u(parcel, iT);
    }
}

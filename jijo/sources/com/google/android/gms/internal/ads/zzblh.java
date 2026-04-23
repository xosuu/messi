package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzblh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblh> CREATOR = new a2(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11507b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11508d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11509f;

    public zzblh(String str, int i10, int i11, int i12) {
        this.f11506a = i10;
        this.f11507b = i11;
        this.f11508d = str;
        this.f11509f = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11507b);
        g4.d0.o(parcel, 2, this.f11508d);
        g4.d0.v(parcel, 3, 4);
        parcel.writeInt(this.f11509f);
        g4.d0.v(parcel, 1000, 4);
        parcel.writeInt(this.f11506a);
        g4.d0.u(parcel, iT);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfpy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpy> CREATOR = new ar(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11635b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11636d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11637f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11638h;

    public zzfpy(int i10, int i11, int i12, String str, String str2) {
        this.f11634a = i10;
        this.f11635b = i11;
        this.f11636d = str;
        this.f11637f = str2;
        this.f11638h = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11634a);
        g4.d0.v(parcel, 2, 4);
        parcel.writeInt(this.f11635b);
        g4.d0.o(parcel, 3, this.f11636d);
        g4.d0.o(parcel, 4, this.f11637f);
        g4.d0.v(parcel, 5, 4);
        parcel.writeInt(this.f11638h);
        g4.d0.u(parcel, iT);
    }
}

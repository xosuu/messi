package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbkv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkv> CREATOR = new a2(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11501b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11502d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11503f;

    public zzbkv(String str, int i10, String str2, boolean z9) {
        this.f11500a = str;
        this.f11501b = z9;
        this.f11502d = i10;
        this.f11503f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.o(parcel, 1, this.f11500a);
        g4.d0.v(parcel, 2, 4);
        parcel.writeInt(this.f11501b ? 1 : 0);
        g4.d0.v(parcel, 3, 4);
        parcel.writeInt(this.f11502d);
        g4.d0.o(parcel, 4, this.f11503f);
        g4.d0.u(parcel, iT);
    }
}

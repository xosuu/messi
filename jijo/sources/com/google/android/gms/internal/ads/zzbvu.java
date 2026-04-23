package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbvu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvu> CREATOR = new ar(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl f11587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11588b;

    public zzbvu(zzl zzlVar, String str) {
        this.f11587a = zzlVar;
        this.f11588b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.n(parcel, 2, this.f11587a, i10);
        g4.d0.o(parcel, 3, this.f11588b);
        g4.d0.u(parcel, iT);
    }
}

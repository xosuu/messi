package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import g4.d0;
import j4.b;

/* JADX INFO: loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zat f11689b;

    public zai(int i10, zat zatVar) {
        this.f11688a = i10;
        this.f11689b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11688a);
        d0.n(parcel, 2, this.f11689b, i10);
        d0.u(parcel, iT);
    }
}

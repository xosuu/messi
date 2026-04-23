package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;
import j4.b;

/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11684b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Intent f11685d;

    public zaa(int i10, int i11, Intent intent) {
        this.f11683a = i10;
        this.f11684b = i11;
        this.f11685d = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11683a);
        d0.v(parcel, 2, 4);
        parcel.writeInt(this.f11684b);
        d0.n(parcel, 3, this.f11685d, i10);
        d0.u(parcel, iT);
    }
}

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import b7.u;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;
import v3.e0;
import v3.i;

/* JADX INFO: loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new a(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f2527b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConnectionResult f2528d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2529f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2530h;

    public zav(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z9, boolean z10) {
        this.f2526a = i10;
        this.f2527b = iBinder;
        this.f2528d = connectionResult;
        this.f2529f = z9;
        this.f2530h = z10;
    }

    public final boolean equals(Object obj) {
        Object e0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (this.f2528d.equals(zavVar.f2528d)) {
            Object e0Var2 = null;
            IBinder iBinder = this.f2527b;
            if (iBinder == null) {
                e0Var = null;
            } else {
                int i10 = v3.a.f17714b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                e0Var = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new e0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = zavVar.f2527b;
            if (iBinder2 != null) {
                int i11 = v3.a.f17714b;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                e0Var2 = iInterfaceQueryLocalInterface2 instanceof i ? (i) iInterfaceQueryLocalInterface2 : new e0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (u.i(e0Var, e0Var2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f2526a);
        d0.m(parcel, 2, this.f2527b);
        d0.n(parcel, 3, this.f2528d, i10);
        d0.v(parcel, 4, 4);
        parcel.writeInt(this.f2529f ? 1 : 0);
        d0.v(parcel, 5, 4);
        parcel.writeInt(this.f2530h ? 1 : 0);
        d0.u(parcel, iT);
    }
}

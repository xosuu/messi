package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f2531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Feature[] f2532b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2533d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ConnectionTelemetryConfiguration f2534f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.k(parcel, 1, this.f2531a);
        d0.r(parcel, 2, this.f2532b, i10);
        d0.v(parcel, 3, 4);
        parcel.writeInt(this.f2533d);
        d0.n(parcel, 4, this.f2534f, i10);
        d0.u(parcel, iT);
    }
}

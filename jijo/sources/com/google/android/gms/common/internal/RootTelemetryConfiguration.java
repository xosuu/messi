package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2516b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2517d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2518f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2519h;

    public RootTelemetryConfiguration(int i10, boolean z9, boolean z10, int i11, int i12) {
        this.f2515a = i10;
        this.f2516b = z9;
        this.f2517d = z10;
        this.f2518f = i11;
        this.f2519h = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f2515a);
        d0.v(parcel, 2, 4);
        parcel.writeInt(this.f2516b ? 1 : 0);
        d0.v(parcel, 3, 4);
        parcel.writeInt(this.f2517d ? 1 : 0);
        d0.v(parcel, 4, 4);
        parcel.writeInt(this.f2518f);
        d0.v(parcel, 5, 4);
        parcel.writeInt(this.f2519h);
        d0.u(parcel, iT);
    }
}

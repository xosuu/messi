package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RootTelemetryConfiguration f2486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2487b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2488d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f2489f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2490h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f2491q;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z9, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f2486a = rootTelemetryConfiguration;
        this.f2487b = z9;
        this.f2488d = z10;
        this.f2489f = iArr;
        this.f2490h = i10;
        this.f2491q = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.n(parcel, 1, this.f2486a, i10);
        d0.v(parcel, 2, 4);
        parcel.writeInt(this.f2487b ? 1 : 0);
        d0.v(parcel, 3, 4);
        parcel.writeInt(this.f2488d ? 1 : 0);
        int[] iArr = this.f2489f;
        if (iArr != null) {
            int iT2 = d0.t(parcel, 4);
            parcel.writeIntArray(iArr);
            d0.u(parcel, iT2);
        }
        d0.v(parcel, 5, 4);
        parcel.writeInt(this.f2490h);
        int[] iArr2 = this.f2491q;
        if (iArr2 != null) {
            int iT3 = d0.t(parcel, 6);
            parcel.writeIntArray(iArr2);
            d0.u(parcel, iT3);
        }
        d0.u(parcel, iT);
    }
}

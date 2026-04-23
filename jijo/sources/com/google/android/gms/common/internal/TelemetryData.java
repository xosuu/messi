package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new a(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2521b;

    public TelemetryData(int i10, List list) {
        this.f2520a = i10;
        this.f2521b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f2520a);
        d0.s(parcel, 2, this.f2521b);
        d0.u(parcel, iT);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbue> CREATOR = new ar(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11564b;

    public zzbue(List list, boolean z9) {
        this.f11563a = z9;
        this.f11564b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 2, 4);
        parcel.writeInt(this.f11563a ? 1 : 0);
        g4.d0.q(parcel, 3, this.f11564b);
        g4.d0.u(parcel, iT);
    }
}

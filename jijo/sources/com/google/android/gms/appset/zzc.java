package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new a(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2454b;

    public zzc(String str, int i10) {
        this.f2453a = str;
        this.f2454b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.o(parcel, 1, this.f2453a);
        d0.v(parcel, 2, 4);
        parcel.writeInt(this.f2454b);
        d0.u(parcel, iT);
    }
}

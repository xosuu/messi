package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbyq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyq> CREATOR = new ar(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11602b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzq f11603d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzl f11604f;

    public zzbyq(String str, String str2, zzq zzqVar, zzl zzlVar) {
        this.f11601a = str;
        this.f11602b = str2;
        this.f11603d = zzqVar;
        this.f11604f = zzlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.o(parcel, 1, this.f11601a);
        g4.d0.o(parcel, 2, this.f11602b);
        g4.d0.n(parcel, 3, this.f11603d, i10);
        g4.d0.n(parcel, 4, this.f11604f, i10);
        g4.d0.u(parcel, iT);
    }
}

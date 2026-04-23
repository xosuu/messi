package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbxi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxi> CREATOR = new ar(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11594b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11595d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11596f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f11597h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f11598q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f11600t;

    public zzbxi(String str, String str2, boolean z9, boolean z10, List list, boolean z11, boolean z12, List list2) {
        this.f11593a = str;
        this.f11594b = str2;
        this.f11595d = z9;
        this.f11596f = z10;
        this.f11597h = list;
        this.f11598q = z11;
        this.f11599s = z12;
        this.f11600t = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.o(parcel, 2, this.f11593a);
        g4.d0.o(parcel, 3, this.f11594b);
        g4.d0.v(parcel, 4, 4);
        parcel.writeInt(this.f11595d ? 1 : 0);
        g4.d0.v(parcel, 5, 4);
        parcel.writeInt(this.f11596f ? 1 : 0);
        g4.d0.q(parcel, 6, this.f11597h);
        g4.d0.v(parcel, 7, 4);
        parcel.writeInt(this.f11598q ? 1 : 0);
        g4.d0.v(parcel, 8, 4);
        parcel.writeInt(this.f11599s ? 1 : 0);
        g4.d0.q(parcel, 9, this.f11600t);
        g4.d0.u(parcel, iT);
    }
}

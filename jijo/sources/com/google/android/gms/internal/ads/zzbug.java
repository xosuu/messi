package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbug extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbug> CREATOR = new ar(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11566b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f11567d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f11568f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11569h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f11570q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f11571s;

    public zzbug(String str, int i10, Bundle bundle, byte[] bArr, boolean z9, String str2, String str3) {
        this.f11565a = str;
        this.f11566b = i10;
        this.f11567d = bundle;
        this.f11568f = bArr;
        this.f11569h = z9;
        this.f11570q = str2;
        this.f11571s = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.o(parcel, 1, this.f11565a);
        g4.d0.v(parcel, 2, 4);
        parcel.writeInt(this.f11566b);
        g4.d0.k(parcel, 3, this.f11567d);
        g4.d0.l(parcel, 4, this.f11568f);
        g4.d0.v(parcel, 5, 4);
        parcel.writeInt(this.f11569h ? 1 : 0);
        g4.d0.o(parcel, 6, this.f11570q);
        g4.d0.o(parcel, 7, this.f11571s);
        g4.d0.u(parcel, iT);
    }
}

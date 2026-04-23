package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new a(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11676b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11677d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11678f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11679h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f11680q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f11681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f11682t;

    public zzcl(long j10, long j11, boolean z9, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f11675a = j10;
        this.f11676b = j11;
        this.f11677d = z9;
        this.f11678f = str;
        this.f11679h = str2;
        this.f11680q = str3;
        this.f11681s = bundle;
        this.f11682t = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 8);
        parcel.writeLong(this.f11675a);
        d0.v(parcel, 2, 8);
        parcel.writeLong(this.f11676b);
        d0.v(parcel, 3, 4);
        parcel.writeInt(this.f11677d ? 1 : 0);
        d0.o(parcel, 4, this.f11678f);
        d0.o(parcel, 5, this.f11679h);
        d0.o(parcel, 6, this.f11680q);
        d0.k(parcel, 7, this.f11681s);
        d0.o(parcel, 8, this.f11682t);
        d0.u(parcel, iT);
    }
}

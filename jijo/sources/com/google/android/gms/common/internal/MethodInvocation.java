package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2507b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2508d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2509f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2510h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f2511q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f2512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2514u;

    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f2506a = i10;
        this.f2507b = i11;
        this.f2508d = i12;
        this.f2509f = j10;
        this.f2510h = j11;
        this.f2511q = str;
        this.f2512s = str2;
        this.f2513t = i13;
        this.f2514u = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f2506a);
        d0.v(parcel, 2, 4);
        parcel.writeInt(this.f2507b);
        d0.v(parcel, 3, 4);
        parcel.writeInt(this.f2508d);
        d0.v(parcel, 4, 8);
        parcel.writeLong(this.f2509f);
        d0.v(parcel, 5, 8);
        parcel.writeLong(this.f2510h);
        d0.o(parcel, 6, this.f2511q);
        d0.o(parcel, 7, this.f2512s);
        d0.v(parcel, 8, 4);
        parcel.writeInt(this.f2513t);
        d0.v(parcel, 9, 4);
        parcel.writeInt(this.f2514u);
        d0.u(parcel, iT);
    }
}

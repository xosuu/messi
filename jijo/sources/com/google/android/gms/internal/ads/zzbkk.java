package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbkk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkk> CREATOR = new a2(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11493b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11494d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f11495f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f11496h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String[] f11497q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f11499t;

    public zzbkk(boolean z9, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z10, long j10) {
        this.f11492a = z9;
        this.f11493b = str;
        this.f11494d = i10;
        this.f11495f = bArr;
        this.f11496h = strArr;
        this.f11497q = strArr2;
        this.f11498s = z10;
        this.f11499t = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11492a ? 1 : 0);
        g4.d0.o(parcel, 2, this.f11493b);
        g4.d0.v(parcel, 3, 4);
        parcel.writeInt(this.f11494d);
        g4.d0.l(parcel, 4, this.f11495f);
        g4.d0.p(parcel, 5, this.f11496h);
        g4.d0.p(parcel, 6, this.f11497q);
        g4.d0.v(parcel, 7, 4);
        parcel.writeInt(this.f11498s ? 1 : 0);
        g4.d0.v(parcel, 8, 8);
        parcel.writeLong(this.f11499t);
        g4.d0.u(parcel, iT);
    }
}

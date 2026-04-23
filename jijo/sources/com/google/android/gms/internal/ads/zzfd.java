package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfd implements zzbj {
    public static final Parcelable.Creator<zzfd> CREATOR = new ar(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11614b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11615d;

    public zzfd(long j10, long j11, long j12) {
        this.f11613a = j10;
        this.f11614b = j11;
        this.f11615d = j12;
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void a(mi miVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfd)) {
            return false;
        }
        zzfd zzfdVar = (zzfd) obj;
        return this.f11613a == zzfdVar.f11613a && this.f11614b == zzfdVar.f11614b && this.f11615d == zzfdVar.f11615d;
    }

    public final int hashCode() {
        long j10 = this.f11613a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) + 527;
        long j11 = this.f11615d;
        long j12 = j11 ^ (j11 >>> 32);
        long j13 = this.f11614b;
        return (((i10 * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) j12);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f11613a + ", modification time=" + this.f11614b + ", timescale=" + this.f11615d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11613a);
        parcel.writeLong(this.f11614b);
        parcel.writeLong(this.f11615d);
    }

    public /* synthetic */ zzfd(Parcel parcel) {
        this.f11613a = parcel.readLong();
        this.f11614b = parcel.readLong();
        this.f11615d = parcel.readLong();
    }
}

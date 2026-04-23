package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzagr implements zzbj {
    public static final Parcelable.Creator<zzagr> CREATOR = new a2(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11451b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11452d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11453f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11454h;

    public zzagr(long j10, long j11, long j12, long j13, long j14) {
        this.f11450a = j10;
        this.f11451b = j11;
        this.f11452d = j12;
        this.f11453f = j13;
        this.f11454h = j14;
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
        if (obj != null && zzagr.class == obj.getClass()) {
            zzagr zzagrVar = (zzagr) obj;
            if (this.f11450a == zzagrVar.f11450a && this.f11451b == zzagrVar.f11451b && this.f11452d == zzagrVar.f11452d && this.f11453f == zzagrVar.f11453f && this.f11454h == zzagrVar.f11454h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f11450a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) + 527;
        long j11 = this.f11454h;
        long j12 = j11 ^ (j11 >>> 32);
        long j13 = this.f11453f;
        long j14 = j13 ^ (j13 >>> 32);
        long j15 = this.f11452d;
        long j16 = j15 ^ (j15 >>> 32);
        long j17 = this.f11451b;
        return (((((((i10 * 31) + ((int) (j17 ^ (j17 >>> 32)))) * 31) + ((int) j16)) * 31) + ((int) j14)) * 31) + ((int) j12);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f11450a + ", photoSize=" + this.f11451b + ", photoPresentationTimestampUs=" + this.f11452d + ", videoStartPosition=" + this.f11453f + ", videoSize=" + this.f11454h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11450a);
        parcel.writeLong(this.f11451b);
        parcel.writeLong(this.f11452d);
        parcel.writeLong(this.f11453f);
        parcel.writeLong(this.f11454h);
    }

    public /* synthetic */ zzagr(Parcel parcel) {
        this.f11450a = parcel.readLong();
        this.f11451b = parcel.readLong();
        this.f11452d = parcel.readLong();
        this.f11453f = parcel.readLong();
        this.f11454h = parcel.readLong();
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzagu implements Parcelable {
    public static final Parcelable.Creator<zzagu> CREATOR = new a2(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11456b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11457d;

    public zzagu(long j10, long j11, int i10) {
        tc1.K(j10 < j11);
        this.f11455a = j10;
        this.f11456b = j11;
        this.f11457d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagu.class == obj.getClass()) {
            zzagu zzaguVar = (zzagu) obj;
            if (this.f11455a == zzaguVar.f11455a && this.f11456b == zzaguVar.f11456b && this.f11457d == zzaguVar.f11457d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11455a), Long.valueOf(this.f11456b), Integer.valueOf(this.f11457d)});
    }

    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f11455a), Long.valueOf(this.f11456b), Integer.valueOf(this.f11457d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11455a);
        parcel.writeLong(this.f11456b);
        parcel.writeInt(this.f11457d);
    }
}

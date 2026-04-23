package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzagy implements zzbj {
    public static final Parcelable.Creator<zzagy> CREATOR = new a2(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11460b;

    public zzagy(int i10, float f10) {
        this.f11459a = f10;
        this.f11460b = i10;
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
        if (obj != null && zzagy.class == obj.getClass()) {
            zzagy zzagyVar = (zzagy) obj;
            if (this.f11459a == zzagyVar.f11459a && this.f11460b == zzagyVar.f11460b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f11459a).hashCode() + 527) * 31) + this.f11460b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f11459a + ", svcTemporalLayerCount=" + this.f11460b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f11459a);
        parcel.writeInt(this.f11460b);
    }

    public /* synthetic */ zzagy(Parcel parcel) {
        this.f11459a = parcel.readFloat();
        this.f11460b = parcel.readInt();
    }
}

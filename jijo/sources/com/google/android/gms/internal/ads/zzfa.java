package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfa implements zzbj {
    public static final Parcelable.Creator<zzfa> CREATOR = new ar(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11612b;

    public zzfa(float f10, float f11) {
        boolean z9 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z9 = true;
        }
        tc1.Q("Invalid latitude or longitude", z9);
        this.f11611a = f10;
        this.f11612b = f11;
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
        if (obj != null && zzfa.class == obj.getClass()) {
            zzfa zzfaVar = (zzfa) obj;
            if (this.f11611a == zzfaVar.f11611a && this.f11612b == zzfaVar.f11612b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f11611a).hashCode() + 527) * 31) + Float.valueOf(this.f11612b).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.f11611a + ", longitude=" + this.f11612b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f11611a);
        parcel.writeFloat(this.f11612b);
    }

    public /* synthetic */ zzfa(Parcel parcel) {
        this.f11611a = parcel.readFloat();
        this.f11612b = parcel.readFloat();
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzagg extends zzagd {
    public static final Parcelable.Creator<zzagg> CREATOR = new a2(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11436b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11437d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11438f;

    public zzagg(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11436b = string;
        this.f11437d = parcel.readString();
        this.f11438f = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagg.class == obj.getClass()) {
            zzagg zzaggVar = (zzagg) obj;
            if (yn0.c(this.f11437d, zzaggVar.f11437d) && yn0.c(this.f11436b, zzaggVar.f11436b) && yn0.c(this.f11438f, zzaggVar.f11438f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11436b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f11437d;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f11438f;
        return (((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final String toString() {
        return this.f11435a + ": domain=" + this.f11436b + ", description=" + this.f11437d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11435a);
        parcel.writeString(this.f11436b);
        parcel.writeString(this.f11438f);
    }

    public zzagg(String str, String str2, String str3) {
        super("----");
        this.f11436b = str;
        this.f11437d = str2;
        this.f11438f = str3;
    }
}

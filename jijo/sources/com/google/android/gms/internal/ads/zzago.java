package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzago extends zzagd {
    public static final Parcelable.Creator<zzago> CREATOR = new a2(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11448b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11449d;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzago(Parcel parcel) {
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        super(string);
        this.f11448b = parcel.readString();
        this.f11449d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzago.class == obj.getClass()) {
            zzago zzagoVar = (zzago) obj;
            if (this.f11435a.equals(zzagoVar.f11435a) && yn0.c(this.f11448b, zzagoVar.f11448b) && yn0.c(this.f11449d, zzagoVar.f11449d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f11435a.hashCode() + 527;
        String str = this.f11448b;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i10 = iHashCode * 31;
        String str2 = this.f11449d;
        return ((i10 + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final String toString() {
        return this.f11435a + ": url=" + this.f11449d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11435a);
        parcel.writeString(this.f11448b);
        parcel.writeString(this.f11449d);
    }

    public zzago(String str, String str2, String str3) {
        super(str);
        this.f11448b = str2;
        this.f11449d = str3;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzafx extends zzagd {
    public static final Parcelable.Creator<zzafx> CREATOR = new a2(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11428b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11429d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11430f;

    public zzafx(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11428b = string;
        this.f11429d = parcel.readString();
        this.f11430f = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafx.class == obj.getClass()) {
            zzafx zzafxVar = (zzafx) obj;
            if (yn0.c(this.f11429d, zzafxVar.f11429d) && yn0.c(this.f11428b, zzafxVar.f11428b) && yn0.c(this.f11430f, zzafxVar.f11430f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11428b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f11429d;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f11430f;
        return (((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final String toString() {
        return this.f11435a + ": language=" + this.f11428b + ", description=" + this.f11429d + ", text=" + this.f11430f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11435a);
        parcel.writeString(this.f11428b);
        parcel.writeString(this.f11430f);
    }

    public zzafx(String str, String str2, String str3) {
        super("COMM");
        this.f11428b = str;
        this.f11429d = str2;
        this.f11430f = str3;
    }
}

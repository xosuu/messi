package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzafz extends zzagd {
    public static final Parcelable.Creator<zzafz> CREATOR = new a2(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11431b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11432d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11433f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f11434h;

    public zzafz(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11431b = string;
        this.f11432d = parcel.readString();
        this.f11433f = parcel.readString();
        this.f11434h = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafz.class == obj.getClass()) {
            zzafz zzafzVar = (zzafz) obj;
            if (yn0.c(this.f11431b, zzafzVar.f11431b) && yn0.c(this.f11432d, zzafzVar.f11432d) && yn0.c(this.f11433f, zzafzVar.f11433f) && Arrays.equals(this.f11434h, zzafzVar.f11434h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11431b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f11432d;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f11433f;
        return Arrays.hashCode(this.f11434h) + (((((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final String toString() {
        return this.f11435a + ": mimeType=" + this.f11431b + ", filename=" + this.f11432d + ", description=" + this.f11433f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11431b);
        parcel.writeString(this.f11432d);
        parcel.writeString(this.f11433f);
        parcel.writeByteArray(this.f11434h);
    }

    public zzafz(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f11431b = str;
        this.f11432d = str2;
        this.f11433f = str3;
        this.f11434h = bArr;
    }
}

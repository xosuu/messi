package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzafn implements zzbj {
    public static final Parcelable.Creator<zzafn> CREATOR = new a2(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11407b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11408d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11409f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11410h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11411q;

    public zzafn(int i10, int i11, String str, String str2, String str3, boolean z9) {
        boolean z10 = true;
        if (i11 != -1 && i11 <= 0) {
            z10 = false;
        }
        tc1.K(z10);
        this.f11406a = i10;
        this.f11407b = str;
        this.f11408d = str2;
        this.f11409f = str3;
        this.f11410h = z9;
        this.f11411q = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final void a(mi miVar) {
        String str = this.f11408d;
        if (str != null) {
            miVar.f6966v = str;
        }
        String str2 = this.f11407b;
        if (str2 != null) {
            miVar.f6965u = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafn.class == obj.getClass()) {
            zzafn zzafnVar = (zzafn) obj;
            if (this.f11406a == zzafnVar.f11406a && yn0.c(this.f11407b, zzafnVar.f11407b) && yn0.c(this.f11408d, zzafnVar.f11408d) && yn0.c(this.f11409f, zzafnVar.f11409f) && this.f11410h == zzafnVar.f11410h && this.f11411q == zzafnVar.f11411q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11407b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f11408d;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = ((this.f11406a + 527) * 31) + iHashCode;
        String str3 = this.f11409f;
        return (((((((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f11410h ? 1 : 0)) * 31) + this.f11411q;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f11408d + "\", genre=\"" + this.f11407b + "\", bitrate=" + this.f11406a + ", metadataInterval=" + this.f11411q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11406a);
        parcel.writeString(this.f11407b);
        parcel.writeString(this.f11408d);
        parcel.writeString(this.f11409f);
        int i11 = yn0.f10944a;
        parcel.writeInt(this.f11410h ? 1 : 0);
        parcel.writeInt(this.f11411q);
    }

    public zzafn(Parcel parcel) {
        this.f11406a = parcel.readInt();
        this.f11407b = parcel.readString();
        this.f11408d = parcel.readString();
        this.f11409f = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11410h = parcel.readInt() != 0;
        this.f11411q = parcel.readInt();
    }
}

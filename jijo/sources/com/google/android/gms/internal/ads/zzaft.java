package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzaft extends zzagd {
    public static final Parcelable.Creator<zzaft> CREATOR = new a2(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11417b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11418d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11419f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11420h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f11421q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzagd[] f11422s;

    public zzaft(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11417b = string;
        this.f11418d = parcel.readInt();
        this.f11419f = parcel.readInt();
        this.f11420h = parcel.readLong();
        this.f11421q = parcel.readLong();
        int i11 = parcel.readInt();
        this.f11422s = new zzagd[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f11422s[i12] = (zzagd) parcel.readParcelable(zzagd.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagd, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaft.class == obj.getClass()) {
            zzaft zzaftVar = (zzaft) obj;
            if (this.f11418d == zzaftVar.f11418d && this.f11419f == zzaftVar.f11419f && this.f11420h == zzaftVar.f11420h && this.f11421q == zzaftVar.f11421q && yn0.c(this.f11417b, zzaftVar.f11417b) && Arrays.equals(this.f11422s, zzaftVar.f11422s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11417b;
        return ((((((((this.f11418d + 527) * 31) + this.f11419f) * 31) + ((int) this.f11420h)) * 31) + ((int) this.f11421q)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11417b);
        parcel.writeInt(this.f11418d);
        parcel.writeInt(this.f11419f);
        parcel.writeLong(this.f11420h);
        parcel.writeLong(this.f11421q);
        zzagd[] zzagdVarArr = this.f11422s;
        parcel.writeInt(zzagdVarArr.length);
        for (zzagd zzagdVar : zzagdVarArr) {
            parcel.writeParcelable(zzagdVar, 0);
        }
    }

    public zzaft(String str, int i10, int i11, long j10, long j11, zzagd[] zzagdVarArr) {
        super("CHAP");
        this.f11417b = str;
        this.f11418d = i10;
        this.f11419f = i11;
        this.f11420h = j10;
        this.f11421q = j11;
        this.f11422s = zzagdVarArr;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzagi extends zzagd {
    public static final Parcelable.Creator<zzagi> CREATOR = new a2(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11439b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11440d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11441f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f11442h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f11443q;

    public zzagi(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f11439b = i10;
        this.f11440d = i11;
        this.f11441f = i12;
        this.f11442h = iArr;
        this.f11443q = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzagd, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagi.class == obj.getClass()) {
            zzagi zzagiVar = (zzagi) obj;
            if (this.f11439b == zzagiVar.f11439b && this.f11440d == zzagiVar.f11440d && this.f11441f == zzagiVar.f11441f && Arrays.equals(this.f11442h, zzagiVar.f11442h) && Arrays.equals(this.f11443q, zzagiVar.f11443q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11443q) + ((Arrays.hashCode(this.f11442h) + ((((((this.f11439b + 527) * 31) + this.f11440d) * 31) + this.f11441f) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11439b);
        parcel.writeInt(this.f11440d);
        parcel.writeInt(this.f11441f);
        parcel.writeIntArray(this.f11442h);
        parcel.writeIntArray(this.f11443q);
    }

    public zzagi(Parcel parcel) {
        super("MLLT");
        this.f11439b = parcel.readInt();
        this.f11440d = parcel.readInt();
        this.f11441f = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i10 = yn0.f10944a;
        this.f11442h = iArrCreateIntArray;
        this.f11443q = parcel.createIntArray();
    }
}

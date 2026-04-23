package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class zzy implements Comparator<zzx>, Parcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new ar(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzx[] f11670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11671b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11672d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11673f;

    public zzy(Parcel parcel) {
        this.f11672d = parcel.readString();
        zzx[] zzxVarArr = (zzx[]) parcel.createTypedArray(zzx.CREATOR);
        int i10 = yn0.f10944a;
        this.f11670a = zzxVarArr;
        this.f11673f = zzxVarArr.length;
    }

    public final zzy b(String str) {
        return yn0.c(this.f11672d, str) ? this : new zzy(str, false, this.f11670a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzx zzxVar, zzx zzxVar2) {
        zzx zzxVar3 = zzxVar;
        zzx zzxVar4 = zzxVar2;
        UUID uuid = bj1.f3036a;
        return uuid.equals(zzxVar3.f11666b) ? !uuid.equals(zzxVar4.f11666b) ? 1 : 0 : zzxVar3.f11666b.compareTo(zzxVar4.f11666b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzy.class == obj.getClass()) {
            zzy zzyVar = (zzy) obj;
            if (yn0.c(this.f11672d, zzyVar.f11672d) && Arrays.equals(this.f11670a, zzyVar.f11670a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f11671b;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f11672d;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f11670a);
        this.f11671b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11672d);
        parcel.writeTypedArray(this.f11670a, 0);
    }

    public zzy(String str, boolean z9, zzx... zzxVarArr) {
        this.f11672d = str;
        zzxVarArr = z9 ? (zzx[]) zzxVarArr.clone() : zzxVarArr;
        this.f11670a = zzxVarArr;
        this.f11673f = zzxVarArr.length;
        Arrays.sort(zzxVarArr, this);
    }
}

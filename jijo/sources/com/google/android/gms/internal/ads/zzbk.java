package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbk implements Parcelable {
    public static final Parcelable.Creator<zzbk> CREATOR = new a2(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbj[] f11487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11488b;

    public zzbk(long j10, zzbj... zzbjVarArr) {
        this.f11488b = j10;
        this.f11487a = zzbjVarArr;
    }

    public final int b() {
        return this.f11487a.length;
    }

    public final zzbj c(int i10) {
        return this.f11487a[i10];
    }

    public final zzbk d(zzbj... zzbjVarArr) {
        int length = zzbjVarArr.length;
        if (length == 0) {
            return this;
        }
        int i10 = yn0.f10944a;
        zzbj[] zzbjVarArr2 = this.f11487a;
        int length2 = zzbjVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzbjVarArr2, length2 + length);
        System.arraycopy(zzbjVarArr, 0, objArrCopyOf, length2, length);
        return new zzbk(this.f11488b, (zzbj[]) objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final zzbk e(zzbk zzbkVar) {
        return zzbkVar == null ? this : d(zzbkVar.f11487a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbk.class == obj.getClass()) {
            zzbk zzbkVar = (zzbk) obj;
            if (Arrays.equals(this.f11487a, zzbkVar.f11487a) && this.f11488b == zzbkVar.f11488b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f11487a) * 31;
        long j10 = this.f11488b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        long j10 = this.f11488b;
        return fb1.i("entries=", Arrays.toString(this.f11487a), j10 == -9223372036854775807L ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : l.a0.g(", presentationTimeUs=", j10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzbj[] zzbjVarArr = this.f11487a;
        parcel.writeInt(zzbjVarArr.length);
        for (zzbj zzbjVar : zzbjVarArr) {
            parcel.writeParcelable(zzbjVar, 0);
        }
        parcel.writeLong(this.f11488b);
    }

    public zzbk(Parcel parcel) {
        this.f11487a = new zzbj[parcel.readInt()];
        int i10 = 0;
        while (true) {
            zzbj[] zzbjVarArr = this.f11487a;
            if (i10 >= zzbjVarArr.length) {
                this.f11488b = parcel.readLong();
                return;
            } else {
                zzbjVarArr[i10] = (zzbj) parcel.readParcelable(zzbj.class.getClassLoader());
                i10++;
            }
        }
    }

    public zzbk(List list) {
        this(-9223372036854775807L, (zzbj[]) list.toArray(new zzbj[0]));
    }
}

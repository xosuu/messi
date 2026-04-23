package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzafj implements zzbj {
    public static final Parcelable.Creator<zzafj> CREATOR = new a2(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11397b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11398d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11399f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11400h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11401q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f11403t;

    public zzafj(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f11396a = i10;
        this.f11397b = str;
        this.f11398d = str2;
        this.f11399f = i11;
        this.f11400h = i12;
        this.f11401q = i13;
        this.f11402s = i14;
        this.f11403t = bArr;
    }

    public static zzafj b(ik0 ik0Var) {
        int iQ = ik0Var.q();
        String strE = xm.e(ik0Var.a(ik0Var.q(), fx0.f4679a));
        String strA = ik0Var.a(ik0Var.q(), fx0.f4681c);
        int iQ2 = ik0Var.q();
        int iQ3 = ik0Var.q();
        int iQ4 = ik0Var.q();
        int iQ5 = ik0Var.q();
        int iQ6 = ik0Var.q();
        byte[] bArr = new byte[iQ6];
        ik0Var.e(0, bArr, iQ6);
        return new zzafj(iQ, strE, strA, iQ2, iQ3, iQ4, iQ5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final void a(mi miVar) {
        miVar.a(this.f11403t, this.f11396a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafj.class == obj.getClass()) {
            zzafj zzafjVar = (zzafj) obj;
            if (this.f11396a == zzafjVar.f11396a && this.f11397b.equals(zzafjVar.f11397b) && this.f11398d.equals(zzafjVar.f11398d) && this.f11399f == zzafjVar.f11399f && this.f11400h == zzafjVar.f11400h && this.f11401q == zzafjVar.f11401q && this.f11402s == zzafjVar.f11402s && Arrays.equals(this.f11403t, zzafjVar.f11403t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11403t) + ((((((((((this.f11398d.hashCode() + ((this.f11397b.hashCode() + ((this.f11396a + 527) * 31)) * 31)) * 31) + this.f11399f) * 31) + this.f11400h) * 31) + this.f11401q) * 31) + this.f11402s) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f11397b + ", description=" + this.f11398d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11396a);
        parcel.writeString(this.f11397b);
        parcel.writeString(this.f11398d);
        parcel.writeInt(this.f11399f);
        parcel.writeInt(this.f11400h);
        parcel.writeInt(this.f11401q);
        parcel.writeInt(this.f11402s);
        parcel.writeByteArray(this.f11403t);
    }

    public zzafj(Parcel parcel) {
        this.f11396a = parcel.readInt();
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11397b = string;
        this.f11398d = parcel.readString();
        this.f11399f = parcel.readInt();
        this.f11400h = parcel.readInt();
        this.f11401q = parcel.readInt();
        this.f11402s = parcel.readInt();
        this.f11403t = parcel.createByteArray();
    }
}

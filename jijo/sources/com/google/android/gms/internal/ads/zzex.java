package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzex implements zzbj {
    public static final Parcelable.Creator<zzex> CREATOR = new ar(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11608b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11609d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11610f;

    public zzex(String str, byte[] bArr, int i10, int i11) {
        this.f11607a = str;
        this.f11608b = bArr;
        this.f11609d = i10;
        this.f11610f = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void a(mi miVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzex.class == obj.getClass()) {
            zzex zzexVar = (zzex) obj;
            if (this.f11607a.equals(zzexVar.f11607a) && Arrays.equals(this.f11608b, zzexVar.f11608b) && this.f11609d == zzexVar.f11609d && this.f11610f == zzexVar.f11610f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11608b) + ((this.f11607a.hashCode() + 527) * 31)) * 31) + this.f11609d) * 31) + this.f11610f;
    }

    public final String toString() {
        String str;
        byte[] bArr = this.f11608b;
        int i10 = this.f11610f;
        if (i10 == 1) {
            int i11 = yn0.f10944a;
            str = new String(bArr, fx0.f4681c);
        } else if (i10 == 23) {
            str = String.valueOf(Float.intBitsToFloat(tp1.k0(bArr)));
        } else if (i10 != 67) {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(length + length);
            for (int i12 = 0; i12 < bArr.length; i12++) {
                sb.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i12] & 15, 16));
            }
            str = sb.toString();
        } else {
            str = String.valueOf(tp1.k0(bArr));
        }
        return "mdta: key=" + this.f11607a + ", value=" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11607a);
        parcel.writeByteArray(this.f11608b);
        parcel.writeInt(this.f11609d);
        parcel.writeInt(this.f11610f);
    }

    public /* synthetic */ zzex(Parcel parcel) {
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11607a = string;
        this.f11608b = parcel.createByteArray();
        this.f11609d = parcel.readInt();
        this.f11610f = parcel.readInt();
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzafp extends zzagd {
    public static final Parcelable.Creator<zzafp> CREATOR = new a2(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11412b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11413d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11414f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f11415h;

    public zzafp(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11412b = string;
        this.f11413d = parcel.readString();
        this.f11414f = parcel.readInt();
        this.f11415h = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.zzagd, com.google.android.gms.internal.ads.zzbj
    public final void a(mi miVar) {
        miVar.a(this.f11415h, this.f11414f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafp.class == obj.getClass()) {
            zzafp zzafpVar = (zzafp) obj;
            if (this.f11414f == zzafpVar.f11414f && yn0.c(this.f11412b, zzafpVar.f11412b) && yn0.c(this.f11413d, zzafpVar.f11413d) && Arrays.equals(this.f11415h, zzafpVar.f11415h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11412b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f11413d;
        return Arrays.hashCode(this.f11415h) + ((((((this.f11414f + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final String toString() {
        return this.f11435a + ": mimeType=" + this.f11412b + ", description=" + this.f11413d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11412b);
        parcel.writeString(this.f11413d);
        parcel.writeInt(this.f11414f);
        parcel.writeByteArray(this.f11415h);
    }

    public zzafp(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f11412b = str;
        this.f11413d = str2;
        this.f11414f = i10;
        this.f11415h = bArr;
    }
}

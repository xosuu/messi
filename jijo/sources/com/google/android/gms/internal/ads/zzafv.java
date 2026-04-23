package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzafv extends zzagd {
    public static final Parcelable.Creator<zzafv> CREATOR = new a2(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11423b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11424d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11425f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f11426h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zzagd[] f11427q;

    public zzafv(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11423b = string;
        this.f11424d = parcel.readByte() != 0;
        this.f11425f = parcel.readByte() != 0;
        this.f11426h = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.f11427q = new zzagd[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f11427q[i12] = (zzagd) parcel.readParcelable(zzagd.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafv.class == obj.getClass()) {
            zzafv zzafvVar = (zzafv) obj;
            if (this.f11424d == zzafvVar.f11424d && this.f11425f == zzafvVar.f11425f && yn0.c(this.f11423b, zzafvVar.f11423b) && Arrays.equals(this.f11426h, zzafvVar.f11426h) && Arrays.equals(this.f11427q, zzafvVar.f11427q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11423b;
        return (((((this.f11424d ? 1 : 0) + 527) * 31) + (this.f11425f ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11423b);
        parcel.writeByte(this.f11424d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11425f ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f11426h);
        zzagd[] zzagdVarArr = this.f11427q;
        parcel.writeInt(zzagdVarArr.length);
        for (zzagd zzagdVar : zzagdVarArr) {
            parcel.writeParcelable(zzagdVar, 0);
        }
    }

    public zzafv(String str, boolean z9, boolean z10, String[] strArr, zzagd[] zzagdVarArr) {
        super("CTOC");
        this.f11423b = str;
        this.f11424d = z9;
        this.f11425f = z10;
        this.f11426h = strArr;
        this.f11427q = zzagdVarArr;
    }
}

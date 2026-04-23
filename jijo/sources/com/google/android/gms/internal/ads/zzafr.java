package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzafr extends zzagd {
    public static final Parcelable.Creator<zzafr> CREATOR = new a2(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11416b;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzafr(Parcel parcel) {
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        super(string);
        this.f11416b = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafr.class == obj.getClass()) {
            zzafr zzafrVar = (zzafr) obj;
            if (this.f11435a.equals(zzafrVar.f11435a) && Arrays.equals(this.f11416b, zzafrVar.f11416b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11416b) + ((this.f11435a.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11435a);
        parcel.writeByteArray(this.f11416b);
    }

    public zzafr(String str, byte[] bArr) {
        super(str);
        this.f11416b = bArr;
    }
}

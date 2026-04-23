package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzagk extends zzagd {
    public static final Parcelable.Creator<zzagk> CREATOR = new a2(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11444b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11445d;

    public zzagk(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11444b = string;
        this.f11445d = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagk.class == obj.getClass()) {
            zzagk zzagkVar = (zzagk) obj;
            if (yn0.c(this.f11444b, zzagkVar.f11444b) && Arrays.equals(this.f11445d, zzagkVar.f11445d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11444b;
        return Arrays.hashCode(this.f11445d) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final String toString() {
        return this.f11435a + ": owner=" + this.f11444b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11444b);
        parcel.writeByteArray(this.f11445d);
    }

    public zzagk(String str, byte[] bArr) {
        super("PRIV");
        this.f11444b = str;
        this.f11445d = bArr;
    }
}

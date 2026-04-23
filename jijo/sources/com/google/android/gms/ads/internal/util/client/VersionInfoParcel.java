package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzs();
    public String afmaVersion;
    public int buddyApkVersion;
    public int clientJarVersion;
    public boolean isClientJar;
    public boolean isLiteSdk;

    public VersionInfoParcel(String str, int i10, int i11, boolean z9, boolean z10) {
        this.afmaVersion = str;
        this.buddyApkVersion = i10;
        this.clientJarVersion = i11;
        this.isClientJar = z9;
        this.isLiteSdk = z10;
    }

    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.o(parcel, 2, this.afmaVersion);
        int i11 = this.buddyApkVersion;
        d0.v(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.clientJarVersion;
        d0.v(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z9 = this.isClientJar;
        d0.v(parcel, 5, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.isLiteSdk;
        d0.v(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.u(parcel, iT);
    }

    public VersionInfoParcel(int i10, int i11, boolean z9) {
        this(i10, i11, z9, false, false);
    }

    public VersionInfoParcel(int i10, int i11, boolean z9, boolean z10) {
        this(i10, i11, z9, false, z10);
    }

    public VersionInfoParcel(int i10, int i11, boolean z9, boolean z10, boolean z11) {
        this("afma-sdk-a-v" + i10 + "." + i11 + "." + (z9 ? "0" : z10 ? "2" : "1"), i10, i11, z9, z11);
    }
}

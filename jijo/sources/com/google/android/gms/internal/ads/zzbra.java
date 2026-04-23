package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzbra extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbra> CREATOR = new a2(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11515b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11516d;

    public zzbra(int i10, int i11, int i12) {
        this.f11514a = i10;
        this.f11515b = i11;
        this.f11516d = i12;
    }

    public static zzbra b(VersionInfo versionInfo) {
        return new zzbra(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbra)) {
            zzbra zzbraVar = (zzbra) obj;
            if (zzbraVar.f11516d == this.f11516d && zzbraVar.f11515b == this.f11515b && zzbraVar.f11514a == this.f11514a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f11514a, this.f11515b, this.f11516d});
    }

    public final String toString() {
        return this.f11514a + "." + this.f11515b + "." + this.f11516d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11514a);
        g4.d0.v(parcel, 2, 4);
        parcel.writeInt(this.f11515b);
        g4.d0.v(parcel, 3, 4);
        parcel.writeInt(this.f11516d);
        g4.d0.u(parcel, iT);
    }
}

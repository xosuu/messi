package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2040b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2041d;

    public zzen(int i10, int i11, String str) {
        this.f2039a = i10;
        this.f2040b = i11;
        this.f2041d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f2039a);
        d0.v(parcel, 2, 4);
        parcel.writeInt(this.f2040b);
        d0.o(parcel, 3, this.f2041d);
        d0.u(parcel, iT);
    }

    public final int zza() {
        return this.f2040b;
    }

    public final String zzb() {
        return this.f2041d;
    }

    public zzen() {
        this(ModuleDescriptor.MODULE_VERSION, 242402000, "23.3.0");
    }
}

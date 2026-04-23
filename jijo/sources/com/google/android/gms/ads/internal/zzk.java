package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzk(boolean z9, boolean z10, String str, boolean z11, float f10, int i10, boolean z12, boolean z13, boolean z14) {
        this.zza = z9;
        this.zzb = z10;
        this.zzc = str;
        this.zzd = z11;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = z12;
        this.zzh = z13;
        this.zzi = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z9 = this.zza;
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 2, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.zzb;
        d0.v(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.o(parcel, 4, this.zzc);
        boolean z11 = this.zzd;
        d0.v(parcel, 5, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.zze;
        d0.v(parcel, 6, 4);
        parcel.writeFloat(f10);
        int i11 = this.zzf;
        d0.v(parcel, 7, 4);
        parcel.writeInt(i11);
        boolean z12 = this.zzg;
        d0.v(parcel, 8, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.zzh;
        d0.v(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.zzi;
        d0.v(parcel, 10, 4);
        parcel.writeInt(z14 ? 1 : 0);
        d0.u(parcel, iT);
    }

    public zzk(boolean z9, boolean z10, boolean z11, float f10, int i10, boolean z12, boolean z13, boolean z14) {
        this(z9, z10, null, z11, f10, -1, z12, z13, z14);
    }
}

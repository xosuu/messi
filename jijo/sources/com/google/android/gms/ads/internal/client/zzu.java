package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public final String zza;
    public long zzb;
    public zze zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    public zzu(String str, long j10, zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iT = d0.t(parcel, 20293);
        d0.o(parcel, 1, str);
        long j10 = this.zzb;
        d0.v(parcel, 2, 8);
        parcel.writeLong(j10);
        d0.n(parcel, 3, this.zzc, i10);
        d0.k(parcel, 4, this.zzd);
        d0.o(parcel, 5, this.zze);
        d0.o(parcel, 6, this.zzf);
        d0.o(parcel, 7, this.zzg);
        d0.o(parcel, 8, this.zzh);
        d0.u(parcel, iT);
    }
}

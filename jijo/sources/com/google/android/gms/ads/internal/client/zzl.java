package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b7.u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzn();
    public final int zza;

    @Deprecated
    public final long zzb;
    public final Bundle zzc;

    @Deprecated
    public final int zzd;
    public final List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfh zzj;
    public final Location zzk;
    public final String zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final List zzo;
    public final String zzp;
    public final String zzq;

    @Deprecated
    public final boolean zzr;
    public final zzc zzs;
    public final int zzt;
    public final String zzu;
    public final List zzv;
    public final int zzw;
    public final String zzx;
    public final int zzy;
    public final long zzz;

    public zzl(int i10, long j10, Bundle bundle, int i11, List list, boolean z9, int i12, boolean z10, String str, zzfh zzfhVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z11, zzc zzcVar, int i13, String str5, List list3, int i14, String str6, int i15, long j11) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i11;
        this.zze = list;
        this.zzf = z9;
        this.zzg = i12;
        this.zzh = z10;
        this.zzi = str;
        this.zzj = zzfhVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z11;
        this.zzs = zzcVar;
        this.zzt = i13;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i14;
        this.zzx = str6;
        this.zzy = i15;
        this.zzz = j11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        return this.zza == zzlVar.zza && this.zzb == zzlVar.zzb && com.google.android.gms.ads.internal.util.client.zzn.zza(this.zzc, zzlVar.zzc) && this.zzd == zzlVar.zzd && u.i(this.zze, zzlVar.zze) && this.zzf == zzlVar.zzf && this.zzg == zzlVar.zzg && this.zzh == zzlVar.zzh && u.i(this.zzi, zzlVar.zzi) && u.i(this.zzj, zzlVar.zzj) && u.i(this.zzk, zzlVar.zzk) && u.i(this.zzl, zzlVar.zzl) && com.google.android.gms.ads.internal.util.client.zzn.zza(this.zzm, zzlVar.zzm) && com.google.android.gms.ads.internal.util.client.zzn.zza(this.zzn, zzlVar.zzn) && u.i(this.zzo, zzlVar.zzo) && u.i(this.zzp, zzlVar.zzp) && u.i(this.zzq, zzlVar.zzq) && this.zzr == zzlVar.zzr && this.zzt == zzlVar.zzt && u.i(this.zzu, zzlVar.zzu) && u.i(this.zzv, zzlVar.zzv) && this.zzw == zzlVar.zzw && u.i(this.zzx, zzlVar.zzx) && this.zzy == zzlVar.zzy && this.zzz == zzlVar.zzz;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy), Long.valueOf(this.zzz)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(i11);
        long j10 = this.zzb;
        d0.v(parcel, 2, 8);
        parcel.writeLong(j10);
        d0.k(parcel, 3, this.zzc);
        int i12 = this.zzd;
        d0.v(parcel, 4, 4);
        parcel.writeInt(i12);
        d0.q(parcel, 5, this.zze);
        boolean z9 = this.zzf;
        d0.v(parcel, 6, 4);
        parcel.writeInt(z9 ? 1 : 0);
        int i13 = this.zzg;
        d0.v(parcel, 7, 4);
        parcel.writeInt(i13);
        boolean z10 = this.zzh;
        d0.v(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.o(parcel, 9, this.zzi);
        d0.n(parcel, 10, this.zzj, i10);
        d0.n(parcel, 11, this.zzk, i10);
        d0.o(parcel, 12, this.zzl);
        d0.k(parcel, 13, this.zzm);
        d0.k(parcel, 14, this.zzn);
        d0.q(parcel, 15, this.zzo);
        d0.o(parcel, 16, this.zzp);
        d0.o(parcel, 17, this.zzq);
        boolean z11 = this.zzr;
        d0.v(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        d0.n(parcel, 19, this.zzs, i10);
        int i14 = this.zzt;
        d0.v(parcel, 20, 4);
        parcel.writeInt(i14);
        d0.o(parcel, 21, this.zzu);
        d0.q(parcel, 22, this.zzv);
        int i15 = this.zzw;
        d0.v(parcel, 23, 4);
        parcel.writeInt(i15);
        d0.o(parcel, 24, this.zzx);
        int i16 = this.zzy;
        d0.v(parcel, 25, 4);
        parcel.writeInt(i16);
        long j11 = this.zzz;
        d0.v(parcel, 26, 8);
        parcel.writeLong(j11);
        d0.u(parcel, iT);
    }
}

package com.google.android.gms.ads.internal.overlay;

import a4.b;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.q70;
import com.google.android.gms.internal.ads.qk;
import com.google.android.gms.internal.ads.s40;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzp zzc;
    public final fx zzd;
    public final qk zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzaa zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final VersionInfoParcel zzm;
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzk zzo;
    public final pk zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final s40 zzt;
    public final q70 zzu;
    public final aq zzv;
    public final boolean zzw;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzaa zzaaVar, fx fxVar, int i10, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzk zzkVar, String str2, String str3, String str4, s40 s40Var, aq aqVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzpVar;
        this.zzd = fxVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzba.zzc().a(eg.A0)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i10;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzkVar;
        this.zzq = null;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = s40Var;
        this.zzu = null;
        this.zzv = aqVar;
        this.zzw = false;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzc zzcVar = this.zza;
        int iT = d0.t(parcel, 20293);
        d0.n(parcel, 2, zzcVar, i10);
        d0.m(parcel, 3, new b(this.zzb));
        d0.m(parcel, 4, new b(this.zzc));
        d0.m(parcel, 5, new b(this.zzd));
        d0.m(parcel, 6, new b(this.zze));
        d0.o(parcel, 7, this.zzf);
        boolean z9 = this.zzg;
        d0.v(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        d0.o(parcel, 9, this.zzh);
        d0.m(parcel, 10, new b(this.zzi));
        int i11 = this.zzj;
        d0.v(parcel, 11, 4);
        parcel.writeInt(i11);
        int i12 = this.zzk;
        d0.v(parcel, 12, 4);
        parcel.writeInt(i12);
        d0.o(parcel, 13, this.zzl);
        d0.n(parcel, 14, this.zzm, i10);
        d0.o(parcel, 16, this.zzn);
        d0.n(parcel, 17, this.zzo, i10);
        d0.m(parcel, 18, new b(this.zzp));
        d0.o(parcel, 19, this.zzq);
        d0.o(parcel, 24, this.zzr);
        d0.o(parcel, 25, this.zzs);
        d0.m(parcel, 26, new b(this.zzt));
        d0.m(parcel, 27, new b(this.zzu));
        d0.m(parcel, 28, new b(this.zzv));
        boolean z10 = this.zzw;
        d0.v(parcel, 29, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.u(parcel, iT);
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzaa zzaaVar, fx fxVar, boolean z9, int i10, VersionInfoParcel versionInfoParcel, q70 q70Var, aq aqVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzpVar;
        this.zzd = fxVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z9;
        this.zzh = null;
        this.zzi = zzaaVar;
        this.zzj = i10;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = q70Var;
        this.zzv = aqVar;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, pk pkVar, qk qkVar, zzaa zzaaVar, fx fxVar, boolean z9, int i10, String str, VersionInfoParcel versionInfoParcel, q70 q70Var, aq aqVar, boolean z10) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzpVar;
        this.zzd = fxVar;
        this.zzp = pkVar;
        this.zze = qkVar;
        this.zzf = null;
        this.zzg = z9;
        this.zzh = null;
        this.zzi = zzaaVar;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = q70Var;
        this.zzv = aqVar;
        this.zzw = z10;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, pk pkVar, qk qkVar, zzaa zzaaVar, fx fxVar, boolean z9, int i10, String str, String str2, VersionInfoParcel versionInfoParcel, q70 q70Var, aq aqVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzpVar;
        this.zzd = fxVar;
        this.zzp = pkVar;
        this.zze = qkVar;
        this.zzf = str2;
        this.zzg = z9;
        this.zzh = str;
        this.zzi = zzaaVar;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = q70Var;
        this.zzv = aqVar;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z9, String str2, IBinder iBinder5, int i10, int i11, String str3, VersionInfoParcel versionInfoParcel, String str4, com.google.android.gms.ads.internal.zzk zzkVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z10) {
        this.zza = zzcVar;
        this.zzb = (com.google.android.gms.ads.internal.client.zza) b.a0(b.t(iBinder));
        this.zzc = (zzp) b.a0(b.t(iBinder2));
        this.zzd = (fx) b.a0(b.t(iBinder3));
        this.zzp = (pk) b.a0(b.t(iBinder6));
        this.zze = (qk) b.a0(b.t(iBinder4));
        this.zzf = str;
        this.zzg = z9;
        this.zzh = str2;
        this.zzi = (zzaa) b.a0(b.t(iBinder5));
        this.zzj = i10;
        this.zzk = i11;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzkVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzt = (s40) b.a0(b.t(iBinder7));
        this.zzu = (q70) b.a0(b.t(iBinder8));
        this.zzv = (aq) b.a0(b.t(iBinder9));
        this.zzw = z10;
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzaa zzaaVar, VersionInfoParcel versionInfoParcel, fx fxVar, q70 q70Var) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzpVar;
        this.zzd = fxVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzaaVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = q70Var;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzp zzpVar, fx fxVar, int i10, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzpVar;
        this.zzd = fxVar;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(fx fxVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i10, aq aqVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = fxVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = aqVar;
        this.zzw = false;
    }
}

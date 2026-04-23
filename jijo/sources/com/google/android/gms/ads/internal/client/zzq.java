package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzq[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzq(android.content.Context r14, com.google.android.gms.ads.AdSize[] r15) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzq.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    public static int zza(DisplayMetrics displayMetrics) {
        float f10 = displayMetrics.heightPixels;
        float f11 = displayMetrics.density;
        int i10 = (int) (f10 / f11);
        return (int) ((i10 <= 400 ? 32 : i10 <= 720 ? 50 : 90) * f11);
    }

    public static zzq zzb() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzq zzc() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzq zzd() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzq zze() {
        return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iT = d0.t(parcel, 20293);
        d0.o(parcel, 2, str);
        int i11 = this.zzb;
        d0.v(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.zzc;
        d0.v(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z9 = this.zzd;
        d0.v(parcel, 5, 4);
        parcel.writeInt(z9 ? 1 : 0);
        int i13 = this.zze;
        d0.v(parcel, 6, 4);
        parcel.writeInt(i13);
        int i14 = this.zzf;
        d0.v(parcel, 7, 4);
        parcel.writeInt(i14);
        d0.r(parcel, 8, this.zzg, i10);
        boolean z10 = this.zzh;
        d0.v(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzi;
        d0.v(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.zzj;
        d0.v(parcel, 11, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.zzk;
        d0.v(parcel, 12, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.zzl;
        d0.v(parcel, 13, 4);
        parcel.writeInt(z14 ? 1 : 0);
        boolean z15 = this.zzm;
        d0.v(parcel, 14, 4);
        parcel.writeInt(z15 ? 1 : 0);
        boolean z16 = this.zzn;
        d0.v(parcel, 15, 4);
        parcel.writeInt(z16 ? 1 : 0);
        boolean z17 = this.zzo;
        d0.v(parcel, 16, 4);
        parcel.writeInt(z17 ? 1 : 0);
        d0.u(parcel, iT);
    }

    public zzq(String str, int i10, int i11, boolean z9, int i12, int i13, zzq[] zzqVarArr, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z9;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = zzqVarArr;
        this.zzh = z10;
        this.zzi = z11;
        this.zzj = z12;
        this.zzk = z13;
        this.zzl = z14;
        this.zzm = z15;
        this.zzn = z16;
        this.zzo = z17;
    }

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzq(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }
}

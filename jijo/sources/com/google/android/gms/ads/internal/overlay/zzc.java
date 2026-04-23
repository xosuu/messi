package com.google.android.gms.ads.internal.overlay;

import a4.b;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzy zzi;
    public final boolean zzj;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z9) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzy) b.a0(b.t(iBinder));
        this.zzj = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iT = d0.t(parcel, 20293);
        d0.o(parcel, 2, str);
        d0.o(parcel, 3, this.zzb);
        d0.o(parcel, 4, this.zzc);
        d0.o(parcel, 5, this.zzd);
        d0.o(parcel, 6, this.zze);
        d0.o(parcel, 7, this.zzf);
        d0.o(parcel, 8, this.zzg);
        d0.n(parcel, 9, this.zzh, i10);
        d0.m(parcel, 10, new b(this.zzi));
        boolean z9 = this.zzj;
        d0.v(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        d0.u(parcel, iT);
    }

    public zzc(Intent intent, zzy zzyVar) {
        this(null, null, null, null, null, null, null, intent, new b(zzyVar), false);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzy zzyVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new b(zzyVar), false);
    }
}

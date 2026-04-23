package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf extends ob implements zzbh {
    public zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() {
        a0(m(), 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
        a0(m(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i10) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        a0(m(), 7);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        a0(m(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        a0(m(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        a0(m(), 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
        a0(m(), 9);
    }
}

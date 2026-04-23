package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;

/* JADX INFO: loaded from: classes.dex */
public final class li extends ob implements ni {
    public li(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final float zze() {
        Parcel parcelT = t(m(), 2);
        float f10 = parcelT.readFloat();
        parcelT.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final float zzf() {
        Parcel parcelT = t(m(), 6);
        float f10 = parcelT.readFloat();
        parcelT.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final float zzg() {
        Parcel parcelT = t(m(), 5);
        float f10 = parcelT.readFloat();
        parcelT.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Parcel parcelT = t(m(), 7);
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = zzdp.zzb(parcelT.readStrongBinder());
        parcelT.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final a4.a zzi() {
        return fb1.f(t(m(), 4));
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final void zzj(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final boolean zzk() {
        Parcel parcelT = t(m(), 10);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final boolean zzl() {
        Parcel parcelT = t(m(), 8);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }
}

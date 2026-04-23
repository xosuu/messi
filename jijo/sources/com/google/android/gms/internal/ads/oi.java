package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class oi extends ob implements pi {
    public oi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final double zzb() {
        Parcel parcelT = t(m(), 3);
        double d10 = parcelT.readDouble();
        parcelT.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final int zzc() {
        Parcel parcelT = t(m(), 5);
        int i10 = parcelT.readInt();
        parcelT.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final int zzd() {
        Parcel parcelT = t(m(), 4);
        int i10 = parcelT.readInt();
        parcelT.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final Uri zze() {
        Parcel parcelT = t(m(), 2);
        Uri uri = (Uri) qb.a(parcelT, Uri.CREATOR);
        parcelT.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final a4.a zzf() {
        return fb1.f(t(m(), 1));
    }
}

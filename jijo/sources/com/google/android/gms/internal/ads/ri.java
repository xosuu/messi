package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ri extends ob implements ti {
    public ri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final a4.a zzb(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        return fb1.f(t(parcelM, 2));
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void zzc() {
        a0(m(), 4);
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void zzd(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 7);
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void zzdv(String str, a4.a aVar) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        qb.e(parcelM, aVar);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void zzdw(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 6);
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void zzdx(ni niVar) {
        Parcel parcelM = m();
        qb.e(parcelM, niVar);
        a0(parcelM, 8);
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void zzdy(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 9);
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void zzdz(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void zze(a4.a aVar, int i10) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        parcelM.writeInt(i10);
        a0(parcelM, 5);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes.dex */
public final class ls extends ob implements ns {
    public ls(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final Bundle zzb() {
        Parcel parcelT = t(m(), 9);
        Bundle bundle = (Bundle) qb.a(parcelT, Bundle.CREATOR);
        parcelT.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final zzdn zzc() {
        Parcel parcelT = t(m(), 12);
        zzdn zzdnVarZzb = zzdm.zzb(parcelT.readStrongBinder());
        parcelT.recycle();
        return zzdnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final ks zzd() {
        ks jsVar;
        Parcel parcelT = t(m(), 11);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            jsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            jsVar = iInterfaceQueryLocalInterface instanceof ks ? (ks) iInterfaceQueryLocalInterface : new js(strongBinder);
        }
        parcelT.recycle();
        return jsVar;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzf(zzl zzlVar, us usVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzlVar);
        qb.e(parcelM, usVar);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzg(zzl zzlVar, us usVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzlVar);
        qb.e(parcelM, usVar);
        a0(parcelM, 14);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzh(boolean z9) {
        Parcel parcelM = m();
        ClassLoader classLoader = qb.f8146a;
        parcelM.writeInt(z9 ? 1 : 0);
        a0(parcelM, 15);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzi(zzdd zzddVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzddVar);
        a0(parcelM, 8);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzj(zzdg zzdgVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzdgVar);
        a0(parcelM, 13);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzk(qs qsVar) {
        Parcel parcelM = m();
        qb.e(parcelM, qsVar);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzl(zzbwu zzbwuVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzbwuVar);
        a0(parcelM, 7);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzm(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 5);
    }
}

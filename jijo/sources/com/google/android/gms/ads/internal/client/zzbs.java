package com.google.android.gms.ads.internal.client;

import a4.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.nq;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.og;
import com.google.android.gms.internal.ads.pq;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.uc;

/* JADX INFO: loaded from: classes.dex */
public final class zzbs extends ob implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        a0(m(), 11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        a0(m(), 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzbeVar);
        a0(parcelM, 20);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzbhVar);
        a0(parcelM, 7);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzqVar);
        a0(parcelM, 13);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzcbVar);
        a0(parcelM, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(uc ucVar) {
        Parcel parcelM = m();
        qb.e(parcelM, ucVar);
        a0(parcelM, 40);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzwVar);
        a0(parcelM, 39);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzciVar);
        a0(parcelM, 45);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z9) {
        Parcel parcelM = m();
        ClassLoader classLoader = qb.f8146a;
        parcelM.writeInt(z9 ? 1 : 0);
        a0(parcelM, 34);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(nq nqVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z9) {
        Parcel parcelM = m();
        ClassLoader classLoader = qb.f8146a;
        parcelM.writeInt(z9 ? 1 : 0);
        a0(parcelM, 22);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(og ogVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzdgVar);
        a0(parcelM, 42);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(pq pqVar, String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(es esVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfk zzfkVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzfkVar);
        a0(parcelM, 29);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 44);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        Parcel parcelT = t(m(), 46);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        Parcel parcelT = t(m(), 23);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzab(zzl zzlVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzlVar);
        Parcel parcelT = t(parcelM, 4);
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzac(zzcf zzcfVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        Parcel parcelT = t(m(), 12);
        zzq zzqVar = (zzq) qb.a(parcelT, zzq.CREATOR);
        parcelT.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        zzbh zzbfVar;
        Parcel parcelT = t(m(), 33);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzbfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
        }
        parcelT.recycle();
        return zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        zzcb zzbzVar;
        Parcel parcelT = t(m(), 32);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzbzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzbzVar = iInterfaceQueryLocalInterface instanceof zzcb ? (zzcb) iInterfaceQueryLocalInterface : new zzbz(strongBinder);
        }
        parcelT.recycle();
        return zzbzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        zzdn zzdlVar;
        Parcel parcelT = t(m(), 41);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzdlVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdlVar = iInterfaceQueryLocalInterface instanceof zzdn ? (zzdn) iInterfaceQueryLocalInterface : new zzdl(strongBinder);
        }
        parcelT.recycle();
        return zzdlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        zzdq zzdoVar;
        Parcel parcelT = t(m(), 26);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzdoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdoVar = iInterfaceQueryLocalInterface instanceof zzdq ? (zzdq) iInterfaceQueryLocalInterface : new zzdo(strongBinder);
        }
        parcelT.recycle();
        return zzdoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final a zzn() {
        return fb1.f(t(m(), 1));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        Parcel parcelT = t(m(), 31);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        a0(m(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzlVar);
        qb.e(parcelM, zzbkVar);
        a0(parcelM, 43);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        a0(m(), 5);
    }
}

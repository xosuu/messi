package com.google.android.gms.ads.internal.client;

import a4.a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.ads.zzbkv;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzcm extends ob implements zzco {
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        Parcel parcelT = t(m(), 7);
        float f10 = parcelT.readFloat();
        parcelT.recycle();
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        Parcel parcelT = t(m(), 9);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        Parcel parcelT = t(m(), 13);
        ArrayList arrayListCreateTypedArrayList = parcelT.createTypedArrayList(zzbkv.CREATOR);
        parcelT.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        a0(m(), 15);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z9) {
        Parcel parcelM = m();
        ClassLoader classLoader = qb.f8146a;
        parcelM.writeInt(z9 ? 1 : 0);
        a0(parcelM, 17);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        a0(m(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, a aVar) {
        Parcel parcelM = m();
        parcelM.writeString(null);
        qb.e(parcelM, aVar);
        a0(parcelM, 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzdaVar);
        a0(parcelM, 16);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(a aVar, String str) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        parcelM.writeString(str);
        a0(parcelM, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(rn rnVar) {
        Parcel parcelM = m();
        qb.e(parcelM, rnVar);
        a0(parcelM, 11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z9) {
        Parcel parcelM = m();
        ClassLoader classLoader = qb.f8146a;
        parcelM.writeInt(z9 ? 1 : 0);
        a0(parcelM, 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f10) {
        Parcel parcelM = m();
        parcelM.writeFloat(f10);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zl zlVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zlVar);
        a0(parcelM, 12);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 18);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzffVar);
        a0(parcelM, 14);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        Parcel parcelT = t(m(), 8);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class fq extends ob implements hq {
    public fq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final boolean zzH() {
        Parcel parcelT = t(m(), 11);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzh(int i10, int i11, Intent intent) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        parcelM.writeInt(i11);
        qb.c(parcelM, intent);
        a0(parcelM, 12);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzi() {
        a0(m(), 10);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzk(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 13);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzl(Bundle bundle) {
        Parcel parcelM = m();
        qb.c(parcelM, bundle);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzm() {
        a0(m(), 8);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzo() {
        a0(m(), 5);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        parcelM.writeStringArray(strArr);
        parcelM.writeIntArray(iArr);
        a0(parcelM, 15);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzq() {
        a0(m(), 2);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzr() {
        a0(m(), 4);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzs(Bundle bundle) {
        Parcel parcelM = m();
        qb.c(parcelM, bundle);
        Parcel parcelT = t(parcelM, 6);
        if (parcelT.readInt() != 0) {
            bundle.readFromParcel(parcelT);
        }
        parcelT.recycle();
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzt() {
        a0(m(), 3);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzu() {
        a0(m(), 7);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzv() {
        a0(m(), 14);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzx() {
        a0(m(), 9);
    }
}

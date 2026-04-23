package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public final class zzdo extends ob implements zzdq {
    public zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        Parcel parcelT = t(m(), 5);
        int i10 = parcelT.readInt();
        parcelT.recycle();
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        zzdt zzdrVar;
        Parcel parcelT = t(m(), 11);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzdrVar = iInterfaceQueryLocalInterface instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface : new zzdr(strongBinder);
        }
        parcelT.recycle();
        return zzdrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z9) {
        Parcel parcelM = m();
        ClassLoader classLoader = qb.f8146a;
        parcelM.writeInt(z9 ? 1 : 0);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        a0(m(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        a0(m(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzdtVar);
        a0(parcelM, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        a0(m(), 13);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        Parcel parcelT = t(m(), 12);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        Parcel parcelT = t(m(), 10);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        Parcel parcelT = t(m(), 4);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }
}

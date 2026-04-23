package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class co extends ob implements eo {
    public co(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void T0(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 22);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void c1(a4.a aVar, a4.a aVar2, a4.a aVar3) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, aVar2);
        qb.e(parcelM, aVar3);
        a0(parcelM, 21);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void d0(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 20);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final boolean zzA() {
        Parcel parcelT = t(m(), 18);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final boolean zzB() {
        Parcel parcelT = t(m(), 17);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final double zze() {
        Parcel parcelT = t(m(), 8);
        double d10 = parcelT.readDouble();
        parcelT.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final float zzf() {
        Parcel parcelT = t(m(), 23);
        float f10 = parcelT.readFloat();
        parcelT.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final float zzg() {
        Parcel parcelT = t(m(), 25);
        float f10 = parcelT.readFloat();
        parcelT.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final float zzh() {
        Parcel parcelT = t(m(), 24);
        float f10 = parcelT.readFloat();
        parcelT.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final Bundle zzi() {
        Parcel parcelT = t(m(), 16);
        Bundle bundle = (Bundle) qb.a(parcelT, Bundle.CREATOR);
        parcelT.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final com.google.android.gms.ads.internal.client.zzdq zzj() {
        Parcel parcelT = t(m(), 11);
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = zzdp.zzb(parcelT.readStrongBinder());
        parcelT.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final ji zzk() {
        Parcel parcelT = t(m(), 12);
        ji jiVarU1 = ii.u1(parcelT.readStrongBinder());
        parcelT.recycle();
        return jiVarU1;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final pi zzl() {
        Parcel parcelT = t(m(), 5);
        pi piVarU1 = fi.u1(parcelT.readStrongBinder());
        parcelT.recycle();
        return piVarU1;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final a4.a zzm() {
        return fb1.f(t(m(), 13));
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final a4.a zzn() {
        return fb1.f(t(m(), 14));
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final a4.a zzo() {
        return fb1.f(t(m(), 15));
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzp() {
        Parcel parcelT = t(m(), 7);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzq() {
        Parcel parcelT = t(m(), 4);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzr() {
        Parcel parcelT = t(m(), 6);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzs() {
        Parcel parcelT = t(m(), 2);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzt() {
        Parcel parcelT = t(m(), 10);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzu() {
        Parcel parcelT = t(m(), 9);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final List zzv() {
        Parcel parcelT = t(m(), 3);
        ArrayList arrayList = parcelT.readArrayList(qb.f8146a);
        parcelT.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void zzx() {
        a0(m(), 19);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ek extends ob implements gk {
    @Override // com.google.android.gms.internal.ads.gk
    public final void E0(zzdg zzdgVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzdgVar);
        a0(parcelM, 32);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void P(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzcsVar);
        a0(parcelM, 26);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void b() {
        a0(m(), 22);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void b1(Bundle bundle) {
        Parcel parcelM = m();
        qb.c(parcelM, bundle);
        a0(parcelM, 17);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void e0(zzcw zzcwVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzcwVar);
        a0(parcelM, 25);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void j1(dk dkVar) {
        Parcel parcelM = m();
        qb.e(parcelM, dkVar);
        a0(parcelM, 21);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final boolean m0(Bundle bundle) {
        Parcel parcelM = m();
        qb.c(parcelM, bundle);
        Parcel parcelT = t(parcelM, 16);
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void n1(Bundle bundle) {
        Parcel parcelM = m();
        qb.c(parcelM, bundle);
        a0(parcelM, 15);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final boolean q() {
        Parcel parcelT = t(m(), 30);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void x0() {
        a0(m(), 27);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void zzA() {
        a0(m(), 28);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final boolean zzH() {
        Parcel parcelT = t(m(), 24);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final double zze() {
        Parcel parcelT = t(m(), 8);
        double d10 = parcelT.readDouble();
        parcelT.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final Bundle zzf() {
        Parcel parcelT = t(m(), 20);
        Bundle bundle = (Bundle) qb.a(parcelT, Bundle.CREATOR);
        parcelT.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final zzdn zzg() {
        Parcel parcelT = t(m(), 31);
        zzdn zzdnVarZzb = zzdm.zzb(parcelT.readStrongBinder());
        parcelT.recycle();
        return zzdnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Parcel parcelT = t(m(), 11);
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = zzdp.zzb(parcelT.readStrongBinder());
        parcelT.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final ji zzi() {
        ji hiVar;
        Parcel parcelT = t(m(), 14);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            hiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            hiVar = iInterfaceQueryLocalInterface instanceof ji ? (ji) iInterfaceQueryLocalInterface : new hi(strongBinder);
        }
        parcelT.recycle();
        return hiVar;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final ni zzj() {
        ni liVar;
        Parcel parcelT = t(m(), 29);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            liVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            liVar = iInterfaceQueryLocalInterface instanceof ni ? (ni) iInterfaceQueryLocalInterface : new li(strongBinder);
        }
        parcelT.recycle();
        return liVar;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final pi zzk() {
        pi oiVar;
        Parcel parcelT = t(m(), 5);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            oiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            oiVar = iInterfaceQueryLocalInterface instanceof pi ? (pi) iInterfaceQueryLocalInterface : new oi(strongBinder);
        }
        parcelT.recycle();
        return oiVar;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final a4.a zzl() {
        return fb1.f(t(m(), 19));
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final a4.a zzm() {
        return fb1.f(t(m(), 18));
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzn() {
        Parcel parcelT = t(m(), 7);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzo() {
        Parcel parcelT = t(m(), 4);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzp() {
        Parcel parcelT = t(m(), 6);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzq() {
        Parcel parcelT = t(m(), 2);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzs() {
        Parcel parcelT = t(m(), 10);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzt() {
        Parcel parcelT = t(m(), 9);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final List zzu() {
        Parcel parcelT = t(m(), 3);
        ArrayList arrayList = parcelT.readArrayList(qb.f8146a);
        parcelT.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final List zzv() {
        Parcel parcelT = t(m(), 23);
        ArrayList arrayList = parcelT.readArrayList(qb.f8146a);
        parcelT.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void zzx() {
        a0(m(), 13);
    }
}

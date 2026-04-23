package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class un extends ob implements wn {
    public un(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void E(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 24);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void I0(zzbvz zzbvzVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void J() {
        a0(m(), 13);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void N(int i10, String str) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        parcelM.writeString(str);
        a0(parcelM, 22);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void X(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 23);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void b() {
        a0(m(), 15);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void c(int i10) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void j0(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void l(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 21);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void t0(ks ksVar) {
        Parcel parcelM = m();
        qb.e(parcelM, ksVar);
        a0(parcelM, 16);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void u0(String str, String str2) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        a0(parcelM, 9);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void y0(gj gjVar, String str) {
        Parcel parcelM = m();
        qb.e(parcelM, gjVar);
        parcelM.writeString(str);
        a0(parcelM, 10);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void zze() {
        a0(m(), 1);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void zzf() {
        a0(m(), 2);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void zzm() {
        a0(m(), 8);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void zzn() {
        a0(m(), 4);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void zzo() {
        a0(m(), 6);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void zzp() {
        a0(m(), 5);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void zzu() {
        a0(m(), 18);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void zzv() {
        a0(m(), 11);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void zzx() {
        a0(m(), 20);
    }
}

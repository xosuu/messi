package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class yv0 extends ob implements zv0 {
    @Override // com.google.android.gms.internal.ads.zv0
    public final void A0() {
        Parcel parcelM = m();
        parcelM.writeIntArray(null);
        a0(parcelM, 4);
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void U(a4.b bVar, String str) {
        Parcel parcelM = m();
        qb.e(parcelM, bVar);
        parcelM.writeString(str);
        parcelM.writeString(null);
        a0(parcelM, 8);
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void X0(byte[] bArr) {
        Parcel parcelM = m();
        parcelM.writeByteArray(bArr);
        a0(parcelM, 5);
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void c(int i10) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        a0(parcelM, 7);
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void k(int i10) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        a0(parcelM, 6);
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void zzf() {
        a0(m(), 3);
    }
}

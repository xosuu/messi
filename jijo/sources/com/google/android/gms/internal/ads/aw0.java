package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class aw0 extends pb implements zv0 {
    public aw0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void A0() {
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void U(a4.b bVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void X0(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                a4.b.t(parcel.readStrongBinder());
                parcel.readString();
                qb.b(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                qb.b(parcel);
                break;
            case 5:
                parcel.createByteArray();
                qb.b(parcel);
                break;
            case 6:
                parcel.readInt();
                qb.b(parcel);
                break;
            case 7:
                parcel.readInt();
                qb.b(parcel);
                break;
            case 8:
                a4.b.t(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                qb.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void c(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void k(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void zzf() {
    }
}

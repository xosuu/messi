package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fj extends ob implements gj {
    public fj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final String P0(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        Parcel parcelT = t(parcelM, 1);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final void Y0(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 5);
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final boolean n(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        Parcel parcelT = t(parcelM, 10);
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final pi o(String str) {
        pi oiVar;
        Parcel parcelM = m();
        parcelM.writeString(str);
        Parcel parcelT = t(parcelM, 2);
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

    @Override // com.google.android.gms.internal.ads.gj
    public final boolean r(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        Parcel parcelT = t(parcelM, 17);
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final void s1(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 14);
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final ni zzf() {
        ni liVar;
        Parcel parcelT = t(m(), 16);
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

    @Override // com.google.android.gms.internal.ads.gj
    public final a4.a zzh() {
        return fb1.f(t(m(), 9));
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final String zzi() {
        Parcel parcelT = t(m(), 4);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final List zzk() {
        Parcel parcelT = t(m(), 3);
        ArrayList<String> arrayListCreateStringArrayList = parcelT.createStringArrayList();
        parcelT.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final void zzl() {
        a0(m(), 8);
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final void zzm() {
        a0(m(), 15);
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final void zzo() {
        a0(m(), 6);
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final boolean zzq() {
        Parcel parcelT = t(m(), 12);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final boolean zzt() {
        Parcel parcelT = t(m(), 13);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }
}

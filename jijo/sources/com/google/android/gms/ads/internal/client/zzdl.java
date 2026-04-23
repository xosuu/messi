package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzdl extends ob implements zzdn {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        Parcel parcelT = t(m(), 5);
        Bundle bundle = (Bundle) qb.a(parcelT, Bundle.CREATOR);
        parcelT.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() {
        Parcel parcelT = t(m(), 4);
        zzu zzuVar = (zzu) qb.a(parcelT, zzu.CREATOR);
        parcelT.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        Parcel parcelT = t(m(), 1);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        Parcel parcelT = t(m(), 6);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        Parcel parcelT = t(m(), 2);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        Parcel parcelT = t(m(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelT.createTypedArrayList(zzu.CREATOR);
        parcelT.recycle();
        return arrayListCreateTypedArrayList;
    }
}

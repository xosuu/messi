package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hi extends ob implements ji {
    public hi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.ji
    public final String zzg() {
        Parcel parcelT = t(m(), 2);
        String string = parcelT.readString();
        parcelT.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ji
    public final List zzh() {
        Parcel parcelT = t(m(), 3);
        ArrayList arrayList = parcelT.readArrayList(qb.f8146a);
        parcelT.recycle();
        return arrayList;
    }
}

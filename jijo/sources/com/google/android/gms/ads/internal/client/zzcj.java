package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public final class zzcj extends ob implements zzcl {
    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final rn getAdapterCreator() {
        Parcel parcelT = t(m(), 2);
        rn rnVarU1 = pn.u1(parcelT.readStrongBinder());
        parcelT.recycle();
        return rnVarU1;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() {
        Parcel parcelT = t(m(), 1);
        zzen zzenVar = (zzen) qb.a(parcelT, zzen.CREATOR);
        parcelT.recycle();
        return zzenVar;
    }
}

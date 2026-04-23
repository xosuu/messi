package com.google.android.gms.ads.internal.client;

import a4.a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public final class zzdh extends ob implements zzdj {
    public zzdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, a aVar, a aVar2) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        qb.e(parcelM, aVar);
        qb.e(parcelM, aVar2);
        a0(parcelM, 1);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class xn extends ob implements yn {
    public xn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.yn
    public final a4.a zze() {
        return fb1.f(t(m(), 1));
    }

    @Override // com.google.android.gms.internal.ads.yn
    public final boolean zzf() {
        Parcel parcelT = t(m(), 2);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }
}

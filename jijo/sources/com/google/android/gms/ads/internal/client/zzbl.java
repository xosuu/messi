package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public final class zzbl extends ob implements zzbn {
    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzlVar);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzlVar, int i10) {
        Parcel parcelM = m();
        qb.c(parcelM, zzlVar);
        parcelM.writeInt(i10);
        a0(parcelM, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() {
        Parcel parcelT = t(m(), 3);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }
}

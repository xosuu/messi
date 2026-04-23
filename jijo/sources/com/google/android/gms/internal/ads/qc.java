package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;

/* JADX INFO: loaded from: classes.dex */
public final class qc extends ob implements rc {
    @Override // com.google.android.gms.internal.ads.rc
    public final void V(a4.a aVar, xc xcVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, xcVar);
        a0(parcelM, 4);
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final void a1(zzdg zzdgVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzdgVar);
        a0(parcelM, 7);
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final void x(boolean z9) {
        Parcel parcelM = m();
        ClassLoader classLoader = qb.f8146a;
        parcelM.writeInt(z9 ? 1 : 0);
        a0(parcelM, 6);
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final zzdn zzf() {
        Parcel parcelT = t(m(), 5);
        zzdn zzdnVarZzb = zzdm.zzb(parcelT.readStrongBinder());
        parcelT.recycle();
        return zzdnVarZzb;
    }
}

package com.google.android.gms.ads.internal.util;

import a4.a;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public final class zzbp extends ob implements zzbr {
    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(a aVar, String str, String str2) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        Parcel parcelT = t(parcelM, 1);
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(a aVar, zza zzaVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzaVar);
        Parcel parcelT = t(parcelM, 3);
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }
}

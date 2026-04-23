package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: loaded from: classes.dex */
public final class yp extends ob implements aq {
    public yp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void M(a4.a aVar, zza zzaVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzaVar);
        a0(parcelM, 6);
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void j(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 4);
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void l1(String[] strArr, int[] iArr, a4.a aVar) {
        Parcel parcelM = m();
        parcelM.writeStringArray(strArr);
        parcelM.writeIntArray(iArr);
        qb.e(parcelM, aVar);
        a0(parcelM, 5);
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void y(Intent intent) {
        Parcel parcelM = m();
        qb.c(parcelM, intent);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void zzh() {
        a0(m(), 3);
    }
}

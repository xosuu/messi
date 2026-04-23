package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class st extends ob implements ut {
    public st(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final a4.a zze(a4.a aVar, a4.a aVar2, String str, a4.a aVar3) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, aVar2);
        parcelM.writeString(str);
        qb.e(parcelM, aVar3);
        return fb1.f(t(parcelM, 11));
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzf(a4.a aVar, zzbyq zzbyqVar, rt rtVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzbyqVar);
        qb.e(parcelM, rtVar);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzg(zzbtl zzbtlVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzbtlVar);
        a0(parcelM, 7);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzh(List list, a4.a aVar, tq tqVar) {
        Parcel parcelM = m();
        parcelM.writeTypedList(list);
        qb.e(parcelM, aVar);
        qb.e(parcelM, tqVar);
        a0(parcelM, 10);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzi(List list, a4.a aVar, tq tqVar) {
        Parcel parcelM = m();
        parcelM.writeTypedList(list);
        qb.e(parcelM, aVar);
        qb.e(parcelM, tqVar);
        a0(parcelM, 9);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzj(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 8);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzk(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzl(List list, a4.a aVar, tq tqVar) {
        Parcel parcelM = m();
        parcelM.writeTypedList(list);
        qb.e(parcelM, aVar);
        qb.e(parcelM, tqVar);
        a0(parcelM, 6);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzm(List list, a4.a aVar, tq tqVar) {
        Parcel parcelM = m();
        parcelM.writeTypedList(list);
        qb.e(parcelM, aVar);
        qb.e(parcelM, tqVar);
        a0(parcelM, 5);
    }
}

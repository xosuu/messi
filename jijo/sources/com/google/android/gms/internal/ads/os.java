package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class os extends ob implements qs {
    @Override // com.google.android.gms.internal.ads.qs
    public final void G0(zze zzeVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzeVar);
        a0(parcelM, 5);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void Z(ks ksVar) {
        Parcel parcelM = m();
        qb.e(parcelM, ksVar);
        a0(parcelM, 3);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void f(int i10) {
        Parcel parcelM = m();
        parcelM.writeInt(i10);
        a0(parcelM, 4);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zze() {
        a0(m(), 7);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zzf() {
        a0(m(), 6);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zzg() {
        a0(m(), 2);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zzj() {
        a0(m(), 1);
    }
}

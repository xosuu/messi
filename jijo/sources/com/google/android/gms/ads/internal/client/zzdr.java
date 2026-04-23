package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public final class zzdr extends ob implements zzdt {
    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() {
        a0(m(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzf(boolean z9) {
        Parcel parcelM = m();
        ClassLoader classLoader = qb.f8146a;
        parcelM.writeInt(z9 ? 1 : 0);
        a0(parcelM, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() {
        a0(m(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() {
        a0(m(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() {
        a0(m(), 1);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes.dex */
public final class or extends ob implements pr {
    public or(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final void h(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelM = m();
        qb.c(parcelM, parcelFileDescriptor);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final void p(zzbb zzbbVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzbbVar);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final void q1(ParcelFileDescriptor parcelFileDescriptor, zzbvb zzbvbVar) {
        Parcel parcelM = m();
        qb.c(parcelM, parcelFileDescriptor);
        qb.c(parcelM, zzbvbVar);
        a0(parcelM, 3);
    }
}

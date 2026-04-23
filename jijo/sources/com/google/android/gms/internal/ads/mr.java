package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes.dex */
public final class mr extends ob implements nr {
    public mr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void h(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelM = m();
        qb.c(parcelM, parcelFileDescriptor);
        a0(parcelM, 1);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void p(zzbb zzbbVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzbbVar);
        a0(parcelM, 2);
    }
}

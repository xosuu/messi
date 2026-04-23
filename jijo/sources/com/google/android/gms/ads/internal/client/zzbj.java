package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbj extends pb implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            zzc();
        } else {
            if (i10 != 2) {
                return false;
            }
            zze zzeVar = (zze) qb.a(parcel, zze.CREATOR);
            qb.b(parcel);
            zzb(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

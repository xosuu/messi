package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzds extends pb implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            zzi();
        } else if (i10 == 2) {
            zzh();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 != 4) {
            if (i10 != 5) {
                return false;
            }
            ClassLoader classLoader = qb.f8146a;
            boolean z9 = parcel.readInt() != 0;
            qb.b(parcel);
            zzf(z9);
        } else {
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
